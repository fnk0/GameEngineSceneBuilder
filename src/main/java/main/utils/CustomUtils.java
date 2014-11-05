package main.utils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import main.models.SceneModel;

import java.io.File;
import java.io.IOException;

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

    /**
     *
     * @param field
     * @return
     */
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

    /**
     *
     * @return
     */
    public static String getFileOutputLocation() {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("Select output location");
        File mFile = chooser.showDialog(null);

        if(mFile != null) {
            return mFile.getAbsolutePath().toString();
        } else {
            return null;
        }
    }

    /**
     *
     * @param element
     */
    public static void closeStage(Control element) {
        ((Stage) element.getScene().getWindow()).close();
    }

    /**
     *
     * @return
     */
    public static FileChooser.ExtensionFilter getPngFilter() {
        return new FileChooser.ExtensionFilter("PNG", "*.png");
    }

    /**
     *
     * @return
     */
    public static FileChooser.ExtensionFilter getPlyFilter() {
        return new FileChooser.ExtensionFilter("PLY", "*.ply");
    }

    /**
     *
     * @return
     */
    public static FileChooser.ExtensionFilter getMp3Filter() {
        return new FileChooser.ExtensionFilter("MP3", "*.mp3");
    }

    /**
     *
     * @return
     */
    public static FileChooser.ExtensionFilter getWavFilter() {
        return new FileChooser.ExtensionFilter("WAV", "*.wav");
    }

    /**
     *
     * @return
     */
    public static FileChooser.ExtensionFilter getMusicFilters() {
        return new FileChooser.ExtensionFilter("Music Extensions", "*mp3, *.wav");
    }

    /**
     * @return
     */
    public static FileChooser.ExtensionFilter getJsonFilter() {
        return new FileChooser.ExtensionFilter("Json", "*.json");
    }

    /**
     *
     * @param windowTitle
     * @param filters
     * @return
     */
    public static String getFileNameWithoutPath(String windowTitle, FileChooser.ExtensionFilter[] filters) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle(windowTitle);
        chooser.getExtensionFilters().addAll(filters);
        File mFile = chooser.showOpenDialog(null);

        if(mFile != null) {
            return mFile.getName();
        } else {
            return null;
        }
    }

    public static File getFile(String windowTitle, FileChooser.ExtensionFilter[] filters) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle(windowTitle);
        chooser.getExtensionFilters().addAll(filters);
        File mFile = chooser.showOpenDialog(null);

        if (mFile != null) {
            return mFile;
        } else {
            return null;
        }
    }

    /**
     *
     * @param filePath
     * @param readModel
     * @return
     */
    public static SceneModel readJsonFile(String filePath, SceneModel readModel) {
        ObjectMapper mapper = new ObjectMapper();
        SceneModel model = null;
        try {
            model = mapper.readValue(new File(filePath), readModel.getClass());
        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return model;
    }

    public static void createJsonFile(SceneModel model, String filePath, String filename) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // convert user object to json string, and save to a file
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath + "/" + filename + ".json"), model);
            // display to console
            //System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(model));
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
