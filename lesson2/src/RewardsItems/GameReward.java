package RewardsItems;

import java.util.ArrayList;
import java.util.Random;

/**
 * Main class of game rewards logic
 */
public class GameReward {
    private final Random random = new Random();
    private final ArrayList<ItemGenerator> generatorList = new ArrayList<>();

    /**
     * Constructor
     */
    public GameReward() {
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new BronzeGenerator());
        generatorList.add(new NullGenerator());
    }

    /**
     * Do random rewards openings
     * @param numberOfRewards number of openings
     */
    public void printRandomRewards(int numberOfRewards) {
        for (int i = 0; i < numberOfRewards; i++) {
            int randomRewardIndex = random.nextInt(generatorList.size());
            ItemGenerator itemGenerator = generatorList.get(randomRewardIndex);
            itemGenerator.openReward();
        }
    }
}