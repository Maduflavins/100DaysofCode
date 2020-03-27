package chapterTwo;

public class WeatherStation {
	public static void main (String[] args) {
		
		//The WeatherData object, weatherData is created and would be passed into other constructors 
		//as specified in the constructors for CurrentConditionsDisplay, StatisticsDisplay and ForecastDisplay
		WeatherData weatherData = new WeatherData();
		
		//Creating objects for each of the Observer and DisplayElements subclasses
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		//setting measurements for temperature, humidity and pressure respectively
		weatherData.setMeasurements(80, 65, 30.4);
		//System.out.println();
		weatherData.setMeasurements(82, 70, 29.2);
		//System.out.println();
		weatherData.setMeasurements(78, 90, 29.2);
	}
}
