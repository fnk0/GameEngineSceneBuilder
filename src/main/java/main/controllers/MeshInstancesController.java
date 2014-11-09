package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.controllers.abstractControllers.ListController;
import main.interfaces.ListData;
import main.models.MeshInstance;
import main.models.SceneModel;
import main.views.CreateMeshInstanceView;
import main.views.DefaultView;
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
public class MeshInstancesController extends ListController implements ListData {

    @FXML
    private VBox instancesPanel;

    private List<DefaultView> instanceViews;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        instanceViews = new ArrayList<DefaultView>();
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

    @Override
    public Pane getBoxPane() {
        return instancesPanel;
    }

    @Override
    public List<DefaultView> getViewsList() {
        return instanceViews;
    }

    @Override
    public ArrayList<SceneModel> getListModelData() {
        ArrayList<SceneModel> models = new ArrayList<>();
        for(DefaultView v : instanceViews) {
            MeshInstance instance = (MeshInstance) v.getController().getModelData();
            models.add(instance);
        }
        return models;
    }
}
