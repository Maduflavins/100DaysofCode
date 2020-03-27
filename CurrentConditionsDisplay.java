package chapterTwo;

public class CurrentConditionsDisplay implements Observer, DisplayElements 
{   //CurrentConditionsDisplay implements Observer interface
	//Instance variable of the class CurrentConditionsDisplay
	private double temp;
	private double humidity;
	private Subject weatherData; //This is stored incase we want to unregister or do anything in reference to the 
	//Subject interface. Remember that line that went from CurrentConditionsDisplay to the Subject interface? Na im be dis!
	//Constructor for the class CurrentConditionsDisplay
	
	public CurrentConditionsDisplay(Subject weatherData) 
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this); //What does this mean and what does it do?
	}
	
	//Implementing the update method from the Observer interface
	public void update(double temp, double humidity, double pressure) 
	{
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
	
	//Implementing the display method from the DisplayElements interface
	public void display() 
	{
		System.out.println("Current conditioning: " + temp + "F degrees and " + humidity + "% humidity");
	}
}