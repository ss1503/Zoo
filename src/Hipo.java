public class Hipo extends Mammal{
    protected int fatPrecentage;

    public Hipo(String animalName, int age, boolean isPredator, double calories, int milkCalorie, int MOP, int fatPrecentage) {
        super(animalName, age, isPredator, calories, milkCalorie, MOP);
        this.fatPrecentage = fatPrecentage;
    }

    public int getFatPrecentage() {
        return fatPrecentage;
    }

    public void setFatPrecentage(int fatPrecentage) {
        this.fatPrecentage = fatPrecentage;
    }

    @Override
    public String toString() {
        return "Hipo{" +
                "fatPrecentage=" + fatPrecentage +
                ", milkCalorie=" + milkCalorie +
                ", MOP=" + MOP +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
