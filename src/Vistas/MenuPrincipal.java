/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Alumno;
import Clases.Materia;
import java.util.HashSet;

/**
 *
 * @author Julian Martinez <juli450@gmail.com>
 */

public class MenuPrincipal extends javax.swing.JFrame {


   //HashSet<Alumno> listAlumnos=new HashSet<Alumno>();
   //HashSet<Materia> listMaterias = new HashSet<Materia>();
   
    public MenuPrincipal() {
        initComponents();
        this.setSize(1000, 800);
//        listMaterias.add(new Materia(1,"Ingles 1",2021));
//        listAlumnos.add(new Alumno(1001,"Lopez","Martin"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mInscribir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Principal");

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumnos");

        mAlumno.setText("Agregar Alumnos");
        mAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(mAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");

        mMaterias.setText("Agregar Materia");
        mMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(mMaterias);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inscripcion");

        mInscribir.setText("Inscribir");
        mInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInscribirActionPerformed(evt);
            }
        });
        jMenu3.add(mInscribir);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir del sistema");

        mSalir.setText("salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jMenu4.add(mSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnoActionPerformed
        javax.swing.JInternalFrame ventana=new FormAlum();
        Escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mAlumnoActionPerformed

    private void mMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMateriasActionPerformed
        javax.swing.JInternalFrame ventana=new FormMat();
        Escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mMateriasActionPerformed

    private void mInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInscribirActionPerformed
       javax.swing.JInternalFrame ventana=new Inscripcion();
        Escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mInscribirActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mAlumno;
    private javax.swing.JMenuItem mInscribir;
    private javax.swing.JMenuItem mMaterias;
    private javax.swing.JMenuItem mSalir;
    // End of variables declaration//GEN-END:variables

    static class Listas{
        static HashSet<Alumno> alumnos = new HashSet<>();
        static HashSet<Materia> materias = new HashSet<>();
    }
}
