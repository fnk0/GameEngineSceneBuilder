package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import main.utils.CustomUtils;
import main.views.CameraView;
import main.views.DefaultView;
import main.views.WorldSettingsView;

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

    private DefaultView worldSettingsPane, cameraPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        worldSettingsPane = new WorldSettingsView();
        cameraPane = new CameraView();

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

    }

    @FXML
    public void selectMeshInstances() {

    }

    @FXML
    public void selectTextures() {

    }

    @FXML
    public void selectLights() {

    }

    @FXML
    public void selectOutputLocation() {

    }

    @FXML
    public void createScene() {

    }

}
