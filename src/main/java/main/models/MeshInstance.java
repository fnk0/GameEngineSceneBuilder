package main.models;

import java.util.ArrayList;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class MeshInstance extends SceneModel {

    private String name, mesh, vertexShader, fragmentShader;
    private double[] scale, rotation, translation;
    private ArrayList<MeshTex> textures;
    private ArrayList<MeshColor> colors;

    public MeshInstance() {
        this.name = "testName";
        this.mesh = "testMesh";
        this.vertexShader = "testVShader";
        this.fragmentShader = "testFShader";
        this.scale = new double[3];
        this.rotation = new double[4];
        this.translation = new double[3];
        this.textures = new ArrayList<MeshTex>();
        this.colors = new ArrayList<MeshColor>();
    }

    public ArrayList<MeshTex> getTextures() {
        return textures;
    }

    public void setTextures(ArrayList<MeshTex> textures) {
        this.textures = textures;
    }

    public ArrayList<MeshColor> getColors() {
        return colors;
    }

    public void setColors(ArrayList<MeshColor> colors) {
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMesh() {
        return mesh;
    }

    public void setMesh(String mesh) {
        this.mesh = mesh;
    }

    public String getVertexShader() {
        return vertexShader;
    }

    public void setVertexShader(String vertexShader) {
        this.vertexShader = vertexShader;
    }

    public String getFragmentShader() {
        return fragmentShader;
    }

    public void setFragmentShader(String fragmentShader) {
        this.fragmentShader = fragmentShader;
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
}
