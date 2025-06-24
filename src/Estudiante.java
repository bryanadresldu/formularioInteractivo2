import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudiante extends JFrame {
    private JTextField nombre_textField;
    private JTextField apellido_textField;
    private JTextField carrera_textField;
    private JTextField edad_textField;
    private JTextField nota1_textField;
    private JTextField nota2_textField;
    private JTextField nota3_textField;
    private JPanel panelEstudiante;
    private JButton calcular_Button;
    private JButton limpiar_Button;
    private JButton REGISTRARDOCENTEButton;

    public Estudiante() {
        setTitle("CALIFICACIONES");
        setSize(400, 700);
        setContentPane(panelEstudiante);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        calcular_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarCampos()) {
                    double nota1 = Double.parseDouble(nota1_textField.getText());
                    double nota2 = Double.parseDouble(nota2_textField.getText());
                    double nota3 = Double.parseDouble(nota3_textField.getText());

                    if (nota1<=20&&nota2<=20&&nota3<=20&&nota1>=0&&nota2>=0&&nota3>=0) {
                        double promedio=(nota1+nota2+nota3)/3;
                        JOptionPane.showMessageDialog(null,"El promedio es: "+promedio);
                    } else {
                        JOptionPane.showMessageDialog(null,"Error ingrese notas validas");

                    }
                }

            }
        });

        limpiar_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nombre_textField.setText("");
                apellido_textField.setText("");
                carrera_textField.setText("");
                edad_textField.setText("");
                nota1_textField.setText("");
                nota2_textField.setText("");
                nota3_textField.setText("");
            }
        });
        REGISTRARDOCENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Docente();
                dispose();
            }
        });
    }

    public boolean validarCampos() {
        if (nombre_textField.getText().trim().isEmpty() ||
                apellido_textField.getText().trim().isEmpty() ||
                carrera_textField.getText().trim().isEmpty() ||
                edad_textField.getText().trim().isEmpty() ||
                nota1_textField.getText().trim().isEmpty() ||
                nota2_textField.getText().trim().isEmpty() ||
                nota3_textField.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return false;
        }
        return true;
    }

}
