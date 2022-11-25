package vista;

import clases.Alumnos;
import clases.Personalizados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Conexion;

public class FrmLogin extends javax.swing.JFrame {

 /**
  * Creates new form FrmLogin
  */
 public FrmLogin() {
  initComponents();

  // Centrar la ventana al iniciarla
  this.setLocationRelativeTo(null);
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jLabel1 = new javax.swing.JLabel();
  btnCerrar = new javax.swing.JButton();
  jLabel2 = new javax.swing.JLabel();
  lblRegistro = new javax.swing.JLabel();
  btnLogin = new javax.swing.JButton();
  txtCarnet = new javax.swing.JTextField();
  txtPw = new javax.swing.JPasswordField();
  jLabel3 = new javax.swing.JLabel();
  jLabel4 = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setTitle("Login");

  jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
  jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel1.setText("Inicio de sesión");

  btnCerrar.setText("Cerrar");
  btnCerrar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnCerrarActionPerformed(evt);
   }
  });

  jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel2.setText("¿No estas registrado?");

  lblRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
  lblRegistro.setForeground(new java.awt.Color(51, 51, 255));
  lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  lblRegistro.setText("registrate, aquí");
  lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
  lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    lblRegistroMouseClicked(evt);
   }
  });

  btnLogin.setText("Comenzar");
  btnLogin.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnLoginActionPerformed(evt);
   }
  });

  txtCarnet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
  txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
   public void keyTyped(java.awt.event.KeyEvent evt) {
    txtCarnetKeyTyped(evt);
   }
  });

  txtPw.setHorizontalAlignment(javax.swing.JTextField.CENTER);

  jLabel3.setText("Carnet:");

  jLabel4.setText("Contraseña:");

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(35, 35, 35)
      .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(layout.createSequentialGroup()
      .addGap(35, 35, 35)
      .addComponent(jLabel3))
     .addGroup(layout.createSequentialGroup()
      .addGap(35, 35, 35)
      .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(layout.createSequentialGroup()
      .addGap(35, 35, 35)
      .addComponent(jLabel4))
     .addGroup(layout.createSequentialGroup()
      .addGap(35, 35, 35)
      .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(layout.createSequentialGroup()
      .addGap(35, 35, 35)
      .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(layout.createSequentialGroup()
      .addGap(40, 40, 40)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
       .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
       .addComponent(lblRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGap(109, 109, 109)
      .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addContainerGap(36, Short.MAX_VALUE))
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(15, 15, 15)
    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jLabel3)
    .addGap(6, 6, 6)
    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(6, 6, 6)
    .addComponent(jLabel4)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
     .addGroup(layout.createSequentialGroup()
      .addGap(29, 29, 29)
      .addComponent(lblRegistro)))
    .addContainerGap(17, Short.MAX_VALUE))
  );

  pack();
 }// </editor-fold>//GEN-END:initComponents

 private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
  // Cerramos el sistema por completo
  System.exit(0);
 }//GEN-LAST:event_btnCerrarActionPerformed

 private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
  // Objeto para la clase de conexion
  Conexion conn = new Conexion();
  Alumnos opAlumno = new Alumnos();
  
  opAlumno.setCarnet(txtCarnet.getText().trim());
  opAlumno.setPw(txtPw.getText().trim());
  
  if (opAlumno.getCarnet().equals("") || opAlumno.getPw().equals(""))
  {
   JOptionPane.showMessageDialog(this, "Debe completar toda la información", "Error", JOptionPane.ERROR_MESSAGE);
  } else
  {

   try
   {
    String SQL = "CALL PA_login_alumno(?, ?)";
    PreparedStatement sentencia = conn.getConexion().prepareStatement(SQL);
    sentencia.setString(1, opAlumno.getCarnet());
    sentencia.setString(2, opAlumno.getPw());

    ResultSet rs = sentencia.executeQuery();
    rs.next();
    
    if (rs.getRow() == 0)
    {
     JOptionPane.showMessageDialog(this, "Usuario y contraseña, no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
    } else
    {
     String pw_db = rs.getString("pw");
     int id = Integer.parseInt(rs.getString("id_alumno"));
     
     if (opAlumno.getPw().equals(pw_db))
     {
      // A falta de multiples validaciones
      FrmHome Home = new FrmHome(id);
      Home.setVisible(true);

      // Cerramos la ventana que corresponde a la de Login para dejar 
      // abierta la principal
      this.dispose();
     } else
     {
      JOptionPane.showMessageDialog(this, "Usuario y contraseña, no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
     }
    }
    
    rs.close();
    sentencia.close();
    conn.getConexion().close();
   } catch (Exception e)
   {
    System.out.println("Error | +info: " + e.getMessage());
   }

  }

 }//GEN-LAST:event_btnLoginActionPerformed

 private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
  // A falta de multiples validaciones
  FrmRegistro registro = new FrmRegistro(this, true);
  registro.setVisible(true);
 }//GEN-LAST:event_lblRegistroMouseClicked

 private void txtCarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnetKeyTyped
  Personalizados.validar_carnet(evt, txtCarnet);
 }//GEN-LAST:event_txtCarnetKeyTyped

 /**
  * @param args the command line arguments
  */
 public static void main(String args[]) {
  /* Set the Nimbus look and feel */
  //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
  /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
   */
  try
  {
   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
   {
    if ("Nimbus".equals(info.getName()))
    {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
    }
   }
  } catch (ClassNotFoundException ex)
  {
   java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex)
  {
   java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex)
  {
   java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex)
  {
   java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new FrmLogin().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton btnCerrar;
 private javax.swing.JButton btnLogin;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel lblRegistro;
 private javax.swing.JTextField txtCarnet;
 private javax.swing.JPasswordField txtPw;
 // End of variables declaration//GEN-END:variables
}
