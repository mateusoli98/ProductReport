package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Brand;

/**
 *
 * @author Mateus
 */
public class BrandDAO {

    public boolean create(Brand brand) {
        return ConnectionFactory.executeQuery("INSERT INTO brand VALUES (DEFAULT, '"
                + brand.getName()
                + "')");
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
                brand =  null;
            }
            
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
        return listBrand;
    }
}
