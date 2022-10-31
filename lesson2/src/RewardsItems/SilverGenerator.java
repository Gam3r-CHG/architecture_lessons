package RewardsItems;

/**
 * Silver reward generator
 */
class SilverGenerator extends ItemGenerator {
    @Override
    GameItem createItem() {
        return new SilverReward();
    }
}