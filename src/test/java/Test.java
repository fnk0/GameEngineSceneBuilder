import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.models.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 10/13/14
 */
public class Test  {

    public static void main(String[] args) {

        GameScene scene = new GameScene();

        WorldSettings worldSettings = new WorldSettings();
        Camera camera = new Camera();
        Mesh mesh = new Mesh();
        MeshInstance meshInstance = new MeshInstance();
        Light light = new Light();
        Texture texture = new Texture();

        MeshColor color = new MeshColor();
        meshInstance.getColors().add(color);

        MeshTex tex = new MeshTex();
        meshInstance.getTextures().add(tex);

        scene.setWorldSettings(worldSettings);
        scene.getCameras().add(camera);
        scene.getMeshes().add(mesh);
        scene.getLights().add(light);
        scene.getTextures().add(texture);
        scene.getMeshInstances().add(meshInstance);


        ObjectMapper mapper = new ObjectMapper();

        try {
            // convert user object to json string, and save to a file
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("testScene.json"), scene);

            // display to console
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(scene));

        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}
