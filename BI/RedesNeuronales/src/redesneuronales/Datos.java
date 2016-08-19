
package redesneuronales;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos extends javax.swing.JFrame {

    String  dir ="../RedesNeuronales/src/arff/prueba.arff";
    RedesNeuronales red = new RedesNeuronales();
    int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x19;
    float x14,x15,x16,x17,x18;
    
    public Datos() {
        initComponents();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        cbsexo = new javax.swing.JComboBox<String>();
        cbster = new javax.swing.JComboBox<String>();
        cbanti = new javax.swing.JComboBox<String>();
        cbfatiga = new javax.swing.JComboBox<String>();
        cbma = new javax.swing.JComboBox<String>();
        cbanorexi = new javax.swing.JComboBox<String>();
        cblive = new javax.swing.JComboBox<String>();
        cbfirm = new javax.swing.JComboBox<String>();
        cbslee = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbasc = new javax.swing.JComboBox<String>();
        cbvarices = new javax.swing.JComboBox<String>();
        jComboBox12 = new javax.swing.JComboBox<String>();
        txtbili = new java.awt.TextField();
        txtal = new java.awt.TextField();
        txtsgot = new java.awt.TextField();
        txtalbum = new java.awt.TextField();
        txtprotime = new java.awt.TextField();
        cbhis = new javax.swing.JComboBox<String>();
        label1 = new java.awt.Label();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Edad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sexo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Steroid");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("antivirals");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("fatigue");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Malaise");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Anorexia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("LiverBig");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("LiverFirm");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Spleenpalpable");

        txtedad.setText("                    ");
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));
        cbsexo.setToolTipText("");
        cbsexo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cbsexoComponentAdded(evt);
            }
        });
        cbsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsexoActionPerformed(evt);
            }
        });

        cbster.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsterActionPerformed(evt);
            }
        });

        cbanti.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbantiActionPerformed(evt);
            }
        });

        cbfatiga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbfatiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfatigaActionPerformed(evt);
            }
        });

        cbma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmaActionPerformed(evt);
            }
        });

        cbanorexi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbanorexi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbanorexiActionPerformed(evt);
            }
        });

        cblive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cblive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbliveActionPerformed(evt);
            }
        });

        cbfirm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfirmActionPerformed(evt);
            }
        });

        cbslee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbslee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsleeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Spiders");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("history");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Alk");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("varices");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Protime");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Sgot");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("ascites");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("bilirubin");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Albumin");

        cbasc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbascActionPerformed(evt);
            }
        });

        cbvarices.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbvarices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbvaricesActionPerformed(evt);
            }
        });

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        txtbili.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtbili.setText("                    ");
        txtbili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbiliActionPerformed(evt);
            }
        });

        txtal.setText("                    ");
        txtal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalActionPerformed(evt);
            }
        });

        txtsgot.setText("                    ");
        txtsgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsgotActionPerformed(evt);
            }
        });

        txtalbum.setText("                    ");
        txtalbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalbumActionPerformed(evt);
            }
        });

        txtprotime.setText("                    ");
        txtprotime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprotimeActionPerformed(evt);
            }
        });

        cbhis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbhis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhisActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Datos Personales de Paciente");

        button2.setLabel("Predecir");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))))
                .addGap(285, 285, 285))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel8))
                                    .addGap(43, 43, 43))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2))
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)))
                                    .addGap(44, 44, 44)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbfatiga, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbster, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbanti, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cblive, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbanorexi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbslee, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbhis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbasc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbvarices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtprotime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsgot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtalbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11)
                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbvarices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbfatiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(cbma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbanti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbanorexi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cblive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(cbfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8)
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(cbslee, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtbili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsgot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(txtalbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(cbhis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbasc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel14)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel17)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel20)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(txtprotime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsexoActionPerformed
       if(cbsexo.getSelectedItem().equals("Hombre"))         
        {
            x1=2;
        }
        else
        {
            x1=1;
        }
        
    }//GEN-LAST:event_cbsexoActionPerformed

    private void cbsexoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cbsexoComponentAdded
    }//GEN-LAST:event_cbsexoComponentAdded

    private void cbsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsterActionPerformed
        if(cbster.getSelectedItem().equals("Si"))         
        {
            x2=2;
        }
        else
        {
            x2=1;
        }
       
    }//GEN-LAST:event_cbsterActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtbiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbiliActionPerformed
    }//GEN-LAST:event_txtbiliActionPerformed

    private void cbantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbantiActionPerformed
        if(cbanti.getSelectedItem().equals("Si"))         
        {
            x3=2;
        }
        else
        {
            x3=1;
        }
    }//GEN-LAST:event_cbantiActionPerformed

    private void cbfatigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfatigaActionPerformed
        if(cbfatiga.getSelectedItem().equals("Si"))         
        {
            x13=2;
        }
        else
        {
            x13=1;
        }
    }//GEN-LAST:event_cbfatigaActionPerformed

    private void cbmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmaActionPerformed
       if(cbma.getSelectedItem().equals("Si"))         
        {
            x4=2;
        }
        else
        {
            x4=1;
        }
    }//GEN-LAST:event_cbmaActionPerformed

    private void cbanorexiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbanorexiActionPerformed
        if(cbanorexi.getSelectedItem().equals("Si"))         
        {
            x5=2;
        }
        else
        {
            x5=1;
        }
    }//GEN-LAST:event_cbanorexiActionPerformed

    private void cbliveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbliveActionPerformed
       if(cblive.getSelectedItem().equals("Si"))         
        {
            x6=2;
        }
        else
        {
            x6=1;
        }
    }//GEN-LAST:event_cbliveActionPerformed

    private void cbfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfirmActionPerformed
        if(cbfirm.getSelectedItem().equals("Si"))         
        {
            x7=2;
        }
        else
        {
            x7=1;
        }
    }//GEN-LAST:event_cbfirmActionPerformed

    private void cbsleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsleeActionPerformed
        if(cbslee.getSelectedItem().equals("Si"))         
        {
            x8=2;
        }
        else
        {
            x8=1;
        }
    }//GEN-LAST:event_cbsleeActionPerformed

    private void cbascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbascActionPerformed
        // TODO add your handling code here:
           
        if(cbasc.getSelectedItem().equals("Si"))         
        {
            x9=2;
        }
        else
        {
            x9=1;
        }
    }//GEN-LAST:event_cbascActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        if(jComboBox12.getSelectedItem().equals("Si"))         
        {
            x10=2;
        }
        else
        {
            x10=1;
        }
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void cbvaricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbvaricesActionPerformed
        if(cbvarices.getSelectedItem().equals("Si"))         
        {
            x11=2;
        }
        else
        {
            x11=1;
        }
    }//GEN-LAST:event_cbvaricesActionPerformed

    private void cbhisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhisActionPerformed
        if(cbhis.getSelectedItem().equals("Si"))         
        {
            x12=2;
        }
        else
        {
            x12=1;
        }
    }//GEN-LAST:event_cbhisActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        try {
            // TODO add your handling code here:
            modificarArchivo();
        } catch (IOException ex) {
           Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
         red.perceptron_multicapa(dir,1);       
        
    }//GEN-LAST:event_button2ActionPerformed

    private void txtalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalActionPerformed

    private void txtsgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsgotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsgotActionPerformed

    private void txtalbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalbumActionPerformed

    private void txtprotimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprotimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprotimeActionPerformed
public void modificarArchivo()throws IOException
{
    //edad
   x19=Integer.parseInt(txtedad.getText().trim());
    x14=Float.parseFloat(txtbili.getText().trim());
            x15=Float.parseFloat(txtal.getText().trim());
            x16=Float.parseFloat(txtsgot.getText().trim());
            x17=Float.parseFloat(txtalbum.getText().trim());
            x18=Float.parseFloat(txtprotime.getText().trim());
    File archivo = new File("../RedesNeuronales/src/arff/prueba.arff");
        BufferedWriter bw;
        if (archivo.exists()) 
        {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("@relation prueba\r\n");
            bw.write("@attribute AGE numeric\r\n");
            bw.write("@attribute SPLEENPALPABLE: numeric\r\n" + "@attribute SEX numeric \r\n" + "@attribute STEROI numeric\r\n"
                    + "@attribute ANTIVIRALS numeric\r\n"
                    + "@attribute FATIGUE numeric\r\n" + "@attribute MALAISE numeric\r\n"
                    + "@attribute ANOREXIA numeric\r\n" + "@attribute LIVERBIG numeric\r\n"
                    + "@attribute LIVERFIRM numeric\r\n"
                    + "@attribute SPIDERS numeric\r\n" + "@attribute ASCITES numeric\r\n"
                    + "@attribute VARICES numeric\r\n" + "@attribute BILIRUBIN numeric\r\n" + "@attribute ALKPHOSPHATE numeric\r\n"
                    + "@attribute SGOT numeric\r\n" + "@attribute ALBUMIN numeric\r\n" + "@attribute PROTIME numeric\r\n"
                    + "@attribute HISTOLOGY numeric\r\n" + "@attribute Class {1,2}\r\n"
                    + "@data\r\n"
            +x19+","+x1+","+x2+","+x3+","+x4+","+x5+","+x6+","+x7+","+x8+","+x9+","+x10+","+x11+","+x12+","
                    +x13+","+x14+","+x15+","+x16+","+x1+","+x18+",?");
        } 
        else
        {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("@relation prueba\r\n");
            bw.write("@attribute AGE numeric\r\n");
            bw.write("@attribute SPLEENPALPABLE: numeric\r\n" + "@attribute SEX numeric \r\n" + "@attribute STEROI numeric\r\n"
                    + "@attribute ANTIVIRALS numeric\r\n" + "@attribute FATIGUE numeric\r\n"
                    + "@attribute FATIGUE numeric\r\n" + "@attribute MALAISE numeric\r\n"
                    + "@attribute ANOREXIA numeric\r\n" + "@attribute LIVERBIG numeric\r\n"
                    + "@attribute LIVERFIRM numeric\r\n"
                    + "@attribute SPIDERS numeric\r\n" + "@attribute ASCITES numeric\r\n"
                    + "@attribute VARICES numeric\r\n" + "@attribute BILIRUBIN numeric\r\n" + "@attribute ALKPHOSPHATE numeric\r\n"
                    + "@attribute SGOT numeric\r\n" + "@attribute ALBUMIN numeric\r\n" + "@attribute PROTIME numeric\r\n"
                    + "@attribute HISTOLOGY numeric\r\n" + "@attribute Class {1,2}\n");
            
        


        }
           bw.close();
}
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JComboBox<String> cbanorexi;
    private javax.swing.JComboBox<String> cbanti;
    private javax.swing.JComboBox<String> cbasc;
    private javax.swing.JComboBox<String> cbfatiga;
    private javax.swing.JComboBox<String> cbfirm;
    private javax.swing.JComboBox<String> cbhis;
    private javax.swing.JComboBox<String> cblive;
    private javax.swing.JComboBox<String> cbma;
    private javax.swing.JComboBox<String> cbsexo;
    private javax.swing.JComboBox<String> cbslee;
    private javax.swing.JComboBox<String> cbster;
    private javax.swing.JComboBox<String> cbvarices;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label label1;
    private java.awt.TextField txtal;
    private java.awt.TextField txtalbum;
    private java.awt.TextField txtbili;
    private javax.swing.JTextField txtedad;
    private java.awt.TextField txtprotime;
    private java.awt.TextField txtsgot;
    // End of variables declaration//GEN-END:variables
}
