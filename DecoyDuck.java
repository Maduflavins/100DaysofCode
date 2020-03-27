package chapterOne;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a decoy duck. I do nothing");
	}

}
