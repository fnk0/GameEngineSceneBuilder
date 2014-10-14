package main.models;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class Camera extends SceneModel {

    private String name;
    private double[] eye, center, vup;
    private double fovy, znear;
    private int zfar;

    public Camera() {
        this.name = "testName";
        this.eye = new double[3];
        this.center = new double[3];
        this.vup = new double[3];
        this.fovy = 0.0;
        this.znear = 0.0;
        this.zfar = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getEye() {
        return eye;
    }

    public void setEye(double[] eye) {
        this.eye = eye;
    }

    public double[] getCenter() {
        return center;
    }

    public void setCenter(double[] center) {
        this.center = center;
    }

    public double[] getVup() {
        return vup;
    }

    public void setVup(double[] vup) {
        this.vup = vup;
    }

    public double getFovy() {
        return fovy;
    }

    public void setFovy(double fovy) {
        this.fovy = fovy;
    }

    public double getZnear() {
        return znear;
    }

    public void setZnear(double znear) {
        this.znear = znear;
    }

    public int getZfar() {
        return zfar;
    }

    public void setZfar(int zfar) {
        this.zfar = zfar;
    }
}
