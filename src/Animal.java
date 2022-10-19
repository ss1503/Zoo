public abstract class Animal {
    protected String animalName;
    protected int age;
    protected boolean isPredator;
    protected double calories;

    public Animal(String animalName, int age, boolean isPredator, double calories) {
        this.animalName = animalName;
        this.age = age;
        this.isPredator = isPredator;
        this.calories = calories;
    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }



    public double Eat()
    {
        return calories * 3;
    }

    public void Sing()
    {
        System.out.println("Tzif Tzif");
    }

    public void Dance()
    {
        System.out.println("Dance Dance");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", age=" + age +
                ", isPredator=" + isPredator +
                ", calories=" + calories +
                '}';
    }
}
