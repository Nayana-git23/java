package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.Gun;

public class Godse {
	public Gun fire(Gun gun)
	{
		System.out.println("running fire in Godsee");
		if(gun!=null)
		{
			
			Gun gun1=gun;
			gun1.display();
			
		}
		else
		{
			System.out.println("gun is null");
		}
		return gun;
	}
}
