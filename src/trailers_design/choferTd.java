/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailers_design;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frank
 */
public class choferTd extends javax.swing.JFrame {

    /**
     * Creates new form choferTd
     */
    public choferTd() {
        initComponents();
         ConsDatos("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtChof = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChofer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNoTrailer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblChofer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblChofer);

        jLabel2.setText("Clave Chof");
        jLabel2.setToolTipText("");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trailers_design/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jLabel4.setText("Edad");

        btnActualizar.setText("Actulizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel5.setText("No. Trailer");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trailers_design/fondo a.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trailers_design/tdjava.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trailers_design/regreso.png"))); // NOI18N
        jButton1.setText("Regresar al menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnGrabar)
                        .addGap(36, 36, 36)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(27, 27, 27)
                        .addComponent(btnConsultar)
                        .addGap(41, 41, 41)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(jLabel3)
                                            .addGap(29, 29, 29))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)))
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtChof)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(txtNoTrailer))))
                            .addComponent(jLabel1))
                        .addGap(156, 156, 156)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNoTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnConsultar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      void ConsDatos(String valor){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("No. Trailer");
        modelo.addColumn("Edad ");
        tblChofer.setModel(modelo);
        String sql;
        ResultSet rs;
        Statement st;
        String[] datos = new String [4];
        if(valor.equals(""))
            sql="SELECT * FROM trailersd.chofer;";
        else
            sql="SELECT * FROM trailersd.chofer WHERE clave = "+ valor+";";
        try{
            //txtNoTrailer
            st=cn.createStatement();
            rs =st.executeQuery(sql);
         while(rs.next()){
             datos[0] = Integer.toString(rs.getInt(1));
             datos[1] = rs.getString(2);
             datos[2] = Double.toString(rs.getDouble(3));
             datos[3] = Integer.toString(rs.getInt(4));
             modelo.addRow(datos);
            if(valor!=("")){
                txtChof.setText(datos[0].toString());
                txtNombre.setText(datos[1].toString());
                txtNoTrailer.setText(datos[2].toString());  
                txtEdad.setText(datos[3].toString());
              }
            } 
         tblChofer.setModel(modelo);
         rs.close();
        }catch(SQLException ex){
            Logger.getLogger(choferTd.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    
    public void  limpiarDatos(){
        txtChof.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtNoTrailer.setText("");
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String codigo=txtChof.getText();
        limpiarDatos();
        ConsDatos(codigo);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("No. Trailer");
        modelo.addColumn("Edad ");
        tblChofer.setModel(modelo);

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        try{
            //clave, nombre, no_trailer, edad
            PreparedStatement pst =cn.prepareStatement("INSERT INTO trailersd.chofer"
                // + "(clave, nombre, no_trailer, edad)"
                + " VALUES ( ?, ?, ?, ?);");
            int ic =(Integer.parseInt( txtChof.getText()));
            pst.setInt(1, ic);
            pst.setString(2, txtNombre.getText());
            double dc = Double.parseDouble(txtEdad.getText());
            pst.setDouble(3,dc);

        
            int ii = (Integer.parseInt( txtNoTrailer.getText()));
            pst.setInt(4, ii);

            System.out.println("ic="+ic+" dc="+dc+" ii="+ii);
            System.out.println (pst);
            pst.executeUpdate();
            ConsDatos("");
        }catch (SQLException ex){
            Logger.getLogger(choferTd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
            PreparedStatement pst =cn.prepareStatement("UPDATE trailersd.chofer"
                + " set clave = "+txtChof.getText()
                +", nombre = '"+ txtNombre.getText()+"'"
                +", no_trailer = "+txtNoTrailer.getText()
                +", edad = "+ txtEdad.getText()
                +" WHERE clave  = " +txtChof.getText()
                + ";");
            System.out.println(pst);
            pst.executeUpdate();
            ConsDatos("");
            limpiarDatos();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Datos incorrectos...");
            Logger.getLogger(choferTd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtChof.getText();
        try{
             PreparedStatement pst = cn.prepareStatement("DELETE FROM trailersd.chofer WHERE clave = "
                + codigo + ";");
            int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de Borrar el registro?",
                "Confirma Elminación", JOptionPane.YES_NO_OPTION);
            System.out.println(pst);
            if(valor == 0){
                pst.executeUpdate();
                limpiarDatos();
                ConsDatos("");
            }
        }catch (SQLException ex){
            Logger.getLogger(choferTd.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Datos incorrectos...");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
        ConsDatos("");
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        InicioTrailerDes f=  new InicioTrailerDes();
        f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFe el");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel";
            //UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
             UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            }
            catch (Exception e) {JOptionPane.showMessageDialog(null, e);
            }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choferTd().setVisible(true);
            }
        });
    }
ConexionTD cc = new ConexionTD();
    Connection cn = cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChofer;
    private javax.swing.JTextField txtChof;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNoTrailer;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
