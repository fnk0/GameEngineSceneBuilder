package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.controllers.MainController;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class SceneBuilder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = CustomUtils.getLoader(ConstantUtils.MAIN_LAYOUT, getClass().getClassLoader());
        Parent root = loader.load();
        MainController mainController = loader.getController();
        primaryStage.setResizable(false);
        primaryStage.setTitle(ConstantUtils.WINDOW_TITLE);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
