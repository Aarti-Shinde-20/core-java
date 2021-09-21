package ZensarTraining;

public class Pen {
	Refill refill;
	int capLength;
	String brand;

//     
//     public Pen(int capLength,String brand, Refill refill) {
//    	 this.refill=refill;
//    	 this.capLength=capLength;
//    	 this.brand=brand;
//     }

	public Refill getRefill() {
		return refill;
	}

	public void setRefill(Refill refill) {
		this.refill = refill;
	}

	public int getCapLength() {
		return capLength;
	}

	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	void display() {
		System.out.println(refill + " " + capLength + " " + brand);

	}
}
