package main.controllers.abstractControllers;

import javafx.scene.layout.Pane;
import main.views.DefaultView;

import java.util.List;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/16/14
 */
public abstract class ListController extends DefaultController {

    public abstract Pane getBoxPane();

    public abstract List<DefaultView> getViewsList();

    public void addView(DefaultView m) {
        getViewsList().add(m);
        getBoxPane().getChildren().add(m);
    }

    public void removeView(int indexPosition) {
        if(indexPosition == 0) return;
        getViewsList().remove(indexPosition);
        getBoxPane().getChildren().remove(indexPosition);
    }

}
