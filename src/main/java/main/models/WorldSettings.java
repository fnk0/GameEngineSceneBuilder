package main.models;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class WorldSettings extends SceneModel {

    private String windowTitle, backgroundMusic;
    private double[] backgroundColor;
    private int width, height, spp;

    public WorldSettings() {
        this.windowTitle = "Window Title";
        this.backgroundMusic = "";
        this.width = 1024;
        this.height = 768;
        this.spp = 16;
        this.backgroundColor = new double[] {0.0, 0.0, 0.0, 1.0};
    }

    public WorldSettings(String windowTitle, int width, int height) {
        super();
        this.windowTitle = windowTitle;
        this.width = width;
        this.height = height;
    }

    public String getWindowTitle() {
        return windowTitle;
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    public String getBackgroundMusic() {
        return backgroundMusic;
    }

    public void setBackgroundMusic(String backgroundMusic) {
        this.backgroundMusic = backgroundMusic;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpp() {
        return spp;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public double[] getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(double[] backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
