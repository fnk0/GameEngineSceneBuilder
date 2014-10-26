package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.CameraController;
import main.controllers.abstractControllers.ControllerWithNode;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
import main.views.CameraBoxView;
import main.views.DefaultView;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/26/14
 */
public class CameraBoxController extends ControllerWithNode {

    @FXML
    private TextField cameraFilePath;

    private CameraController cameraController;

    private DefaultView cameraBoxView;

    @FXML
    public void addCamera() {
        cameraBoxView = new CameraBoxView();
        ((CameraBoxController) cameraBoxView.getController()).setNodePosition(cameraController.getViewsList().size());
        ((CameraBoxController) cameraBoxView.getController()).setCameraController(cameraController);
        cameraController.addView(cameraBoxView);
    }

    @FXML
    public void removeCamera() {
        cameraController.removeView(getNodePosition());
    }

    @FXML
    public void selectFile() {
        cameraFilePath.setText(CustomUtils.getFile(ConstantUtils.SELECT_CAMERA, new FileChooser.ExtensionFilter[]{CustomUtils.getJsonFilter()}));
    }

    public void setCameraController(CameraController cameraController) {
        this.cameraController = cameraController;
    }
}
