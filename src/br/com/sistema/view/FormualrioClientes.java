/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sistema.view;

import br.com.sistema.dao.ClientesDAO;
import br.com.sistema.model.Clientes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author gustavo
 */
public class FormualrioClientes extends javax.swing.JFrame {

    /**
     * Creates new form FormualrioClientes
     */
    public FormualrioClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Datos_Personales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        BtnBusqueda = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextCelular = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        TextDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextCpf = new javax.swing.JFormattedTextField();
        TxtNumeroCl = new javax.swing.JTextField();
        TextN = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TextBarrio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TextCiudad = new javax.swing.JTextField();
        TextComplemento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CbUf = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        TextRg = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TextCep = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        CbSexo = new javax.swing.JComboBox<>();
        PanelGuias = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TxtBuscaNombre = new javax.swing.JTextField();
        BtnBuscarNombre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Catastro de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 796, -1));

        Datos_Personales.setPreferredSize(new java.awt.Dimension(974, 548));

        jLabel2.setText("Codigo:");

        TextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });

        BtnBusqueda.setText("Buscar");
        BtnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusquedaActionPerformed(evt);
            }
        });

        jLabel4.setText("E-mail:");

        jLabel5.setText("Celular:");

        try {
            TextCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Direccion:");

        jLabel7.setText("CEP:");

        try {
            TextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TextN.setText("N:");

        jLabel11.setText("UF:");

        jLabel12.setText("Barrio:");

        jLabel13.setText("Ciudad:");

        jLabel14.setText("Complemento:");

        CbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel15.setText("RG:");

        TextRg.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                TextRgCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jLabel16.setText("Cpf:");

        try {
            TextCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setText("Sexo:");

        CbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        CbSexo.setSelectedIndex(-1);

        javax.swing.GroupLayout Datos_PersonalesLayout = new javax.swing.GroupLayout(Datos_Personales);
        Datos_Personales.setLayout(Datos_PersonalesLayout);
        Datos_PersonalesLayout.setHorizontalGroup(
            Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Datos_PersonalesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(TextN)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextRg)
                    .addComponent(TextDireccion)
                    .addComponent(TextEmail)
                    .addComponent(TextNombre)
                    .addGroup(Datos_PersonalesLayout.createSequentialGroup()
                        .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtNumeroCl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(TextBarrio, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBusqueda)
                    .addGroup(Datos_PersonalesLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(TextCelular)
                            .addComponent(TextComplemento)
                            .addComponent(CbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextCep, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        Datos_PersonalesLayout.setVerticalGroup(
            Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Datos_PersonalesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextNombre)
                    .addComponent(BtnBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextEmail)
                    .addComponent(jLabel5)
                    .addComponent(TextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextDireccion)
                    .addComponent(jLabel6)
                    .addComponent(TextCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtNumeroCl)
                    .addComponent(TextN)
                    .addComponent(CbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(CbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBarrio)
                    .addComponent(jLabel12)
                    .addComponent(TextCiudad)
                    .addComponent(jLabel13)
                    .addComponent(TextComplemento)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Datos_PersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextRg)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(338, 338, 338))
        );

        jTabbedPane1.addTab("Datos Personales", Datos_Personales);

        jLabel8.setText("Nombre:");

        TxtBuscaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscaNombreActionPerformed(evt);
            }
        });

        BtnBuscarNombre.setText("Buscar");

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "email", "cpf", "direccion", "email", "telefono", "cep", "numero", "barrio", "estado", "uf"
            }
        ));
        jScrollPane1.setViewportView(TablaClientes);

        javax.swing.GroupLayout PanelGuiasLayout = new javax.swing.GroupLayout(PanelGuias);
        PanelGuias.setLayout(PanelGuiasLayout);
        PanelGuiasLayout.setHorizontalGroup(
            PanelGuiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGuiasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelGuiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGuiasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelGuiasLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(TxtBuscaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBuscarNombre)
                        .addGap(189, 189, 189))))
        );
        PanelGuiasLayout.setVerticalGroup(
            PanelGuiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGuiasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelGuiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtBuscaNombre)
                    .addComponent(BtnBuscarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Consulta de Clientes", PanelGuias);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 796, 310));

        BtnNuevo.setText("Nuevo");
        getContentPane().add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 411, -1, -1));

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 411, -1, -1));

        BtnEditar.setText("Editar");
        getContentPane().add(BtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 411, -1, -1));

        BtnEliminar.setText("Eliminar");
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 411, -1, -1));

        BtnImprimir.setText("Imprimir");
        getContentPane().add(BtnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 411, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodigoActionPerformed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void TxtBuscaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscaNombreActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        Clientes obj = new Clientes();
       obj.setNombre(TextNombre.getText());
       obj.setEmail(TextEmail.getText());
       obj.setTelefono(TextCelular.getText());
       obj.setDireccion(TextDireccion.getText());
       obj.setCep(TextCep.getText());
       obj.setNumero(TxtNumeroCl.getText());
       obj.setBarrio(TextBarrio.getText());
       obj.setCiudad(TextCiudad.getText());
       obj.setComplemento(TextComplemento.getText());
       obj.setRg(TextRg.getText());
       obj.setCpf(TextCpf.getText());
       obj.setUf(CbUf.getSelectedItem().toString()); 
       obj.setSexo(CbSexo.getSelectedItem().toString()); 
       obj.setCpf(TextCpf.getText()); 
       
       ClientesDAO dao = new ClientesDAO();
        try {
            dao.guardar(obj);
        } catch (SQLException ex) {
            Logger.getLogger(FormualrioClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TextRgCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TextRgCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TextRgCaretPositionChanged

    private void BtnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusquedaActionPerformed
        // TODO add your handling code here:
        String nombre = TextNombre.getText();
        Clientes obj = new Clientes();
        ClientesDAO dao = new ClientesDAO();
        
        obj = dao.buscarCliente(nombre);
        if(obj.getNombre() != null){
            TextCodigo.setText(String.valueOf(obj.getId()));
            TextNombre.setText(obj.getNombre());
            TextBarrio.setText(obj.getBarrio());
            TextCep.setText(obj.getCep());
            TextCiudad.setText(obj.getCiudad());
            TextComplemento.setText(obj.getComplemento());
            TextCpf.setText(obj.getCpf());
            TextDireccion.setText(obj.getDireccion());
            TextEmail.setText(obj.getEmail());
            TextN.setText(obj.getNumero());
            TextRg.setText(obj.getRg());
            TextCelular.setText(obj.getTelefono());
            CbUf.setSelectedItem(obj.getUf());
            CbSexo.setSelectedItem(obj.getSexo());
            TextComplemento.setText(obj.getcomplemento());
        }else{
            JOptionPane.showMessageDialog(null,"Cliente no encontrado");
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_BtnBusquedaActionPerformed

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
            java.util.logging.Logger.getLogger(FormualrioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormualrioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormualrioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormualrioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormualrioClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarNombre;
    private javax.swing.JButton BtnBusqueda;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> CbSexo;
    private javax.swing.JComboBox<String> CbUf;
    private javax.swing.JPanel Datos_Personales;
    private javax.swing.JPanel PanelGuias;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTextField TextBarrio;
    private javax.swing.JFormattedTextField TextCelular;
    private javax.swing.JFormattedTextField TextCep;
    private javax.swing.JTextField TextCiudad;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextComplemento;
    private javax.swing.JFormattedTextField TextCpf;
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JLabel TextN;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextRg;
    private javax.swing.JTextField TxtBuscaNombre;
    private javax.swing.JTextField TxtNumeroCl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

  
