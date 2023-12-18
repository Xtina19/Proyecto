package Movimientos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**Saludos soy yo
 *
 * @author User
 */
public class DeColegios extends javax.swing.JFrame {

    /**
     * Creates new form DeColegios
     */
    public DeColegios() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IdCa = new javax.swing.JTextField();
        IdCo = new javax.swing.JTextField();
        IdRe = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        NombreCa = new javax.swing.JTextField();
        NombreRe = new javax.swing.JTextField();
        Fecha = new com.toedter.calendar.JDateChooser();
        Guardar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Id circunscripción", "Dirección"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Colegios");

        jLabel2.setText("Id Colegio");

        jLabel3.setText("Id Recinto");

        jLabel4.setText("Id Candidato");

        IdCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdCaActionPerformed(evt);
            }
        });

        IdCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdCoActionPerformed(evt);
            }
        });

        IdRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdReActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Colegio", "Id Candidato", "Votos"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        NombreCa.setEditable(false);
        NombreCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCaActionPerformed(evt);
            }
        });

        NombreRe.setEditable(false);
        NombreRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreReActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IdRe, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(IdCo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(IdCa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombreRe, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreCa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(Guardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(IdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IdCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(IdCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guardar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private boolean colegioExist = false; 
     
    private void IdCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCaActionPerformed
     validarCa();
    }//GEN-LAST:event_IdCaActionPerformed
    
    private void validarCa() {
       String idCandidato = IdCa.getText();
      NombreCa.setText( NombreIdCa(idCandidato));
    }
   private String NombreIdCa(String id) {
        String archivo = "Archivos\\Candidatos.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].trim().equals(id)) {
                return parts[1].trim();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
    }

    return null; 
    }
    
    private void IdReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdReActionPerformed
      if(IdRe.getText().isEmpty()) {
      NombreRe.setText(""); 
          return;
      }
        validarRecinto();
    }//GEN-LAST:event_IdReActionPerformed
    
 private void validarRecinto() {
        String idRecinto = IdRe.getText();
       NombreRe.setText( NombreIdRe(idRecinto));
    }
 
   private String NombreIdRe(String id) {
        String archivo = "Archivos\\Recintos.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].trim().equals(id)) {
                return parts[1].trim();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
    }

    return null; 
    }
   private void guardarRecintoYColegio() {
    String idColegio = IdCo.getText();
    String idRecinto = IdRe.getText();
    String archivo = "Archivos\\Colegio.txt";

    try {
        // Obtener la fecha seleccionada en el formato deseado
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaSeleccionada = dateFormat.format(Fecha.getDate());

        // Append el ID del recinto, el ID del colegio y la fecha al archivo
        Files.write(Paths.get(archivo), (idRecinto + "," + idColegio + "," + fechaSeleccionada + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
        JOptionPane.showMessageDialog(this, "ID de recinto, colegio y fecha guardados en Colegio.txt", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar el ID de recinto, colegio y fecha en Colegio.txt", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
   
    private void IdCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCoActionPerformed
     String idColegio = IdCo.getText();
        buscarColegio(idColegio);

        if (colegioExist) {
            JOptionPane.showMessageDialog(this, "Modificando", "Modificando", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Creando", "Creando", JOptionPane.INFORMATION_MESSAGE);
        }

        if (colegioExist) {
            modificarColegio(idColegio);
        } else {
            guardarColegio();
        }
    }//GEN-LAST:event_IdCoActionPerformed

    private void buscarColegio(String idColegio) {
        String archivo = "Archivos\\Colegio.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(idColegio)) {
                    colegioExist = true;
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar el Id de Colegio", "Error", JOptionPane.ERROR_MESSAGE);
        }

        colegioExist = false;
    }
    
    private void guardarColegio() {
      String idColegio = IdCo.getText();
    
    // Validate if the id is not empty
    if (idColegio.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un Id de Colegio válido", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String archivo = "Archivos\\Colegio.txt";

    try {
        // Append the id to the file
        Files.write(Paths.get(archivo), (idColegio + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
        JOptionPane.showMessageDialog(this, "Id de Colegio guardado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar el Id de Colegio", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
    
    private boolean modificarColegio(String idColegio) {
        List<String> lineasModificadas = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Colegio.txt"))) {
        String linea;
        boolean IdModificado = false;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split("");
            if (partes.length == 1 && partes[0].equals(idColegio)) {
                partes[0] = idColegio + " - Modificado";
                IdModificado = true;
            }
            // Agregamos la línea (modificada o no) a la lista
            lineasModificadas.add(String.join("", partes));
        }

        if (IdModificado) {
            // Ahora escribimos las líneas modificadas de vuelta al archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Archivos\\Colegio.txt"))) {
                for (String lineaModificada : lineasModificadas) {
                    bw.write(lineaModificada);
                    bw.newLine(); // Agregamos un salto de línea después de cada línea
                }
            }
        }
        return IdModificado;
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
   }
    private void NombreCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCaActionPerformed

    private void NombreReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreReActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        guardarRecintoYColegio();
    }//GEN-LAST:event_GuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeColegios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField IdCa;
    private javax.swing.JTextField IdCo;
    private javax.swing.JTextField IdRe;
    private javax.swing.JTextField NombreCa;
    private javax.swing.JTextField NombreRe;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

