package controller;

import javax.swing.JOptionPane;
import model.Brand;
import model.DAO.BrandDAO;
import resource.StandardText;

public class BrandController {

    BrandDAO brandDAO = new BrandDAO();

    public boolean validate(Brand brand) {

        if (brand.getName().isEmpty()) {
            return false;
        }

        if (brandDAO.findBrand(brand) == null) {
            Brand b = new Brand();
            brand.setName(JOptionPane.showInputDialog(StandardText.ENTER_BRAND_NAME));

            if (brandDAO.create(brand)) {
                return true;
            }
        } else {
            return true;
        }

        return false;
    }
}
