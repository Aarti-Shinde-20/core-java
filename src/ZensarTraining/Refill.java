package ZensarTraining;

public class Refill {
	String inkColor;
	int length;
	Nib nib;
	String refill;

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}

	public String getRefill() {
		return refill;
	}

	public void setRefill(String refill) {
		this.refill = refill;
	}

//	public Refill(String inkColor,int length,Nib nib) {
//    	this.inkColor=inkColor;
//    	this.length=length;
//    	this.nib=nib;
//    	
//    }

	void display1() {
		System.out.println(inkColor + " " + length + " " + nib);
	}
}