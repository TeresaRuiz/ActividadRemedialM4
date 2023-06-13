/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Archivos;

/**
 *
 * @author ESTUDIANTE
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnImagen = new javax.swing.JButton();
        lGJPanelImagen1 = new components.LGJPanelImagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout());

        panelContenedor.setBackground(new java.awt.Color(204, 255, 255));
        panelContenedor.setMinimumSize(new java.awt.Dimension(930, 600));
        panelContenedor.setPreferredSize(new java.awt.Dimension(930, 600));
        panelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido a nuestra remedial");
        panelContenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        panelContenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 410, 340));

        btnImagen.setBackground(new java.awt.Color(102, 204, 255));
        btnImagen.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnImagen.setForeground(new java.awt.Color(0, 0, 0));
        btnImagen.setText("Abrir imagen");
        btnImagen.setToolTipText("");
        panelContenedor.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        lGJPanelImagen1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tokito.png"))); // NOI18N

        javax.swing.GroupLayout lGJPanelImagen1Layout = new javax.swing.GroupLayout(lGJPanelImagen1);
        lGJPanelImagen1.setLayout(lGJPanelImagen1Layout);
        lGJPanelImagen1Layout.setHorizontalGroup(
            lGJPanelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        lGJPanelImagen1Layout.setVerticalGroup(
            lGJPanelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        panelContenedor.add(lGJPanelImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 20, 700, 580));

        getContentPane().add(panelContenedor);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private components.LGJPanelImagen lGJPanelImagen1;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
