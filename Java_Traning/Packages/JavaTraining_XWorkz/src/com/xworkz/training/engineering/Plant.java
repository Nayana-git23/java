package com.xworkz.training.engineering;

public class Plant {
	String plantName;
	String uses;
	double length;
	String areagrown;
	String color;
	int lifeSpan = 5;
	boolean isFlowering = true;
	String habitate = "Rain forest";
	boolean isEdible = true;
	String waterRequirement = "10L";

	public Plant(String plantName, String uses, double length, String areagrown, String color)

	{
		this.plantName = plantName;
		this.areagrown = areagrown;
		this.uses = uses;
		this.color = color;
		this.areagrown = areagrown;
		
	}
	public void lifespan(int lifeSpan)
	{
		this.lifeSpan=lifeSpan;
	}

	public void gida() {
		System.out.println(plantName);
		System.out.println(areagrown);
		System.out.println(uses);
		System.out.println(color);
		System.out.println(lifeSpan);
		System.out.println(isFlowering);
		System.out.println(habitate);
		System.out.println(isEdible);
		System.out.println(waterRequirement);
		System.out.println(length);
	}

}
