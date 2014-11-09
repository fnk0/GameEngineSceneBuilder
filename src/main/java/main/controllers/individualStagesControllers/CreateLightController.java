package main.controllers.individualStagesControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import main.controllers.abstractControllers.DefaultController;
import main.models.Light;
import main.utils.CustomUtils;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 11/4/14
 */
public class CreateLightController extends DefaultController {


    @FXML
    TextField lightName, drX, drY, drZ, drW, posX, posY, posZ, posW, outputLocation;

    @FXML
    TextField atteX, atteY, atteZ, red, green, blue, alpha, caX, caY, caZ, caW;

    @FXML
    ComboBox<String> type;

    @FXML
    Button btnCreateLight;

    @FXML
    public void selectFile() {
        outputLocation.setText(CustomUtils.getFileOutputLocation());
    }

    @FXML
    public void createNewLight() {

        Light l = new Light();
        l.setName(lightName.getText());

        l.getDirection()[0] = Double.parseDouble(drX.getText());
        l.getDirection()[1] = Double.parseDouble(drY.getText());
        l.getDirection()[2] = Double.parseDouble(drZ.getText());
        l.getDirection()[3] = Double.parseDouble(drW.getText());

        l.getPosition()[0] = Double.parseDouble(posX.getText());
        l.getPosition()[1] = Double.parseDouble(posY.getText());
        l.getPosition()[2] = Double.parseDouble(posZ.getText());
        l.getPosition()[3] = Double.parseDouble(posW.getText());

        l.getAttenuation()[0] = Double.parseDouble(atteX.getText());
        l.getAttenuation()[1] = Double.parseDouble(atteY.getText());
        l.getAttenuation()[2] = Double.parseDouble(atteZ.getText());

        l.getColor()[0] = Double.parseDouble(red.getText());
        l.getColor()[1] = Double.parseDouble(green.getText());
        l.getColor()[2] = Double.parseDouble(blue.getText());
        l.getColor()[3] = Double.parseDouble(alpha.getText());

        l.getConeAngles()[0] = Double.parseDouble(caX.getText());
        l.getConeAngles()[1] = Double.parseDouble(caY.getText());
        l.getConeAngles()[2] = Double.parseDouble(caZ.getText());
        l.getConeAngles()[3] = Double.parseDouble(caW.getText());

        CustomUtils.createJsonFile(l, outputLocation.getText(), l.getName());
        CustomUtils.closeStage(btnCreateLight);
    }
}
