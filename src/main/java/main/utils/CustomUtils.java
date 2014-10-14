package main.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/14/14
 */
public class CustomUtils {

    /**
     *
     * @param pane
     * @return
     */
    public static Pane setAnchors(Pane pane) {
        AnchorPane.setTopAnchor(pane, 0.0);
        AnchorPane.setBottomAnchor(pane, 0.0);
        AnchorPane.setLeftAnchor(pane, 0.0);
        AnchorPane.setRightAnchor(pane, 0.0);

        return pane;
    }

    /**
     *
     * @param fileLocation
     * @param loader
     * @return
     */
    public static FXMLLoader getLoader(String fileLocation, ClassLoader loader) {
        return new FXMLLoader(loader.getResource(fileLocation));
    }

    public static boolean isTextNumValid(TextField field) {

        if(!field.getText().isEmpty()) {
            try {
                double d = Double.parseDouble(field.getText());
                return true;
            } catch (Exception ex) {
                System.out.println("Not valid field: " + field.getText());
                ex.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
