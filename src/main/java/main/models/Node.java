package main.models;

import java.util.ArrayList;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/26/14
 */
public class Node extends SceneModel {

    private String name, parent, meshInstance, backgroundMusic;
    private double[] scale, rotation, translation;
    private ArrayList<String> children;

    public Node() {
        children = new ArrayList<String>();
        this.scale = new double[3];
        this.rotation = new double[4];
        this.translation = new double[3];
        this.name = "";
        this.parent = "";
        this.meshInstance = "";
        this.backgroundMusic = "";
    }

    public Node(String name, String parent, String meshInstance, String backgroundMusic, double[] scale, double[] rotation, double[] translation, ArrayList<String> children) {
        this.name = name;
        this.parent = parent;
        this.meshInstance = meshInstance;
        this.backgroundMusic = backgroundMusic;
        this.scale = scale;
        this.rotation = rotation;
        this.translation = translation;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getMeshInstance() {
        return meshInstance;
    }

    public void setMeshInstance(String meshInstance) {
        this.meshInstance = meshInstance;
    }

    public String getBackgroundMusic() {
        return backgroundMusic;
    }

    public void setBackgroundMusic(String backgroundMusic) {
        this.backgroundMusic = backgroundMusic;
    }

    public double[] getScale() {
        return scale;
    }

    public void setScale(double[] scale) {
        this.scale = scale;
    }

    public double[] getRotation() {
        return rotation;
    }

    public void setRotation(double[] rotation) {
        this.rotation = rotation;
    }

    public double[] getTranslation() {
        return translation;
    }

    public void setTranslation(double[] translation) {
        this.translation = translation;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }
}
