package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Alert;
import model.Brand;
import model.Product;
import resource.StandardText;
import resource.ViewAlert;

public class ProductDAO {

    public boolean create(Product product) {
        return ConnectionFactory.executeQuery(
                "INSERT INTO product "
                + "VALUES "
                + "(DEFAULT,"
                + "'" + product.getName() + "',"
                + "'" + product.getAmount() + "',"
                + "'" + product.getPrice() + "',"
                + "'" + product.getBrand().getId() + "'"
                + ")");
    }

    public ArrayList<Product> findAll() {
        ArrayList<Product> listProduct = new ArrayList<>();
        try {

            ResultSet rs = ConnectionFactory.executeQueryR(
                    "SELECT "
                    + "    p.id,"
                    + "    p.name,"
                    + "    p.amount,"
                    + "    p.price,"
                    + "    b.id AS brandId,"
                    + "    b.name AS brandName"
                    + "FROM "
                    + "    product p, brand b"
                    + "WHERE "
                    + "    p.idBrand = b.id"
            );

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setAmount(rs.getInt("amount"));
                product.setPrice(rs.getFloat("price"));

                product.setBrand(new Brand(
                        rs.getInt("brandId"),
                        rs.getString("brandName"))
                );

                listProduct.add(product);
                product = null;
            }

        } catch (SQLException ex) {
            System.err.println(StandardText.ERROR + ex);
            ViewAlert.show(new Alert(
                    StandardText.ERROR_FETCHING_RECORDS,
                    StandardText.TITLE_ERROR,
                    JOptionPane.ERROR_MESSAGE));
        }
        return listProduct;
    }
}
