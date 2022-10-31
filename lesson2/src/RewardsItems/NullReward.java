package RewardsItems;

/**
 * Null reward
 */
class NullReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Null");
    }
}