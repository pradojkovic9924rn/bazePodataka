package gui;

import javax.swing.*;
import java.awt.*;

public class SignInFrame extends JFrame {
    JButton enter;
    JTextField imeUneti;
    JTextField sifraUneti;

    public SignInFrame() {
        enter=new JButton("enter");
        imeUneti = new JTextField();
        sifraUneti = new JTextField();

        imeUneti.setText("ovde");
        sifraUneti.setText("ovde");



        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth / 4, screenHeight / 6);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("sign in");

        JPanel panela = new JPanel(new FlowLayout());
        panela.add(new JLabel("Kor. Ime"));
        panela.add(imeUneti);
        panela.add(new JLabel("Sifra"));
        panela.add(sifraUneti);
        panela.add(enter);
        add(panela);
    }
}
