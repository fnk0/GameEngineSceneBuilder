package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.MeshesController;
import main.controllers.abstractControllers.ControllerWithNode;
import main.models.Mesh;
import main.models.SceneModel;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
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
        meshFilePath.setText(CustomUtils.getFileNameWithoutPath(ConstantUtils.SELECT_MESH, new FileChooser.ExtensionFilter[]{CustomUtils.getPlyFilter()}));
    }

    public void setMeshesController(MeshesController meshesController) {
        this.meshesController = meshesController;
    }

    @Override
    public SceneModel getModelData() {
        Mesh mesh = new Mesh();
        mesh.setName(meshName.getText());
        mesh.setFile(meshFilePath.getText());
        return mesh;
    }
}
