package RewardsItems;

/**
 * Gold reward generator
 */
class GoldGenerator extends ItemGenerator {
    @Override
    GameItem createItem() {
        return new GoldReward();
    }
}