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
public class DeCandidatos extends javax.swing.JFrame {

    /**
     * Creates new form DeCandidatos
     */
    public DeCandidatos() {
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

        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        IdCir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IdPar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TotalVo = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel5.setText("Id partido");

        jLabel4.setText("Id circuncripciones");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimientos de candidatos");

        jLabel2.setText("Id ");

        jLabel6.setText("Total de votos");

        TotalVo.setEditable(false);
        TotalVo.setText("0");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(Guardar)
                                .addGap(74, 74, 74)
                                .addComponent(Limpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IdPar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IdCir, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TotalVo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(26, 26, 26)
                        .addComponent(Buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Buscar))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(IdPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IdCir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void LimpiarCampos(){
        Id.setText("");
        Nombre.setText("");
        IdPar.setText("");
        IdCir.setText("");
        TotalVo.setText("0");        
    }
    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String id = Id.getText();
        String nombre = Nombre.getText();
        String idpar = IdPar.getText();
        String idcir = IdCir.getText();
        String totalvo = "0";
        
        // Validar que el id y la descripcion no estén vacíos
        if (id.isEmpty() || nombre.isEmpty()|| idpar.isEmpty()|| idcir.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los datos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el proceso
        }

        try {
            // Intentar abrir el archivo
            File archivo = new File("Archivos\\Candidatos.txt");

            // Verificar si el archivo existe
            if (archivo.exists()) {
                // Verificar si el usuario ya existe en el archivo
                if (modificarCandidato(id, nombre, idpar, idcir)) {
                    JOptionPane.showMessageDialog(null, "Información del candidato modificada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCampos();
                    return; // Detener el proceso si el usuario ya existe y fue modificado
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

            CrearCandidatos(archivo, id, nombre, idpar, idcir, totalvo);
            
        } catch (IOException e) {
            // Capturar y manejar la excepción en caso de error
            JOptionPane.showMessageDialog(null, "Error al manejar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void CrearCandidatos(File archivo, String id, String nombre, String idpar, String idcir, String totalvo) throws IOException{
        // Verificar si el id existe en el archivo de partidos
        if(!buscarIdPartido(idpar)){
            return;
        }

        // Verificar si el id existe en el archivo de circunscripciones
        if(!buscarIdCircunscripcion(idcir)){
            return;
        }        

        
        // Abrir flujos de escritura
        try (FileWriter FW = new FileWriter(archivo, true);
            BufferedWriter BW = new BufferedWriter(FW)) {

            // Crear la línea formateada
            String linea = String.format("%s,%s,%s,%s, %s", id,nombre,idpar,idcir, totalvo);
            System.out.println("Línea: " + linea);  // Agregar esta línea para imprimir la línea formateada

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
    
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        buscarYRellenarCandidato();
    }//GEN-LAST:event_BuscarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        MenuP Menu = new MenuP();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

     private boolean buscarIdPartido(String idpar) {
         System.out.println("ID Partido a buscar: " + idpar);

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Partidos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2 && partes[0].equals(idpar)) {
                    // Encontramos el id, rellenamos los campos
                    IdCir.setText(partes[0]);
                    return true; // Terminamos la búsqueda una vez encontrado el recinto
                }
            }

            // Si llegamos aquí, el id no fue encontrado
            JOptionPane.showMessageDialog(this, "Id no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private boolean buscarIdCircunscripcion(String idcir) {
        System.out.println("ID Circunscripcion a buscar: " + idcir);

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Circunscripciones.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4 && partes[0].equals(idcir)) {
                    // Encontramos el id, rellenamos los campos
                    IdCir.setText(partes[0]);
                    return true; // Terminamos la búsqueda una vez encontrado el recinto
                }
            }

            // Si llegamos aquí, el id no fue encontrado
            JOptionPane.showMessageDialog(this, "Id no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
        
    private boolean modificarCandidato(String id,String nombre,String idpar,String idcir) {
        // Verificar si el id existe en el archivo de partidos
        if(!buscarIdPartido(idpar)){
            return false;
        }

        // Verificar si el id existe en el archivo de circunscripciones
        if(!buscarIdCircunscripcion(idcir)){
            return false;
        }        

        // Crear una lista para almacenar las líneas modificadas
        List<String> lineasModificadas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Candidatos.txt"))) {
            String linea;
            boolean candidatoModificado = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5 && partes[0].equals(id)) {
                    // Encontramos el usuario, rellenamos los campos
                    // Puedes realizar modificaciones aquí si es necesario
                    partes[1] = nombre;
                    partes[2] = idpar;
                    partes[3] = idcir;

                    // Agregamos la línea modificada a la lista
                    lineasModificadas.add(String.join(",", partes));
                    candidatoModificado = true;
                } 
                else {
                    // Si no es el usuario que estamos buscando, simplemente agregamos la línea al listado
                    lineasModificadas.add(linea);
                }
            }

            if (candidatoModificado) {
                // Ahora escribimos las líneas modificadas de vuelta al archivo
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Archivos\\Candidatos.txt"))) {
                    for (String lineaModificada : lineasModificadas) {
                        bw.write(lineaModificada);
                     bw.newLine(); // Agregamos un salto de línea después de cada línea
                    }
                }
            }

        return candidatoModificado;

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
     private void buscarYRellenarCandidato() {
        String id = Id.getText().trim();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Candidatos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5 && partes[0].equals(id)) {
                    // Encontramos el partido, rellenamos los campos
                    Nombre.setText(partes[1]);
                    IdPar.setText(partes[2]);
                    IdCir.setText(partes[3]);
                    TotalVo.setText(partes[4]);
                    return; // Terminamos la búsqueda una vez encontrado el partido
                }
            }

            // Si llegamos aquí, el candidato no fue encontrado
            JOptionPane.showMessageDialog(this, "Candidato no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

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
            java.util.logging.Logger.getLogger(DeCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeCandidatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField IdCir;
    private javax.swing.JTextField IdPar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField TotalVo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
