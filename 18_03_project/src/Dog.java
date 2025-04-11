public class Dog extends Pets{
    private String dogBreed;
    private boolean goodHouseKeeper;

    public Dog(int petId, boolean healthy, String petName, String diseases, double weight, String dogBreed, boolean goodHouseKeeper) {
        super(petId, healthy, petName, diseases, weight);
        this.dogBreed = dogBreed;
        this.goodHouseKeeper = goodHouseKeeper;
    }
    public String speak() { return ("Woof! Woof!"); }



    @Override
    public String toString() {
        return "Dog{" +
                "petId = " + getPetId() +
                ", healthy = " + isHealthy() +
                ", petName = '" + getPetName() + '\'' +
                ", diseases = '" + getDiseases() + '\'' +
                ", weight = " + getWeight() +
                ", dogBreed = '" + dogBreed + '\'' +
                ", goodHouseKeeper = " + goodHouseKeeper +
                '}';
    }


}
