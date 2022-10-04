public class Mammal extends Animal {
    protected int milkCalorie;
    protected int MOP;

    public Mammal(String animalName, int age, boolean isPredator, int calories, int milkCalorie, int MOP) {
        super(animalName, age, isPredator, calories);
        this.milkCalorie = milkCalorie;
        this.MOP = MOP;
    }

    public int getMilkCalorie() {
        return milkCalorie;
    }

    public void setMilkCalorie(int milkCalorie) {
        this.milkCalorie = milkCalorie;
    }

    public int getMOP() {
        return MOP;
    }

    public void setMOP(int MOP) {
        this.MOP = MOP;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "milkCalorie=" + milkCalorie +
                ", MOP=" + MOP +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
