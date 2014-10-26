package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main.controllers.abstractControllers.DefaultController;
import main.models.SceneModel;
import main.models.WorldSettings;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public class WorldSettingsController extends DefaultController {

    @FXML
    private TextField windowTitle, width, height;

    @FXML
    private TextField red, green, blue, alpha;

    @FXML
    private TextField backgroundMusic, spp;

    @Override
    public SceneModel getModelData() {

        WorldSettings worldSettings = new WorldSettings();
        worldSettings.setWindowTitle(windowTitle.getText());
        worldSettings.setBackgroundMusic(backgroundMusic.getText());
        worldSettings.setWidth(Integer.parseInt(width.getText()));
        worldSettings.setHeight(Integer.parseInt(height.getText()));

        Double r = Double.parseDouble(red.getText());
        Double g = Double.parseDouble(green.getText());
        Double b = Double.parseDouble(blue.getText());
        Double a = Double.parseDouble(alpha.getText());

        worldSettings.setBackgroundColor(new double[]{r, g, b, a});

        return worldSettings;
    }
}
