public class childCow extends Cow{
    protected boolean isCute;

    public childCow(String animalName, int age, boolean isPredator, int calories, int milkCalorie, int MOP, int numOfCalving, boolean isCute) {
        super(animalName, age, isPredator, calories, milkCalorie, MOP, numOfCalving);
        this.isCute = isCute;
    }

    public boolean isCute() {
        return isCute;
    }

    public void setCute(boolean cute) {
        isCute = cute;
    }

    @Override
    public String toString() {
        return "childCow{" +
                "isCute=" + isCute +
                ", numOfCalving=" + numOfCalving +
                ", milkCalorie=" + milkCalorie +
                ", MOP=" + MOP +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
