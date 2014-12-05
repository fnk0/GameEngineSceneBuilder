package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import main.controllers.abstractControllers.DefaultController;
import main.models.Node;
import main.models.SceneModel;
import main.utils.ConstantUtils;
import main.utils.CustomUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 11/18/14
 */
public class TileEditorController extends DefaultController {

    @FXML
    Button btn_0_0, btn_0_1, btn_0_2, btn_0_3, btn_0_4, btn_0_5, btn_0_6;

    @FXML
    Button btn_1_0, btn_1_1, btn_1_2, btn_1_3, btn_1_4, btn_1_5, btn_1_6;

    @FXML
    Button btn_2_0, btn_2_1, btn_2_2, btn_2_3, btn_2_4, btn_2_5, btn_2_6;

    @FXML
    Button btn_3_0, btn_3_1, btn_3_2, btn_3_3, btn_3_4, btn_3_5, btn_3_6;

    @FXML
    Button btn_4_0, btn_4_1, btn_4_2, btn_4_3, btn_4_4, btn_4_5, btn_4_6;

    @FXML
    Button btn_5_0, btn_5_1, btn_5_2, btn_5_3, btn_5_4, btn_5_5, btn_5_6;

    private List<SceneModel> nodeList = new ArrayList<>();

    @FXML
    public void get_0_0() {
        nodeList.add(changeObj(0, 0));
    }

    @FXML
    public void get_0_1() {
        nodeList.add(changeObj(0, 1));
    }

    @FXML
    public void get_0_2() {
        nodeList.add(changeObj(0, 2));
    }

    @FXML
    public void get_0_3() {
        nodeList.add(changeObj(0, 3));
    }

    @FXML
    public void get_0_4() {
        nodeList.add(changeObj(0, 4));
    }

    @FXML
    public void get_0_5() {
        nodeList.add(changeObj(0, 5));
    }

    @FXML
    public void get_0_6() {
        nodeList.add(changeObj(0, 6));
    }

    @FXML
      public void get_1_0() {
        nodeList.add(changeObj(1, 0));
    }

    @FXML
    public void get_1_1() {
        nodeList.add(changeObj(1, 1));
    }

    @FXML
    public void get_1_2() {
        nodeList.add(changeObj(1, 2));
    }

    @FXML
    public void get_1_3() {
        nodeList.add(changeObj(1, 3));
    }

    @FXML
    public void get_1_4() {
        nodeList.add(changeObj(1, 4));
    }

    @FXML
    public void get_1_5() {
        nodeList.add(changeObj(1, 5));
    }

    @FXML
    public void get_1_6() {
        nodeList.add(changeObj(1, 6));
    }

    @FXML
    public void get_2_0() {
        nodeList.add(changeObj(2, 0));
    }

    @FXML
    public void get_2_1() {
        nodeList.add(changeObj(2, 1));
    }

    @FXML
    public void get_2_2() {
        nodeList.add(changeObj(2, 2));
    }

    @FXML
    public void get_2_3() {
        nodeList.add(changeObj(2, 3));
    }

    @FXML
    public void get_2_4() {
        nodeList.add(changeObj(2, 4));
    }

    @FXML
    public void get_2_5() {
        nodeList.add(changeObj(2, 5));
    }

    @FXML
    public void get_2_6() {
        nodeList.add(changeObj(2, 6));
    }

    @FXML
    public void get_3_0() {
        nodeList.add(changeObj(3, 0));
    }

    @FXML
    public void get_3_1() {
        nodeList.add(changeObj(3, 1));
    }

    @FXML
    public void get_3_2() {
        nodeList.add(changeObj(3, 2));
    }

    @FXML
    public void get_3_3() {
        nodeList.add(changeObj(3, 3));
    }

    @FXML
    public void get_3_4() {
        nodeList.add(changeObj(3, 4));
    }

    @FXML
    public void get_3_5() {
        nodeList.add(changeObj(3, 5));
    }

    @FXML
    public void get_3_6() {
        nodeList.add(changeObj(3, 6));
    }

    @FXML
    public void get_4_0() {
        nodeList.add(changeObj(4, 0));
    }

    @FXML
    public void get_4_1() {
        nodeList.add(changeObj(4, 1));
    }

    @FXML
    public void get_4_2() {
        nodeList.add(changeObj(4, 2));
    }

    @FXML
    public void get_4_3() {
        nodeList.add(changeObj(4, 3));
    }

    @FXML
    public void get_4_4() {
        nodeList.add(changeObj(4, 4));
    }

    @FXML
    public void get_4_5() {
        nodeList.add(changeObj(4, 5));
    }

    @FXML
    public void get_4_6() {
        nodeList.add(changeObj(4, 6));
    }

    @FXML
    public void get_5_0() {
        nodeList.add(changeObj(5, 0));
    }

    @FXML
    public void get_5_1() {
        nodeList.add(changeObj(5, 1));
    }

    @FXML
    public void get_5_2() {
        nodeList.add(changeObj(5, 2));
    }

    @FXML
    public void get_5_3() {
        nodeList.add(changeObj(5, 3));
    }

    @FXML
    public void get_5_4() {
        nodeList.add(changeObj(5, 4));
    }

    @FXML
    public void get_5_5() {
        nodeList.add(changeObj(5, 5));
    }

    @FXML
    public void get_5_6() {
        nodeList.add(changeObj(5, 6));
    }

    public SceneModel changeObj(int x, int y) {

        File f = CustomUtils.getFile(ConstantUtils.SELECT_NODE, new FileChooser.ExtensionFilter[]{CustomUtils.getJsonFilter()});
        SceneModel node = CustomUtils.readJsonFile(f.getAbsolutePath(), new Node());

        double[] translation = {x, y, ((Node) node).getTranslation()[0]};
        ((Node) node).setTranslation(translation);
        return node;
    }



}
