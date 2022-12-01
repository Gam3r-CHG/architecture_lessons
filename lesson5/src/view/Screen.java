package view;

import data.ModelFile;
import logic.CreateModel;

/**
 * Main screen of the program
 */
public class Screen implements UI{

    ModelFile modelFile;

    public Screen() {
        this.modelFile = new ModelFile();
    }

    @Override
    public void openMenu() {
        // For example
        LoadModel loadModel = new LoadModel("test");
        this.modelFile = loadModel.modelFile;
    }

    @Override
    public void saveMenu() {
        SaveModel saveModel = new SaveModel("test", this.modelFile);
    }

    @Override
    public void createMenu() {
        // For example
        this.modelFile = new CreateModel().createNewModel();
    }

    @Override
    public void rotateMenu() {
        // For example
        new RotateModel().method1();
    }

    @Override
    public void editMenu() {
        // For example
        new EditModel().method1();
    }
}
