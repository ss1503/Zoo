public class Park {
    protected Animal[] animals;
    protected int numOfAnimals;

    public Park()
    {
        animals = new Animal[1000];
        numOfAnimals = 0;
    }

    public void AddAnimal(Animal newAnimal)
    {
        animals[numOfAnimals] = newAnimal;
    }

    public void listOfOldPredators()
    {

        for(int i = 0; i < animals.length; i++)
        {
            if(animals[i].isPredator && animals[i].age > 10)
            {
                System.out.println(animals[i].getAnimalName());
            }
        }
    }

    public void listOfBirdAndReptilePredators()
    {
        for(Animal ani : animals)
        {
            if(ani instanceof Reptile && ani instanceof Bird && ani.isPredator)
            {
                System.out.println(ani.getAnimalName());
            }
        }
    }
}
