package main.views;

import main.controllers.DefaultController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import main.utils.CustomUtils;

import java.io.IOException;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public abstract class DefaultView extends AnchorPane {

    private DefaultController mController;

    public DefaultView() {

        Pane pane = getPaneFromXML();

        CustomUtils.setAnchors(pane);

        this.getChildren().add(pane);
    }

    public Pane getPaneFromXML() {

        Pane root = null;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(getLayoutLocation()));
            root = loader.load();
            mController = loader.getController();
        } catch (NullPointerException ex) {
            System.out.println("XML Layout is Null.");
        } catch (IOException ex) {
            System.out.println("Could not load XML layout.");
        }

        return root;
    }

    public abstract String getLayoutLocation();

    public DefaultController getController() {
        return mController;
    }
}
