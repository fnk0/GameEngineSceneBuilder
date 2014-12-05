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

    private String name, parent, meshInstance, backgroundMusic,camera;
    private double[] scale, rotation, translation;
    private int mass;
    private ArrayList<String> children, scripts;
    private boolean is_billboard;


    public Node() {
        children = new ArrayList<String>();
        this.scale = new double[3];
        this.rotation = new double[4];
        this.translation = new double[3];
        this.name = "testNode";
        this.parent = "someNode";
        this.meshInstance = "cubeInstance";
        this.backgroundMusic = "background.mp3";
        this.is_billboard = false;
        this.scripts = new ArrayList<>();
        this.camera = "camera";
    }

    public Node(Node n) {
        this.name = n.getName();
        this.parent = n.getParent();
        this.meshInstance = n.getMeshInstance();
        this.backgroundMusic = n.getBackgroundMusic();
        this.camera = n.getCamera();
        this.scale = n.getScale();
        this.rotation = n.getRotation();
        this.translation = n.getTranslation();
        this.mass = n.getMass();
        this.children = n.getChildren();
        this.scripts = n.getScripts();
        this.is_billboard = n.isBillboard();
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

    public boolean isBillboard() {
        return is_billboard;
    }

    public void setBillboard(boolean isBillboard) {
        this.is_billboard = isBillboard;
    }

    public ArrayList<String> getScripts() {
        return scripts;
    }

    public void setScripts(ArrayList<String> scripts) {
        this.scripts = scripts;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}
