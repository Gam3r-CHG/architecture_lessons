package RewardsItems;

/**
 * Abstract class item generator
 */
abstract class ItemGenerator {
    /**
     * open reward action
     */
    void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    /**
     * Create reward item
     *
     * @return reward item
     */
    abstract GameItem createItem();
}