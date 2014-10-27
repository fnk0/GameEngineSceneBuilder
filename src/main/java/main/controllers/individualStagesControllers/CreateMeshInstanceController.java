package main.controllers.individualStagesControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualElementsControllers.ColorBoxController;
import main.controllers.individualElementsControllers.TextureRowController;
import main.models.MeshColor;
import main.models.MeshInstance;
import main.models.MeshTex;
import main.models.SceneModel;
import main.utils.CustomUtils;
import main.views.ColorBoxView;
import main.views.DefaultView;
import main.views.TextureRowView;

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
    private VBox colorsPane, texturesPane;

    @FXML
    private Button btnCreate;

    private ArrayList<DefaultView> colorsViews;
    private ArrayList<DefaultView> texturesViews;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        colorsViews = new ArrayList<DefaultView>();
        texturesViews = new ArrayList<DefaultView>();
        ColorBoxView colorBoxView = new ColorBoxView();
        ((ColorBoxController) colorBoxView.getController()).setListController(this);
        colorsViews.add(colorBoxView);
        colorsPane.getChildren().add(colorBoxView);

        TextureRowView texRow = new TextureRowView();
        ((TextureRowController) texRow.getController()).setListController(this);
        texturesViews.add(texRow);
        texturesPane.getChildren().add(texRow);
    }

    @FXML
    public void selectFile() {
        filePath.setText(CustomUtils.getFileOutputLocation());
    }

    @FXML
    public void createMeshInstance() {
        CustomUtils.createJsonFile(getModelData(), filePath.getText(), meshInstanceName.getText());
        CustomUtils.closeStage(btnCreate);
    }

    @Override
    public Pane getBoxPane() {
        return colorsPane;
    }

    @Override
    public List<DefaultView> getViewsList() {
        return colorsViews;
    }

    public Pane getTexPane() {
        return texturesPane;
    }

    public List<DefaultView> getTexturesList() {
        return texturesViews;
    }

    public void addTexture(DefaultView t) {
        texturesViews.add(t);
        texturesPane.getChildren().add(t);
    }

    public void removeTexture(int nodePosition) {
        if(nodePosition == 0) return;
        texturesViews.remove(nodePosition);
        texturesPane.getChildren().remove(nodePosition);
    }

    @Override
    public SceneModel getModelData() {
        MeshInstance instance = new MeshInstance();
        instance.setName(meshInstanceName.getText());
        instance.setMesh(meshName.getText());
        instance.setVertexShader(vertexShader.getText());
        instance.setFragmentShader(fragmentShader.getText());
        ArrayList<MeshColor> colors = new ArrayList<MeshColor>();
        ArrayList<MeshTex> textures = new ArrayList<MeshTex>();
        for(DefaultView c : colorsViews) {
            colors.add((MeshColor) c.getController().getModelData());
        }
        for(DefaultView t : texturesViews) {
            textures.add((MeshTex) t.getController().getModelData());
        }
        instance.setColors(colors);
        instance.setTextures(textures);
        return instance;
    }
}
