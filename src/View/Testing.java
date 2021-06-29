package View;

import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Testing {
    public ListView list;

    public void initialize() {
        list = new ListView();

        list.getItems().add("1");
        list.getItems().add("2");
        list.getItems().add("3");
        list.getItems().add("4");
        list.getItems().add("5");
        list.getItems().add("6");

    }

}
