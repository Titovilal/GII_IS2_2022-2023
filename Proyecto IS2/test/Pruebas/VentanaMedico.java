package Pruebas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class VentanaMedico extends javax.swing.JFrame {

    private int x, y, xMouse, yMouse;

    public VentanaMedico() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelBase.setLayout(new BorderLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBuscarEnfermedad = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        buttonPaciente3 = new javax.swing.JButton();
        buttonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMedicamentos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelNombreMedicamento = new javax.swing.JLabel();
        panelBusccarMedicamento = new javax.swing.JPanel();
        panelBuscarPaciente = new javax.swing.JPanel();
        panelPacientesDelDia = new javax.swing.JPanel();
        panelPrueba = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();
        panelBarraSuperior = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panelMinimizar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        buttonEnfermedad = new javax.swing.JButton();
        buttonPaciente1 = new javax.swing.JButton();
        buttonMedicamento = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        panelBase = new javax.swing.JPanel();

        panelBuscarEnfermedad.setBackground(new java.awt.Color(68, 68, 68));

        jPanel1.setBackground(new java.awt.Color(68, 68, 68));
        jPanel1.setForeground(new java.awt.Color(78, 78, 78));

        buttonPaciente3.setBackground(new java.awt.Color(78, 78, 78));
        buttonPaciente3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonPaciente3.setForeground(new java.awt.Color(204, 204, 204));
        buttonPaciente3.setText("Borrar");
        buttonPaciente3.setBorderPainted(false);
        buttonPaciente3.setFocusPainted(false);

        buttonBuscar.setBackground(new java.awt.Color(78, 78, 78));
        buttonBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscar.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscar.setText("Buscar");
        buttonBuscar.setBorderPainted(false);
        buttonBuscar.setFocusPainted(false);
        buttonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuscarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBuscarMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar enfermedad");

        textBuscar.setBackground(new java.awt.Color(78, 78, 78));
        textBuscar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscar.setForeground(new java.awt.Color(204, 204, 204));
        textBuscar.setToolTipText("");
        textBuscar.setBorder(null);
        textBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonBuscar)
                .addGap(18, 18, 18)
                .addComponent(buttonPaciente3)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buttonBuscar)
                    .addComponent(buttonPaciente3)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        listMedicamentos.setBackground(new java.awt.Color(78, 78, 78));
        listMedicamentos.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listMedicamentos.setForeground(new java.awt.Color(204, 204, 204));
        listMedicamentos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1234567890123456789012345678901234567890", "Item 2", "Item 3", "Item 4", "Item 5", "no hay " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMedicamentos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listMedicamentosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listMedicamentos);

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enfermedad No contagiosa");

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Dosis recomendada: xxxxxx");

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dosis diaria: xxxxxxxx");
        jLabel4.setPreferredSize(new java.awt.Dimension(280, 20));

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de medicamentos");

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Enfermedad: esclerosis lateral multiple con trastorno del lado");
        jLabel6.setPreferredSize(new java.awt.Dimension(420, 20));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 230, 230));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("|");

        jTextArea1.setBackground(new java.awt.Color(78, 78, 78));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setRows(6);
        jTextArea1.setTabSize(4);
        jTextArea1.setBorder(null);
        jTextArea1.setPreferredSize(new java.awt.Dimension(252, 132));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enfermedades relacionadas");

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        labelNombreMedicamento.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelNombreMedicamento.setForeground(new java.awt.Color(204, 204, 204));
        labelNombreMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombreMedicamento.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        javax.swing.GroupLayout panelBuscarEnfermedadLayout = new javax.swing.GroupLayout(panelBuscarEnfermedad);
        panelBuscarEnfermedad.setLayout(panelBuscarEnfermedadLayout);
        panelBuscarEnfermedadLayout.setHorizontalGroup(
            panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                        .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                                .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(labelNombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                        .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))))
        );
        panelBuscarEnfermedadLayout.setVerticalGroup(
            panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                        .addComponent(labelNombreMedicamento)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBusccarMedicamento.setBackground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout panelBusccarMedicamentoLayout = new javax.swing.GroupLayout(panelBusccarMedicamento);
        panelBusccarMedicamento.setLayout(panelBusccarMedicamentoLayout);
        panelBusccarMedicamentoLayout.setHorizontalGroup(
            panelBusccarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        panelBusccarMedicamentoLayout.setVerticalGroup(
            panelBusccarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        panelBuscarPaciente.setBackground(new java.awt.Color(51, 0, 204));
        panelBuscarPaciente.setPreferredSize(new java.awt.Dimension(659, 485));

        javax.swing.GroupLayout panelBuscarPacienteLayout = new javax.swing.GroupLayout(panelBuscarPaciente);
        panelBuscarPaciente.setLayout(panelBuscarPacienteLayout);
        panelBuscarPacienteLayout.setHorizontalGroup(
            panelBuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        panelBuscarPacienteLayout.setVerticalGroup(
            panelBuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        panelPacientesDelDia.setBackground(new java.awt.Color(0, 102, 102));
        panelPacientesDelDia.setPreferredSize(new java.awt.Dimension(659, 485));

        javax.swing.GroupLayout panelPacientesDelDiaLayout = new javax.swing.GroupLayout(panelPacientesDelDia);
        panelPacientesDelDia.setLayout(panelPacientesDelDiaLayout);
        panelPacientesDelDiaLayout.setHorizontalGroup(
            panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        panelPacientesDelDiaLayout.setVerticalGroup(
            panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        panelPrueba.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout panelPruebaLayout = new javax.swing.GroupLayout(panelPrueba);
        panelPrueba.setLayout(panelPruebaLayout);
        panelPruebaLayout.setHorizontalGroup(
            panelPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        panelPruebaLayout.setVerticalGroup(
            panelPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(51, 204, 0));

        panelBarraSuperior.setBackground(new java.awt.Color(51, 51, 51));
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

        panelSalir.setBackground(new java.awt.Color(51, 51, 51));
        panelSalir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelSalirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelSalirFocusLost(evt);
            }
        });
        panelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSalirMouseClicked(evt);
            }
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

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("x");

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMinimizar.setBackground(new java.awt.Color(51, 51, 51));
        panelMinimizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelMinimizarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelMinimizarFocusLost(evt);
            }
        });
        panelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMinimizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-");
        jLabel10.setMaximumSize(new java.awt.Dimension(14, 30));
        jLabel10.setMinimumSize(new java.awt.Dimension(14, 30));
        jLabel10.setPreferredSize(new java.awt.Dimension(14, 30));
        jLabel10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel10FocusGained(evt);
            }
        });

        javax.swing.GroupLayout panelMinimizarLayout = new javax.swing.GroupLayout(panelMinimizar);
        panelMinimizar.setLayout(panelMinimizarLayout);
        panelMinimizarLayout.setHorizontalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinimizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMinimizarLayout.setVerticalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(61, 61, 61));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(546, 546, 546)
                .addComponent(panelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(51, 51, 51));
        panelMenu.setRequestFocusEnabled(false);
        panelMenu.setVerifyInputWhenFocusTarget(false);

        buttonEnfermedad.setBackground(new java.awt.Color(68, 68, 68));
        buttonEnfermedad.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        buttonEnfermedad.setText("Enfermedades");
        buttonEnfermedad.setBorderPainted(false);
        buttonEnfermedad.setFocusPainted(false);
        buttonEnfermedad.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEnfermedadMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonEnfermedadMousePressed(evt);
            }
        });
        buttonEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnfermedadActionPerformed(evt);
            }
        });

        buttonPaciente1.setBackground(new java.awt.Color(68, 68, 68));
        buttonPaciente1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonPaciente1.setForeground(new java.awt.Color(204, 204, 204));
        buttonPaciente1.setText("Pacientes del día");
        buttonPaciente1.setBorderPainted(false);
        buttonPaciente1.setFocusPainted(false);
        buttonPaciente1.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPaciente1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPaciente1MousePressed(evt);
            }
        });

        buttonMedicamento.setBackground(new java.awt.Color(68, 68, 68));
        buttonMedicamento.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonMedicamento.setForeground(new java.awt.Color(204, 204, 204));
        buttonMedicamento.setText("Medicamentos");
        buttonMedicamento.setBorderPainted(false);
        buttonMedicamento.setFocusPainted(false);
        buttonMedicamento.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMedicamentoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMedicamentoMousePressed(evt);
            }
        });

        buttonPaciente.setBackground(new java.awt.Color(68, 68, 68));
        buttonPaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonPaciente.setForeground(new java.awt.Color(204, 204, 204));
        buttonPaciente.setText("Historial pacientes");
        buttonPaciente.setBorderPainted(false);
        buttonPaciente.setFocusPainted(false);
        buttonPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPacienteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPacienteMousePressed(evt);
            }
        });
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(buttonPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(buttonEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(buttonMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(buttonPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPaciente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBase.setBackground(new java.awt.Color(68, 68, 68));
        panelBase.setPreferredSize(new java.awt.Dimension(659, 485));

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseClicked

    }//GEN-LAST:event_panelSalirMouseClicked

    private void panelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseClicked

    }//GEN-LAST:event_panelMinimizarMouseClicked

    private void panelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseDragged
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraSuperiorMouseDragged

    private void panelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraSuperiorMousePressed

    private void buttonEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEnfermedadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnfermedadMouseClicked

    private void buttonEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEnfermedadMousePressed
        panelBase.removeAll();
        panelBase.add(panelBuscarEnfermedad);

        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonEnfermedadMousePressed

    private void buttonEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnfermedadActionPerformed

    private void buttonMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMedicamentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicamentoMouseClicked

    private void buttonMedicamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMedicamentoMousePressed
        panelBase.removeAll();
        panelBase.add(panelBusccarMedicamento);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonMedicamentoMousePressed

    private void buttonPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPacienteMousePressed
        panelBase.removeAll();
        panelBase.add(panelBuscarPaciente);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonPacienteMousePressed

    private void buttonPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPacienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteMouseClicked

    private void buttonPaciente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPaciente1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPaciente1MouseClicked

    private void buttonPaciente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPaciente1MousePressed
        panelBase.removeAll();
        panelBase.add(panelPacientesDelDia);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonPaciente1MousePressed

    private void buttonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarMouseClicked

    private void buttonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarMousePressed

    private void panelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseExited
        panelSalir.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelSalirMouseExited

    private void panelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseExited
        panelMinimizar.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelMinimizarMouseExited

    private void panelMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseReleased
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_panelMinimizarMouseReleased

    private void panelSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseReleased
        System.exit(0);
    }//GEN-LAST:event_panelSalirMouseReleased

    private void textBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buttonBuscar.doClick();
        }
    }//GEN-LAST:event_textBuscarKeyPressed

    private void listMedicamentosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMedicamentosValueChanged
        labelNombreMedicamento.setText(listMedicamentos.getSelectedValue());
    }//GEN-LAST:event_listMedicamentosValueChanged

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void panelSalirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelSalirFocusGained
    }//GEN-LAST:event_panelSalirFocusGained

    private void panelSalirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelSalirFocusLost
    }//GEN-LAST:event_panelSalirFocusLost

    private void panelMinimizarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelMinimizarFocusGained

    }//GEN-LAST:event_panelMinimizarFocusGained

    private void panelMinimizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelMinimizarFocusLost
    }//GEN-LAST:event_panelMinimizarFocusLost

    private void jLabel10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel10FocusGained
    }//GEN-LAST:event_jLabel10FocusGained

    private void panelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseEntered
        panelSalir.setBackground(new Color(61, 61, 61));
    }//GEN-LAST:event_panelSalirMouseEntered

    private void panelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseEntered
        panelMinimizar.setBackground(new Color(61, 61, 61));
    }//GEN-LAST:event_panelMinimizarMouseEntered

    private void panelMinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMinimizarMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new VentanaMedico().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonEnfermedad;
    private javax.swing.JButton buttonMedicamento;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPaciente1;
    private javax.swing.JButton buttonPaciente3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelNombreMedicamento;
    private javax.swing.JList<String> listMedicamentos;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelBuscarEnfermedad;
    private javax.swing.JPanel panelBuscarPaciente;
    private javax.swing.JPanel panelBusccarMedicamento;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel panelPacientesDelDia;
    private javax.swing.JPanel panelPrueba;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables
}
