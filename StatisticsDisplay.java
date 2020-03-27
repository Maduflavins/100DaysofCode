package chapterTwo;

public class StatisticsDisplay implements Observer, DisplayElements {
	//The first two instance variables would enable us declare the minimum and maximum temperature
	//The second and third would be used to get the average weather from a selected number
	private double maxTemp = 0.0;
	private double minTemp = 200;
	private double tempSum= 0.0;
	private int numReadings;
	private WeatherData weatherData;

	//Constructor taking WeatherData object as parameter
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	//Implementing the update method from the Observer interface
	public void update(double temp, double humidity, double pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	//Implementing the update method from the DisplayElements interface
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
}
