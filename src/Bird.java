public class Bird extends Animal{
    protected int flyHeight;
    protected int wingSpan;

    public Bird(String animalName, int age, boolean isPredator, int calories, int flyHeight, int wingSpan) {
        super(animalName, age, isPredator, calories);
        this.flyHeight = flyHeight;
        this.wingSpan = wingSpan;
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(int flyHeight) {
        this.flyHeight = flyHeight;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "flyHeight=" + flyHeight +
                ", wingSpan=" + wingSpan +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
