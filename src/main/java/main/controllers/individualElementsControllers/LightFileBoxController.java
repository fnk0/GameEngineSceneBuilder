package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.LightsController;
import main.controllers.abstractControllers.ControllerWithNode;
import main.models.Light;
import main.models.SceneModel;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
import main.views.LightFileBoxView;

import java.io.File;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 11/4/14
 */
public class LightFileBoxController extends ControllerWithNode {

    @FXML
    private TextField fileLocation;

    private LightsController controller;

    private SceneModel light;

    @FXML
    public void addLight() {
        LightFileBoxView lightFileBoxView = new LightFileBoxView();
        ((LightFileBoxController) lightFileBoxView.getController()).setNodePosition(controller.getViewsList().size());
        ((LightFileBoxController) lightFileBoxView.getController()).setController(controller);
        controller.addView(lightFileBoxView);
    }

    @FXML
    public void removeLight() {
        controller.removeView(getNodePosition());
    }

    @FXML
    public void selectFile() {
        File f = CustomUtils.getFile(ConstantUtils.SELECT_MESH_INSTANCE, new FileChooser.ExtensionFilter[]{CustomUtils.getJsonFilter()});
        fileLocation.setText(f.getAbsolutePath());
        light = CustomUtils.readJsonFile(fileLocation.getText(), new Light());
        //System.out.println(light.toJson());
    }

    public void setController(LightsController controller) {
        this.controller = controller;
    }

    @Override
    public SceneModel getModelData() {
        return light;
    }
}
