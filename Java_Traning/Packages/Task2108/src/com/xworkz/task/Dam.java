package com.xworkz.task;

public class Dam {

	String[] dams=new String[7];
	int position;
	
	public void damName(String dam)
	{
		this.dams[this.position]=dam;
		position++;
	}
	public void display()
	{
		for(String anekattu:dams)
		{
			System.out.println(anekattu);
		}
	}
}