public class Reptile extends Animal{
    protected int taleLength;

    public Reptile(String animalName, int age, boolean isPredator, int calories, int taleLength) {
        super(animalName, age, isPredator, calories);
        this.taleLength = taleLength;
    }

    public int getTaleLength() {
        return taleLength;
    }

    public void setTaleLength(int taleLength) {
        this.taleLength = taleLength;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "taleLength=" + taleLength +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
