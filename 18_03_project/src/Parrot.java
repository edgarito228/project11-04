public class Parrot extends Pets{
    private String color;
    private boolean canSpeak;

    public Parrot(int petId, boolean healthy, String petName, String diseases, double weight, String color, boolean canSpeak) {
        super(petId, healthy, petName, diseases, weight);
        this.color = color;
        this.canSpeak = canSpeak;
    }

    public String speak() { return ("Squack!"); }

    @Override
    public String toString() {
        return "Parrot {" +
                "petId ="+ getPetId() +
                ", healthy ="+ isHealthy() +
                ", petName='" + getPetName() + '\'' +
                ", diseases='" + getDiseases() + '\'' +
                ", weight = " + getWeight() +
                ", color = '" + color + '\'' +
                ", canSpeak = " + canSpeak +
                '}';
    }
}
