package main.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class GameScene {

    private SceneModel worldSettings;
    private List<SceneModel> cameras;
    private List<SceneModel> meshes;
    private List<SceneModel> meshInstances;
    private List<SceneModel> textures;
    private List<SceneModel> lights;

    public GameScene() {
        this.worldSettings = new WorldSettings();
        this.cameras = new ArrayList<SceneModel>();
        this.meshes = new ArrayList<SceneModel>();
        this.meshInstances = new ArrayList<SceneModel>();
        this.textures = new ArrayList<SceneModel>();
        this.lights = new ArrayList<SceneModel>();
    }

    public SceneModel getWorldSettings() {
        return worldSettings;
    }

    public void setWorldSettings(SceneModel worldSettings) {
        this.worldSettings = worldSettings;
    }

    public List<SceneModel> getCameras() {
        return cameras;
    }

    public void setCameras(List<SceneModel> cameras) {
        this.cameras = cameras;
    }

    public List<SceneModel> getMeshes() {
        return meshes;
    }

    public void setMeshes(List<SceneModel> meshes) {
        this.meshes = meshes;
    }

    public List<SceneModel> getMeshInstances() {
        return meshInstances;
    }

    public void setMeshInstances(List<SceneModel> meshInstances) {
        this.meshInstances = meshInstances;
    }

    public List<SceneModel> getTextures() {
        return textures;
    }

    public void setTextures(List<SceneModel> textures) {
        this.textures = textures;
    }

    public List<SceneModel> getLights() {
        return lights;
    }

    public void setLights(List<SceneModel> lights) {
        this.lights = lights;
    }
}
