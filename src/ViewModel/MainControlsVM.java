package ViewModel;

import View.MainControls;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainControlsVM {
    private JFileChooser fc;
    private final JFrame frame;
    public File flightDataCsv;


    public MainControlsVM() {
        frame = new JFrame();
    }

    public void handleOpenClick(MainControls c) {
        frame.setVisible(true);
        BringToFront();
        fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(c);

    }

    private void BringToFront() {
        frame.setExtendedState(JFrame.ICONIFIED);
        frame.setExtendedState(JFrame.NORMAL);

    }

}
