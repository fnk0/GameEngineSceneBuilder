package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualElementsControllers.DefaultFileBoxController;
import main.interfaces.ListData;
import main.models.SceneModel;
import main.views.DefaultBoxView;
import main.views.DefaultView;
import main.views.NewNodeView;

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
public class NodesController extends ListController implements ListData{

    @FXML
    private VBox nodesPanel;

    private List<DefaultView> nodesViews;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        nodesViews = new ArrayList<DefaultView>();
        DefaultBoxView cBoxView = new DefaultBoxView();
        ((DefaultFileBoxController) cBoxView.getController()).setListController(this);
        nodesViews.add(cBoxView);
        nodesPanel.getChildren().add(cBoxView);
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
        for(DefaultView v : nodesViews) {
            modelData.add(v.getController().getModelData());
        }
        return modelData;
    }
}
