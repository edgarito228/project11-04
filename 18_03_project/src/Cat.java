public class Cat extends Pets{
    private String catBreed;
    private int age;

    public Cat(int petId, boolean healthy, String petName, String diseases, double weight, String catBreed, int age) {
        super(petId, healthy, petName, diseases, weight);
        this.catBreed = catBreed;
        this.age = age;
    }
    public String speak() { return ("Meow!"); }

    @Override
    public String toString() {
        return "Cat{" +
                "petId = " + getPetId() +
                ", healthy = " + isHealthy() +
                ", petName = '" + getPetName() + '\'' +
                ", diseases = '" + getDiseases() + '\'' +
                ", weight = " + getWeight() +
                "catBreed = '" + catBreed + '\'' +
                ", age = " + age +
                '}';
    }
}
