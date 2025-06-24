import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Docente extends JFrame{


    private JTextField nombreD_textField;
    private JTextField carrera_textField;
    private JComboBox materias_comboBox;
    private JButton limpiarButton;
    private JPanel panelDocente;

    public Docente() {
        setTitle("REGISTRAR DOCENTE");
        setSize(400, 700);
        setContentPane(panelDocente);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreD_textField.setText("");
                carrera_textField.setText("");
                materias_comboBox.setSelectedIndex(0);
            }
        });
    }
}
