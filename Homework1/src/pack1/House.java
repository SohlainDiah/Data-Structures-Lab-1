package pack1;

public class House {
	protected int ID;
	protected float price;
	protected String location;
	protected String advertiser;


	public House(int iD, float price, String location, String advertiser) {
		super();
		this.ID = iD;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
	}
	
	public House() {
		this.ID = 0;
		this.price = 0.0f;
		this.location = null;
		this.advertiser = null;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAdvertiser() {
		return advertiser;
	}
	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}
	

	@Override
	public String toString() {
		return "House [ID=" + ID + ", price=" + price + ", location=" + location + ", advertiser=" + advertiser + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
}
