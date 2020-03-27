package chapterOne;

public class DuckTest {
	public static void main (String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		mallard.swim();
		
		System.out.println();
		
		Duck decoy = new DecoyDuck();
		decoy.performFly();
		decoy.performQuack();
		decoy.setQuackBehaviour(new DuckCall());
		decoy.performQuack();
		decoy.swim();
		decoy.display();
		
		System.out.println();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.setFlyBehaviour(new FlyRocketPowered()); //setting dynamically
		modelDuck.performFly();
		modelDuck.swim();
		modelDuck.display();
		
		System.out.println();
		
		Duck newModelDuck = new NewDuck();
		newModelDuck.display();
		newModelDuck.performFly();
		newModelDuck.performQuack();
		newModelDuck.setQuackBehaviour(new QuackWithThinSound());
		newModelDuck.performQuack();
		newModelDuck.swim();
	
	}
}
