/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import MenuPrincipal.MenuP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DeCircunscripciones extends javax.swing.JFrame {

    /**
     * Creates new form DeCircuncripciones
     */
    public DeCircunscripciones() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cant_Candidatos = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        Id = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Id_Municipio = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Id municipio");

        jLabel4.setText("Cantidad de candidatos");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimientos de circuncripciones");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id ");

        jLabel3.setText("Nombre");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Id_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(43, 43, 43)
                                .addComponent(Cant_Candidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Buscar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Guardar)
                        .addGap(71, 71, 71)
                        .addComponent(Limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(Salir)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Id_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cant_Candidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        buscarYRellenarCircunscripcion();
    }//GEN-LAST:event_BuscarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String id = Id.getText();
        String nombre = Nombre.getText();
        String id_municipio = Id_Municipio.getText();
        int cant_candidatos = (int) Cant_Candidatos.getValue();

        // Validar que el id y la descripcion no estén vacíos
        if (id.isEmpty() || nombre.isEmpty() || id_municipio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El id, nombre y municipio son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el proceso
        }

        if(cant_candidatos < 0){
            JOptionPane.showMessageDialog(null, "La cantidad de candidatos debe ser positiva", "Error", JOptionPane.ERROR_MESSAGE);
            Cant_Candidatos.setValue(0);
            return; // Detener el proceso
        }

        try {
            // Intentar abrir el archivo
            File archivo = new File("Archivos\\Circunscripciones.txt");

            // Verificar si el archivo existe
            if (archivo.exists()) {
                // Verificar si la circunscripcion ya existe en el archivo
                if (modificarCircunscripcion(id, nombre, id_municipio, cant_candidatos)) {
                    JOptionPane.showMessageDialog(null, "Información de la circunscripcion modificada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCampos();
                    return; // Detener el proceso si la circunscripcion ya existe y fue modificado
                }
            }
            else {
                // Si el archivo no existe, intentar crear uno nuevo
                if (archivo.createNewFile()) {
                    System.out.println("Se ha creado un nuevo archivo.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No se pudo crear el archivo ", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Detener el proceso si no se pudo crear el archivo
                }
            }

            CrearCircunscripcion(archivo, id, nombre, id_municipio, cant_candidatos);

        } catch (IOException e) {
            // Capturar y manejar la excepción en caso de error
            JOptionPane.showMessageDialog(null, "Error al manejar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void CrearCircunscripcion(File archivo, String id, String nombre, String id_municipio, int cant_candidatos) throws IOException{
        // Verificar si el id existe en el archivo de municipios
        if(!buscarIdMunicipio(id_municipio)){
            return;
        }

        // Abrir flujos de escritura
        try (FileWriter FW = new FileWriter(archivo, true);
            BufferedWriter BW = new BufferedWriter(FW)) {

            // Crear la línea formateada
            String linea = String.format("%s,%s,%s,%d", id, nombre, id_municipio, cant_candidatos);
            System.out.println("Linea: " + linea);  // Agregar esta línea para imprimir la línea formateada

            // Aquí se guarda la información
            BW.write(linea);
            BW.newLine(); // Añadir una nueva línea

            JOptionPane.showMessageDialog(null, "Información guardada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
            LimpiarCampos();
        }
        catch (IOException e) {
            // Capturar y manejar la excepción en caso de error
            JOptionPane.showMessageDialog(null, "Error al guardar en el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void LimpiarCampos(){
        Id.setText("");
        Nombre.setText("");
        Id_Municipio.setText("");
        Cant_Candidatos.setValue(0);        
    }
    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        MenuP Menu = new MenuP();
        Menu.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_SalirActionPerformed
 
     private boolean buscarIdMunicipio(String id_municipio) {
         System.out.println("ID Municipio a buscar: " + id_municipio);

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Municipios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2 && partes[0].equals(id_municipio)) {
                    // Encontramos el id, rellenamos los campos
                    Id_Municipio.setText(partes[0]);
                    return true; // Terminamos la búsqueda una vez encontrado el recinto
                }
            }

            // Si llegamos aquí, el id no fue encontrado
            JOptionPane.showMessageDialog(this, "Id Municipio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    private boolean modificarCircunscripcion(String id, String nombre, String id_municipio, int cant_candidatos) {
        // Verificar si el id existe en el archivo de municipios
        if(!buscarIdMunicipio(id_municipio)){
            return false;
        }
        
        // Crear una lista para almacenar las líneas modificadas
        List<String> lineasModificadas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Circunscripciones.txt"))) {
            String linea;
            boolean circunscripcionModificada = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4 && partes[0].equals(id)) {
                    // Encontramos la circunscripcion, rellenamos los campos
                    partes[1] = nombre;
                    partes[2] = id_municipio;
                    partes[3] = String.valueOf(cant_candidatos);
                    
                    // Agregamos la línea modificada a la lista
                    lineasModificadas.add(String.join(",", partes));
                    circunscripcionModificada = true;
                } 
                else {
                    // Si no es la circunscripcion que estamos buscando, simplemente agregamos la línea al listado
                    lineasModificadas.add(linea);
                }
            }

            if (circunscripcionModificada) {
                // Ahora escribimos las líneas modificadas de vuelta al archivo
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Archivos\\Circunscripciones.txt"))) {
                    for (String lineaModificada : lineasModificadas) {
                        bw.write(lineaModificada);
                     bw.newLine(); // Agregamos un salto de línea después de cada línea
                    }
                }
            }

        return circunscripcionModificada;

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void buscarYRellenarCircunscripcion() {
        String idCircunscripcion = Id.getText().trim();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Circunscripciones.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4 && partes[0].equals(idCircunscripcion)) {
                    // Encontramos la circunscripcion, rellenamos los campos
                    Nombre.setText(partes[1].trim());
                    Id_Municipio.setText(partes[2].trim());
        
                    // Convertir la cadena a entero antes de asignarlo al JSpinner
                    int cantCandidatos = Integer.parseInt(partes[3]);
                    Cant_Candidatos.setValue(cantCandidatos);
                    
                    return; // Terminamos la búsqueda una vez encontrada la circunscripcion
                }
            }

            // Si llegamos aquí, la circunscripcion no fue encontrada
            JOptionPane.showMessageDialog(this, "Circunscripcion no encontrada", "Error", JOptionPane.ERROR_MESSAGE);

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(DeCircunscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeCircunscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeCircunscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeCircunscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeCircunscripciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JSpinner Cant_Candidatos;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Id_Municipio;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
