/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cliente.presentacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import mvcf.AModel;
import mvcf.AView;

/**
 *
 * @author juan sebastian
 */
public class GUIMenuPaf extends javax.swing.JFrame implements AView {

    /**
     * Creates new form GUIMenuPaf
     */
    public GUIMenuPaf() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        tbpPrincipal = new javax.swing.JTabbedPane();
        pnlRealizar = new javax.swing.JPanel();
        lblIdentificacion = new javax.swing.JLabel();
        lblFrecuenciaC = new javax.swing.JLabel();
        lblFechaV = new javax.swing.JLabel();
        lblEstatura = new javax.swing.JLabel();
        lblMedidaB = new javax.swing.JLabel();
        lblMedidaC = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtFrecuenciaR = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtMedidaB = new javax.swing.JTextField();
        txtMedidaC = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnRealizar = new javax.swing.JButton();
        lblMedidaP = new javax.swing.JLabel();
        txtMedidaP = new javax.swing.JTextField();
        lblFrecuenciaCR = new javax.swing.JLabel();
        txtFrecuenciaActiva = new javax.swing.JTextField();
        jcFechaV = new com.toedter.calendar.JDateChooser();
        lblMensajeErrorRealizar = new javax.swing.JLabel();
        pnlElaborar = new javax.swing.JPanel();
        cbxSemanas = new javax.swing.JComboBox<>();
        lblEjercicio1 = new javax.swing.JLabel();
        txtIdElaborar = new javax.swing.JTextField();
        txtEjercicio = new javax.swing.JTextField();
        lblId1 = new javax.swing.JLabel();
        lblEjercicio2 = new javax.swing.JLabel();
        lblEjercicio3 = new javax.swing.JLabel();
        txtEjercicio2 = new javax.swing.JTextField();
        txtEjercicio3 = new javax.swing.JTextField();
        spR3 = new javax.swing.JSpinner();
        lblEjercicio4 = new javax.swing.JLabel();
        lblEjercicio5 = new javax.swing.JLabel();
        lblEjercicio6 = new javax.swing.JLabel();
        spR1 = new javax.swing.JSpinner();
        spR2 = new javax.swing.JSpinner();
        lblEjercicio7 = new javax.swing.JLabel();
        spP1 = new javax.swing.JSpinner();
        lblEjercicio8 = new javax.swing.JLabel();
        spP3 = new javax.swing.JSpinner();
        lblEjercicio9 = new javax.swing.JLabel();
        spP2 = new javax.swing.JSpinner();
        jcFechaElaborar = new com.toedter.calendar.JDateChooser();
        lblId2 = new javax.swing.JLabel();
        lblId4 = new javax.swing.JLabel();
        btnRegistrarSemana = new javax.swing.JButton();
        lblMensajeErrorElaborar = new javax.swing.JLabel();
        btnElaborar = new javax.swing.JButton();
        pnlRegistrarAsis = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdAsistencia = new javax.swing.JTextField();
        lblObservacionAsistencia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaObservacion = new javax.swing.JTextArea();
        jcFechaAsistencia = new com.toedter.calendar.JDateChooser();
        lblFechaAsistencia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAsistencia = new javax.swing.JButton();
        lblMensajeErrorAsistencia = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu PAF");

        lblIdentificacion.setText("Identificación");

        lblFrecuenciaC.setText("Frecuencia cardiaca reposo");

        lblFechaV.setText("Fecha valoración");

        lblEstatura.setText("Estatura Paciente (cm)");

        lblMedidaB.setText("Medida brazo (cm)");

        lblMedidaC.setText("Medida cintura (cm)");

        lblTitulo.setText("Realizar valoración fisica");

        btnRealizar.setText("Realizar");

        lblMedidaP.setText("Medida pecho (cm)");

        lblFrecuenciaCR.setText("Frecuencia cardiaca activa");

        jcFechaV.setPreferredSize(new java.awt.Dimension(90, 20));

        lblMensajeErrorRealizar.setText(".");

        javax.swing.GroupLayout pnlRealizarLayout = new javax.swing.GroupLayout(pnlRealizar);
        pnlRealizar.setLayout(pnlRealizarLayout);
        pnlRealizarLayout.setHorizontalGroup(
            pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRealizarLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFrecuenciaC)
                    .addGroup(pnlRealizarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblMensajeErrorRealizar))
                    .addComponent(lblFrecuenciaCR)
                    .addComponent(lblEstatura)
                    .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblMedidaC)
                        .addComponent(lblMedidaB, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMedidaP, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblIdentificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRealizarLayout.createSequentialGroup()
                        .addComponent(btnRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlRealizarLayout.createSequentialGroup()
                        .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFrecuenciaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRealizarLayout.createSequentialGroup()
                                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFrecuenciaR, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMedidaC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMedidaB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMedidaP, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlRealizarLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addComponent(lblTitulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                        .addComponent(lblFechaV))
                                    .addGroup(pnlRealizarLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(106, 106, 106))))
        );
        pnlRealizarLayout.setVerticalGroup(
            pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRealizarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(19, 19, 19)
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRealizarLayout.createSequentialGroup()
                        .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdentificacion)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFrecuenciaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFrecuenciaC)))
                    .addGroup(pnlRealizarLayout.createSequentialGroup()
                        .addComponent(lblFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrecuenciaCR)
                    .addComponent(txtFrecuenciaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstatura)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedidaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedidaB))
                .addGap(11, 11, 11)
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedidaC)
                    .addComponent(txtMedidaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedidaP)
                    .addComponent(txtMedidaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRealizarLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnRealizar)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRealizarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensajeErrorRealizar)
                        .addContainerGap())))
        );

        tbpPrincipal.addTab("Realizar Valoracion Fisica", pnlRealizar);

        cbxSemanas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semana 1", "Semana 2", "Semana 3", "Semana 4", "Semana 5", "Semana 6", "Semana 7", "Semana 8" }));

        lblEjercicio1.setText("Ejercicio 1");

        lblId1.setText("Identificacion paciente");

        lblEjercicio2.setText("Ejercicio 2");

        lblEjercicio3.setText("Ejercicio 3");

        spR3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        spR3.setPreferredSize(new java.awt.Dimension(60, 20));

        lblEjercicio4.setText("Repeticiones");

        lblEjercicio5.setText("Repeticiones");

        lblEjercicio6.setText("Repeticiones");

        spR1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        spR1.setPreferredSize(new java.awt.Dimension(60, 20));

        spR2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        spR2.setPreferredSize(new java.awt.Dimension(60, 20));

        lblEjercicio7.setText("Peso (kg)");

        spP1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        spP1.setPreferredSize(new java.awt.Dimension(60, 20));

        lblEjercicio8.setText("Peso (kg)");

        spP3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        spP3.setPreferredSize(new java.awt.Dimension(60, 20));

        lblEjercicio9.setText("Peso (kg)");

        spP2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        spP2.setPreferredSize(new java.awt.Dimension(60, 20));

        jcFechaElaborar.setPreferredSize(new java.awt.Dimension(90, 20));

        lblId2.setText("Fecha inicio programa fisico");

        lblId4.setText("Elaborar programa fisico");

        btnRegistrarSemana.setText("Registrar semana");

        lblMensajeErrorElaborar.setText(".");

        btnElaborar.setText("Crear Programa Fisico");

        javax.swing.GroupLayout pnlElaborarLayout = new javax.swing.GroupLayout(pnlElaborar);
        pnlElaborar.setLayout(pnlElaborarLayout);
        pnlElaborarLayout.setHorizontalGroup(
            pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlElaborarLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlElaborarLayout.createSequentialGroup()
                        .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlElaborarLayout.createSequentialGroup()
                                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEjercicio2)
                                    .addComponent(lblEjercicio1)
                                    .addComponent(lblEjercicio3)
                                    .addComponent(lblMensajeErrorElaborar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEjercicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEjercicio3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlElaborarLayout.createSequentialGroup()
                                        .addComponent(lblEjercicio4)
                                        .addGap(18, 18, 18)
                                        .addComponent(spR1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlElaborarLayout.createSequentialGroup()
                                        .addComponent(lblEjercicio5)
                                        .addGap(18, 18, 18)
                                        .addComponent(spR2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlElaborarLayout.createSequentialGroup()
                                        .addComponent(lblEjercicio6)
                                        .addGap(18, 18, 18)
                                        .addComponent(spR3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEjercicio9)
                                    .addComponent(lblEjercicio7)
                                    .addComponent(lblEjercicio8)))
                            .addGroup(pnlElaborarLayout.createSequentialGroup()
                                .addComponent(cbxSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnElaborar)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spP3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spP1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlElaborarLayout.createSequentialGroup()
                                .addComponent(spP2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrarSemana))))
                    .addGroup(pnlElaborarLayout.createSequentialGroup()
                        .addComponent(lblId1)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdElaborar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(lblId2)
                        .addGap(18, 18, 18)
                        .addComponent(jcFechaElaborar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlElaborarLayout.createSequentialGroup()
                    .addGap(249, 249, 249)
                    .addComponent(lblId4)
                    .addContainerGap(415, Short.MAX_VALUE)))
        );
        pnlElaborarLayout.setVerticalGroup(
            pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlElaborarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdElaborar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcFechaElaborar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElaborar))
                .addGap(35, 35, 35)
                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlElaborarLayout.createSequentialGroup()
                        .addComponent(lblMensajeErrorElaborar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlElaborarLayout.createSequentialGroup()
                        .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spR1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEjercicio4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spP1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEjercicio7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlElaborarLayout.createSequentialGroup()
                                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEjercicio5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spR2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEjercicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEjercicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEjercicio6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spR3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spP3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEjercicio9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEjercicio3)
                                    .addComponent(txtEjercicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spP2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEjercicio8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegistrarSemana)))
                        .addGap(64, 64, 64))))
            .addGroup(pnlElaborarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlElaborarLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblId4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );

        tbpPrincipal.addTab("Elaborar Programa Fisico", pnlElaborar);

        jLabel1.setText("Identificacion Paciente");

        lblObservacionAsistencia.setText("Observación");

        txtaObservacion.setColumns(20);
        txtaObservacion.setRows(5);
        jScrollPane1.setViewportView(txtaObservacion);

        jcFechaAsistencia.setPreferredSize(new java.awt.Dimension(90, 20));

        lblFechaAsistencia.setText("Fecha asistencia");

        jLabel2.setText("Registro de Asistencia");

        btnAsistencia.setText("Registrar Asistencia");

        lblMensajeErrorAsistencia.setText("-");

        javax.swing.GroupLayout pnlRegistrarAsisLayout = new javax.swing.GroupLayout(pnlRegistrarAsis);
        pnlRegistrarAsis.setLayout(pnlRegistrarAsisLayout);
        pnlRegistrarAsisLayout.setHorizontalGroup(
            pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarAsisLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarAsisLayout.createSequentialGroup()
                        .addGroup(pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblObservacionAsistencia)
                            .addComponent(lblFechaAsistencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAsistencia)
                            .addGroup(pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcFechaAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(txtIdAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMensajeErrorAsistencia))
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarAsisLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))))
        );
        pnlRegistrarAsisLayout.setVerticalGroup(
            pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarAsisLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcFechaAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaAsistencia))
                .addGap(40, 40, 40)
                .addGroup(pnlRegistrarAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObservacionAsistencia)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnAsistencia)
                .addGap(32, 32, 32)
                .addComponent(lblMensajeErrorAsistencia)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tbpPrincipal.addTab("Registrar Asistencia Paciente", pnlRegistrarAsis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnRealizar() {
        return btnRealizar;
    }

    public JTextField getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public JTextField getTxtFrecuenciaReposo() {
        return txtFrecuenciaR;
    }

    public JTextField getTxtFrecuenciaActiva() {
        return txtFrecuenciaActiva;
    }

    public JTextField getTxtEstatura() {
        return txtEstatura;
    }

    public JTextField getTxtMedidaB() {
        return txtMedidaB;
    }

    public JTextField getTxtMedidaC() {
        return txtMedidaC;
    }

    public JTextField getTxtMedidaP() {
        return txtMedidaP;
    }

    public String getJcFechaV() {
        Date date = jcFechaV.getDate();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        String strDate = dateFormat.format(date);
        return strDate;
    }
    
    public JTextField get2TxtIdElaborar() {
        return txtIdElaborar;
    }

    public JSpinner get2SpP1() {
        return spP1;
    }

    public JSpinner get2SpP2() {
        return spP2;
    }

    public JSpinner get2SpP3() {
        return spP3;
    }

    public JSpinner get2SpR1() {
        return spR1;
    }

    public JSpinner get2SpR2() {
        return spR2;
    }

    public JSpinner get2SpR3() {
        return spR3;
    }

    public JTextField get2TxtEjercicio() {
        return txtEjercicio;
    }

    public JTextField get2TxtEjercicio2() {
        return txtEjercicio2;
    }

    public JTextField get2TxtEjercicio3() {
        return txtEjercicio3;
    }

    public JComboBox<String> get2CbxSemanas() {
        return cbxSemanas;
    }
    
    public String get2JcFechaP() {
        Date date = jcFechaElaborar.getDate();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        String strDate = dateFormat.format(date);
        return strDate;
    }

    public JLabel getLblMensajeErrorRealizar() {
        return this.lblMensajeErrorRealizar;
    }
    
    public JLabel getLblMensajeErrorElaborar() {
        return this.lblMensajeErrorElaborar;
    }

    public JButton getBtnElaborar() {
        return btnElaborar;
    }

    public JButton getBtnRegistrarSemana() {
        return btnRegistrarSemana;
    }

    public JButton getBtnAsistencia() {
        return btnAsistencia;
    }

    public String getJcFechaAsistencia() {
        Date date = jcFechaAsistencia.getDate();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        String strDate = dateFormat.format(date);
        return strDate;
    }

    public JTextField getTxtIdElaborar() {
        return txtIdElaborar;
    }

    public JTextArea getTxtaObservacion() {
        return txtaObservacion;
    }

    public JTextField getTxtIdAsistencia() {
        return txtIdAsistencia;
    }

    public JLabel getLblMensajeErrorAsistencia() {
        return lblMensajeErrorAsistencia;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnElaborar;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JButton btnRegistrarSemana;
    private javax.swing.JComboBox<String> cbxSemanas;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcFechaAsistencia;
    private com.toedter.calendar.JDateChooser jcFechaElaborar;
    private com.toedter.calendar.JDateChooser jcFechaV;
    private javax.swing.JLabel lblEjercicio1;
    private javax.swing.JLabel lblEjercicio2;
    private javax.swing.JLabel lblEjercicio3;
    private javax.swing.JLabel lblEjercicio4;
    private javax.swing.JLabel lblEjercicio5;
    private javax.swing.JLabel lblEjercicio6;
    private javax.swing.JLabel lblEjercicio7;
    private javax.swing.JLabel lblEjercicio8;
    private javax.swing.JLabel lblEjercicio9;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblFechaAsistencia;
    private javax.swing.JLabel lblFechaV;
    private javax.swing.JLabel lblFrecuenciaC;
    private javax.swing.JLabel lblFrecuenciaCR;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId4;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblMedidaB;
    private javax.swing.JLabel lblMedidaC;
    private javax.swing.JLabel lblMedidaP;
    private javax.swing.JLabel lblMensajeErrorAsistencia;
    private javax.swing.JLabel lblMensajeErrorElaborar;
    private javax.swing.JLabel lblMensajeErrorRealizar;
    private javax.swing.JLabel lblObservacionAsistencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlElaborar;
    private javax.swing.JPanel pnlRealizar;
    private javax.swing.JPanel pnlRegistrarAsis;
    private javax.swing.JSpinner spP1;
    private javax.swing.JSpinner spP2;
    private javax.swing.JSpinner spP3;
    private javax.swing.JSpinner spR1;
    private javax.swing.JSpinner spR2;
    private javax.swing.JSpinner spR3;
    private javax.swing.JTabbedPane tbpPrincipal;
    private javax.swing.JTextField txtEjercicio;
    private javax.swing.JTextField txtEjercicio2;
    private javax.swing.JTextField txtEjercicio3;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtFrecuenciaActiva;
    private javax.swing.JTextField txtFrecuenciaR;
    private javax.swing.JTextField txtIdAsistencia;
    private javax.swing.JTextField txtIdElaborar;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtMedidaB;
    private javax.swing.JTextField txtMedidaC;
    private javax.swing.JTextField txtMedidaP;
    private javax.swing.JTextArea txtaObservacion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(AModel arg0) {
    }
}
