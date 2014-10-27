package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.abstractControllers.ControllerWithNode;
import main.controllers.abstractControllers.ListController;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
import main.views.DefaultBoxView;
import main.views.DefaultView;

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

    private DefaultView cameraBoxView;

    @FXML
    public void addBox() {
        cameraBoxView = new DefaultBoxView();
        ((DefaultFileBoxController) cameraBoxView.getController()).setNodePosition(listController.getViewsList().size());
        ((DefaultFileBoxController) cameraBoxView.getController()).setListController(listController);
        listController.addView(cameraBoxView);
    }

    @FXML
    public void removeBox() {
        listController.removeView(getNodePosition());
    }

    @FXML
    public void selectFile() {
        filePath.setText(CustomUtils.getFile(ConstantUtils.SELECT_CAMERA, new FileChooser.ExtensionFilter[]{CustomUtils.getJsonFilter()}));
    }

    public void setListController(ListController listController) {
        this.listController = listController;
    }
}
