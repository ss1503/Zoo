public class Cow extends Mammal{
    protected int numOfCalving;

    public Cow(String animalName, int age, boolean isPredator, double calories, double milkCalorie, int MOP, int numOfCalving) {
        super(animalName, age, isPredator, calories, milkCalorie, MOP);
        this.numOfCalving = numOfCalving;
    }

    public int getNumOfCalving() {
        return numOfCalving;
    }

    public void setNumOfCalving(int numOfCalving) {
        this.numOfCalving = numOfCalving;
    }

    public double Eat()
    {
        return super.Eat() * 0.25;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "numOfCalving=" + numOfCalving +
                ", milkCalorie=" + milkCalorie +
                ", MOP=" + MOP +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
