package cliente.presentacion;

import mvcf.AModel;
import mvcf.AView;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author yerso
 */
public class GUIMenuAdmin extends javax.swing.JFrame implements AView {

    /**
     * Creates new form GUIMenuAdmin
     */
    public GUIMenuAdmin() {
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

        gbtnTipoIdReg = new javax.swing.ButtonGroup();
        gbtnOcupacionReg = new javax.swing.ButtonGroup();
        tbpPrincipal = new javax.swing.JTabbedPane();
        pnlRegistrarPersonal = new javax.swing.JPanel();
        pnlTituloReg = new javax.swing.JPanel();
        lblTituloRegistrar = new javax.swing.JLabel();
        pnlTipoIdReg = new javax.swing.JPanel();
        pnlTipoIdRegIzq = new javax.swing.JPanel();
        lblTipoId = new javax.swing.JLabel();
        pnlTipoIdRegDere = new javax.swing.JPanel();
        rbtnCCReg = new javax.swing.JRadioButton();
        rbtnPasaporteReg = new javax.swing.JRadioButton();
        rbtnTIReg = new javax.swing.JRadioButton();
        pnlIdReg = new javax.swing.JPanel();
        lblIdReg = new javax.swing.JLabel();
        txtIdReg = new javax.swing.JTextField();
        pnlNombreReg = new javax.swing.JPanel();
        lblNombreReg = new javax.swing.JLabel();
        txtNombreReg = new javax.swing.JTextField();
        pnlOcupacionReg = new javax.swing.JPanel();
        pnlOcupacionRegIzq = new javax.swing.JPanel();
        lblOcupacionReg = new javax.swing.JLabel();
        pnlOcupacionRegDere = new javax.swing.JPanel();
        rbtnSecretariaReg = new javax.swing.JRadioButton();
        rbtnPaf = new javax.swing.JRadioButton();
        pnlUsuarioReg = new javax.swing.JPanel();
        lblUsuarioReg = new javax.swing.JLabel();
        txtUsuarioReg = new javax.swing.JTextField();
        pnlClave = new javax.swing.JPanel();
        lblClaveReg = new javax.swing.JLabel();
        pssClaveReg = new javax.swing.JPasswordField();
        pnlBotonRegistrar = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        lblMensajeErrorReg = new javax.swing.JLabel();
        pnlModificarPersonal = new javax.swing.JPanel();
        pnlModificarTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlModificarConsulta = new javax.swing.JPanel();
        lblModificarConsultar = new javax.swing.JLabel();
        txtModificarConsultar = new javax.swing.JTextField();
        btnModificarConsultar = new javax.swing.JButton();
        pnlModificarTipoId = new javax.swing.JPanel();
        lblModificarTipoId = new javax.swing.JLabel();
        cbxModificarTipoId = new javax.swing.JComboBox<>();
        pnlModificarId = new javax.swing.JPanel();
        lblModificarId = new javax.swing.JLabel();
        txtModificarId = new javax.swing.JTextField();
        pnlModificarNombre = new javax.swing.JPanel();
        lblModificarNombre = new javax.swing.JLabel();
        txtModificarNombre = new javax.swing.JTextField();
        pnlModificarOcupacion = new javax.swing.JPanel();
        lblModificarOcupacion = new javax.swing.JLabel();
        cbxModificarOcupacion = new javax.swing.JComboBox<>();
        pnlModificarUsuario = new javax.swing.JPanel();
        lblModificarUsuario = new javax.swing.JLabel();
        txtModificarUsuario = new javax.swing.JTextField();
        pnlModificarClave = new javax.swing.JPanel();
        lblModificarClave = new javax.swing.JLabel();
        pssModificarClave = new javax.swing.JPasswordField();
        pnlModificarBoton = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        lblModificarMensaje = new javax.swing.JLabel();
        pnlEliminarPersonal = new javax.swing.JPanel();
        lblEliminarTitulo = new javax.swing.JLabel();
        lblEliminarID = new javax.swing.JLabel();
        txtEliminarId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        lblEliminarMensaje = new javax.swing.JLabel();
        pnlConsultarPersonal = new javax.swing.JPanel();
        pnlTituloConsultar = new javax.swing.JPanel();
        lblTituloConsultar = new javax.swing.JLabel();
        pnlConsultaConsultar = new javax.swing.JPanel();
        lblConsultaConsultar = new javax.swing.JLabel();
        txtConsultaConsultar = new javax.swing.JTextField();
        pnlInformacionConsultar = new javax.swing.JPanel();
        lblNombreConsultar = new javax.swing.JLabel();
        lblNombreConsultaRes = new javax.swing.JLabel();
        lblOcupacionConsultar = new javax.swing.JLabel();
        lblOcupacionConsultaRes = new javax.swing.JLabel();
        lblUsuarioConsulta = new javax.swing.JLabel();
        lblUsuarioConsultaRes = new javax.swing.JLabel();
        pnlBotonConsultar = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        lblMensajeErrorConsultar = new javax.swing.JLabel();
        pnlListarPersonal = new javax.swing.JPanel();
        pnlNorteListar = new javax.swing.JPanel();
        lblTituloListar = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaPersonal = new javax.swing.JTable();
        lblMensajeErrorListar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Administrador");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        tbpPrincipal.setPreferredSize(new java.awt.Dimension(500, 700));

        pnlRegistrarPersonal.setLayout(new java.awt.GridLayout(8, 0));

        pnlTituloReg.setLayout(new java.awt.GridLayout(1, 0));

        lblTituloRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegistrar.setText("Registrar Personal");
        pnlTituloReg.add(lblTituloRegistrar);

        pnlRegistrarPersonal.add(pnlTituloReg);

        pnlTipoIdReg.setLayout(new java.awt.GridLayout(1, 2));

        pnlTipoIdRegIzq.setLayout(new java.awt.GridLayout(1, 0));

        lblTipoId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoId.setText("Tipo de Identificación");
        pnlTipoIdRegIzq.add(lblTipoId);

        pnlTipoIdReg.add(pnlTipoIdRegIzq);

        pnlTipoIdRegDere.setLayout(new java.awt.GridLayout(3, 0));

        gbtnTipoIdReg.add(rbtnCCReg);
        rbtnCCReg.setSelected(true);
        rbtnCCReg.setText("Cedula de Ciudadania");
        pnlTipoIdRegDere.add(rbtnCCReg);

        gbtnTipoIdReg.add(rbtnPasaporteReg);
        rbtnPasaporteReg.setText("Pasaporte");
        pnlTipoIdRegDere.add(rbtnPasaporteReg);

        gbtnTipoIdReg.add(rbtnTIReg);
        rbtnTIReg.setText("Tarjeta de Identidad");
        pnlTipoIdRegDere.add(rbtnTIReg);

        pnlTipoIdReg.add(pnlTipoIdRegDere);

        pnlRegistrarPersonal.add(pnlTipoIdReg);

        pnlIdReg.setLayout(new java.awt.GridLayout(1, 0));

        lblIdReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdReg.setText("ID");
        pnlIdReg.add(lblIdReg);
        pnlIdReg.add(txtIdReg);

        pnlRegistrarPersonal.add(pnlIdReg);

        pnlNombreReg.setLayout(new java.awt.GridLayout(1, 0));

        lblNombreReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreReg.setText("Nombre Completo");
        pnlNombreReg.add(lblNombreReg);
        pnlNombreReg.add(txtNombreReg);

        pnlRegistrarPersonal.add(pnlNombreReg);

        pnlOcupacionReg.setLayout(new java.awt.GridLayout(1, 0));

        pnlOcupacionRegIzq.setLayout(new java.awt.GridLayout(1, 0));

        lblOcupacionReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOcupacionReg.setText("Ocupación");
        pnlOcupacionRegIzq.add(lblOcupacionReg);

        pnlOcupacionReg.add(pnlOcupacionRegIzq);

        pnlOcupacionRegDere.setLayout(new java.awt.GridLayout(2, 0));

        gbtnOcupacionReg.add(rbtnSecretariaReg);
        rbtnSecretariaReg.setSelected(true);
        rbtnSecretariaReg.setText("Secretaria");
        pnlOcupacionRegDere.add(rbtnSecretariaReg);

        gbtnOcupacionReg.add(rbtnPaf);
        rbtnPaf.setText("Profesional de Acondicionamiento Fisico");
        pnlOcupacionRegDere.add(rbtnPaf);

        pnlOcupacionReg.add(pnlOcupacionRegDere);

        pnlRegistrarPersonal.add(pnlOcupacionReg);

        pnlUsuarioReg.setLayout(new java.awt.GridLayout(1, 0));

        lblUsuarioReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioReg.setText("Usuario");
        pnlUsuarioReg.add(lblUsuarioReg);
        pnlUsuarioReg.add(txtUsuarioReg);

        pnlRegistrarPersonal.add(pnlUsuarioReg);

        pnlClave.setLayout(new java.awt.GridLayout(1, 0));

        lblClaveReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClaveReg.setText("Clave");
        pnlClave.add(lblClaveReg);
        pnlClave.add(pssClaveReg);

        pnlRegistrarPersonal.add(pnlClave);

        pnlBotonRegistrar.setLayout(new java.awt.GridLayout(2, 0));

        btnRegistrar.setText("Registrar");
        pnlBotonRegistrar.add(btnRegistrar);
        pnlBotonRegistrar.add(lblMensajeErrorReg);

        pnlRegistrarPersonal.add(pnlBotonRegistrar);

        tbpPrincipal.addTab("Registar", pnlRegistrarPersonal);

        pnlModificarPersonal.setLayout(new java.awt.GridLayout(9, 1));

        pnlModificarTitulo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Personal");
        pnlModificarTitulo.add(jLabel1);

        pnlModificarPersonal.add(pnlModificarTitulo);

        pnlModificarConsulta.setLayout(new java.awt.GridLayout(1, 3));

        lblModificarConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarConsultar.setText("Consultar Personal");
        pnlModificarConsulta.add(lblModificarConsultar);
        pnlModificarConsulta.add(txtModificarConsultar);

        btnModificarConsultar.setText("Consultar");
        pnlModificarConsulta.add(btnModificarConsultar);

        pnlModificarPersonal.add(pnlModificarConsulta);

        pnlModificarTipoId.setLayout(new java.awt.GridLayout(1, 0));

        lblModificarTipoId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarTipoId.setText("Tipo ID");
        pnlModificarTipoId.add(lblModificarTipoId);

        cbxModificarTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadania", "Pasaporte", "Tarjeta de Identidad" }));
        pnlModificarTipoId.add(cbxModificarTipoId);

        pnlModificarPersonal.add(pnlModificarTipoId);

        pnlModificarId.setLayout(new java.awt.GridLayout(1, 0));

        lblModificarId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarId.setText("ID");
        pnlModificarId.add(lblModificarId);

        txtModificarId.setEditable(false);
        pnlModificarId.add(txtModificarId);

        pnlModificarPersonal.add(pnlModificarId);

        pnlModificarNombre.setLayout(new java.awt.GridLayout(1, 0));

        lblModificarNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarNombre.setText("Nombre");
        pnlModificarNombre.add(lblModificarNombre);
        pnlModificarNombre.add(txtModificarNombre);

        pnlModificarPersonal.add(pnlModificarNombre);

        pnlModificarOcupacion.setLayout(new java.awt.GridLayout(1, 0));

        lblModificarOcupacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarOcupacion.setText("Ocupación");
        pnlModificarOcupacion.add(lblModificarOcupacion);

        cbxModificarOcupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretaria", "PAF" }));
        pnlModificarOcupacion.add(cbxModificarOcupacion);

        pnlModificarPersonal.add(pnlModificarOcupacion);

        pnlModificarUsuario.setLayout(new java.awt.GridLayout(1, 0));

        lblModificarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarUsuario.setText("Usuario");
        pnlModificarUsuario.add(lblModificarUsuario);
        pnlModificarUsuario.add(txtModificarUsuario);

        pnlModificarPersonal.add(pnlModificarUsuario);

        pnlModificarClave.setLayout(new java.awt.GridLayout(1, 0));

        lblModificarClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarClave.setText("Clave");
        pnlModificarClave.add(lblModificarClave);
        pnlModificarClave.add(pssModificarClave);

        pnlModificarPersonal.add(pnlModificarClave);

        pnlModificarBoton.setLayout(new java.awt.GridLayout(2, 0));

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        pnlModificarBoton.add(btnModificar);
        pnlModificarBoton.add(lblModificarMensaje);

        pnlModificarPersonal.add(pnlModificarBoton);

        tbpPrincipal.addTab("Modificar", pnlModificarPersonal);

        pnlEliminarPersonal.setLayout(new java.awt.GridLayout(5, 3));

        lblEliminarTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminarTitulo.setText("Eliminar Personal");
        pnlEliminarPersonal.add(lblEliminarTitulo);

        lblEliminarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminarID.setText("Identificación del Personal");
        pnlEliminarPersonal.add(lblEliminarID);
        pnlEliminarPersonal.add(txtEliminarId);

        btnEliminar.setText("Eliminar");
        pnlEliminarPersonal.add(btnEliminar);
        pnlEliminarPersonal.add(lblEliminarMensaje);

        tbpPrincipal.addTab("Eliminar", pnlEliminarPersonal);

        pnlConsultarPersonal.setLayout(new java.awt.GridLayout(3, 0));

        pnlTituloConsultar.setLayout(new java.awt.GridLayout(2, 0));

        lblTituloConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloConsultar.setText("Consultar Personal");
        pnlTituloConsultar.add(lblTituloConsultar);

        pnlConsultaConsultar.setLayout(new java.awt.GridLayout(1, 2));

        lblConsultaConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultaConsultar.setText("Ingrese ID del personal");
        pnlConsultaConsultar.add(lblConsultaConsultar);
        pnlConsultaConsultar.add(txtConsultaConsultar);

        pnlTituloConsultar.add(pnlConsultaConsultar);

        pnlConsultarPersonal.add(pnlTituloConsultar);

        pnlInformacionConsultar.setLayout(new java.awt.GridLayout(3, 2));

        lblNombreConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreConsultar.setText("Nombre Completo");
        pnlInformacionConsultar.add(lblNombreConsultar);

        lblNombreConsultaRes.setText("-");
        pnlInformacionConsultar.add(lblNombreConsultaRes);

        lblOcupacionConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOcupacionConsultar.setText("Ocupación");
        pnlInformacionConsultar.add(lblOcupacionConsultar);

        lblOcupacionConsultaRes.setText("-");
        pnlInformacionConsultar.add(lblOcupacionConsultaRes);

        lblUsuarioConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioConsulta.setText("Usuario");
        pnlInformacionConsultar.add(lblUsuarioConsulta);

        lblUsuarioConsultaRes.setText("-");
        pnlInformacionConsultar.add(lblUsuarioConsultaRes);

        pnlConsultarPersonal.add(pnlInformacionConsultar);

        pnlBotonConsultar.setLayout(new java.awt.GridLayout(2, 0));

        btnConsultar.setText("Consultar");
        pnlBotonConsultar.add(btnConsultar);
        pnlBotonConsultar.add(lblMensajeErrorConsultar);

        pnlConsultarPersonal.add(pnlBotonConsultar);

        tbpPrincipal.addTab("Consultar", pnlConsultarPersonal);

        pnlListarPersonal.setLayout(new java.awt.BorderLayout());

        pnlNorteListar.setLayout(new java.awt.GridLayout(1, 0));

        lblTituloListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloListar.setText("Listar Personal");
        pnlNorteListar.add(lblTituloListar);

        btnListar.setText("Listar");
        pnlNorteListar.add(btnListar);

        pnlListarPersonal.add(pnlNorteListar, java.awt.BorderLayout.NORTH);

        tblListaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre Completo", "Ocupación", "Usuario"
            }
        ));
        jScrollPane1.setViewportView(tblListaPersonal);

        pnlListarPersonal.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        pnlListarPersonal.add(lblMensajeErrorListar, java.awt.BorderLayout.PAGE_END);

        tbpPrincipal.addTab("Listar", pnlListarPersonal);

        getContentPane().add(tbpPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUIMenuAdmin().setVisible(true);
//            }
//        });
//    }


    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JPasswordField getPssClaveReg() {
        return pssClaveReg;
    }

    public JRadioButton getRbtnCCReg() {
        return rbtnCCReg;
    }

    public JRadioButton getRbtnPaf() {
        return rbtnPaf;
    }

    public JRadioButton getRbtnPasaporteReg() {
        return rbtnPasaporteReg;
    }

    public JRadioButton getRbtnSecretariaReg() {
        return rbtnSecretariaReg;
    }

    public JRadioButton getRbtnTIReg() {
        return rbtnTIReg;
    }

    public JTextField getTxtConsultaConsultar() {
        return txtConsultaConsultar;
    }

    public JTextField getTxtIdReg() {
        return txtIdReg;
    }

    public JTextField getTxtNombreReg() {
        return txtNombreReg;
    }

    public JTextField getTxtUsuarioReg() {
        return txtUsuarioReg;
    }

    public JLabel getLblMensajeErrorReg() {
        return lblMensajeErrorReg;
    }

    public JLabel getLblMensajeErrorListar() {
        return lblMensajeErrorListar;
    }

    public JLabel getLblMensajeErrorConsultar() {
        return lblMensajeErrorConsultar;
    }

    public JLabel getLblNombreConsultaRes() {
        return lblNombreConsultaRes;
    }

    public JLabel getLblOcupacionConsultaRes() {
        return lblOcupacionConsultaRes;
    }

    public JLabel getLblUsuarioConsultaRes() {
        return lblUsuarioConsultaRes;
    }

    public JTable getTblListaPersonal() {
        return tblListaPersonal;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JComboBox<String> getCbxModificarTipoId() {
        return cbxModificarTipoId;
    }

    public JLabel getLblModificarMensaje() {
        return lblModificarMensaje;
    }

    public JTextField getTxtModificarConsultar() {
        return txtModificarConsultar;
    }

    public JTextField getTxtModificarId() {
        return txtModificarId;
    }

    public JTextField getTxtModificarNombre() {
        return txtModificarNombre;
    }

    public JTextField getTxtModificarUsuario() {
        return txtModificarUsuario;
    }

    public JComboBox<String> getCbxModificarOcupacion() {
        return cbxModificarOcupacion;
    }

    public JPasswordField getPssModificarClave() {
        return pssModificarClave;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JTextField getTxtEliminarId() {
        return txtEliminarId;
    }

    public JLabel getLblEliminarMensaje() {
        return lblEliminarMensaje;
    }

    public JButton getBtnModificarConsultar() {
        return btnModificarConsultar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarConsultar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxModificarOcupacion;
    private javax.swing.JComboBox<String> cbxModificarTipoId;
    private javax.swing.ButtonGroup gbtnOcupacionReg;
    private javax.swing.ButtonGroup gbtnTipoIdReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClaveReg;
    private javax.swing.JLabel lblConsultaConsultar;
    private javax.swing.JLabel lblEliminarID;
    private javax.swing.JLabel lblEliminarMensaje;
    private javax.swing.JLabel lblEliminarTitulo;
    private javax.swing.JLabel lblIdReg;
    private javax.swing.JLabel lblMensajeErrorConsultar;
    private javax.swing.JLabel lblMensajeErrorListar;
    private javax.swing.JLabel lblMensajeErrorReg;
    private javax.swing.JLabel lblModificarClave;
    private javax.swing.JLabel lblModificarConsultar;
    private javax.swing.JLabel lblModificarId;
    private javax.swing.JLabel lblModificarMensaje;
    private javax.swing.JLabel lblModificarNombre;
    private javax.swing.JLabel lblModificarOcupacion;
    private javax.swing.JLabel lblModificarTipoId;
    private javax.swing.JLabel lblModificarUsuario;
    private javax.swing.JLabel lblNombreConsultaRes;
    private javax.swing.JLabel lblNombreConsultar;
    private javax.swing.JLabel lblNombreReg;
    private javax.swing.JLabel lblOcupacionConsultaRes;
    private javax.swing.JLabel lblOcupacionConsultar;
    private javax.swing.JLabel lblOcupacionReg;
    private javax.swing.JLabel lblTipoId;
    private javax.swing.JLabel lblTituloConsultar;
    private javax.swing.JLabel lblTituloListar;
    private javax.swing.JLabel lblTituloRegistrar;
    private javax.swing.JLabel lblUsuarioConsulta;
    private javax.swing.JLabel lblUsuarioConsultaRes;
    private javax.swing.JLabel lblUsuarioReg;
    private javax.swing.JPanel pnlBotonConsultar;
    private javax.swing.JPanel pnlBotonRegistrar;
    private javax.swing.JPanel pnlClave;
    private javax.swing.JPanel pnlConsultaConsultar;
    private javax.swing.JPanel pnlConsultarPersonal;
    private javax.swing.JPanel pnlEliminarPersonal;
    private javax.swing.JPanel pnlIdReg;
    private javax.swing.JPanel pnlInformacionConsultar;
    private javax.swing.JPanel pnlListarPersonal;
    private javax.swing.JPanel pnlModificarBoton;
    private javax.swing.JPanel pnlModificarClave;
    private javax.swing.JPanel pnlModificarConsulta;
    private javax.swing.JPanel pnlModificarId;
    private javax.swing.JPanel pnlModificarNombre;
    private javax.swing.JPanel pnlModificarOcupacion;
    private javax.swing.JPanel pnlModificarPersonal;
    private javax.swing.JPanel pnlModificarTipoId;
    private javax.swing.JPanel pnlModificarTitulo;
    private javax.swing.JPanel pnlModificarUsuario;
    private javax.swing.JPanel pnlNombreReg;
    private javax.swing.JPanel pnlNorteListar;
    private javax.swing.JPanel pnlOcupacionReg;
    private javax.swing.JPanel pnlOcupacionRegDere;
    private javax.swing.JPanel pnlOcupacionRegIzq;
    private javax.swing.JPanel pnlRegistrarPersonal;
    private javax.swing.JPanel pnlTipoIdReg;
    private javax.swing.JPanel pnlTipoIdRegDere;
    private javax.swing.JPanel pnlTipoIdRegIzq;
    private javax.swing.JPanel pnlTituloConsultar;
    private javax.swing.JPanel pnlTituloReg;
    private javax.swing.JPanel pnlUsuarioReg;
    private javax.swing.JPasswordField pssClaveReg;
    private javax.swing.JPasswordField pssModificarClave;
    private javax.swing.JRadioButton rbtnCCReg;
    private javax.swing.JRadioButton rbtnPaf;
    private javax.swing.JRadioButton rbtnPasaporteReg;
    private javax.swing.JRadioButton rbtnSecretariaReg;
    private javax.swing.JRadioButton rbtnTIReg;
    private javax.swing.JTable tblListaPersonal;
    private javax.swing.JTabbedPane tbpPrincipal;
    private javax.swing.JTextField txtConsultaConsultar;
    private javax.swing.JTextField txtEliminarId;
    private javax.swing.JTextField txtIdReg;
    private javax.swing.JTextField txtModificarConsultar;
    private javax.swing.JTextField txtModificarId;
    private javax.swing.JTextField txtModificarNombre;
    private javax.swing.JTextField txtModificarUsuario;
    private javax.swing.JTextField txtNombreReg;
    private javax.swing.JTextField txtUsuarioReg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(AModel arg0) {
    }
}
