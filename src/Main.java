public class Main {
    public static void main(String[] args) {

    }

    public static double sumCalories(Animal[] animals)
    {
        double sum = 0;

        for(int i = 0; i < animals.length; i++)
        {
            sum += animals[i].Eat();
        }

        return sum;
    }

    public static void singForAll(Animal[] animals)
    {
        for(int i = 0; i < animals.length; i++)
        {
            animals[i].Sing();
        }
    }

    public static void DanceForAll(Animal[] animals)
    {
        for(int i = 0; i < animals.length; i++)
        {
            animals[i].Dance();
        }
    }

    public static String fattestHip(Hipo[] animals)
    {
        int fattest = animals[0].fatPrecentage;
        String fattestName = " ";

        for(int i = 0; i < animals.length; i++)
        {
            if(animals[i].fatPrecentage > fattest)
            {
                fattest = animals[i].fatPrecentage;
                fattestName = animals[i].getAnimalName();
            }
        }
        return fattestName;
    }
}