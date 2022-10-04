public class chiken extends Bird{
    protected boolean canFly;

    public chiken(String animalName, int age, boolean isPredator, int calories, int flyHeight, int wingSpan, boolean canFly) {
        super(animalName, age, isPredator, calories, flyHeight, wingSpan);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "chiken{" +
                "canFly=" + canFly +
                ", flyHeight=" + flyHeight +
                ", wingSpan=" + wingSpan +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
