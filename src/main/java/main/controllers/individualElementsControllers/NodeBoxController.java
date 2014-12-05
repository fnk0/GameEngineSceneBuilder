package main.controllers.individualElementsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import main.controllers.NodesController;
import main.controllers.abstractControllers.ControllerWithNode;
import main.interfaces.ListData;
import main.models.Node;
import main.models.SceneModel;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;
import main.views.NodeFileBoxView;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 11/8/14
 */
public class NodeBoxController extends ControllerWithNode implements ListData {

    @FXML
    private TextField fileLocation, numRepeats, fromX, fromY, fromZ, toX, toZ, toY;

    private NodesController controller;

    @FXML
    private CheckBox repeat;

    private SceneModel node;

    private boolean repeatNode = false;

    @FXML
    public void addNode() {
        NodeFileBoxView nodeFileBoxView = new NodeFileBoxView();
        ((NodeBoxController) nodeFileBoxView.getController()).setNodePosition(controller.getViewsList().size());
        ((NodeBoxController) nodeFileBoxView.getController()).setController(controller);
        controller.addView(nodeFileBoxView);
    }

    @FXML
    public void removeNode() {
        controller.removeView(getNodePosition());
    }

    @FXML
    public void selectFile() {
        File f = CustomUtils.getFile(ConstantUtils.SELECT_NODE, new FileChooser.ExtensionFilter[]{CustomUtils.getJsonFilter()});
        fileLocation.setText(f.getAbsolutePath());
        node = CustomUtils.readJsonFile(fileLocation.getText(), new Node());
        System.out.println(node.toJson());
    }

    public void setController(NodesController controller) {
        this.controller = controller;
    }

    @FXML
    public void shouldRepeat() {
        repeatNode = !repeatNode;
    }

    @Override
    public SceneModel getModelData() {
        return node;
    }

    @Override
    public ArrayList<SceneModel> getListModelData() {
        ArrayList<SceneModel> nodes = new ArrayList<>();
        if(repeatNode) {

            int num = Integer.parseInt(numRepeats.getText());

            double[] start = {Double.parseDouble(fromX.getText()), Double.parseDouble(fromY.getText()), Double.parseDouble(fromZ.getText())};
            double[] end = {Double.parseDouble(toX.getText()), Double.parseDouble(toY.getText()), Double.parseDouble(toZ.getText())};

            for(int i = 0; i < num; i++) {
                double rX = start[0] + (end[0] - start[0]) * Math.random();
                double rY = start[1] + (end[1] - start[1]) * Math.random();
                double rZ = start[2] + (end[2] - start[2]) * Math.random();

                double[] translation = {rX, rY, rZ};
                Node newNode = new Node((Node) node);
                String name = UUID.randomUUID().toString().replaceAll("-", "");
                newNode.setName(name);
                newNode.setTranslation(translation);
                nodes.add(newNode);
            }
        } else {
            nodes.add(node);
        }
        return nodes;
    }
}
