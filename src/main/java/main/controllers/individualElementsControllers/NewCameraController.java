package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.controllers.abstractControllers.DefaultController;
import main.models.Camera;
import main.models.SceneModel;
import main.utils.CustomUtils;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/26/14
 */
public class NewCameraController extends DefaultController {

    @FXML
    private TextField cameraName, eyeX, eyeY, eyeZ, outputLocation;

    @FXML
    private TextField vupX, vupY, vupZ, zNear, zFar, fileName;

    @FXML
    private TextField centerX, centerY, centerZ, fovY;

    @FXML
    private Button btnCreateCamera;

    private Camera camera;


    @FXML
    public void selectLocation() {
        outputLocation.setText(CustomUtils.getFileOutputLocation());
    }

    @FXML
    public void createCamera() {
        CustomUtils.createJsonFile(getModelData(), outputLocation.getText(), fileName.getText());
        ((Stage) btnCreateCamera.getScene().getWindow()).close();
    }

    @Override
    public SceneModel getModelData() {

        camera = new Camera();

        if(cameraName.getText() != null) {
            camera.setName(cameraName.getText());
        }

        if(CustomUtils.isTextNumValid(eyeX)) {
            camera.getEye()[0] = Double.parseDouble(eyeX.getText());
        }

        if(CustomUtils.isTextNumValid(eyeY)) {
            camera.getEye()[1] = Double.parseDouble(eyeY.getText());
        }

        if(CustomUtils.isTextNumValid(eyeZ)) {
            camera.getEye()[2] = Double.parseDouble(eyeZ.getText());
        }

        if(CustomUtils.isTextNumValid(vupX)) {
            camera.getVup()[0] = Double.parseDouble(vupX.getText());
        }

        if(CustomUtils.isTextNumValid(vupY)) {
            camera.getVup()[1] = Double.parseDouble(vupY.getText());
        }

        if(CustomUtils.isTextNumValid(vupZ)) {
            camera.getVup()[0] = Double.parseDouble(vupZ.getText());
        }

        if(CustomUtils.isTextNumValid(centerX)) {
            camera.getCenter()[0] = Double.parseDouble(centerX.getText());
        }

        if(CustomUtils.isTextNumValid(centerY)) {
            camera.getCenter()[0] = Double.parseDouble(centerY.getText());
        }

        if(CustomUtils.isTextNumValid(centerZ)) {
            camera.getCenter()[0] = Double.parseDouble(centerZ.getText());
        }

        if(CustomUtils.isTextNumValid(zNear)) {
            camera.setZnear(Double.parseDouble(zNear.getText()));
        }

        if(CustomUtils.isTextNumValid(zFar)) {
            camera.setZfar(Integer.parseInt(zFar.getText()));
        }

        if(CustomUtils.isTextNumValid(fovY)) {
            camera.setFovy(Double.parseDouble(fovY.getText()));
        }

        return camera;
    }

}
