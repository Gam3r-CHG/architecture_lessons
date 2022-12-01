package logic;

import data.CadFile;
import data.GraphicsFile;
import data.ModelFile;

/**
 * Format's converter
 */
public class ConvertModel {
    /**
     * Convert to internal format from other formats
     * @param graphicsFile
     * @return
     */
    public ModelFile ConvertToModel(GraphicsFile graphicsFile){
        // Some logic
        return new ModelFile();
    }

    /**
     * Convert to Cad format from internal format
     * @param modelFile
     * @param fileName
     * @return
     */
    public CadFile ConvertToCad(ModelFile modelFile, String fileName){
        // Some logic
        return new CadFile(fileName);
    }

}
