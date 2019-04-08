/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.visão;

import com.ifpb.SGC.Dao.CervejaDaoImplem;
import com.ifpb.SGC.modelo.Cerveja;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ramil
 */
public class TelaOpçõesCerveja extends javax.swing.JFrame {
    CervejaDaoImplem c2;
   
    

    public TelaOpçõesCerveja() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        c2 = new CervejaDaoImplem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cT_CodSalvarCerveja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cT_NomeSalvarCerveja = new javax.swing.JTextField();
        cT_PreçoSalvarCerveja = new javax.swing.JTextField();
        cT_DescriSalvarCerveja = new javax.swing.JTextField();
        botãoSalvarCerveja = new javax.swing.JButton();
        botãoVoltarCerveja = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cT_CodDeletarCerveja = new javax.swing.JTextField();
        botãoDeletarCerveja = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cT_CodEditarCerveja = new javax.swing.JTextField();
        cT_NomeEditarCerveja = new javax.swing.JTextField();
        cT_PreçoEditarCerveja = new javax.swing.JTextField();
        cT_DescriEditarCerveja = new javax.swing.JTextField();
        botãoEditarCerveja = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cTListarCerveja = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        botãoListarCerveja = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cTBuscarCerveja2 = new javax.swing.JTextArea();
        botãoVoltarBuscarIngre = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cTBuscarCerveja = new javax.swing.JTextField();
        botãoBuscarCerveja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(500, 350));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel1.setText("Codigo:");

        cT_CodSalvarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cT_CodSalvarCervejaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel3.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel4.setText("Descrição:");

        cT_NomeSalvarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cT_NomeSalvarCervejaActionPerformed(evt);
            }
        });

        botãoSalvarCerveja.setText("Salvar");
        botãoSalvarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoSalvarCervejaActionPerformed(evt);
            }
        });

        botãoVoltarCerveja.setText("Voltar");
        botãoVoltarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoVoltarCervejaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel10.setText("Cadastro de Cerveja");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botãoVoltarCerveja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(botãoSalvarCerveja))
                    .addComponent(cT_PreçoSalvarCerveja)
                    .addComponent(cT_NomeSalvarCerveja, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cT_CodSalvarCerveja, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cT_DescriSalvarCerveja)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cT_CodSalvarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cT_NomeSalvarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cT_PreçoSalvarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cT_DescriSalvarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botãoVoltarCerveja)
                    .addComponent(botãoSalvarCerveja))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jLabel5.setText("Codigo:");

        botãoDeletarCerveja.setText("Deletar");
        botãoDeletarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoDeletarCervejaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Deletar Cerveja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botãoDeletarCerveja)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cT_CodDeletarCerveja, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cT_CodDeletarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botãoDeletarCerveja)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deletar", jPanel2);

        jLabel6.setText("Codigo:");

        jLabel7.setText("Nome:");

        jLabel8.setText("Preço:");

        jLabel9.setText("Descrição:");

        cT_PreçoEditarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cT_PreçoEditarCervejaActionPerformed(evt);
            }
        });

        botãoEditarCerveja.setText("Editar");
        botãoEditarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoEditarCervejaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel12.setText("Editar Cerveja");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cT_DescriEditarCerveja))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(cT_PreçoEditarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cT_CodEditarCerveja, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cT_NomeEditarCerveja)))
                    .addComponent(botãoEditarCerveja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(172, 172, 172))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cT_CodEditarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cT_NomeEditarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cT_PreçoEditarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cT_DescriEditarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(botãoEditarCerveja)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar", jPanel3);

        cTListarCerveja.setColumns(20);
        cTListarCerveja.setRows(5);
        jScrollPane1.setViewportView(cTListarCerveja);

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel13.setText("Listar Cervejas");

        botãoListarCerveja.setText("Listar");
        botãoListarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoListarCervejaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(botãoListarCerveja)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botãoListarCerveja)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Listar", jPanel4);

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel14.setText("Buscar Cerveja");

        cTBuscarCerveja2.setColumns(20);
        cTBuscarCerveja2.setRows(5);
        jScrollPane2.setViewportView(cTBuscarCerveja2);

        botãoVoltarBuscarIngre.setText("Voltar");

        jLabel15.setText("Codigo:");

        cTBuscarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTBuscarCervejaActionPerformed(evt);
            }
        });

        botãoBuscarCerveja.setText("Buscar");
        botãoBuscarCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoBuscarCervejaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botãoVoltarBuscarIngre)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cTBuscarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(botãoBuscarCerveja))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel14)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cTBuscarCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botãoBuscarCerveja))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botãoVoltarBuscarIngre)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Buscar", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cT_CodSalvarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cT_CodSalvarCervejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cT_CodSalvarCervejaActionPerformed

    private void cT_NomeSalvarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cT_NomeSalvarCervejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cT_NomeSalvarCervejaActionPerformed

    private void botãoSalvarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoSalvarCervejaActionPerformed
        int cod = Integer.parseInt(cT_CodSalvarCerveja.getText());
        float preço = Float.parseFloat(cT_PreçoSalvarCerveja.getText());
        
        Cerveja c1 = new Cerveja(cod, cT_NomeSalvarCerveja.getText(), preço, cT_DescriSalvarCerveja.getText());
        try {
            c2.salvar(c1);
        } catch (IOException ex) {
            Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Salvo Com sucesso");
        cT_CodSalvarCerveja.setText("");
        cT_NomeSalvarCerveja.setText("");
        cT_PreçoSalvarCerveja.setText("");
        cT_DescriSalvarCerveja.setText("");
    }//GEN-LAST:event_botãoSalvarCervejaActionPerformed

    private void botãoDeletarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoDeletarCervejaActionPerformed
        int cod = Integer.parseInt(cT_CodDeletarCerveja.getText());
        try {
            if (c2.Deletar(cod)){
                JOptionPane.showMessageDialog(rootPane, "Deletado com sucesso");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Não Não foi possivel");
            }
        } catch (IOException ex) {
            Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cT_CodDeletarCerveja.setText("");
    }//GEN-LAST:event_botãoDeletarCervejaActionPerformed

    private void cT_PreçoEditarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cT_PreçoEditarCervejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cT_PreçoEditarCervejaActionPerformed

    private void botãoVoltarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoVoltarCervejaActionPerformed
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_botãoVoltarCervejaActionPerformed

    private void botãoEditarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoEditarCervejaActionPerformed
       int cod = Integer.parseInt(cT_CodEditarCerveja.getText());
        float preço = Float.parseFloat(cT_PreçoEditarCerveja.getText());
        
        Cerveja c3 = new Cerveja(cod, cT_NomeEditarCerveja.getText(), preço, cT_DescriEditarCerveja.getText());
        try {
            
            if (c2.editar(c3)){
                JOptionPane.showMessageDialog(rootPane, "Editado com sucesso");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Não foi possivel");
            }
        } catch (IOException ex) {
            Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Salvo Com sucesso");
        cT_CodEditarCerveja.setText("");
        cT_NomeEditarCerveja.setText("");
        cT_PreçoEditarCerveja.setText("");
        cT_DescriEditarCerveja.setText("");
    }//GEN-LAST:event_botãoEditarCervejaActionPerformed

    private void botãoListarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoListarCervejaActionPerformed

        Set<Cerveja> result = c2.listaDeCervejas;
        cTListarCerveja.setText(result.toString());
    }//GEN-LAST:event_botãoListarCervejaActionPerformed

    private void cTBuscarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTBuscarCervejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTBuscarCervejaActionPerformed

    private void botãoBuscarCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoBuscarCervejaActionPerformed
        int cod = Integer.parseInt(cTBuscarCerveja.getText());

        Cerveja result = c2.buscarPorCodigo(cod);
        cTBuscarCerveja2.setText(result.toString());
        cTBuscarCerveja.setText("");
    }//GEN-LAST:event_botãoBuscarCervejaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaOpçõesCerveja().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TelaOpçõesCerveja.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botãoBuscarCerveja;
    private javax.swing.JButton botãoDeletarCerveja;
    private javax.swing.JButton botãoEditarCerveja;
    private javax.swing.JButton botãoListarCerveja;
    private javax.swing.JButton botãoSalvarCerveja;
    private javax.swing.JButton botãoVoltarBuscarIngre;
    private javax.swing.JButton botãoVoltarCerveja;
    private javax.swing.JTextField cTBuscarCerveja;
    private javax.swing.JTextArea cTBuscarCerveja2;
    private javax.swing.JTextArea cTListarCerveja;
    private javax.swing.JTextField cT_CodDeletarCerveja;
    private javax.swing.JTextField cT_CodEditarCerveja;
    private javax.swing.JTextField cT_CodSalvarCerveja;
    private javax.swing.JTextField cT_DescriEditarCerveja;
    private javax.swing.JTextField cT_DescriSalvarCerveja;
    private javax.swing.JTextField cT_NomeEditarCerveja;
    private javax.swing.JTextField cT_NomeSalvarCerveja;
    private javax.swing.JTextField cT_PreçoEditarCerveja;
    private javax.swing.JTextField cT_PreçoSalvarCerveja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
