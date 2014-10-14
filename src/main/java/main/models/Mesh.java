package main.models;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class Mesh extends SceneModel {

    private String name, file;

    public Mesh() {
        this.name = "testName";
        this.file = "testFile";
    }

    public Mesh(String meshName, String meshFile) {
        this.name = meshName;
        this.file = meshFile;
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
