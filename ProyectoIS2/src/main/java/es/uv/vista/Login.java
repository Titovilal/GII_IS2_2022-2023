package es.uv.vista;

import es.uv.modelo.AccesoBD;
import es.uv.modelo.Trabajador;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JFrame {

    private int xMouseCurrent;
    private int yMouseCurrent;
    private int xMouse;
    private int yMouse;
    VentanaEnfermera e;
    VentanaMedico m;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        AccesoBD.abrirConexionBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelBarraSuperior = new javax.swing.JPanel();
        panelMinimizar = new javax.swing.JPanel();
        labelMinimizar = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIniciar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tfContra = new javax.swing.JPasswordField();
        buttonAcceder = new javax.swing.JButton();
        txtError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(61, 61, 61));

        panelBarraSuperior.setBackground(new java.awt.Color(51, 51, 51));
        panelBarraSuperior.setPreferredSize(new java.awt.Dimension(364, 40));
        panelBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMouseDragged(evt);
            }
        });
        panelBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMousePressed(evt);
            }
        });

        panelMinimizar.setBackground(new java.awt.Color(51, 51, 51));
        panelMinimizar.setPreferredSize(new java.awt.Dimension(46, 40));
        panelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseReleased(evt);
            }
        });

        labelMinimizar.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        labelMinimizar.setForeground(new java.awt.Color(204, 204, 204));
        labelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizar.setText("-");
        labelMinimizar.setMaximumSize(new java.awt.Dimension(14, 30));
        labelMinimizar.setMinimumSize(new java.awt.Dimension(14, 30));
        labelMinimizar.setPreferredSize(new java.awt.Dimension(14, 30));

        javax.swing.GroupLayout panelMinimizarLayout = new javax.swing.GroupLayout(panelMinimizar);
        panelMinimizar.setLayout(panelMinimizarLayout);
        panelMinimizarLayout.setHorizontalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinimizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMinimizarLayout.setVerticalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelSalir.setBackground(new java.awt.Color(51, 51, 51));
        panelSalir.setPreferredSize(new java.awt.Dimension(46, 40));
        panelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSalirMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelSalirMouseReleased(evt);
            }
        });

        labelSalir.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(204, 204, 204));
        labelSalir.setText("x");

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelSalir)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Contraseña");

        txtIniciar.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txtIniciar.setForeground(new java.awt.Color(204, 204, 204));
        txtIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIniciar.setText("Iniciar Sesión");

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Usuario");

        tfUsuario.setBackground(new java.awt.Color(61, 61, 61));
        tfUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tfUsuario.setToolTipText("");
        tfUsuario.setBorder(null);
        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyPressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        tfContra.setBackground(new java.awt.Color(61, 61, 61));
        tfContra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfContra.setForeground(new java.awt.Color(255, 255, 255));
        tfContra.setToolTipText("");
        tfContra.setBorder(null);
        tfContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfContraKeyPressed(evt);
            }
        });

        buttonAcceder.setBackground(new java.awt.Color(68, 68, 68));
        buttonAcceder.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        buttonAcceder.setForeground(new java.awt.Color(204, 204, 204));
        buttonAcceder.setText("Acceder");
        buttonAcceder.setBorderPainted(false);
        buttonAcceder.setFocusPainted(false);
        buttonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAccederActionPerformed(evt);
            }
        });

        txtError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfContra, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txtError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(buttonAcceder)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseDragged
        xMouseCurrent = evt.getXOnScreen();
        yMouseCurrent = evt.getYOnScreen();
        this.setLocation(xMouseCurrent - xMouse, yMouseCurrent - yMouse);
    }//GEN-LAST:event_panelBarraSuperiorMouseDragged

    private void panelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraSuperiorMousePressed

    private void tfContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buttonAcceder.doClick();
        }
    }//GEN-LAST:event_tfContraKeyPressed

    private void tfUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buttonAcceder.doClick();
        }
    }//GEN-LAST:event_tfUsuarioKeyPressed

    private void buttonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAccederActionPerformed

        e = new VentanaEnfermera();
        m = new VentanaMedico();

        Trabajador t = new Trabajador();

        t = AccesoBD.loginTrabajador(tfUsuario.getText(), tfContra.getText());
        if (!(t.getEsMedico()==null)) {
            if (t.getEsMedico()) {
                m.setVisible(true);
                this.setVisible(false);
            } else {
                e.setVisible(true);
                this.setVisible(false);
            }
        } else {
            txtIniciar.setText("usuario o contraseña incorrecta");
        }
        /* VentanaEnfermera e = new VentanaEnfermera();
        VentanaMedico m = new VentanaMedico();
        int loggin = tipoLogin(tfUsuario.getText(), tfContra.getText() + ""); //tfContra deberia usar el método getPassword, para compararlo con la contraseña almacenada
        System.out.println(""+  tfContra.getPassword());
        if (loggin == 1) {
            m.setVisible(true);
            this.setVisible(false);
        } else {
            if (loggin == 2) {
                e.setVisible(true);
                this.setVisible(false);
            } else {
                txtError.setForeground(Color.red);
                txtError.setText("nombre o contraseña incorrecta");
            }
        } */
 /* m.setVisible(true);
        e.setVisible(true);
        this.setVisible(false); */
    }//GEN-LAST:event_buttonAccederActionPerformed

    private void panelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseEntered
        panelSalir.setBackground(new Color(192, 0, 0));
    }//GEN-LAST:event_panelSalirMouseEntered

    private void panelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseExited
        panelSalir.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelSalirMouseExited

    private void panelSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseReleased
        System.exit(0);
    }//GEN-LAST:event_panelSalirMouseReleased

    private void panelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseEntered
        panelMinimizar.setBackground(new Color(61, 61, 61));
    }//GEN-LAST:event_panelMinimizarMouseEntered

    private void panelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseExited
        panelMinimizar.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelMinimizarMouseExited

    private void panelMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseReleased
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_panelMinimizarMouseReleased

    private int tipoLogin(String user, String pass) {
        int tipo = 0;

        String enfermeraUSER = "enfermera";
        String enfermeraPASS = "enfermera";
        String medicoPASS = "medico";
        String medicoUSER = "medico";

        if (user.equals(medicoUSER) && pass.equals(medicoPASS)) {
            tipo = 1;
        } else {
            if (user.equals(enfermeraUSER) && pass.equals(enfermeraPASS)) {
                tipo = 2;
            }
        }

        return tipo;

    }
    
    public String enfermera_getDNI(){
        return e.getDNI();
    }
    public String enfermera_getNombre(){
        return e.getNombre();
    }
    public String enfermera_getApellidos(){
        return e.getApellidos();
    }
    public int enfermera_getHabitacion(){
        return e.getHabitacion();
    }
    public String enfermera_getSintomas(){
            return e.getSintomas();
    }
    
    //Action Listeners
    public void setActionListener(ActionListener al)
    {
        e.setActionListener(al);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAcceder;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPasswordField tfContra;
    private javax.swing.JTextField tfUsuario;
    private javax.swing.JLabel txtError;
    private javax.swing.JLabel txtIniciar;
    // End of variables declaration//GEN-END:variables
}
