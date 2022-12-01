package data;

import logic.ConvertModel;

/**
 * Example format supported by the program
 */
public class CadFile implements GraphicsFile{
    public String fileName;
    public GraphicsFile graphicsFile;

    public CadFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ModelFile open() {
        this.graphicsFile = new CadFile(fileName);
        return new ConvertModel().ConvertToModel(this.graphicsFile);
    }

    @Override
    public void save() {
        // Some logic
    }
}
