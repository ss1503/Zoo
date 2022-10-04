public class Snake extends Reptile{
    protected boolean isPoisonous;

    public Snake(String animalName, int age, boolean isPredator, int calories, int taleLength, boolean isPoisonous) {
        super(animalName, age, isPredator, calories, taleLength);
        this.isPoisonous = isPoisonous;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "isPoisonous=" + isPoisonous +
                ", taleLength=" + taleLength +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
