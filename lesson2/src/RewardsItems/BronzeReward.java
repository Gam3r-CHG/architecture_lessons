package RewardsItems;

/**
 * Bronze reward
 */
class BronzeReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Bronze");
    }
}