import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Pets {
    private static int petId;
    private boolean healthy;
    private String petName;
    private String diseases;
    private double weight;
    private static ArrayList<Pets> petsCollection = new ArrayList<Pets>();

    public static ArrayList<Pets> getPetsCollection() {
        return petsCollection;
    }
    public static void addPets(Pets pets) { petsCollection.add(pets); }
    public static void removePets(Pets pets) { petsCollection.remove(pets); }

    public Pets(int petId, boolean healthy, String petName, String diseases, double weight) {
        this.petId = petId;
        this.healthy = healthy;
        this.petName = petName;
        this.diseases = diseases;
        this.weight = weight;
    }
    public String speak() { return("*animal sounds*"); }
    public String healing() {
        healthy = true;
        return ("This animal is healthy");
    }
    public String unexpectedIllnessOccurred() {
        healthy = false;
        return ("This animal is not healthy");
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void registration() {
        System.out.println("Hello from Daugavpils Charity Vet Clinic!");
        System.out.println("Enter the attending vet name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (Objects.equals(name, "Edgar Trofimov")) {
            System.out.println("Your patients data: ");
            Dog p1 = new Dog (1, false, "Bobik", "canine flu", 23, "Husky", true);
            p1.toString();
        }
        else {
            System.out.println("Your name isn't registered in the database. Would you like to register a pet? Type 1");
            String x = scan.nextLine();
            if (Objects.equals(x, "1")) {
                System.out.println("Is your pet a Dog/Parrot/Turtle/Cat?");
                String pet = scan.nextLine();
                if (Objects.equals(pet, "Dog")) {
                    System.out.println("Put in the dog's information, is he/she healthy (true/false)");
                    boolean healthy = scan.nextBoolean();
                    if (healthy == true) {
                        System.out.println("Dog's name, dog's weight, dog's breed and if he/she is a good house keeper (true/false).");
                        scan.nextLine();
                        String petName = scan.nextLine();
                        String diseases = "None";
                        String weight = scan.nextLine();
                        double weight1 = Double.parseDouble(weight);
                        String dogBreed = scan.nextLine();
                        String goodHouseKeeper = scan.nextLine();
                        boolean goodHouseKeeper1 = Boolean.parseBoolean(goodHouseKeeper);
                        Dog p1 = new Dog (1,healthy,petName,diseases,weight1,dogBreed,goodHouseKeeper1);
                        System.out.println(p1.toString());
                        System.out.println("Your pet will be registered to your name. Goodbye, "+name+".");
                        Pets.addPets(p1);
                    }
                    else if (healthy == false) {
                        System.out.println("Dog's name, dog's disease/es, dog's weight, dog's breed and if he/she is a good house keeper (true/false).");
                        scan.nextLine();
                        String petName = scan.nextLine();
                        String diseases = scan.nextLine();
                        String weight = scan.nextLine();
                        double weight1 = Double.parseDouble(weight);
                        String dogBreed = scan.nextLine();
                        String goodHouseKeeper = scan.nextLine();
                        boolean goodHouseKeeper1 = Boolean.parseBoolean(goodHouseKeeper);
                        Dog p2 = new Dog (1,healthy,petName,diseases,weight1,dogBreed,goodHouseKeeper1);
                        System.out.println(p2);
                        Pets.treatment();
                        Pets.addPets(p2);
                    }
                }
                if (Objects.equals(pet, "Parrot")) {
                    System.out.println("Put in the parrot's information, is he/she healthy (true/false)");
                    boolean healthy = scan.nextBoolean();
                    if (healthy == true) {
                        System.out.println("Parrot's name, parrot's weight, parrot's color and if he/she can speak.");
                        scan.nextLine();
                        String petName = scan.nextLine();
                        String diseases = "None";
                        String weight = scan.nextLine();
                        double weight1 = Double.parseDouble(weight);
                        String color = scan.nextLine();
                        String canSpeak = scan.nextLine();
                        boolean canSpeak1 = Boolean.parseBoolean(canSpeak);
                        Parrot p3 = new Parrot (2,healthy,petName,diseases,weight1,color,canSpeak1);
                        System.out.println(p3.toString());
                        System.out.println("Your pet will be registered to your name. Goodbye, "+name+".");
                        Pets.addPets(p3);
                    }
                    else if (healthy == false) {
                        System.out.println("Parrot's name, parrot's diseases, parrot's weight, parrot's color and if he/she can speak.");
                        scan.nextLine();
                        String petName = scan.nextLine();
                        String diseases = scan.nextLine();
                        String weight = scan.nextLine();
                        double weight1 = Double.parseDouble(weight);
                        String color = scan.nextLine();
                        String canSpeak = scan.nextLine();
                        boolean canSpeak1 = Boolean.parseBoolean(canSpeak);
                        Parrot p4 = new Parrot (2,healthy,petName,diseases,weight1,color,canSpeak1);
                        System.out.println(p4.toString());
                        Pets.treatment();
                        Pets.addPets(p4);
                    }
                }
                if (Objects.equals(pet, "Turtle")) {
                    System.out.println("Put in the turtle's information, is he/she healthy (true/false)");
                    boolean healthy = scan.nextBoolean();
                    if (healthy == true) {
                        System.out.println("Turtle's name, turtle's weight, turtle's size (in full cm) and it's classification.");
                        scan.nextLine();
                        String petName = scan.nextLine();
                        String diseases = "None";
                        String weight = scan.nextLine();
                        double weight1 = Double.parseDouble(weight);
                        String size = scan.nextLine();
                        int size1 = Integer.parseInt(size);
                        String classification = scan.nextLine();
                        Turtle p5 = new Turtle (3,healthy,petName,diseases,weight1, size1,classification);
                        System.out.println(p5.toString());
                        System.out.println("Your pet will be registered to your name. Goodbye, "+name+".");
                        Pets.addPets(p5);
                    }
                    else if (healthy == false) {
                        System.out.println("Turtle's name, turtle's diseases, turtle's weight, turtle's size (in full cm) and it's classification.");
                        scan.nextLine();
                        String petName = scan.nextLine();
                        String diseases = scan.nextLine();
                        String weight = scan.nextLine();
                        double weight1 = Double.parseDouble(weight);
                        String size = scan.nextLine();
                        int size1 = Integer.parseInt(size);
                        String classification = scan.nextLine();
                        Turtle p6 = new Turtle (3,healthy,petName,diseases,weight1, size1,classification);
                        System.out.println(p6.toString());
                        Pets.treatment();
                        Pets.addPets(p6);
                    }
                }
                if (Objects.equals(pet, "Cat")) {
                    System.out.println("Put in the cat's information, is he/she healthy (true/false)");
                    boolean healthy = scan.nextBoolean();
                    if (healthy == true) {
                        System.out.println("Cat's name, cat's weight, cat's breed and it's age in full years.");
                        scan.nextLine();
                        String petName = scan.nextLine();
                        String diseases = "None";
                        String weight = scan.nextLine();
                        double weight1 = Double.parseDouble(weight);
                        String catBreed = scan.nextLine();
                        String age = scan.nextLine();
                        int age1 = Integer.parseInt(age);
                        Cat p7 = new Cat (4,healthy,petName,diseases,weight1, catBreed,age1);
                        System.out.println(p7.toString());
                        System.out.println("Your pet will be registered to your name. Goodbye, "+name+".");
                        Pets.addPets(p7);
                    }
                    else if (healthy == false) {
                        System.out.println("Cat's name, cat's diseases, cat's weight, cat's breed and it's age in full years.");
                        scan.nextLine();
                        String petName = scan.nextLine();
                        String diseases = scan.nextLine();
                        String weight = scan.nextLine();
                        double weight1 = Double.parseDouble(weight);
                        String catBreed = scan.nextLine();
                        String age = scan.nextLine();
                        int age1 = Integer.parseInt(age);
                        Cat p8 = new Cat (4,healthy,petName,diseases,weight1, catBreed,age1);
                        System.out.println(p8.toString());
                        Pets.addPets(p8);
                        Pets.treatment();
                    }
                }
            }
            else {
                System.out.println("Goodbye");
            }

        }
        Pets.writeFile();
    }
    public static void treatment() {
        Scanner scan = new Scanner(System.in);

        if (petId == 1) {
            System.out.println("Input your dog's weight");
            String weight = scan.nextLine();
            double weight1 = Double.parseDouble(weight);
            System.out.println("Your pet will be registered to your name. Now, you should choose the treatment for it: \n1) Pain killer \n2) Sedative\n3) Both sedative and pain killer");
            String option = scan.nextLine();
            if ((Objects.equals(option, "1"))) {
                double dosage = (weight1/2.20462)*(0.002/10);
                double roundOff = (double) Math.round(dosage * 1000) /1000;
                System.out.println("Carprofen dosage: "+roundOff);
            }
            if ((Objects.equals(option, "2"))) {
                double dosage = (weight1/2.20462)*(0.002/10);
                double roundOff = (double) Math.round(dosage * 1000) /1000;
                System.out.println("Acepromazine dosage: "+roundOff);
            }
            if ((Objects.equals(option, "3"))) {
                double dosage = (weight1 / 2.20462) * (0.001 / 12);
                double dosage1 = (weight1 / 2.20462) * (0.001 / 10);
                double roundOff = (double) Math.round(dosage * 1000) / 1000;
                double roundOff1 = (double) Math.round(dosage1 * 1000) / 1000;
                System.out.println("Carprofen dosage: " + roundOff + "\nAcepromazine dosage: " + roundOff1);
            }
        }
        else if (petId == 2) {
            System.out.println("Input your parrot's weight");
            String weight = scan.nextLine();
            double weight1 = Double.parseDouble(weight);
            System.out.println("Your pet will be registered to your name. Now, you should choose the treatment for it: \n1) Pain killer \n2) Sedative\n3) Both sedative and pain killer");
            String option = scan.nextLine();
            if ((Objects.equals(option, "1"))) {
                double dosage = (weight1/2.20462)*(0.002/10);
                double roundOff = (double) Math.round(dosage * 1000) /1000;
                System.out.println("Carprofen dosage: "+roundOff);
            }
            if ((Objects.equals(option, "2"))) {
                double dosage = (weight1/2.20462)*(0.002/10);
                double roundOff = (double) Math.round(dosage * 1000) /1000;
                System.out.println("Acepromazine dosage: "+roundOff);
            }
            if ((Objects.equals(option, "3"))) {
                double dosage = (weight1 / 2.20462) * (0.001 / 12);
                double dosage1 = (weight1 / 2.20462) * (0.001 / 10);
                double roundOff = (double) Math.round(dosage * 1000) / 1000;
                double roundOff1 = (double) Math.round(dosage1 * 1000) / 1000;
                System.out.println("Carprofen dosage: " + roundOff + "\nAcepromazine dosage: " + roundOff1);
            }
        }
        else if (petId == 3) {
            System.out.println("Input your turtle's weight");
            String weight = scan.nextLine();
            double weight1 = Double.parseDouble(weight);
            System.out.println("Your pet will be registered to your name. Now, you should choose the treatment for it: \n1) Pain killer \n2) Sedative\n3) Both sedative and pain killer");
            String option = scan.nextLine();
            if ((Objects.equals(option, "1"))) {
                double dosage = (weight1/2.20462)*(0.002/10);
                double roundOff = (double) Math.round(dosage * 1000) /1000;
                System.out.println("Carprofen dosage: "+roundOff);
            }
            if ((Objects.equals(option, "2"))) {
                double dosage = (weight1/2.20462)*(0.002/10);
                double roundOff = (double) Math.round(dosage * 1000) /1000;
                System.out.println("Acepromazine dosage: "+roundOff);
            }
            if ((Objects.equals(option, "3"))) {
                double dosage = (weight1 / 2.20462) * (0.001 / 12);
                double dosage1 = (weight1 / 2.20462) * (0.001 / 10);
                double roundOff = (double) Math.round(dosage * 1000) / 1000;
                double roundOff1 = (double) Math.round(dosage1 * 1000) / 1000;
                System.out.println("Carprofen dosage: " + roundOff + "\nAcepromazine dosage: " + roundOff1);
            }
        }
        else if (petId == 4) {
            System.out.println("Input your cat's weight");
            String weight = scan.nextLine();
            double weight1 = Double.parseDouble(weight);
            System.out.println("Your pet will be registered to your name. Now, you should choose the treatment for it: \n1) Pain killer \n2) Sedative\n3) Both sedative and pain killer");
            String option = scan.nextLine();
            if ((Objects.equals(option, "1"))) {
                double dosage = (weight1/2.20462)*(0.002/10);
                double roundOff = (double) Math.round(dosage * 1000) /1000;
                System.out.println("Carprofen dosage: "+roundOff);
            }
            if ((Objects.equals(option, "2"))) {
                double dosage = (weight1/2.20462)*(0.002/10);
                double roundOff = (double) Math.round(dosage * 1000) /1000;
                System.out.println("Acepromazine dosage: "+roundOff);
            }
            if ((Objects.equals(option, "3"))) {
                double dosage = (weight1 / 2.20462) * (0.001 / 12);
                double dosage1 = (weight1 / 2.20462) * (0.001 / 10);
                double roundOff = (double) Math.round(dosage * 1000) / 1000;
                double roundOff1 = (double) Math.round(dosage1 * 1000) / 1000;
                System.out.println("Carprofen dosage: " + roundOff + "\nAcepromazine dosage: " + roundOff1);
            }
        }
    }
    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter("output.txt");
            for (Pets pets : petsCollection) {
                fw.write("\n"+pets.toString() + "\n");
                fw.write(pets.speak() + "\n");

                //fw.write(pets.unexpectedIllnessOccurred() + "\n");
                //fw.write(pets.healing() + "\n");
                fw.write("++++++++++++++++++++++");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
