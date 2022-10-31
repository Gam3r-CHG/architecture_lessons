package InMemoryModel;

/**
 * Interface of model change
 */
public interface IModelChanger {
    void notifyChange(IModelChanger sender);
}
