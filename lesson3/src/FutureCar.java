/**
 * Class of the Future Car
 */
class FutureCar extends Car {
    /**
     * Constructor
     */
    FutureCar() {
        this.setNumberWheels(3);
    }

    @Override
    public void movement() {
        fly();
    }

    private void fly() {
    }
}
