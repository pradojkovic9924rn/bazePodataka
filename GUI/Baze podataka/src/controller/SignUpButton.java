package controller;

import gui.MainFrame;
import gui.SignInFrame;
import gui.SignUpFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SignUpButton extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().setVisible(false);
        SignUpFrame signUpFrame = new SignUpFrame();
        signUpFrame.setVisible(true);
    }
}
