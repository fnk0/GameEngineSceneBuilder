package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.controllers.abstractControllers.DefaultController;
import main.views.CreateMeshInstanceView;
import main.views.MeshInstanceFileBoxView;

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
public class MeshInstancesController extends DefaultController {

    @FXML
    private VBox instancesPanel;

    private List<MeshInstanceFileBoxView> instanceViews;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        instanceViews = new ArrayList<MeshInstanceFileBoxView>();
        MeshInstanceFileBoxView firstMesh = new MeshInstanceFileBoxView();
        ((MeshInstancesFileBoxController) firstMesh.getController()).setController(this);
        instancesPanel.getChildren().add(firstMesh);
        instanceViews.add(firstMesh);
    }

    @FXML
    public void createMeshInstance() {
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(new CreateMeshInstanceView()));
        stage.sizeToScene();
        stage.show();
    }

    public void addMeshToList(MeshInstanceFileBoxView m) {
        instanceViews.add(m);
    }

    public void addMeshViewToBox(MeshInstanceFileBoxView v) {
        instancesPanel.getChildren().add(v);
    }

    public List<MeshInstanceFileBoxView> getMeshViews() {
        return instanceViews;
    }

}
