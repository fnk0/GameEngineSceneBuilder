package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.abstractControllers.ControllerWithNode;
import main.models.MeshInstance;
import main.models.SceneModel;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
import main.views.MeshInstanceFileBoxView;

import java.io.File;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public class MeshInstancesFileBoxController extends ControllerWithNode {

    @FXML
    private TextField meshInstanceFilePath;

    private MeshInstancesController controller;

    private MeshInstanceFileBoxView meshInstanceFileBoxView;

    private SceneModel meshInstance;

    @FXML
    public void addMeshInstance() {
        meshInstanceFileBoxView = new MeshInstanceFileBoxView();
        ((MeshInstancesFileBoxController) meshInstanceFileBoxView.getController()).setNodePosition(controller.getViewsList().size());
        ((MeshInstancesFileBoxController) meshInstanceFileBoxView.getController()).setController(controller);
        controller.addView(meshInstanceFileBoxView);
    }

    @FXML
    public void removeMeshInstance() {
        controller.removeView(getNodePosition());
    }

    @FXML
    public void selectMeshInstanceLocation() {
        File f = CustomUtils.getFile(ConstantUtils.SELECT_MESH_INSTANCE, new FileChooser.ExtensionFilter[]{CustomUtils.getJsonFilter()});
        meshInstanceFilePath.setText(f.getAbsolutePath());
        meshInstance = CustomUtils.readJsonFile(meshInstanceFilePath.getText(), new MeshInstance());
    }

    public void setController(MeshInstancesController controller) {
        this.controller = controller;
    }

    @Override
    public SceneModel getModelData() {
        return meshInstance;
    }
}
