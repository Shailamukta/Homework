package hw8Inheritance;
//Here mammal and animal class are line no 13-14 is a single inheritance.

/*Here line no 31-33 is a example of Multi-level inheritance.(dog-mammal-animal) is the 
 * multi-level inheritance.
 */
//Here hierarchical inheritance is from reptile,mammal,birds to animal.

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n.................\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n................\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n................\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n.............\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n..............\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n.............\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n..................\n");
		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.animalInfo();
		bullDog.mammalInfo();
		bullDog.dogInfo();

		System.out.println("\n..............\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.animalInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();

	}

}
