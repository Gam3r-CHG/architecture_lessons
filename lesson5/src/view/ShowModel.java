package view;

import data.ModelFile;
import logic.RenderModel;

/**
 * Show model in program
 */
public class ShowModel {
    public void show(ModelFile modelFile){
        new RenderModel().render(modelFile);
    }
}
