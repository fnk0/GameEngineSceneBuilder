package main.controllers.individualStagesControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.abstractControllers.DefaultController;
import main.models.Node;
import main.models.SceneModel;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/26/14
 */
public class CreateNewNodeController extends DefaultController {

    @FXML
    private TextField nodeName, parentNode, meshInstance, backgroundMusic, outputLocation;

    @FXML
    private TextField trX, trY, trZ, rtX, rtY, rtZ, rtW, scX, scY, scZ;

    @FXML
    private CheckBox isBillboard;

    @FXML
    private Button btnCreateNode;

    private Node node;

    @FXML
    public void createNewNode() {
        CustomUtils.createJsonFile(getModelData(), outputLocation.getText(), nodeName.getText());
        CustomUtils.closeStage(btnCreateNode);
    }

    @FXML
    public void selectMusic() {
        backgroundMusic.setText(CustomUtils.getFileNameWithoutPath(ConstantUtils.SELECT_MUSIC, new FileChooser.ExtensionFilter[]{CustomUtils.getMusicFilters()}));
    }

    @FXML
    public void selectFile() {
        outputLocation.setText(CustomUtils.getFileOutputLocation());
    }

    @Override
    public SceneModel getModelData() {

        node = new Node();

        if(nodeName.getText() != null) {
            node.setName(nodeName.getText());
        }

        node.setParent(parentNode.getText());

        if(meshInstance.getText() != null) {
            node.setMeshInstance(meshInstance.getText());
        }

        if(backgroundMusic.getText() != null) {
            node.setBackgroundMusic(backgroundMusic.getText());
        }

        if(CustomUtils.isTextNumValid(trX)) {
            node.getTranslation()[0] = Double.parseDouble(trX.getText());
        }

        if(CustomUtils.isTextNumValid(trY)) {
            node.getTranslation()[1] = Double.parseDouble(trY.getText());
        }

        if(CustomUtils.isTextNumValid(trZ)) {
            node.getTranslation()[2] = Double.parseDouble(trZ.getText());
        }

        if(CustomUtils.isTextNumValid(rtX)) {
            node.getRotation()[0] = Double.parseDouble(rtX.getText());
        }

        if(CustomUtils.isTextNumValid(rtY)) {
            node.getRotation()[1] = Double.parseDouble(rtY.getText());
        }

        if(CustomUtils.isTextNumValid(rtZ)) {
            node.getRotation()[2] = Double.parseDouble(rtZ.getText());
        }

        if(CustomUtils.isTextNumValid(rtW)) {
            node.getRotation()[3] = Double.parseDouble(rtW.getText());
        }

        if(CustomUtils.isTextNumValid(scX)) {
            node.getScale()[0] = Double.parseDouble(scX.getText());
        }

        if(CustomUtils.isTextNumValid(scY)) {
            node.getScale()[1] = Double.parseDouble(scY.getText());
        }

        if(CustomUtils.isTextNumValid(scZ)) {
            node.getScale()[2] = Double.parseDouble(scZ.getText());
        }

        node.setBillboard(isBillboard.isSelected());

        return node;
    }
}
