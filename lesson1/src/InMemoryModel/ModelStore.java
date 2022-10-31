package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;

/**
 * Class dataset of models, scenes. flashes and cameras
 */
public class ModelStore implements IModelChanger {
    public ArrayList<PolygonalModel> models = new ArrayList<>();
    public ArrayList<Scene> scenes = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    private ArrayList<IModelChangedObserver> changedObservers = new ArrayList<>();


    /**
     * Constructor of class
     *
     * @param polygon
     * @param modelIndex
     * @param cameraId
     */
    public ModelStore(Polygon polygon, int modelIndex, int cameraId) {
        models.add(new PolygonalModel(polygon));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(
                models.get(modelIndex),
                flashes.get(modelIndex),
                cameras.get(modelIndex)));
    }

    /**
     * Get scene
     *
     * @param sceneNumber number of scene
     * @return scene with number = sceneNumber
     */
    public Scene GetScene(int sceneNumber) {
        return scenes.get(sceneNumber);
    }

    /**
     * Method from interface IModelChanger
     *
     * @param sender
     */
    @Override
    public void notifyChange(IModelChanger sender) {
    }
}
