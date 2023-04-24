package paq1;
import paqG07.contenedor;
import javax.swing.*;

public class gestioncontainers extends JFrame{
    private JCheckBox inspeccionadoEnAduanasCheckBox;
    private JRadioButton a1RadioButton;
    private JRadioButton a3RadioButton;
    private JRadioButton a2RadioButton;
    private JPanel mainpanel;
    private JLabel rem;
    private JLabel indentify;
    private JLabel pesot;
    private JLabel contenidos;
    private JLabel remite;
    private JLabel recibe;
    private JLabel pais;

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
    public gestioncontainers(contenedor p1){
        setContentPane(mainpanel);
        setTitle("GestionDeContenedores");
        setSize(900,500);


        indentify.setText(String.valueOf(p1.getNumero_identificación()));
        pesot.setText(String.valueOf((p1.getPeso())));
        contenidos.setText(p1.getDescripción());
        remite.setText(p1.getEmpresa_remitente());
        recibe.setText(p1.getEmpresa_receptora());
        pais.setText(p1.getPaís_procedencia());
        if(p1.getPrioridad()==1){
            a1RadioButton.setSelected(true);
        } else if (p1.getPrioridad()==2) {
            a2RadioButton.setSelected(true);
        } else a3RadioButton.setSelected(true);
        if(p1.isAduanas()){
            inspeccionadoEnAduanasCheckBox.setSelected(true);
        }

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
    }
}
