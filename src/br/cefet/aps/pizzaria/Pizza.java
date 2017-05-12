package br.cefet.aps.pizzaria;

public abstract class Pizza {
	private float price;
	
	public Pizza(float price){
		this.price = price;
	}
	
	public abstract float price();
	
}
