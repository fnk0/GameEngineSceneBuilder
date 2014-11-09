package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.NodesController;
import main.controllers.abstractControllers.ControllerWithNode;
import main.models.Node;
import main.models.SceneModel;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
import main.views.NodeFileBoxView;

import java.io.File;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 11/8/14
 */
public class NodeBoxController extends ControllerWithNode {

    @FXML
    private TextField fileLocation;

    private NodesController controller;

    private SceneModel light;

    @FXML
    public void addNode() {
        NodeFileBoxView nodeFileBoxView = new NodeFileBoxView();
        ((NodeBoxController) nodeFileBoxView.getController()).setNodePosition(controller.getViewsList().size());
        ((NodeBoxController) nodeFileBoxView.getController()).setController(controller);
    }

    @FXML
    public void removeNode() {
        controller.removeView(getNodePosition());
    }

    @FXML
    public void selectFile() {
        File f = CustomUtils.getFile(ConstantUtils.SELECT_NODE, new FileChooser.ExtensionFilter[]{CustomUtils.getJsonFilter()});
        fileLocation.setText(f.getAbsolutePath());
        light = CustomUtils.readJsonFile(fileLocation.getText(), new Node());
        System.out.println(light.toJson());
    }

    public void setController(NodesController controller) {
        this.controller = controller;
    }

    @Override
    public SceneModel getModelData() {
        return light;
    }

}
