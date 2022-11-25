package vista;

import clases.Alumnos;
import clases.Personalizados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Conexion;

public class FrmRegistro extends javax.swing.JDialog {

 /**
  * Creates new form FrmRegistro
  */
 public FrmRegistro(java.awt.Frame parent, boolean modal) {
  super(parent, modal);
  initComponents();

  this.setLocationRelativeTo(null);
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jButton2 = new javax.swing.JButton();
  jButton1 = new javax.swing.JButton();
  jLabel2 = new javax.swing.JLabel();
  jPanel2 = new javax.swing.JPanel();
  jLabel3 = new javax.swing.JLabel();
  jLabel4 = new javax.swing.JLabel();
  jLabel5 = new javax.swing.JLabel();
  jLabel6 = new javax.swing.JLabel();
  jLabel7 = new javax.swing.JLabel();
  jLabel8 = new javax.swing.JLabel();
  jLabel9 = new javax.swing.JLabel();
  jTextField1 = new javax.swing.JTextField();
  jTextField2 = new javax.swing.JTextField();
  jTextField4 = new javax.swing.JTextField();
  jTextField5 = new javax.swing.JTextField();
  jComboBox1 = new javax.swing.JComboBox();
  jTextField3 = new javax.swing.JTextField();
  jTextField6 = new javax.swing.JTextField();
  jLabel1 = new javax.swing.JLabel();
  jPanel3 = new javax.swing.JPanel();
  jLabel10 = new javax.swing.JLabel();
  jLabel11 = new javax.swing.JLabel();
  jLabel12 = new javax.swing.JLabel();
  jLabel13 = new javax.swing.JLabel();
  jLabel14 = new javax.swing.JLabel();
  jLabel15 = new javax.swing.JLabel();
  jLabel16 = new javax.swing.JLabel();
  jTextField7 = new javax.swing.JTextField();
  jTextField8 = new javax.swing.JTextField();
  jTextField9 = new javax.swing.JTextField();
  jTextField10 = new javax.swing.JTextField();
  jComboBox2 = new javax.swing.JComboBox();
  jTextField11 = new javax.swing.JTextField();
  jTextField12 = new javax.swing.JTextField();
  jButton3 = new javax.swing.JButton();
  jButton4 = new javax.swing.JButton();
  jLabel17 = new javax.swing.JLabel();
  jPanel4 = new javax.swing.JPanel();
  jLabel18 = new javax.swing.JLabel();
  jLabel19 = new javax.swing.JLabel();
  jLabel20 = new javax.swing.JLabel();
  jLabel21 = new javax.swing.JLabel();
  jLabel22 = new javax.swing.JLabel();
  jLabel23 = new javax.swing.JLabel();
  jLabel24 = new javax.swing.JLabel();
  txtCarnet = new javax.swing.JTextField();
  txtNombre = new javax.swing.JTextField();
  cboCarrera = new javax.swing.JComboBox();
  txtApellido = new javax.swing.JTextField();
  txtCorreo = new javax.swing.JTextField();
  txtPw = new javax.swing.JPasswordField();
  txtPw2 = new javax.swing.JPasswordField();
  btnRegistro = new javax.swing.JButton();
  btnCancelar = new javax.swing.JButton();

  jButton2.setText("Cancelar");

  jButton1.setText("Guardar");

  jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  jLabel2.setText("Complete el formulario con los datos correspondientes");

  jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

  jLabel3.setText("Carnet:");

  jLabel4.setText("Nombre:");

  jLabel5.setText("Carrera:");

  jLabel6.setText("Contraseña:");

  jLabel7.setText("Confirme contraseña:");

  jLabel8.setText("Apellidos:");

  jLabel9.setText("Correo electrónico:");

  jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Licenciatura", "Ingenieria", "Tecnico" }));

  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
  jPanel2.setLayout(jPanel2Layout);
  jPanel2Layout.setHorizontalGroup(
   jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel2Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel2Layout.createSequentialGroup()
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
       .addComponent(jLabel6)
       .addComponent(jTextField4)
       .addComponent(jLabel7)
       .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
      .addGap(0, 0, Short.MAX_VALUE))
     .addGroup(jPanel2Layout.createSequentialGroup()
      .addComponent(jLabel4)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel8)
      .addGap(169, 169, 169))
     .addGroup(jPanel2Layout.createSequentialGroup()
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel5)
       .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel9)
       .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addContainerGap())
     .addGroup(jPanel2Layout.createSequentialGroup()
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
       .addComponent(jTextField2)
       .addGroup(jPanel2Layout.createSequentialGroup()
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addContainerGap())))
  );
  jPanel2Layout.setVerticalGroup(
   jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel2Layout.createSequentialGroup()
    .addGap(19, 19, 19)
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel3)
     .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(18, 18, 18)
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel4)
     .addComponent(jLabel8))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel5)
     .addComponent(jLabel9))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(27, 27, 27)
    .addComponent(jLabel6)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jLabel7)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap(21, Short.MAX_VALUE))
  );

  jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  jLabel1.setText("Complete el formulario con los datos correspondientes");

  jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

  jLabel10.setText("Carnet:");

  jLabel11.setText("Nombre:");

  jLabel12.setText("Carrera:");

  jLabel13.setText("Contraseña:");

  jLabel14.setText("Confirme contraseña:");

  jLabel15.setText("Apellidos:");

  jLabel16.setText("Correo electrónico:");

  jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Licenciatura", "Ingenieria", "Tecnico" }));

  javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
  jPanel3.setLayout(jPanel3Layout);
  jPanel3Layout.setHorizontalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel3Layout.createSequentialGroup()
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
       .addComponent(jLabel13)
       .addComponent(jTextField9)
       .addComponent(jLabel14)
       .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
      .addGap(0, 0, Short.MAX_VALUE))
     .addGroup(jPanel3Layout.createSequentialGroup()
      .addComponent(jLabel11)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel15)
      .addGap(169, 169, 169))
     .addGroup(jPanel3Layout.createSequentialGroup()
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel12)
       .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel16)
       .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addContainerGap())
     .addGroup(jPanel3Layout.createSequentialGroup()
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
       .addComponent(jTextField8)
       .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(jLabel10)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addContainerGap())))
  );
  jPanel3Layout.setVerticalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addGap(19, 19, 19)
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel10)
     .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(18, 18, 18)
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel11)
     .addComponent(jLabel15))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel12)
     .addComponent(jLabel16))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(27, 27, 27)
    .addComponent(jLabel13)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jLabel14)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap(21, Short.MAX_VALUE))
  );

  jButton3.setText("Guardar");

  jButton4.setText("Cancelar");

  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
  setUndecorated(true);
  setResizable(false);

  jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  jLabel17.setText("Complete el formulario con los datos correspondientes");

  jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

  jLabel18.setText("Carnet:");

  jLabel19.setText("Nombre:");

  jLabel20.setText("Carrera:");

  jLabel21.setText("Contraseña:");

  jLabel22.setText("Confirme contraseña:");

  jLabel23.setText("Apellidos:");

  jLabel24.setText("Correo electrónico:");

  txtCarnet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
  txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
   public void keyTyped(java.awt.event.KeyEvent evt) {
    txtCarnetKeyTyped(evt);
   }
  });

  cboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Licenciatura", "Ingeniería", "Técnico" }));

  javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
  jPanel4.setLayout(jPanel4Layout);
  jPanel4Layout.setHorizontalGroup(
   jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel4Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(jPanel4Layout.createSequentialGroup()
        .addComponent(cboCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(30, 30, 30))
       .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
         .addComponent(jLabel18)
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
         .addComponent(txtCarnet))
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel19)
         .addComponent(jLabel20)
         .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
      .addGap(5, 5, 5)
      .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
       .addComponent(jLabel23)
       .addComponent(jLabel24)
       .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
       .addComponent(txtCorreo))
      .addGap(18, 18, 18))
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
      .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
       .addComponent(txtPw2, javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(txtPw, javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
         .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING))
        .addGap(0, 115, Short.MAX_VALUE)))
      .addGap(308, 308, 308))))
  );
  jPanel4Layout.setVerticalGroup(
   jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel4Layout.createSequentialGroup()
    .addGap(19, 19, 19)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel18)
     .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(18, 18, 18)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel19)
     .addComponent(jLabel23))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel20)
     .addComponent(jLabel24))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(18, 18, 18)
    .addComponent(jLabel21)
    .addGap(8, 8, 8)
    .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jLabel22)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(txtPw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap(13, Short.MAX_VALUE))
  );

  btnRegistro.setText("Registrarme");
  btnRegistro.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnRegistroActionPerformed(evt);
   }
  });

  btnCancelar.setText("Cancelar");
  btnCancelar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnCancelarActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
     .addGroup(layout.createSequentialGroup()
      .addGap(20, 20, 20)
      .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(18, 18, 18)
      .addComponent(btnCancelar)
      .addGap(0, 201, Short.MAX_VALUE))
     .addGroup(layout.createSequentialGroup()
      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel17)))
    .addGap(18, 18, 18))
   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
     .addContainerGap(21, Short.MAX_VALUE)
     .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addContainerGap(14, Short.MAX_VALUE)))
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(19, 19, 19)
    .addComponent(jLabel17)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(btnRegistro)
     .addComponent(btnCancelar))
    .addGap(16, 16, 16))
   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
     .addContainerGap(44, Short.MAX_VALUE)
     .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addContainerGap(67, Short.MAX_VALUE)))
  );

  pack();
 }// </editor-fold>//GEN-END:initComponents

 private void txtCarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnetKeyTyped
  Personalizados.validar_carnet(evt, txtCarnet);
 }//GEN-LAST:event_txtCarnetKeyTyped

 private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
  this.dispose();
 }//GEN-LAST:event_btnCancelarActionPerformed

 private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
  // Objeto para la clase de conexion
  Conexion conn = new Conexion();
  Alumnos opAlumno = new Alumnos();

  // Insertar a base de datos
  String SQL = "", pw, pw2;
  int carnet_existe = 0, email_existe = 0;

  pw = txtPw.getText().trim();
  pw2 = txtPw2.getText().trim();

  opAlumno.setCarnet(txtCarnet.getText().trim());
  opAlumno.setNombre(txtNombre.getText().trim());
  opAlumno.setApellido(txtApellido.getText().trim());
  opAlumno.setCarrera(cboCarrera.getSelectedItem().toString());
  opAlumno.setEmail(txtCorreo.getText().trim());
  opAlumno.setPw(txtPw.getText().trim());

  try
  {
   PreparedStatement sentencia;
   ResultSet rs;
   // Validamos que no exista el carnet
   SQL = "CALL PA_global_carnet(?)";
   sentencia = conn.getConexion().prepareStatement(SQL);
   sentencia.setString(1, opAlumno.getCarnet());

   rs = sentencia.executeQuery();
   rs.next();
   carnet_existe = rs.getInt("cantidad_carnet");

   // Validamos que no exista el email
   SQL = "CALL PA_global_email(?)";
   sentencia = conn.getConexion().prepareStatement(SQL);
   sentencia.setString(1, opAlumno.getEmail());

   rs = sentencia.executeQuery();
   rs.next();
   email_existe = rs.getInt("cantidad_email");
   rs.close();
   sentencia.close();

  } catch (Exception ex)
  {
   System.out.println("Error | +info: " + ex.getMessage());
  }

  if (carnet_existe > 0)
  {
   JOptionPane.showMessageDialog(this, "El carnet no puede asignarse porque ya esta siendo usado", "Error", JOptionPane.ERROR_MESSAGE);
  } else if (email_existe > 0)
  {
   JOptionPane.showMessageDialog(this, "El correo electrónico no puede asignarse porque ya esta siendo usado", "Error", JOptionPane.ERROR_MESSAGE);
  } else
  {
   if (opAlumno.getCarnet().equals("") || opAlumno.getNombre().equals("") || opAlumno.getApellido().equals("") || opAlumno.getEmail().equals("") || pw.equals("") || pw2.equals(""))
   {
    JOptionPane.showMessageDialog(this, "Debe completar toda la información " + opAlumno.getNombre(), "Error", JOptionPane.ERROR_MESSAGE);
   } else
   {
    if (pw.length() < 8)
    {
     JOptionPane.showMessageDialog(this, "La contraseña debe tener mas de 8 caracteres " + opAlumno.getNombre(), "Error", JOptionPane.ERROR_MESSAGE);
    } else
    {
     if (pw.equals(pw2))
     {
      try
      {
       PreparedStatement sentencia;
       
       SQL = "CALL PA_insertar_alumno(?, ?, ?, ?, ?, ?);";
       sentencia = conn.getConexion().prepareStatement(SQL);

       sentencia.setString(1, opAlumno.getCarnet());
       sentencia.setString(2, opAlumno.getNombre());
       sentencia.setString(3, opAlumno.getApellido());
       sentencia.setString(4, opAlumno.getCarrera());
       sentencia.setString(5, opAlumno.getEmail());
       sentencia.setString(6, opAlumno.getPw());

       sentencia.executeUpdate();

       // SQL para recuperar el ultimo id insertado
       SQL = "SELECT last_insert_id() as last_id";
       Statement sentenciaID = conn.getConexion().createStatement();
       ResultSet rs = sentenciaID.executeQuery(SQL);

       rs.next();
       int id_alumno = rs.getInt("last_id");
       rs.close();
       sentenciaID.close();
       
       SQL = "CALL PA_nota_defecto(?, ?);";
       sentencia = conn.getConexion().prepareStatement(SQL);

       sentencia.setString(1, opAlumno.getNombre());
       sentencia.setInt(2, id_alumno);

       int respuesta = sentencia.executeUpdate();

       if (respuesta > 0)
       {
        JOptionPane.showMessageDialog(this, "Se procesaron los datos correctamente, por favor inicia sesión", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        this.dispose();
       } else
       {
        JOptionPane.showMessageDialog(this, "Ups! Ocurrio un error, intenta mas tarde.", "Error", JOptionPane.ERROR_MESSAGE);
       }

       sentencia.close();
       conn.getConexion().close();
      } catch (Exception e)
      {
       System.out.println("Error | +info: " + e.getMessage());
      }
     } else
     {
      JOptionPane.showMessageDialog(this, "La contraseña no coiciden " + opAlumno.getNombre(), "Error", JOptionPane.ERROR_MESSAGE);
     }
    }
   }
  }

 }//GEN-LAST:event_btnRegistroActionPerformed

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton btnCancelar;
 private javax.swing.JButton btnRegistro;
 private javax.swing.JComboBox cboCarrera;
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JButton jButton3;
 private javax.swing.JButton jButton4;
 private javax.swing.JComboBox jComboBox1;
 private javax.swing.JComboBox jComboBox2;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel10;
 private javax.swing.JLabel jLabel11;
 private javax.swing.JLabel jLabel12;
 private javax.swing.JLabel jLabel13;
 private javax.swing.JLabel jLabel14;
 private javax.swing.JLabel jLabel15;
 private javax.swing.JLabel jLabel16;
 private javax.swing.JLabel jLabel17;
 private javax.swing.JLabel jLabel18;
 private javax.swing.JLabel jLabel19;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel20;
 private javax.swing.JLabel jLabel21;
 private javax.swing.JLabel jLabel22;
 private javax.swing.JLabel jLabel23;
 private javax.swing.JLabel jLabel24;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JLabel jLabel8;
 private javax.swing.JLabel jLabel9;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JPanel jPanel3;
 private javax.swing.JPanel jPanel4;
 private javax.swing.JTextField jTextField1;
 private javax.swing.JTextField jTextField10;
 private javax.swing.JTextField jTextField11;
 private javax.swing.JTextField jTextField12;
 private javax.swing.JTextField jTextField2;
 private javax.swing.JTextField jTextField3;
 private javax.swing.JTextField jTextField4;
 private javax.swing.JTextField jTextField5;
 private javax.swing.JTextField jTextField6;
 private javax.swing.JTextField jTextField7;
 private javax.swing.JTextField jTextField8;
 private javax.swing.JTextField jTextField9;
 private javax.swing.JTextField txtApellido;
 private javax.swing.JTextField txtCarnet;
 private javax.swing.JTextField txtCorreo;
 private javax.swing.JTextField txtNombre;
 private javax.swing.JPasswordField txtPw;
 private javax.swing.JPasswordField txtPw2;
 // End of variables declaration//GEN-END:variables
}
