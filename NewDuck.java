package chapterOne;

public class NewDuck extends Duck {
	public NewDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("This time, a new model duck as work");
	}
}

