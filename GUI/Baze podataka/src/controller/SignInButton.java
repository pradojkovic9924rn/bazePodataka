package controller;

import gui.MainFrame;
import gui.SignInFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SignInButton extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().setVisible(false);
        SignInFrame signInFrame = new SignInFrame();
        signInFrame.setVisible(true);
    }
}
