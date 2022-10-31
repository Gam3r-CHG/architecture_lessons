package RewardsItems;

/**
 * Null reward generator
 */
class NullGenerator extends ItemGenerator {
    @Override
    GameItem createItem() {
        return new NullReward();
    }
}