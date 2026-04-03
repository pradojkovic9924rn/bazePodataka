import gui.MainFrame;

import javax.swing.*;
import java.awt.*;

public class ApplicationFramework {
    private static ApplicationFramework applicationInstance;
    private MainFrame mainFrame;
    private ApplicationFramework() {
        init();
    }

    public static ApplicationFramework getInstance(){
        if(applicationInstance == null){
            applicationInstance = new ApplicationFramework();
        }
        return applicationInstance;
    }

    private void init(){
        MainFrame mainFrame = MainFrame.getInstance();
    }
}
