import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanaQueSeCierra extends EscuchadorVentana {
    private void ejecuta() {
        JFrame ventana = new JFrame("Ventana que se cierra");
        ventana.addWindowListener(new EscuchadorVentana());
    }
}

class EscuchadoraBoton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Pulsaste el botón.");
    }
}

public class Gui01 extends JFrame {
    private Container panel;
    private JButton miboton;

    private JButton miboton2;
    public Gui01 () {
        super("Ejemplo de Layout");
        setLayout(new FlowLayout(FlowLayout.CENTER,15,15));
        panel.add(miboton);
        miboton.addActionListener(new EscuchadoraBotton());
        panel.setSize(500, 500);
        panel.setVisible(true);
        setSize(800,800);
        setVisible(true);
        panel.addWindowListener(new EscuchadorVentana());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        Gui01 aplicacion = new Gui01();
    }}