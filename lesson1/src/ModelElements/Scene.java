package ModelElements;

import java.util.ArrayList;

/**
 * Class of scene
 */
public class Scene<Type> {
    public static int id = 0;
    public ArrayList<PolygonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();


    /**
     * Constructor of class
     *
     * @param model
     * @param flash
     * @param camera
     */
    public Scene(PolygonalModel model, Flash flash, Type camera) {
        this.models.add(model);
        this.flashes.add(flash);
        ArrayList<Type> cameras = new ArrayList<>();
        cameras.add(camera);
        id++;

    }

    /**
     * Method number 1
     *
     * @param type1 something
     * @return something2
     */
    public Type method1(Type type1) {
        return type1;
    }

    /**
     * Method number 2
     *
     * @param type1 something1
     * @param type2 something2
     * @return something3
     */
    public Type method2(Type type1, Type type2) {
        return type2;
    }
}
