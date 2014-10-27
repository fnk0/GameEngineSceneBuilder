package main.controllers.individualStagesControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualElementsControllers.ColorBoxController;
import main.models.SceneModel;
import main.utils.CustomUtils;
import main.views.ColorBoxView;
import main.views.DefaultView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/16/14
 */
public class CreateMeshInstanceController extends ListController {

    @FXML
    private TextField meshInstanceName, meshName, vertexShader, fragmentShader, filePath;

    @FXML
    private TextArea texturesList;

    @FXML
    private VBox colorsPane;

    @FXML
    private Button btnCreate;

    private ArrayList<DefaultView> colorsViews;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        colorsViews = new ArrayList<DefaultView>();
        ColorBoxView colorBoxView = new ColorBoxView();
        ((ColorBoxController) colorBoxView.getController()).setListController(this);
        colorsViews.add(colorBoxView);
        colorsPane.getChildren().add(colorBoxView);
    }

    @FXML
    public void selectFile() {
        filePath.setText(CustomUtils.getFileOutputLocation());
    }

    @FXML
    public void createMeshInstance() {

    }

    @Override
    public Pane getBoxPane() {
        return colorsPane;
    }

    @Override
    public List<DefaultView> getViewsList() {
        return colorsViews;
    }

    @Override
    public SceneModel getModelData() {
        return super.getModelData();
    }
}
