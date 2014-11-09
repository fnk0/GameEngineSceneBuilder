package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualElementsControllers.LightFileBoxController;
import main.interfaces.ListData;
import main.models.SceneModel;
import main.views.CreateLightView;
import main.views.DefaultView;
import main.views.LightFileBoxView;

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
public class LightsController extends ListController implements ListData {

    @FXML
    private VBox instancesPanel;

    private List<DefaultView> instanceViews;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        instanceViews = new ArrayList<DefaultView>();
        LightFileBoxView firstLight = new LightFileBoxView();
        ((LightFileBoxController) firstLight.getController()).setController(this);
        instancesPanel.getChildren().add(firstLight);
        instanceViews.add(firstLight);
    }

    @FXML
    public void createLight() {
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(new CreateLightView()));
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
            models.add(v.getController().getModelData());
        }

        return models;
    }
}
