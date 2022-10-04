public class Crocodile extends Reptile{
    protected boolean isDentalCare;

    public Crocodile(String animalName, int age, boolean isPredator, int calories, int taleLength, boolean isDentalCare) {
        super(animalName, age, isPredator, calories, taleLength);
        this.isDentalCare = isDentalCare;
    }

    public boolean isDentalCare() {
        return isDentalCare;
    }

    public void setDentalCare(boolean dentalCare) {
        isDentalCare = dentalCare;
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "isDentalCare=" + isDentalCare +
                ", taleLength=" + taleLength +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
