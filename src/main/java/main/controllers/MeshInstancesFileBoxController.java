package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main.controllers.abstractControllers.DefaultController;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public class MeshInstancesFileBoxController extends DefaultController {

    @FXML
    private TextField meshInstanceName, meshInstanceFilePath;

    private MeshInstancesController controller;

    @FXML
    public void addMeshInstance() {

    }

    @FXML
    public void removeMeshInstance() {

    }

    @FXML
    public void selectMeshInstanceLocation() {

    }

    public void setController(MeshInstancesController controller) {
        this.controller = controller;
    }
}
