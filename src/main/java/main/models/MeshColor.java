package main.models;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class MeshColor extends SceneModel {

    private String type;
    private double[] value;

    public MeshColor() {
        this.type = "testColorType";
        this.value = new double[]{0, 0, 0, 1};
    }

    public MeshColor(String type, double[] color) {
        this.type = type;
        this.value = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double[] getValue() {
        return value;
    }

    public void setValue(double[] value) {
        this.value = value;
    }

    public void setRed(String  r) {
        value[0] = Double.parseDouble(r);
    }

    public void setBlue(String b) {
        value[1] = Double.parseDouble(b);
    }

    public void setGreen(String g) {
        value[2] = Double.parseDouble(g);
    }

    public void setAlpha(String a) {
        value[3] = Double.parseDouble(a);
    }
}
