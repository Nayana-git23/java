package com.xworkz.training.engineering;

public class Ball {

	String ballName;
	String color;
	String use;
	String ballUsedSport;
	String playerUsed;
	String company;
	double weight;
	double size;
	String buyer;
	String manudate;

	int lifespan;
	int buyerAge;
	String purchasedDate;
	long buyerId;
	double price;
	String productId;
	long customerCare;

	int quantity = 10;
	String meterial = "leather";
	String timeTaken = "2 hour";
	String companyOwner = "Gorge";
	int companyEstablished = 1995;
	String income = "1B";
	double diameter = 12;
	String licienceId = "12ab12";

	public Ball(String ballName,
	String color,
	String use,
	String ballUsedSport,
	String playerUsed,
	String company,
	double weight,
	double size,
	String  buyer,
	String manudate,
	
	int lifespan,
	int buyerAge,
	String purchasedDate,
	long buyerId,
	double price,
	String productId,
	long customerCare)
	{
	
	this.ballName=ballName;
	this.color=color;
	this.use=use;
	this.ballUsedSport=ballUsedSport;
	this.playerUsed=playerUsed;
	this.company=company;
	this.weight=weight;
	this.size=size;
	this.buyer=buyer;
	this.manudate=manudate;
	this.lifespan=lifespan;
	this.buyerAge=buyerAge;
	this.purchasedDate=purchasedDate;
	this.buyerId=buyerId;
	this. price= price;
	this.productId=productId;
	this.customerCare=customerCare;
	
	
	}
	

	public void print()
	{
		System.out.println(ballName);
		System.out.println(color);
		System.out.println(use);
		System.out.println(ballUsedSport);
		System.out.println(playerUsed);
		System.out.println(company);
		System.out.println(weight);
		System.out.println(size);
		System.out.println(buyer);
		System.out.println(manudate);
		System.out.println(lifespan);
		System.out.println(buyerAge);
		System.out.println(purchasedDate);
		System.out.println(buyerId);
		System.out.println(price);
		System.out.println(productId);
		System.out.println(customerCare);
		System.out.println(quantity);
		System.out.println(meterial);
		System.out.println(timeTaken);
		System.out.println(companyOwner);
		System.out.println(companyEstablished);
		System.out.println(income);
		System.out.println(diameter);
		System.out.println(licienceId);
		System.out.println("--------------------------------------------");
		
		
		
	
	}
	
}
