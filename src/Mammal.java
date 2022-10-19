public abstract class Mammal extends Animal {
    protected double milkCalorie;
    protected int MOP;

    public Mammal(String animalName, int age, boolean isPredator, double calories, double milkCalorie, int MOP) {
        super(animalName, age, isPredator, calories);
        this.milkCalorie = milkCalorie;
        this.MOP = MOP;
    }

    public double getMilkCalorie() {
        return milkCalorie;
    }

    public void setMilkCalorie(double milkCalorie) {
        this.milkCalorie = milkCalorie;
    }

    public int getMOP() {
        return MOP;
    }

    public void setMOP(int MOP) {
        this.MOP = MOP;
    }

    public double Eat()
    {
        return super.Eat() + milkCalorie;
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
