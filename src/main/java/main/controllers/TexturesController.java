package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import main.controllers.abstractControllers.ListController;
import main.controllers.individualElementsControllers.TextureBoxController;
import main.views.DefaultView;
import main.views.TextureFileBoxView;

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
public class TexturesController extends ListController {

    @FXML
    private VBox texturesPanel;

    private List<DefaultView> texturesView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        texturesView = new ArrayList<DefaultView>();
        TextureFileBoxView tex = new TextureFileBoxView();
        ((TextureBoxController) tex.getController()).setTexturesController(this);
        texturesView.add(tex);
        texturesPanel.getChildren().add(tex);
    }

    @Override
    public Pane getBoxPane() {
        return texturesPanel;
    }

    @Override
    public List<DefaultView> getViewsList() {
        return texturesView;
    }
}
