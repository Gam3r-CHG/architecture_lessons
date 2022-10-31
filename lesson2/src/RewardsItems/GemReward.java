package RewardsItems;

/**
 * Gem reward
 */
class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}