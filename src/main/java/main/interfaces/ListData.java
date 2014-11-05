package main.interfaces;

import main.models.SceneModel;

import java.util.ArrayList;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/27/14
 */
public interface ListData  {

    ArrayList<SceneModel> modelData = new ArrayList<SceneModel>();

    public ArrayList<SceneModel> getListModelData();

}
