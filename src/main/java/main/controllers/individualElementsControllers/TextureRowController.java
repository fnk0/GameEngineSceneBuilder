package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import main.controllers.abstractControllers.ControllerWithNode;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualStagesControllers.CreateMeshInstanceController;
import main.models.MeshTex;
import main.models.SceneModel;
import main.views.TextureRowView;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/16/14
 */
public class TextureRowController extends ControllerWithNode {

    @FXML
    private ComboBox<String> texType;

    @FXML
    private TextField texName;

    private CreateMeshInstanceController instanceController;

    private ListController listController;

    @FXML
    public void removeTexture() {
        ((CreateMeshInstanceController) listController).removeTexture(getNodePosition());
    }

    @FXML
    public void addTexture() {
        TextureRowView tex = new TextureRowView();
        ((TextureRowController) tex.getController()).setListController(listController);
        ((TextureRowController) tex.getController()).setNodePosition(((CreateMeshInstanceController)listController).getTexturesList().size());
        ((CreateMeshInstanceController) listController).addTexture(tex);
    }

    public void setListController(ListController listController) {
        this.listController = listController;
    }

    @Override
    public SceneModel getModelData() {
        MeshTex tex = new MeshTex();
        tex.setTexName(texName.getText());
        tex.setTexType(texType.getValue());
        return tex;
    }
}
