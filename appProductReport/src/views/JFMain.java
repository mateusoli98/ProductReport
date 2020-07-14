package views;

import javax.swing.JOptionPane;
import model.Brand;
import model.DAO.BrandDAO;

public class JFMain extends javax.swing.JFrame {

    BrandDAO brandDAO = new BrandDAO();

    public JFMain() {
        initComponents();
        loadComboBoxBrands();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnCreateProduct = new javax.swing.JButton();
        scrollPanelProducts = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        btnCreateReport = new javax.swing.JButton();
        lblBrand = new javax.swing.JLabel();
        cbBrand = new javax.swing.JComboBox<>();
        lblNewBrand = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panMain.setBackground(new java.awt.Color(242, 242, 242));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 51));
        lblName.setText("Nome");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lblAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(51, 51, 51));
        lblAmount.setText("Quantidade");

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblPrice.setText("Preco");

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnCreateProduct.setBackground(new java.awt.Color(0, 102, 153));
        btnCreateProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreateProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateProduct.setText("Cadastrar");
        btnCreateProduct.setBorder(null);
        btnCreateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateProduct.setFocusable(false);

        scrollPanelProducts.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelProducts.setBorder(new javax.swing.border.MatteBorder(null));
        scrollPanelProducts.setForeground(new java.awt.Color(51, 51, 51));

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanelProducts.setViewportView(tableProducts);
        if (tableProducts.getColumnModel().getColumnCount() > 0) {
            tableProducts.getColumnModel().getColumn(0).setResizable(false);
            tableProducts.getColumnModel().getColumn(1).setResizable(false);
            tableProducts.getColumnModel().getColumn(2).setResizable(false);
            tableProducts.getColumnModel().getColumn(3).setResizable(false);
        }

        btnCreateReport.setBackground(new java.awt.Color(0, 153, 153));
        btnCreateReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreateReport.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateReport.setText("Gerar relatorio");
        btnCreateReport.setBorder(null);
        btnCreateReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateReport.setFocusable(false);

        lblBrand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(51, 51, 51));
        lblBrand.setText("Marca");

        cbBrand.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbBrand.setForeground(new java.awt.Color(51, 51, 51));
        cbBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "**Selecione**" }));
        cbBrand.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cbBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblNewBrand.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNewBrand.setForeground(new java.awt.Color(51, 204, 0));
        lblNewBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewBrand.setText("+");
        lblNewBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNewBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewBrandMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelProducts)
            .addGroup(panMainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(btnCreateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmount)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBrand)
                            .addGroup(panMainLayout.createSequentialGroup()
                                .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNewBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(lblBrand))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNewBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(lblAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPanelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblNewBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewBrandMouseClicked
        Brand brand = new Brand();
        brand.setName(JOptionPane.showInputDialog("Digite o nome da marca"));
        JOptionPane.showMessageDialog(null,
                brandDAO.create(brand) ? "Marca criada com sucesso" : "Nao foi possivel criar a marca"
        );
        loadComboBoxBrands();
    }//GEN-LAST:event_lblNewBrandMouseClicked

    private void loadComboBoxBrands() {
        cbBrand.removeAllItems();
        cbBrand.addItem("**Selecione**");

        brandDAO.findAll().forEach(brand -> {
            cbBrand.addItem(brand.getName());
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProduct;
    private javax.swing.JButton btnCreateReport;
    private javax.swing.JComboBox<String> cbBrand;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewBrand;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JPanel panMain;
    private javax.swing.JScrollPane scrollPanelProducts;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
