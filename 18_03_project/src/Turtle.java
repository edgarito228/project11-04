public class Turtle extends Pets{
    private int size;
    private String classification;

    public Turtle(int petId, boolean healthy, String petName, String diseases, double weight, int size, String classification) {
        super(petId, healthy, petName, diseases, weight);
        this.size = size;
        this.classification = classification;
    }
    public String speak() { return ("I'm a turtle"); }

    @Override
    public String toString() {
        return "Turtle{" +
                "petId = " + getPetId() +
                ", healthy = " + isHealthy() +
                ", petName='" + getPetName() + '\'' +
                ", diseases='" + getDiseases() + '\'' +
                ", weight=" + getWeight() +
                "size=" + size +
                ", classification='" + classification + '\'' +
                '}';
    }
}
