package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.TexturesController;
import main.controllers.abstractControllers.ControllerWithNode;
import main.models.SceneModel;
import main.models.Texture;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
import main.views.DefaultView;
import main.views.TextureFileBoxView;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/16/14
 */
public class TextureBoxController extends ControllerWithNode {

    @FXML
    private TextField textureName, textureFilePath;

    private TexturesController texturesController;

    private DefaultView texView;

    @FXML
    public void addTexture() {
        texView = new TextureFileBoxView();
        ((TextureBoxController) texView.getController()).setNodePosition(texturesController.getViewsList().size());
        ((TextureBoxController) texView.getController()).setTexturesController(texturesController);
        texturesController.addView(texView);
    }

    @FXML
    public void removeTexture() {
        texturesController.removeView(getNodePosition());
    }

    @FXML
    public void selectTextureLocation() {
        textureFilePath.setText(CustomUtils.getFileNameWithoutPath(ConstantUtils.SELECT_TEXTURE, new FileChooser.ExtensionFilter[]{CustomUtils.getPngFilter()}));
    }

    public void setTexturesController(TexturesController texturesController) {
        this.texturesController = texturesController;
    }

    @Override
    public SceneModel getModelData() {

        Texture texture = new Texture();
        texture.setName(textureName.getText());
        texture.setFile(textureFilePath.getText());

        return texture;
    }
}
