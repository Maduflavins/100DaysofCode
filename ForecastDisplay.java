package chapterTwo;

public class ForecastDisplay implements Observer, DisplayElements {
	private double currentPressure = 29.92;  
	private double lastPressure;
	private WeatherData weatherData;

	//Constructor taking the WeatherData object as argument
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	//Implementing the update method in the Oberserver interface. Call display method after updating values
	public void update(double temp, double humidity, double pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

	//Implementing the display method from the DisplayElements interface
	public void display() 
	{
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) 
		{
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) 
		{
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure)
		{
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
