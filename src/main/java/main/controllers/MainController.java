package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import main.controllers.abstractControllers.DefaultController;
import main.models.GameScene;
import main.utils.CustomUtils;
import main.views.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public class MainController extends DefaultController {

    @FXML
    private TextField outputLocation, fileName;

    @FXML
    private AnchorPane loaderPanel;

    private BorderPane middlePane;

    private DefaultView worldSettingsPane, cameraPane, meshesPane, meshInstancesPane;
    private DefaultView texturesPane, lightsPane, nodesPane, tileEditorPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        worldSettingsPane = new WorldSettingsView();
        cameraPane = new CameraView();
        meshesPane = new MeshesView();
        meshInstancesPane = new MeshInstanceView();
        texturesPane = new TextureView();
        lightsPane = new LightsView();
        nodesPane = new NodesView();
        tileEditorPane = new TileEditorView();

        middlePane = new BorderPane();

        CustomUtils.setAnchors(middlePane);

        loaderPanel.getChildren().add(middlePane);

        middlePane.setCenter(worldSettingsPane);
    }

    @FXML
    public void selectWorldSettings() {
        middlePane.setCenter(worldSettingsPane);
    }

    @FXML
    public void selectCamera() {
        middlePane.setCenter(cameraPane);
    }

    @FXML
    public void selectMeshes() {
        middlePane.setCenter(meshesPane);
    }

    @FXML
    public void selectMeshInstances() {
        middlePane.setCenter(meshInstancesPane);
    }

    @FXML
    public void selectTextures() {
        middlePane.setCenter(texturesPane);
    }

    @FXML
    public void selectLights() {
        middlePane.setCenter(lightsPane);
    }

    @FXML
    public void selectNodes() {
        middlePane.setCenter(nodesPane);
    }

    @FXML
    public void selectTileEditor() {
        middlePane.setCenter(tileEditorPane);
    }

    @FXML
    public void selectOutputLocation() {
        outputLocation.setText(CustomUtils.getFileOutputLocation());
    }

    @FXML
    public void createScene() {
        GameScene scene = new GameScene();
        scene.setWorldSettings(worldSettingsPane.getController().getModelData());
        scene.setNodes(((NodesController) nodesPane.getController()).getListModelData());
        scene.setLights(((LightsController) lightsPane.getController()).getListModelData());
        scene.setTextures(((TexturesController) texturesPane.getController()).getListModelData());
        scene.setMeshInstances(((MeshInstancesController) meshInstancesPane.getController()).getListModelData());
        scene.setMeshes(((MeshesController) meshesPane.getController()).getListModelData());
        scene.setCameras(((CameraController) cameraPane.getController()).getListModelData());
        CustomUtils.createJsonFile(scene, outputLocation.getText(), fileName.getText());
    }

}
