package main.models;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class MeshTex extends SceneModel {

    private String name, type;

    public MeshTex() {
        this.name = "testTex";
        this.type = "testType";
    }

    public MeshTex(String texName, String texType) {
        this.name = texName;
        this.type = texType;
    }

    public String getTexName() {
        return name;
    }

    public void setTexName(String texName) {
        this.name = texName;
    }

    public String getTexType() {
        return type;
    }

    public void setTexType(String texType) {
        this.type = texType;
    }
}
