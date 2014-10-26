package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualElementsControllers.CameraBoxController;
import main.views.CameraBoxView;
import main.views.DefaultView;
import main.views.NewCameraView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public class CameraController extends ListController {

    @FXML
    private VBox camerasPanel;

    private List<DefaultView> camerasViews;

    @FXML
    public void createNewCamera() {
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(new NewCameraView()));
        stage.sizeToScene();
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        camerasViews = new ArrayList<DefaultView>();
        CameraBoxView cBoxView = new CameraBoxView();
        ((CameraBoxController) cBoxView.getController()).setCameraController(this);
        camerasViews.add(cBoxView);
        camerasPanel.getChildren().add(cBoxView);
    }

    @Override
    public Pane getBoxPane() {
        return camerasPanel;
    }

    @Override
    public List<DefaultView> getViewsList() {
        return camerasViews;
    }
}
