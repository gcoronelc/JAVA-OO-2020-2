package pe.wilsonstore.ventaapp.view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import pe.wilsonstore.ventaapp.controller.VentaController;
import pe.wilsonstore.ventaapp.dto.VentaDto;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class ReporteVentas extends javax.swing.JDialog {

	private VentaController controller;
	private List<VentaDto>  ventas = null;

	/**
	 * Creates new form ReporteVentas
	 */
	public ReporteVentas(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		this.setLocationRelativeTo(null);
		controller = new VentaController();
		llenarCategorias();
	}

	private void llenarCategorias(){
		cboCategoria.removeAllItems();;
		cboCategoria.addItem("TODOS");
		String[] categorias = controller.traerCategorias();
		for (String categoria : categorias) {
			cboCategoria.addItem(categoria);
		}
	}
	
	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    cboCategoria = new javax.swing.JComboBox<>();
    btnConsultar = new javax.swing.JButton();
    btnConsultar1 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblRepo = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("REPORTE DE VENTAS");

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

    jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    jLabel1.setText("Categoría:");

    cboCategoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    btnConsultar.setBackground(new java.awt.Color(0, 0, 204));
    btnConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    btnConsultar.setForeground(new java.awt.Color(204, 204, 204));
    btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/wilsonstore/ventaapp/imagenes/buscar.png"))); // NOI18N
    btnConsultar.setText("Consultar");
    btnConsultar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnConsultarActionPerformed(evt);
      }
    });

    btnConsultar1.setBackground(new java.awt.Color(102, 204, 255));
    btnConsultar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    btnConsultar1.setForeground(new java.awt.Color(0, 0, 102));
    btnConsultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/wilsonstore/ventaapp/imagenes/excel.png"))); // NOI18N
    btnConsultar1.setText("Consultar");
    btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnConsultar1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(45, 45, 45)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

    tblRepo.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "CATEGORIA", "PRODUCTO", "PRECIO", "CANTIDAD", "IMPORTE"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tblRepo);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(28, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    // Proceso
		String categoria = cboCategoria.getSelectedItem().toString();
		ventas = controller.traerVentas(categoria);
		// Reporte
		DefaultTableModel tabla;
		tabla = (DefaultTableModel) tblRepo.getModel();
		tabla.setRowCount(0);
		Object[] rowData;
		for(VentaDto dto: ventas){
			rowData = new Object[]{
				dto.getCategoria(),
				dto.getProducto(),
				dto.getPrecio(),
				dto.getCantidad(),
				dto.getImporte()
			};
			tabla.addRow(rowData);
		}
  }//GEN-LAST:event_btnConsultarActionPerformed

  private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
    try {
      // Archivo destino
      String archivo = "";
      // Seleccionar archivo destino
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
      int result = fileChooser.showOpenDialog(this);
			if(result != JFileChooser.APPROVE_OPTION){
				return;
			}
			File selectedFile = fileChooser.getSelectedFile();
			//System.out.println("Selected file: " + selectedFile.getAbsolutePath());
			archivo = selectedFile.getAbsolutePath();

      // Proceso de crear el archivo excel
      // Paso 1: Crear el libro
      String plantilla = "/pe/wilsonstore/ventaapp/plantillas/ventas.xls";
      InputStream inp = Class.class.getResourceAsStream(plantilla);
      HSSFWorkbook objWB = new HSSFWorkbook(inp);
      // Paso 2: Crear la hoja
      HSSFSheet hoja = objWB.getSheetAt(0);
      // Cargar data a la hoja
      HSSFRow filaData = null;
			int fila = 0;
      for (VentaDto dto: ventas) {
        filaData = hoja.createRow(fila);
        filaData.createCell(0).setCellValue(dto.getCategoria());
        filaData.createCell(1).setCellValue(dto.getProducto());
        filaData.createCell(2).setCellValue(dto.getPrecio());
        filaData.createCell(3).setCellValue(dto.getCantidad());
        filaData.createCell(4).setCellValue(dto.getImporte());
				fila++;
      }
      // Crear el archivo
      File objFile = new File(archivo);
      FileOutputStream archivoSalida = new FileOutputStream(objFile);
      objWB.write(archivoSalida);
      archivoSalida.close();
      JOptionPane.showMessageDialog(this, "Proceso ejecutado correctamente.","APP",JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException ex) {
      //ex.printStackTrace();
      JOptionPane.showMessageDialog(this, "No se tiene permiso para crear el archivo.","APP",JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnConsultar1ActionPerformed

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
			java.util.logging.Logger.getLogger(ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				ReporteVentas dialog = new ReporteVentas(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnConsultar;
  private javax.swing.JButton btnConsultar1;
  private javax.swing.JComboBox<String> cboCategoria;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblRepo;
  // End of variables declaration//GEN-END:variables

}
