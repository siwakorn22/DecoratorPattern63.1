
public class Streamedmilk extends CondimentDecorator {

Beverage beverage;
	
	public Streamedmilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Streamed milk";
	}
	
	public double cost() {
		return .10 + beverage.cost();
	}
}
