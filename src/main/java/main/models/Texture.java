package main.models;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class Texture extends SceneModel {

    private String name, file;

    public Texture() {
        this.name = "test";
        this.file = "test.png";
    }

    public Texture(String textureName, String textureFile) {
        this.name = textureName;
        this.file = textureFile;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
