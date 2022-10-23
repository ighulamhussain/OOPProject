import javax.swing.*;

class CurrencyConverter extends javax.swing.JFrame {
    // Variables declaration
    private JButton Convert;
    private JButton jButton1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JTextField txtAmount;
    private JComboBox<String> txtFrom;
    private JComboBox<String> txtTo;

    public CurrencyConverter() {
        initComponents();
    }

    private void initComponents() {

        jComboBox2 = new JComboBox<>();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        txtAmount = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        Convert = new JButton();
        txtFrom = new JComboBox<>();
        txtTo = new JComboBox<>();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton1.setText("Currency Converter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Amount");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("To");

        Convert.setBackground(new java.awt.Color(255, 204, 102));
        Convert.setText("Convert");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        txtFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"USD", "RIYAL", "PKR", "EURO", "POUND", "DHIRAM"}));
        txtFrom.setToolTipText("");

        txtTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"RIYAL", "USD", "PKR", "EURO ", "POUND", "DHIRAM"}));
        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtAmount)
                                                        .addComponent(txtFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtTo)
                                                .addGap(18, 18, 18)))
                                .addGap(78, 78, 78)
                                .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {
        Double convert;
        Double amount = Double.parseDouble(txtAmount.getText());

        if (txtFrom.getSelectedItem().toString() == "EURO" && txtTo.getSelectedItem().toString() == "USD") {
            convert = amount * 0.98;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " USD");
        } else if (txtFrom.getSelectedItem().toString() == "POUND" && txtTo.getSelectedItem().toString() == "USD") {
            convert = amount * 1.12;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " USD");
        } else if (txtFrom.getSelectedItem().toString() == "DHIRAM" && txtTo.getSelectedItem().toString() == "USD") {
            convert = amount * 0.27;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " USD");
        } else if (txtFrom.getSelectedItem().toString() == "RIYAL" && txtTo.getSelectedItem().toString() == "USD") {
            convert = amount * 0.27;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " USD");
        } else if (txtFrom.getSelectedItem().toString() == "PKR" && txtTo.getSelectedItem().toString() == "USD") {
            convert = amount * 0.0045;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " USD");
        } else if (txtFrom.getSelectedItem().toString() == "USD" && txtTo.getSelectedItem().toString() == "PKR") {
            convert = amount * 221.10;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " PKR");
        } else if (txtFrom.getSelectedItem().toString() == "POUND" && txtTo.getSelectedItem().toString() == "PKR") {
            convert = amount * 246.59;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " PKR");
        } else if (txtFrom.getSelectedItem().toString() == "EURO" && txtTo.getSelectedItem().toString() == "PKR") {
            convert = amount * 216.93;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " PKR");
        } else if (txtFrom.getSelectedItem().toString() == "DIRHAM" && txtTo.getSelectedItem().toString() == "PKR") {
            convert = amount * 60.77;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " PKR");
        } else if (txtFrom.getSelectedItem().toString() == "RIYAL" && txtTo.getSelectedItem().toString() == "PKR") {
            convert = amount * 58.82;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " PKR");
        } else if (txtFrom.getSelectedItem().toString() == "POUND" && txtTo.getSelectedItem().toString() == "EURO") {
            convert = amount * 1.14;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " EURO");
        } else if (txtFrom.getSelectedItem().toString() == "PKR" && txtTo.getSelectedItem().toString() == "EURO") {
            convert = amount * 0.0046;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " EURO");
        } else if (txtFrom.getSelectedItem().toString() == "USD" && txtTo.getSelectedItem().toString() == "EURO") {
            convert = amount * 1.02;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " EURO");
        } else if (txtFrom.getSelectedItem().toString() == "DHIRAM" && txtTo.getSelectedItem().toString() == "EURO") {
            convert = amount * 0.28;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " EURO");
        } else if (txtFrom.getSelectedItem().toString() == "RIYAL" && txtTo.getSelectedItem().toString() == "EURO") {
            convert = amount * 0.27;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " EURO");
        } else if (txtFrom.getSelectedItem().toString() == "DHIRAM" && txtTo.getSelectedItem().toString() == "POUND") {
            convert = amount * 0.24;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " POUND");
        } else if (txtFrom.getSelectedItem().toString() == "USD" && txtTo.getSelectedItem().toString() == "POUND") {
            convert = amount * 0.90;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " POUND");
        } else if (txtFrom.getSelectedItem().toString() == "PKR" && txtTo.getSelectedItem().toString() == "POUND") {
            convert = amount * 0.0040;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " POUND");
        } else if (txtFrom.getSelectedItem().toString() == "RIYAL" && txtTo.getSelectedItem().toString() == "POUND") {
            convert = amount * 0.24;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " POUND");
        } else if (txtFrom.getSelectedItem().toString() == "EURO" && txtTo.getSelectedItem().toString() == "POUND") {
            convert = amount * 0.88;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " POUND");
        } else if (txtFrom.getSelectedItem().toString() == "USD" && txtTo.getSelectedItem().toString() == "RIYAL") {
            convert = amount * 3.76;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " RIYAL");
        } else if (txtFrom.getSelectedItem().toString() == "PKR" && txtTo.getSelectedItem().toString() == "RIYAL") {
            convert = amount * 0.017;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " RIYAL");
        } else if (txtFrom.getSelectedItem().toString() == "EURO" && txtTo.getSelectedItem().toString() == "RIYAL") {
            convert = amount * 3.69;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " RIYAL");
        } else if (txtFrom.getSelectedItem().toString() == "POUND" && txtTo.getSelectedItem().toString() == "RIYAL") {
            convert = amount * 4.20;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " RIYAL");
        } else if (txtFrom.getSelectedItem().toString() == "DHIRAM" && txtTo.getSelectedItem().toString() == "RIYAL") {
            convert = amount * 1.02;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " RIYAL");
        } else if (txtFrom.getSelectedItem().toString() == "USD" && txtTo.getSelectedItem().toString() == "DHIRAM") {
            convert = amount * 3.67;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " DHIRAM");
        } else if (txtFrom.getSelectedItem().toString() == "PKR" && txtTo.getSelectedItem().toString() == "DHIRAM") {
            convert = amount * 0.016;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " DHIRAM");
        } else if (txtFrom.getSelectedItem().toString() == "EURO" && txtTo.getSelectedItem().toString() == "DHIRAM") {
            convert = amount * 3.60;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " DHIRAM");
        } else if (txtFrom.getSelectedItem().toString() == "POUND" && txtTo.getSelectedItem().toString() == "DHIRAM") {
            convert = amount * 4.10;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " DHIRAM");
        } else if (txtFrom.getSelectedItem().toString() == "RIYAL" && txtTo.getSelectedItem().toString() == "DHIRAM") {
            convert = amount * 0.98;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " DHIRAM");
        }


    }

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }

}
