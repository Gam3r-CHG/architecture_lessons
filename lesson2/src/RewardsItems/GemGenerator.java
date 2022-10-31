package RewardsItems;

/**
 * Gem reward generator
 */
class GemGenerator extends ItemGenerator {
    @Override
    GameItem createItem() {
        return new GemReward();
    }
}