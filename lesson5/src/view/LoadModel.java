package view;

import data.CadFile;
import data.ModelFile;

/**
 * Load graphics file which user choose to program and convert to internal format
 */
public class LoadModel {
    String fileName;
    ModelFile modelFile;
    public LoadModel(String fileName) {
        this.fileName = fileName;
        if (true) // Test which format (for example 'cad')
        {
            this.modelFile = new CadFile(fileName).open();
        }
    }
}
