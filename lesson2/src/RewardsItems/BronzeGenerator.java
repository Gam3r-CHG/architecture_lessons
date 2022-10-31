package RewardsItems;

/**
 * Bronze reward generator
 */
class BronzeGenerator extends ItemGenerator {
    @Override
    GameItem createItem() {
        return new BronzeReward();
    }
}