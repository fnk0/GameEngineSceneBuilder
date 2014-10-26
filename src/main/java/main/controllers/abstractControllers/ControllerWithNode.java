package main.controllers.abstractControllers;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/16/14
 */
public abstract class ControllerWithNode extends DefaultController {

    private int nodePosition;

    public int getNodePosition() {
        return nodePosition;
    }

    public void setNodePosition(int nodePosition) {
        this.nodePosition = nodePosition;
    }
}
