package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualElementsControllers.MeshController;
import main.views.DefaultView;
import main.views.MeshView;

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
public class MeshesController extends ListController {

    @FXML
    private VBox meshesPanel;

    private List<DefaultView> meshViews;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        meshViews = new ArrayList<DefaultView>();
        MeshView firstMesh = new MeshView();
        ((MeshController) firstMesh.getController()).setMeshesController(this);
        meshesPanel.getChildren().add(firstMesh);
        meshViews.add(firstMesh);
    }

    @Override
    public Pane getBoxPane() {
        return meshesPanel;
    }

    @Override
    public List<DefaultView> getViewsList() {
        return meshViews;
    }

}
