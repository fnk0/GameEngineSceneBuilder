package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import main.controllers.abstractControllers.ControllerWithNode;
import main.views.DefaultView;

import java.util.List;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/16/14
 */
public class ColorRowController extends ControllerWithNode {

    @FXML
    private ComboBox<String> colorType;

    @FXML
    private TextField red, green, blue, alpha;

    private ColorRowController mController;

    private List<DefaultView> colors;

    @FXML
    public void removeColorBox() {

    }

    @FXML
    public void addColorBox() {

    }

    public void setController(ColorRowController mController) {
        this.mController = mController;
    }
}
