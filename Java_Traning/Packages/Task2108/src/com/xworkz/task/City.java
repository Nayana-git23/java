package com.xworkz.task;

public class City {
String[] cities=new String[7];
int index;

public void cityNames(String city)
{
	this.cities[this.index]=city;
	index++;
}
public void show()
{
	for(String oru:cities)
	{
		System.out.println(oru);
	}
}
}
