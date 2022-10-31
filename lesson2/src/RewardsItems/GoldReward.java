package RewardsItems;

/**
 * Gold reward
 */
class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}

