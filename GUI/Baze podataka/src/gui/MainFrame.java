package gui;

import controller.SignInButton;
import controller.SignUpButton;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static MainFrame mainFrame;
    private JButton login;
    private JButton signUp;

    private MainFrame()  {
        init();
    }

    public static MainFrame getInstance(){
        if(mainFrame == null){
            mainFrame = new MainFrame();
        }
        return mainFrame;
    }

    private void init(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth / 4, screenHeight / 6);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("pocetni ekran");
        JPanel panela = new JPanel();
        panela.setLayout(new FlowLayout());



        login = new JButton("sign in");
        login.setAction(new SignInButton());
        login.setText("sign in");
        signUp = new JButton("sign up");
        signUp.setAction(new SignUpButton());
        signUp.setText("sign up");
        JLabel labela = new JLabel("proba");
        panela.add(login);
        panela.add(signUp);

        add(panela);
        setVisible(true);

    }
}
