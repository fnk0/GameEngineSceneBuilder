package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualElementsControllers.NodeBoxController;
import main.interfaces.ListData;
import main.models.SceneModel;
import main.views.DefaultView;
import main.views.NewNodeView;
import main.views.NodeFileBoxView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/26/14
 */
public class NodesController extends ListController implements ListData {

    @FXML
    private VBox nodesPanel;

    private List<DefaultView> nodesViews;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        nodesViews = new ArrayList<DefaultView>();
        NodeFileBoxView nodeBoxView = new NodeFileBoxView();
        ((NodeBoxController) nodeBoxView.getController()).setController(this);
        nodesViews.add(nodeBoxView);
        nodesPanel.getChildren().add(nodeBoxView);
    }

    @FXML
    public void createNewNode() {
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(new NewNodeView()));
        stage.sizeToScene();
        stage.show();
    }

    @Override
    public Pane getBoxPane() {
        return nodesPanel;
    }

    @Override
    public List<DefaultView> getViewsList() {
        return nodesViews;
    }

    @Override
    public ArrayList<SceneModel> getListModelData() {
        ArrayList<SceneModel> models = new ArrayList<>();
        for(DefaultView v : nodesViews) {
            models.add(v.getController().getModelData());
        }
        return models;
    }
}
