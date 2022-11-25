package vista;

import clases.Contactos;
import clases.Personalizados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;


public class FrmContactos extends javax.swing.JDialog {

 /**
  * Creates new form FrmContactos
  *
  * @param id
  */
 int id_global;

 // Configuramos la tabla
 private DefaultTableModel modeloTabla;

 public FrmContactos(java.awt.Frame parent, boolean modal, int id) {
  super(parent, modal);
  initComponents();

  this.setLocationRelativeTo(null);
  cargarContactos(id);
  id_global = id;
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  btnSalir = new javax.swing.JButton();
  jLabel1 = new javax.swing.JLabel();
  jPanel1 = new javax.swing.JPanel();
  jLabel2 = new javax.swing.JLabel();
  jLabel3 = new javax.swing.JLabel();
  jLabel4 = new javax.swing.JLabel();
  jLabel5 = new javax.swing.JLabel();
  jLabel6 = new javax.swing.JLabel();
  jLabel7 = new javax.swing.JLabel();
  txtNombres = new javax.swing.JTextField();
  txtApellidos = new javax.swing.JTextField();
  txtEmail = new javax.swing.JTextField();
  txtTelefono = new javax.swing.JTextField();
  txtCarnet = new javax.swing.JTextField();
  jScrollPane1 = new javax.swing.JScrollPane();
  txtApunte = new javax.swing.JTextArea();
  btnGuardar = new javax.swing.JButton();
  btnEditar = new javax.swing.JButton();
  btnActualizar = new javax.swing.JButton();
  btnEliminar = new javax.swing.JButton();
  btnLimpiar = new javax.swing.JButton();
  jScrollPane2 = new javax.swing.JScrollPane();
  tblContactos = new javax.swing.JTable();
  lblId = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
  setUndecorated(true);

  btnSalir.setText("Salir de contactos");
  btnSalir.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnSalirActionPerformed(evt);
   }
  });

  jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel1.setText("Hola, visualiza, guarda, edita y borra tus contactos");

  jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contactos"));

  jLabel2.setText("Nombres:");

  jLabel3.setText("Apellidos:");

  jLabel4.setText("Teléfono: (+503)");

  jLabel5.setText("Email:");

  jLabel6.setText("Carnet del contacto:");

  jLabel7.setText("Apunte:");

  txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
   public void keyTyped(java.awt.event.KeyEvent evt) {
    txtTelefonoKeyTyped(evt);
   }
  });

  txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
   public void keyTyped(java.awt.event.KeyEvent evt) {
    txtCarnetKeyTyped(evt);
   }
  });

  txtApunte.setColumns(20);
  txtApunte.setLineWrap(true);
  txtApunte.setRows(2);
  txtApunte.setTabSize(5);
  jScrollPane1.setViewportView(txtApunte);

  btnGuardar.setText("Guardar");
  btnGuardar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnGuardarActionPerformed(evt);
   }
  });

  btnEditar.setText("Editar");
  btnEditar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnEditarActionPerformed(evt);
   }
  });

  btnActualizar.setText("Actualizar");
  btnActualizar.setEnabled(false);
  btnActualizar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnActualizarActionPerformed(evt);
   }
  });

  btnEliminar.setText("Eliminar");
  btnEliminar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnEliminarActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnActualizar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnEliminar)
        .addGap(0, 0, Short.MAX_VALUE))
       .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
         .addGroup(jPanel1Layout.createSequentialGroup()
          .addComponent(jLabel6)
          .addGap(10, 10, 10)
          .addComponent(txtCarnet))
         .addGroup(jPanel1Layout.createSequentialGroup()
          .addComponent(jLabel4)
          .addGap(9, 9, 9)
          .addComponent(txtTelefono))
         .addGroup(jPanel1Layout.createSequentialGroup()
          .addComponent(jLabel2)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 36, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel3)
         .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
         .addComponent(jLabel7)))))
     .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(58, 58, 58)
      .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(0, 0, Short.MAX_VALUE)))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(txtApellidos)
     .addComponent(txtEmail)
     .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
    .addContainerGap())
  );
  jPanel1Layout.setVerticalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addGap(11, 11, 11)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel2)
     .addComponent(jLabel3)
     .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel4)
     .addComponent(jLabel5)
     .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(jLabel6)
       .addComponent(jLabel7)
       .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(btnGuardar)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(btnEditar)
       .addComponent(btnActualizar)
       .addComponent(btnEliminar))
      .addGap(0, 7, Short.MAX_VALUE))
     .addComponent(jScrollPane1))
    .addContainerGap())
  );

  btnLimpiar.setText("Limpiar");
  btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnLimpiarActionPerformed(evt);
   }
  });

  tblContactos.setModel(new javax.swing.table.DefaultTableModel(
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
  tblContactos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
  jScrollPane2.setViewportView(tblContactos);

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(130, 130, 130)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(55, 55, 55)
      .addComponent(lblId))
     .addGroup(layout.createSequentialGroup()
      .addGap(18, 18, 18)
      .addComponent(btnLimpiar)))
    .addContainerGap(43, Short.MAX_VALUE))
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addComponent(btnSalir)
    .addGap(18, 18, 18))
   .addComponent(jScrollPane2)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(22, 22, 22)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(lblId))
    .addGap(18, 18, 18)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(28, 28, 28)))
    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
    .addGap(12, 12, 12))
  );

  pack();
 }// </editor-fold>//GEN-END:initComponents

 private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
  FrmHome home = new FrmHome(id_global);
  home.setVisible(true);

  this.dispose();
 }//GEN-LAST:event_btnSalirActionPerformed

 private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
  Personalizados.validar_telefono(evt, txtTelefono);
 }//GEN-LAST:event_txtTelefonoKeyTyped

 private void txtCarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnetKeyTyped
  Personalizados.validar_carnet(evt, txtCarnet);
 }//GEN-LAST:event_txtCarnetKeyTyped

 private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
  // Objeto para la clase de conexion
  Conexion conn = new Conexion();
  Contactos OpContactos = new Contactos();

  OpContactos.setId_alumno(id_global);
  OpContactos.setNombre(txtNombres.getText().trim());
  OpContactos.setApellido(txtApellidos.getText().trim());
  OpContactos.setTelefono(txtTelefono.getText().trim());
  OpContactos.setEmail(txtEmail.getText().trim());
  OpContactos.setCarnet_contacto(txtCarnet.getText().trim());
  OpContactos.setApunte(txtApunte.getText().trim());

  if (OpContactos.getNombre().equals("") || OpContactos.getApellido().equals("") || OpContactos.getTelefono().equals("") || OpContactos.getEmail().equals("") || OpContactos.getEmail().equals("") || OpContactos.getApunte().equals(""))
  {
   JOptionPane.showMessageDialog(this, "Debe completar toda la información", "Error", JOptionPane.ERROR_MESSAGE);
  } else
  {
   if (OpContactos.getTelefono().charAt(0) == '2' || OpContactos.getTelefono().charAt(0) == '6' || OpContactos.getTelefono().charAt(0) == '7')
   {
    try
    {
     String SQL = "CALL PA_insertar_contactos(?, ?, ?, ?, ?, ?, ?)";
     PreparedStatement sentencia = conn.getConexion().prepareStatement(SQL);

     sentencia.setString(1, OpContactos.getNombre());
     sentencia.setString(2, OpContactos.getApellido());
     sentencia.setString(3, OpContactos.getTelefono());
     sentencia.setString(4, OpContactos.getEmail());
     sentencia.setString(5, OpContactos.getCarnet_contacto());
     sentencia.setString(6, OpContactos.getApunte());
     sentencia.setString(7, String.valueOf(OpContactos.getId_alumno()));

     int respuesta = sentencia.executeUpdate();

     if (respuesta > 0)
     {
      JOptionPane.showMessageDialog(this, "Se agrego a los contactos a " + OpContactos.getNombre(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
      cargarContactos(id_global);
      limpiar();
     } else
     {
      JOptionPane.showMessageDialog(this, "Ups! Ocurrio un error, intenta mas tarde.", "Error", JOptionPane.ERROR_MESSAGE);
     }
    } catch (Exception e)
    {
     System.out.println("Error | +info: " + e.getMessage());
    }
   } else
   {
    JOptionPane.showMessageDialog(this, "El télefono no es admitido", "Error", JOptionPane.ERROR_MESSAGE);
   }
  }


 }//GEN-LAST:event_btnGuardarActionPerformed

 private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
  limpiar();
 }//GEN-LAST:event_btnLimpiarActionPerformed

 private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
  if (this.tblContactos.getSelectedRow() != -1)
  {
   Contactos OpContactos = new Contactos();
   
   // Desabilitamos los demas botones y activamos el de actualizar
   Personalizados.desabilitar_botones(btnGuardar, btnEliminar, btnLimpiar, btnActualizar);

   // Obtenemos la informacion de la nota
   int fila = this.tblContactos.getSelectedRow();
   OpContactos.setId_contacto((int) this.tblContactos.getValueAt(fila, 0));
   OpContactos.setNombre(String.valueOf(this.tblContactos.getValueAt(fila, 1)));
   OpContactos.setApellido(String.valueOf(this.tblContactos.getValueAt(fila, 2)));
   OpContactos.setTelefono(String.valueOf(this.tblContactos.getValueAt(fila, 3)));
   OpContactos.setEmail(String.valueOf(this.tblContactos.getValueAt(fila, 4)));
   OpContactos.setCarnet_contacto(String.valueOf(this.tblContactos.getValueAt(fila, 5)));
   OpContactos.setApunte(String.valueOf(this.tblContactos.getValueAt(fila, 6)));

   // Llenamos los datos de los JtextField
   lblId.setText(String.valueOf(OpContactos.getId_contacto()));
   txtNombres.setText(OpContactos.getNombre());
   txtApellidos.setText(OpContactos.getApellido());
   txtTelefono.setText(OpContactos.getTelefono());
   txtEmail.setText(OpContactos.getEmail());
   txtCarnet.setText(OpContactos.getCarnet_contacto());
   txtApunte.setText(OpContactos.getApunte());
  } else
  {
   JOptionPane.showMessageDialog(this, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
  }
 }//GEN-LAST:event_btnEditarActionPerformed

 private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
  // Objeto para la clase de conexion
  Conexion conn = new Conexion();
  Contactos OpContactos = new Contactos();

  OpContactos.setId_contacto(Integer.parseInt(lblId.getText()));
  OpContactos.setNombre(txtNombres.getText().trim());
  OpContactos.setApellido(txtApellidos.getText().trim());
  OpContactos.setTelefono(txtTelefono.getText().trim());
  OpContactos.setEmail(txtEmail.getText().trim());
  OpContactos.setCarnet_contacto(txtCarnet.getText().trim());
  OpContactos.setApunte(txtApunte.getText().trim());
  
  try
  {
   String SQL = "CALL PA_actualizar_contactos(?, ?, ?, ?, ?, ?, ?)";
   PreparedStatement sentencia = conn.getConexion().prepareStatement(SQL);
   
   sentencia.setString(1, String.valueOf(OpContactos.getId_contacto()));
   sentencia.setString(2, OpContactos.getNombre());
   sentencia.setString(3, OpContactos.getApellido());
   sentencia.setString(4, OpContactos.getTelefono());
   sentencia.setString(5, OpContactos.getEmail());
   sentencia.setString(6, OpContactos.getCarnet_contacto());
   sentencia.setString(7, OpContactos.getApunte());
   
   int resultado = sentencia.executeUpdate();

   if (resultado > 0)
   {
    JOptionPane.showMessageDialog(this, "Se actualizo el contacto de " + OpContactos.getNombre(), "Éxito", JOptionPane.INFORMATION_MESSAGE);

    cargarContactos(id_global);
    limpiar();

    Personalizados.habilitar_botones(btnGuardar, btnEliminar, btnLimpiar, btnActualizar);
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
 }//GEN-LAST:event_btnActualizarActionPerformed

 private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
  if (this.tblContactos.getSelectedRow() != -1)
  {
   int eleccion = JOptionPane.showConfirmDialog(this, "¿Borrar el contacto seleccionado?", "Confirmacion", JOptionPane.YES_NO_OPTION);

   if (eleccion == JOptionPane.YES_OPTION)
   {
    Conexion conn = new Conexion();
    Contactos OpContactos = new Contactos();

    int fila = this.tblContactos.getSelectedRow();
    OpContactos.setId_contacto(Integer.parseInt(String.valueOf(this.tblContactos.getValueAt(fila, 0))));

    try
    {
     String SQL = "CALL PA_eliminar_contactos(?)";
     PreparedStatement sentencia = conn.getConexion().prepareStatement(SQL);
     sentencia.setString(1, String.valueOf(OpContactos.getId_contacto()));

     int filas = sentencia.executeUpdate();

     if (filas > 0)
     {
      JOptionPane.showMessageDialog(this, "Se elimino el contacto", "Éxito", JOptionPane.INFORMATION_MESSAGE);
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

   }

   cargarContactos(id_global);
  } else
  {
   JOptionPane.showMessageDialog(this, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
  }
 }//GEN-LAST:event_btnEliminarActionPerformed

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton btnActualizar;
 private javax.swing.JButton btnEditar;
 private javax.swing.JButton btnEliminar;
 private javax.swing.JButton btnGuardar;
 private javax.swing.JButton btnLimpiar;
 private javax.swing.JButton btnSalir;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JScrollPane jScrollPane2;
 private javax.swing.JLabel lblId;
 private javax.swing.JTable tblContactos;
 private javax.swing.JTextField txtApellidos;
 private javax.swing.JTextArea txtApunte;
 private javax.swing.JTextField txtCarnet;
 private javax.swing.JTextField txtEmail;
 private javax.swing.JTextField txtNombres;
 private javax.swing.JTextField txtTelefono;
 // End of variables declaration//GEN-END:variables

 private void cargarContactos(int id) {
  // Objeto para la clase de conexion
  Conexion conn = new Conexion();

  ResultSet rs = null;
  PreparedStatement sentencia = null;
  lblId.setVisible(false);

  try
  {
   String SQL = "CALL PA_consulta_contactos(?)";
   sentencia = conn.getConexion().prepareStatement(SQL);
   sentencia.setInt(1, id);

   rs = sentencia.executeQuery();

  } catch (Exception e)
  {
   System.out.println("Error | + info: " + e.getMessage());
  }

  // Configuramos el modelo de tabla
  // Esto permite que no se puedan editar las celdas
  this.modeloTabla = new DefaultTableModel() {
   @Override
   public boolean isCellEditable(int row, int column) {
    return false;
   }
  };

  // los Jtable, vienen a pedazos, tenemos que hacerlo manualmente
  this.tblContactos.setModel(modeloTabla);

  // Agregamos las columnas
  modeloTabla.addColumn("");
  modeloTabla.addColumn("Nombres");
  modeloTabla.addColumn("Apellidos");
  modeloTabla.addColumn("Télefono");
  modeloTabla.addColumn("Email");
  modeloTabla.addColumn("Carnet");
  modeloTabla.addColumn("Apunte");

  tblContactos.getColumnModel().getColumn(0).setPreferredWidth(30);
  tblContactos.getColumnModel().getColumn(1).setPreferredWidth(140);
  tblContactos.getColumnModel().getColumn(2).setPreferredWidth(140);
  tblContactos.getColumnModel().getColumn(3).setPreferredWidth(70);
  tblContactos.getColumnModel().getColumn(4).setPreferredWidth(200);
  tblContactos.getColumnModel().getColumn(5).setPreferredWidth(80);
  tblContactos.getColumnModel().getColumn(6).setPreferredWidth(200);

  // recorremos los contactos por sus filas
  Object[] fila;

  try
  {
   while (rs.next())
   {
    fila = new Object[8];

    fila[0] = rs.getInt("id_contactos");
    fila[1] = rs.getString("nombre");
    fila[2] = rs.getString("apellido");
    fila[3] = rs.getString("telefono");
    fila[4] = rs.getString("email");
    fila[5] = rs.getString("carnet_contacto");
    fila[6] = rs.getString("apunte");

    modeloTabla.addRow(fila);
   }

   rs.close();
   sentencia.close();
   conn.getConexion().close();
  } catch (Exception e)
  {
   System.out.println("Error | + info: " + e.getMessage());
  }
 }

 private void limpiar() {
  txtNombres.setText("");
  txtApellidos.setText("");
  txtTelefono.setText("");
  txtCarnet.setText("");
  txtEmail.setText("");
  txtApunte.setText("");
 }

}
