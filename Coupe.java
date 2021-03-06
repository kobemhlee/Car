public class Coupe extends Car implements PriceCalc {

	private int initPrice; // initial price
	private double price; // price value of car
	private int priceLimit; // lowest that price can go 

	private static Car x = new Car();
	
	public static void main(String[] args)
	{
		x.calcInitPrice();
		x.calculatePrice();
	}

	public int calcInitPrice()
	{
		if (x.getBrand().equals("Toyota"))
		{
			initPrice = 21000;
			priceLimit = 10000;
		}
		if (x.getBrand().equals("BMW"))
		{
			initPrice = 38000;
			priceLimit = 20000;
		}
		if (x.getBrand().equals("Audi"))
		{
			initPrice = 36000;
			priceLimit = 18000;
		}
		if (x.getBrand().equals("Lexus"))
		{
			initPrice = 32000;
			priceLimit = 16000;
		}
		if (x.getBrand().equals("Honda"))
		{
			initPrice = 22000;
			priceLimit = 11000;
		}
		else
		{
			initPrice = 0;
			priceLimit = 0;
		}
	}

	public double calculatePrice()
	{
		double yearDeduction = (2018 - x.getYear())*0.7;
		double mileDeduction = x.getMileage()*0.01;

		price = initPrice - initPrice*yearDeduction - initPrice*mileDeduction;

		if (price > priceLimit)
			return price;
		else
			return priceLimit;

	}

	public String toString()
	{
		return ("Car Type: Coupe/n" + super.toString());
	}

}