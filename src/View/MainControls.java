package View;

import ViewModel.MainControlsVM;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainControls extends Component {
    public Button OpenButton;

    private final MainControlsVM vm;

    public MainControls() {
        vm = new MainControlsVM();
    }


    public void handleOpenButton(javafx.event.ActionEvent actionEvent) {
        vm.handleOpenClick(this);
    }
}
