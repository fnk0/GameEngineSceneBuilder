package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import main.controllers.TexturesController;
import main.controllers.abstractControllers.ControllerWithNode;
import main.utils.CustomUtils;
import main.views.TextureFileBoxView;

import java.awt.*;

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

    private TextureFileBoxView texView;

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
        textureFilePath.setText(CustomUtils.getFileOutputLocation());
    }

    public void setTexturesController(TexturesController texturesController) {
        this.texturesController = texturesController;
    }
}
