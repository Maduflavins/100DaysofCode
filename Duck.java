package chapterOne;

public abstract class Duck {
	//Instance variable of types 'Interfaces'
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	//No argument constructor
	public Duck () {}
	
	//Abstract method
	public abstract void display();

	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehave) {
		flyBehaviour = flyBehave;
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehave) {
		quackBehaviour = quackBehave;
	}
	
	public void swim() {
		System.out.println("All ducks float, even the decoys!");
	}
}
