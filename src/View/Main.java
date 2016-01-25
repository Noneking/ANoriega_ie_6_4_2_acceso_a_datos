/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author nonek
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        jButtonInsert = new javax.swing.JButton();
        jButtonModify = new javax.swing.JButton();
        jToggleButtonDelete = new javax.swing.JToggleButton();
        jButtonCheckConnection = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        jSplitPaneClient = new javax.swing.JSplitPane();
        jPanelClient = new javax.swing.JPanel();
        jLabelClientName = new javax.swing.JLabel();
        jTextFieldClientName = new javax.swing.JTextField();
        jPanelAddress = new javax.swing.JPanel();
        jLabelAddressStreet = new javax.swing.JLabel();
        jTextFieldAddressStreet = new javax.swing.JTextField();
        jLabelAddressCity = new javax.swing.JLabel();
        jTextFieldAddressCity = new javax.swing.JTextField();
        jLabelAddressPostalCode = new javax.swing.JLabel();
        jTextFieldAddressPostalCode = new javax.swing.JTextField();
        jLabelAddressProvince = new javax.swing.JLabel();
        jTextFieldAddressProvince = new javax.swing.JTextField();
        jLabelClientNif = new javax.swing.JLabel();
        jTextFieldClientNif = new javax.swing.JTextField();
        jLabelClientPhone = new javax.swing.JLabel();
        jTextFieldClientPhone1 = new javax.swing.JTextField();
        jTextFieldClientPhone2 = new javax.swing.JTextField();
        jTextFieldClientPhone3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClient = new javax.swing.JTable();
        jSplitPaneProduct = new javax.swing.JSplitPane();
        jPanelProduct = new javax.swing.JPanel();
        jLabelProductDescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaProductDescription = new javax.swing.JTextArea();
        jLabelProductPVP = new javax.swing.JLabel();
        jTextFieldProductPVP = new javax.swing.JTextField();
        jLabelProductStock = new javax.swing.JLabel();
        jTextFieldProductStock = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProduct = new javax.swing.JTable();
        jSplitPaneLineaVenta = new javax.swing.JSplitPane();
        jPanelLineaVenta = new javax.swing.JPanel();
        jLabelLineaVentaLineNumber = new javax.swing.JLabel();
        jTextFieldLineaVentaLineNumber = new javax.swing.JTextField();
        jLabelLineaVentaProduc = new javax.swing.JLabel();
        jTextFieldLineaVentaProduct = new javax.swing.JTextField();
        jButtonLineaVentaProductAdd = new javax.swing.JButton();
        jLabelLineaVentaAmount = new javax.swing.JLabel();
        jSpinnerLineaVentaAmount = new javax.swing.JSpinner();
        jToggleButtonLineaVentaProductSearch = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableLineaVenta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar.setEnabled(false);
        jToolBar.setFocusable(false);

        jButtonInsert.setText("INSERTAR");
        jButtonInsert.setFocusable(false);
        jButtonInsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInsert.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonInsert);

        jButtonModify.setText("MODIFICAR");
        jButtonModify.setFocusable(false);
        jButtonModify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModify.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonModify);

        jToggleButtonDelete.setText("ELIMINAR");
        jToggleButtonDelete.setFocusable(false);
        jToggleButtonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jToggleButtonDelete);

        jButtonCheckConnection.setText("COMPROBAR CONEXION");
        jButtonCheckConnection.setFocusable(false);
        jButtonCheckConnection.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCheckConnection.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonCheckConnection);

        jSplitPaneClient.setDividerLocation(200);

        jLabelClientName.setText("NOMBRE:");

        jPanelAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("DIRECCION"));
        jPanelAddress.setName("DIRECCION"); // NOI18N

        jLabelAddressStreet.setText("CALLE:");

        jLabelAddressCity.setText("POBLACION:");

        jLabelAddressPostalCode.setText("CODIGO POSTAL:");

        jLabelAddressProvince.setText("PROVINCIA:");

        javax.swing.GroupLayout jPanelAddressLayout = new javax.swing.GroupLayout(jPanelAddress);
        jPanelAddress.setLayout(jPanelAddressLayout);
        jPanelAddressLayout.setHorizontalGroup(
            jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddressStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldAddressStreet)
                    .addComponent(jLabelAddressCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldAddressCity)
                    .addComponent(jTextFieldAddressPostalCode)
                    .addGroup(jPanelAddressLayout.createSequentialGroup()
                        .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAddressPostalCode)
                            .addComponent(jLabelAddressProvince))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addComponent(jTextFieldAddressProvince))
                .addContainerGap())
        );
        jPanelAddressLayout.setVerticalGroup(
            jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddressLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAddressStreet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAddressCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAddressPostalCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAddressPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAddressProvince)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAddressProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelClientNif.setText("NIF:");

        jLabelClientPhone.setText("TELEFONO:");

        javax.swing.GroupLayout jPanelClientLayout = new javax.swing.GroupLayout(jPanelClient);
        jPanelClient.setLayout(jPanelClientLayout);
        jPanelClientLayout.setHorizontalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldClientName)
                    .addComponent(jLabelClientNif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldClientNif)
                    .addComponent(jLabelClientPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldClientPhone1)
                    .addComponent(jTextFieldClientPhone2)
                    .addComponent(jTextFieldClientPhone3))
                .addContainerGap())
        );
        jPanelClientLayout.setVerticalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelClientName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClientNif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClientNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClientPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClientPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClientPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClientPhone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jSplitPaneClient.setLeftComponent(jPanelClient);

        jTableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableClient);

        jSplitPaneClient.setRightComponent(jScrollPane1);

        jTabbedPane.addTab("CLIENTE", jSplitPaneClient);

        jSplitPaneProduct.setDividerLocation(200);

        jLabelProductDescription.setText("DESCRIPCION:");

        jTextAreaProductDescription.setColumns(20);
        jTextAreaProductDescription.setRows(5);
        jScrollPane2.setViewportView(jTextAreaProductDescription);

        jLabelProductPVP.setText("PVP:");

        jLabelProductStock.setText("STOCK ACTUAL:");

        javax.swing.GroupLayout jPanelProductLayout = new javax.swing.GroupLayout(jPanelProduct);
        jPanelProduct.setLayout(jPanelProductLayout);
        jPanelProductLayout.setHorizontalGroup(
            jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProductDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jTextFieldProductPVP)
                    .addComponent(jTextFieldProductStock)
                    .addComponent(jLabelProductPVP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelProductStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelProductLayout.setVerticalGroup(
            jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProductDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProductPVP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProductPVP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProductStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jSplitPaneProduct.setLeftComponent(jPanelProduct);

        jTableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableProduct);

        jSplitPaneProduct.setRightComponent(jScrollPane3);

        jTabbedPane.addTab("PRODUCTO", jSplitPaneProduct);

        jSplitPaneLineaVenta.setDividerLocation(200);

        jLabelLineaVentaLineNumber.setText("NUMERO LINEA:");

        jLabelLineaVentaProduc.setText("PRODUCTO:");

        jButtonLineaVentaProductAdd.setText("AÑADIR");

        jLabelLineaVentaAmount.setText("CANTIDAD:");

        jToggleButtonLineaVentaProductSearch.setText("BUSCAR");

        javax.swing.GroupLayout jPanelLineaVentaLayout = new javax.swing.GroupLayout(jPanelLineaVenta);
        jPanelLineaVenta.setLayout(jPanelLineaVentaLayout);
        jPanelLineaVentaLayout.setHorizontalGroup(
            jPanelLineaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLineaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLineaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLineaVentaLineNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jTextFieldLineaVentaLineNumber)
                    .addComponent(jTextFieldLineaVentaProduct)
                    .addComponent(jButtonLineaVentaProductAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLineaVentaAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerLineaVentaAmount)
                    .addGroup(jPanelLineaVentaLayout.createSequentialGroup()
                        .addComponent(jLabelLineaVentaProduc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jToggleButtonLineaVentaProductSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLineaVentaLayout.setVerticalGroup(
            jPanelLineaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLineaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLineaVentaLineNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLineaVentaLineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLineaVentaProduc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLineaVentaProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonLineaVentaProductSearch)
                .addGap(4, 4, 4)
                .addComponent(jButtonLineaVentaProductAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLineaVentaAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerLineaVentaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jSplitPaneLineaVenta.setLeftComponent(jPanelLineaVenta);

        jTableLineaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTableLineaVenta);

        jSplitPaneLineaVenta.setRightComponent(jScrollPane4);

        jTabbedPane.addTab("LINEA_VENTA", jSplitPaneLineaVenta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCheckConnection;
    public javax.swing.JButton jButtonInsert;
    public javax.swing.JButton jButtonLineaVentaProductAdd;
    public javax.swing.JButton jButtonModify;
    public javax.swing.JLabel jLabelAddressCity;
    public javax.swing.JLabel jLabelAddressPostalCode;
    public javax.swing.JLabel jLabelAddressProvince;
    public javax.swing.JLabel jLabelAddressStreet;
    public javax.swing.JLabel jLabelClientName;
    public javax.swing.JLabel jLabelClientNif;
    public javax.swing.JLabel jLabelClientPhone;
    public javax.swing.JLabel jLabelLineaVentaAmount;
    public javax.swing.JLabel jLabelLineaVentaLineNumber;
    public javax.swing.JLabel jLabelLineaVentaProduc;
    public javax.swing.JLabel jLabelProductDescription;
    public javax.swing.JLabel jLabelProductPVP;
    public javax.swing.JLabel jLabelProductStock;
    public javax.swing.JPanel jPanelAddress;
    public javax.swing.JPanel jPanelClient;
    public javax.swing.JPanel jPanelLineaVenta;
    public javax.swing.JPanel jPanelProduct;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JSpinner jSpinnerLineaVentaAmount;
    public javax.swing.JSplitPane jSplitPaneClient;
    public javax.swing.JSplitPane jSplitPaneLineaVenta;
    public javax.swing.JSplitPane jSplitPaneProduct;
    public javax.swing.JTabbedPane jTabbedPane;
    public javax.swing.JTable jTableClient;
    public javax.swing.JTable jTableLineaVenta;
    public javax.swing.JTable jTableProduct;
    public javax.swing.JTextArea jTextAreaProductDescription;
    public javax.swing.JTextField jTextFieldAddressCity;
    public javax.swing.JTextField jTextFieldAddressPostalCode;
    public javax.swing.JTextField jTextFieldAddressProvince;
    public javax.swing.JTextField jTextFieldAddressStreet;
    public javax.swing.JTextField jTextFieldClientName;
    public javax.swing.JTextField jTextFieldClientNif;
    public javax.swing.JTextField jTextFieldClientPhone1;
    public javax.swing.JTextField jTextFieldClientPhone2;
    public javax.swing.JTextField jTextFieldClientPhone3;
    public javax.swing.JTextField jTextFieldLineaVentaLineNumber;
    public javax.swing.JTextField jTextFieldLineaVentaProduct;
    public javax.swing.JTextField jTextFieldProductPVP;
    public javax.swing.JTextField jTextFieldProductStock;
    public javax.swing.JToggleButton jToggleButtonDelete;
    public javax.swing.JToggleButton jToggleButtonLineaVentaProductSearch;
    public javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables
}
