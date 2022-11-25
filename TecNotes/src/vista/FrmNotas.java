package vista;

import clases.Notas;
import clases.Personalizados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class FrmNotas extends javax.swing.JDialog {

 /**
  * Creates new form FrmNotas
  */
 int id_global;

 // Configuramos la tabla
 private DefaultTableModel modeloTabla;

 public FrmNotas(java.awt.Frame parent, boolean modal, int id) {
  super(parent, modal);
  initComponents();

  this.setLocationRelativeTo(null);
  cargarNotas(id);
  id_global = id;
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jLabel1 = new javax.swing.JLabel();
  btnSalir = new javax.swing.JButton();
  jPanel1 = new javax.swing.JPanel();
  jLabel2 = new javax.swing.JLabel();
  txtTitulo = new javax.swing.JTextField();
  jLabel3 = new javax.swing.JLabel();
  btnBorrar = new javax.swing.JButton();
  btnGuardar = new javax.swing.JButton();
  jScrollPane3 = new javax.swing.JScrollPane();
  txtNota = new javax.swing.JTextArea();
  btnEditar = new javax.swing.JButton();
  btnActualizar = new javax.swing.JButton();
  jScrollPane2 = new javax.swing.JScrollPane();
  tblNotas = new javax.swing.JTable();
  lblId = new javax.swing.JLabel();
  btnLimpiar = new javax.swing.JButton();

  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
  setUndecorated(true);

  jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel1.setText("Hola, visualiza, guarda, edita y borra tus notas");

  btnSalir.setText("Salir de Notas");
  btnSalir.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnSalirActionPerformed(evt);
   }
  });

  jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Notas"));

  jLabel2.setText("Título:");

  jLabel3.setText("Nota:");

  btnBorrar.setText("Eliminar");
  btnBorrar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnBorrarActionPerformed(evt);
   }
  });

  btnGuardar.setText("Guardar");
  btnGuardar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnGuardarActionPerformed(evt);
   }
  });

  txtNota.setColumns(20);
  txtNota.setLineWrap(true);
  txtNota.setRows(5);
  jScrollPane3.setViewportView(txtNota);

  btnEditar.setText("Editar");
  btnEditar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnEditarActionPerformed(evt);
   }
  });

  btnActualizar.setText("Actualizar");
  btnActualizar.setToolTipText("");
  btnActualizar.setEnabled(false);
  btnActualizar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnActualizarActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addGap(28, 28, 28)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(jLabel2)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(jLabel3)
      .addGap(18, 18, 18)
      .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(btnActualizar)
        .addGap(0, 0, Short.MAX_VALUE)))))
    .addContainerGap())
  );
  jPanel1Layout.setVerticalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addGap(7, 7, 7)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel2)
     .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(btnGuardar))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(btnEditar)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(btnActualizar)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addContainerGap())
     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel1Layout.createSequentialGroup()
       .addComponent(jLabel3)
       .addGap(67, 67, 67))
      .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
  );

  tblNotas.setModel(new javax.swing.table.DefaultTableModel(
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
  tblNotas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
  jScrollPane2.setViewportView(tblNotas);

  lblId.setEnabled(false);

  btnLimpiar.setText("Limpiar");
  btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnLimpiarActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(88, 88, 88)
      .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(80, 80, 80)
      .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(layout.createSequentialGroup()
      .addGap(88, 88, 88)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(18, 18, 18)
      .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addGap(0, 0, Short.MAX_VALUE))
   .addGroup(layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jScrollPane2)
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGap(0, 0, Short.MAX_VALUE)
      .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addContainerGap())
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(6, 6, 6)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(14, 14, 14)
      .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(4, 4, 4)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGroup(layout.createSequentialGroup()
      .addGap(141, 141, 141)
      .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addGap(18, 18, 18)
    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(12, 12, 12)
    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap(11, Short.MAX_VALUE))
  );

  pack();
 }// </editor-fold>//GEN-END:initComponents

 private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
  FrmHome home = new FrmHome(id_global);
  home.setVisible(true);

  this.dispose();
 }//GEN-LAST:event_btnSalirActionPerformed

 private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
  if (this.tblNotas.getSelectedRow() != -1)
  {
   int eleccion = JOptionPane.showConfirmDialog(this, "¿Borrar la nota seleccionada?", "Confirmacion", JOptionPane.YES_NO_OPTION);

   if (eleccion == JOptionPane.YES_OPTION)
   {
    Conexion conn = new Conexion();
    Notas OpNotas = new Notas();

    int fila = this.tblNotas.getSelectedRow();
    OpNotas.setId_nota((int)this.tblNotas.getValueAt(fila, 0));

    try
    {
     String SQL = "CALL PA_eliminar_notas(?)";
     PreparedStatement sentencia = conn.getConexion().prepareStatement(SQL);
     sentencia.setString(1, String.valueOf(OpNotas.getId_nota()));
     
     int filas = sentencia.executeUpdate();
     
     if (filas > 0)
     {
      JOptionPane.showMessageDialog(this, "Se elimino la nota con exito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
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
   
   cargarNotas(id_global);
  } else
  {
   JOptionPane.showMessageDialog(this, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
  }
 }//GEN-LAST:event_btnBorrarActionPerformed

 private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
  // Objeto para la clase de conexion
  Conexion conn = new Conexion();
  Notas OpNotas = new Notas();
  
  OpNotas.setTitulo(txtTitulo.getText().trim());
  OpNotas.setNotas(txtNota.getText().trim());
  OpNotas.setId_alumno(id_global);

  if (OpNotas.getTitulo().equals("") || OpNotas.getNotas().equals(""))
  {
   JOptionPane.showMessageDialog(this, "Debe completar toda la información", "Error", JOptionPane.ERROR_MESSAGE);
  } else
  {
   try
   {
    String SQL = "CALL PA_insertar_notas(?, ?, ?)";
    PreparedStatement sentencia = conn.getConexion().prepareStatement(SQL);

    sentencia.setString(1, OpNotas.getTitulo());
    sentencia.setString(2, OpNotas.getNotas());
    sentencia.setString(3, String.valueOf(OpNotas.getId_alumno()));

    int respuesta = sentencia.executeUpdate();

    if (respuesta > 0)
    {
     JOptionPane.showMessageDialog(this, "Se guardo la nota con el título: " + OpNotas.getTitulo(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
     cargarNotas(id_global);
     limpiar();
    } else
    {
     JOptionPane.showMessageDialog(this, "Ups! Ocurrio un error, intenta mas tarde.", "Error", JOptionPane.ERROR_MESSAGE);
    }
   } catch (Exception e)
   {
    System.out.println("Error | +info: " + e.getMessage());
   }

  }
 }//GEN-LAST:event_btnGuardarActionPerformed

 private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
  if (this.tblNotas.getSelectedRow() != -1)
  {
   Notas OpNotas = new Notas();
   
   // Desabilitamos los demas botones y activamos el de actualizar
   Personalizados.desabilitar_botones(btnGuardar, btnBorrar, btnLimpiar, btnActualizar);

   // Obtenemos la informacion de la nota
   int fila = this.tblNotas.getSelectedRow();
   OpNotas.setId_nota((int) this.tblNotas.getValueAt(fila, 0));
   OpNotas.setTitulo(String.valueOf(this.tblNotas.getValueAt(fila, 1)));
   OpNotas.setNotas(String.valueOf(this.tblNotas.getValueAt(fila, 2)));

   // Llenamos los datos de los JtextField
   lblId.setText(String.valueOf(OpNotas.getId_nota()));
   txtTitulo.setText(OpNotas.getTitulo());
   txtNota.setText(OpNotas.getNotas());

  } else
  {
   JOptionPane.showMessageDialog(this, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
  }
 }//GEN-LAST:event_btnEditarActionPerformed

 private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
  // Actualizamos la nota

  // Objeto para la clase de conexion
  Conexion conn = new Conexion();
  Notas OpNotas = new Notas();

  OpNotas.setId_nota(Integer.parseInt(lblId.getText()));
  OpNotas.setTitulo(txtTitulo.getText().trim());
  OpNotas.setNotas(txtNota.getText().trim());

  try
  {
   String SQL = "CALL PA_actualizar_notas(?, ?, ?)";
   PreparedStatement sentencia = conn.getConexion().prepareStatement(SQL);

   sentencia.setString(1, String.valueOf(OpNotas.getId_nota()));
   sentencia.setString(2, OpNotas.getTitulo());
   sentencia.setString(3, OpNotas.getNotas());
   
   int resultado = sentencia.executeUpdate();

   if (resultado > 0)
   {
    JOptionPane.showMessageDialog(this, "Se actualizo la nota con el titulo: " + OpNotas.getTitulo(), "Éxito", JOptionPane.INFORMATION_MESSAGE);

    cargarNotas(id_global);
    limpiar();

    Personalizados.habilitar_botones(btnGuardar, btnBorrar, btnLimpiar, btnActualizar);
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

 private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
  limpiar();
 }//GEN-LAST:event_btnLimpiarActionPerformed

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton btnActualizar;
 private javax.swing.JButton btnBorrar;
 private javax.swing.JButton btnEditar;
 private javax.swing.JButton btnGuardar;
 private javax.swing.JButton btnLimpiar;
 private javax.swing.JButton btnSalir;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JScrollPane jScrollPane2;
 private javax.swing.JScrollPane jScrollPane3;
 private javax.swing.JLabel lblId;
 private javax.swing.JTable tblNotas;
 private javax.swing.JTextArea txtNota;
 private javax.swing.JTextField txtTitulo;
 // End of variables declaration//GEN-END:variables

 private void cargarNotas(int id) {
  // Objeto para la clase de conexion
  Conexion conn = new Conexion();

  ResultSet rs = null;
  PreparedStatement sentencia = null;
  lblId.setVisible(false);
  try
  {
   String SQL = "CALL PA_consulta_notas(?)";
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
  this.tblNotas.setModel(modeloTabla);

  // Agregamos las columnas
  modeloTabla.addColumn("");
  modeloTabla.addColumn("Titulo");
  modeloTabla.addColumn("Notas");

  tblNotas.getColumnModel().getColumn(0).setPreferredWidth(30);
  tblNotas.getColumnModel().getColumn(1).setPreferredWidth(160);
  tblNotas.getColumnModel().getColumn(2).setPreferredWidth(500);
  
  // recorremos las notas por sus filas
  Object[] fila;

  try
  {
   while (rs.next())
   {
    fila = new Object[3];

    fila[0] = rs.getInt("id_notas");
    fila[1] = rs.getString("titulo");
    fila[2] = rs.getString("notas");

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
  txtTitulo.setText("");
  txtNota.setText("");
 }
}
