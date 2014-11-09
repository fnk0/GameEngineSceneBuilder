package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.abstractControllers.ControllerWithNode;
import main.controllers.abstractControllers.ListController;
import main.models.Camera;
import main.models.SceneModel;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
import main.views.DefaultBoxView;
import main.views.DefaultView;

import java.io.File;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/26/14
 */
public class DefaultFileBoxController extends ControllerWithNode {

    @FXML
    private TextField filePath;

    private ListController listController;

    private DefaultView defaultBoxView;

    private SceneModel model;

    @FXML
    public void addBox() {
        defaultBoxView = new DefaultBoxView();
        ((DefaultFileBoxController) defaultBoxView.getController()).setNodePosition(listController.getViewsList().size());
        ((DefaultFileBoxController) defaultBoxView.getController()).setListController(listController);
        listController.addView(defaultBoxView);
    }

    @FXML
    public void removeBox() {
        listController.removeView(getNodePosition());
    }

    @FXML
    public void selectFile() {
        File f = CustomUtils.getFile(ConstantUtils.SELECT_CAMERA, new FileChooser.ExtensionFilter[]{CustomUtils.getJsonFilter()});
        filePath.setText(f.getAbsolutePath());
        model = CustomUtils.readJsonFile(filePath.getText(), new Camera());

    }

    public void setListController(ListController listController) {
        this.listController = listController;
    }

    @Override
    public SceneModel getModelData() {
        return model;
    }
}
