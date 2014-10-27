package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import main.controllers.abstractControllers.ControllerWithNode;
import main.controllers.abstractControllers.ListController;
import main.models.MeshColor;
import main.models.SceneModel;
import main.utils.CustomUtils;
import main.views.ColorBoxView;
import main.views.DefaultView;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/16/14
 */
public class ColorBoxController extends ControllerWithNode {

    @FXML
    private TextField colorType, red, blue, green, alpha;

    private DefaultView colorView;

    private ListController listController;

    @FXML
    public void addColor() {
        colorView = new ColorBoxView();
        ((ColorBoxController) colorView.getController()).setNodePosition(listController.getViewsList().size());
        ((ColorBoxController) colorView.getController()).setListController(listController);
        listController.addView(colorView);
    }

    @FXML
    public void removeColor() {
        listController.removeView(getNodePosition());
    }

    public void setListController(ListController listController) {
        this.listController = listController;
    }

    @Override
    public SceneModel getModelData() {
        MeshColor color = new MeshColor();
        color.setType(colorType.getText());

        if(CustomUtils.isTextNumValid(red)) {
            color.setRed(red.getText());
        }
        if(CustomUtils.isTextNumValid(blue)) {
            color.setBlue(blue.getText());
        }
        if(CustomUtils.isTextNumValid(green)) {
            color.setGreen(green.getText());
        }
        if(CustomUtils.isTextNumValid(alpha)) {
            color.setAlpha(alpha.getText());
        }
        return color;
    }
}
