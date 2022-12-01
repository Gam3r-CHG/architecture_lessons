package view;

import data.ModelFile;
import logic.ConvertModel;

/**
 * Save model from internal format to other formats which user choose
 */
public class SaveModel {
    String fileName;
    ModelFile modelFile;
    public SaveModel(String fileName, ModelFile modelFile) {
        this.fileName = fileName;
        if (true) // Test which format (for example 'cad')
        {
            new ConvertModel().ConvertToCad(modelFile, fileName).save();
        }
    }
}
