
public class Car extends Vehicle implements Drive {
	private double price;

	public Car(String model, double price) {
		super(model);
		this.price = price;
	}

	public void display() {
		System.out.println("Model " + model + " Price " + price);
	}

	public void start() {
		System.out.println("Start");
	}

	public void stop() {
		System.out.println("Stop");
	}

	public static void main(String[] args) {
		Car c = new Car("BMW", 15000000.0);
		c.display();
		c.start();
		c.stop();
	}
}
