package controller;

import javax.swing.JOptionPane;
import model.Alert;
import model.Brand;
import model.DAO.BrandDAO;
import resource.StandardText;
import resource.ViewAlert;

public class BrandController {

    BrandDAO brandDAO = new BrandDAO();

    public boolean validate(Brand brand) {

        if (brandDAO.findBrand(brand) == null) {
            Brand b = new Brand();
            brand.setName(JOptionPane.showInputDialog(StandardText.ENTER_BRAND_NAME));

            if (brandDAO.create(brand)) {
                ViewAlert.show(new Alert());
                return true;
            }
        } else {
            return true;
        }

        return false;
    }
}
