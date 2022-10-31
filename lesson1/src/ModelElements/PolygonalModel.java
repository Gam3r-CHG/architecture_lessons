package ModelElements;

/**
 * Polygonal Model class
 */
public class PolygonalModel {
    public Polygon polygons;
    public Texture textures;

    /**
     * Constructor of class
     *
     * @param polygons
     */
    public PolygonalModel(Polygon polygons) {
        this.polygons = polygons;
        this.textures = new Texture();
    }
}
