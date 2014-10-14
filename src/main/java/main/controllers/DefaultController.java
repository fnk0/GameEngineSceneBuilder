package main.controllers;

import javafx.fxml.Initializable;
import main.models.SceneModel;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public abstract class DefaultController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * This method will likely be overriden.
     * I do not enforce
     * @return
     */
    public SceneModel getModelData() {
        return null;
    }
}
