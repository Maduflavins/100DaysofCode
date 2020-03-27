package chapterTwo;

import java.util.ArrayList;
public class WeatherData implements Subject 
{
	//An arraylist to hold the list of observer or subscribers
	//Instance variables for the Subject interface
	private ArrayList<Observer> observers; 
	private double temp;
	private double humidity;
	private double pressure;
	
	//Constructor for the (Array)list of Observers, listed on the Subject (WeatherData) class
	public WeatherData() 
	{
		observers = new ArrayList<Observer>();
	}
	
	//The next three methods implement the Subject interface
	public void registerObserver(Observer o) 
	{
		observers.add(o);
	}
	
	public void removeObserver(Observer o) 
	{
		int i = observers.indexOf(o);
		if(i >= 0) 
		{
			observers.remove(i);
		}
	}
	
	public void notifyObserver() 
	{
		for(Observer observer : observers) 
		{
			observer.update(temp, humidity, pressure);
		}
	}
	
	//For any update received from the weather station, the notifyObserver method is called
	public void measurementsChanged() 
	{
		notifyObserver();
	}
	
	public void setMeasurements(double temp, double humidity, double pressure) 
	{
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	//other WeatherData methods	
}
	

