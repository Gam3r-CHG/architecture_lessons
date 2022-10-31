package RewardsItems;

/**
 * Silver reward
 */
class SilverReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Silver");
    }
}