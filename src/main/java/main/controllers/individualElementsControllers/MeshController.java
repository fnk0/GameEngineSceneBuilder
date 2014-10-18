package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main.controllers.MeshesController;
import main.controllers.abstractControllers.ControllerWithNode;
import main.views.MeshView;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public class MeshController extends ControllerWithNode {

    @FXML
    private TextField meshName, meshFilePath;

    private MeshesController meshesController;

    private MeshView thisMesh;

    @FXML
    public void addMesh() {
        thisMesh = new MeshView();
        ((MeshController) thisMesh.getController()).setNodePosition(meshesController.getViewsList().size());
        ((MeshController) thisMesh.getController()).setMeshesController(meshesController);
        meshesController.addView(thisMesh);
    }

    @FXML
    public void removeMesh() {
        meshesController.removeView(getNodePosition());
    }

    @FXML
    public void selectMeshLocation() {

    }

    public void setMeshesController(MeshesController meshesController) {
        this.meshesController = meshesController;
    }


}
