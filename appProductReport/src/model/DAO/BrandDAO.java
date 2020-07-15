package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Alert;

import model.Brand;
import resource.ViewAlert;

public class BrandDAO {

    public boolean create(Brand brand) {
        String query = "INSERT INTO brand VALUES (DEFAULT, '" + brand.getName() + "')";

        if (find(brand)) {
            ViewAlert.show(new Alert("Marca ja existe", "Error", JOptionPane.ERROR_MESSAGE));
            return false;
        }

        return ConnectionFactory.executeQuery(query);
    }

    public boolean find(Brand brand) {
        try {
            return ConnectionFactory
                    .executeQueryR("SELECT id FROM brand WHERE name = '" + brand.getName() + "'")
                    .next();

        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
            ViewAlert.show(new Alert("Erro ao buscar registro(s)", "Error", JOptionPane.ERROR_MESSAGE));
        }
        return false;
    }

    public ArrayList<Brand> findAll() {
        ArrayList<Brand> listBrand = new ArrayList<>();
        try {

            ResultSet rs = ConnectionFactory.executeQueryR("SELECT * FROM brand");

            while (rs.next()) {
                Brand brand = new Brand();
                brand.setId(rs.getInt("id"));
                brand.setName(rs.getString("name"));
                listBrand.add(brand);
                brand = null;
            }

        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
            ViewAlert.show(new Alert("Erro ao buscar registro(s)", "Error", JOptionPane.ERROR_MESSAGE));
        }
        return listBrand;
    }
}
