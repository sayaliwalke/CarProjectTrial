package ProjectCar;

public class Vehicle {
	private int vehicleId;
	private String brand;
	private String model;
	private String bodyType;
	private double price;
	private String imagePath;

	public Vehicle(int vehicleId, String brand, String model, String bodyType, double price, String imagePath) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.model = model;
		this.bodyType = bodyType;
		this.price = price;
		this.imagePath = imagePath;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getBodytype() {
		return bodyType;
	}

	public void setBodytype(String bodytype) {
		this.bodyType = bodytype;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
