package main.models;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class Light extends SceneModel {

    private String name, type;
    private double[] uLightDirection, uLightPosition, uAttenuation, uLightColor, uConeAngles;

    public Light() {
        this.name = "testLightName";
        this.type = "testLightType";
        this.uLightDirection = new double[] {0.0, 1.0, 0.0, 0.0};
        this.uLightPosition = new double[] {0.0, 0.0, 0.0, 1.0};
        this.uAttenuation = new double[] {0.0, 0.0, 0.0, 1.0};
        this.uLightColor = new double[] {0.0, 0.0, 0.0, 0.0};
        this.uConeAngles = new double[] {0.5, 0.55, 0.0, 0.0};
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double[] getDirection() {
        return uLightDirection;
    }

    public void setDirection(double[] direction) {
        this.uLightDirection = direction;
    }

    public double[] getPosition() {
        return uLightPosition;
    }

    public void setPosition(double[] position) {
        this.uLightPosition = position;
    }

    public double[] getAttenuation() {
        return uAttenuation;
    }

    public void setAttenuation(double[] attenuation) {
        this.uAttenuation = attenuation;
    }

    public double[] getColor() {
        return uLightColor;
    }

    public void setColor(double[] color) {
        this.uLightColor = color;
    }

    public double[] getConeAngles() {
        return uConeAngles;
    }

    public void setConeAngles(double[] coneAngles) {
        this.uConeAngles = coneAngles;
    }
}
