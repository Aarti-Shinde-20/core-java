package ZensarTraining;

public class Nib {

	static String materialType;
	int width;

	public Nib() {
		// TODO Auto-generated constructor stub
	}

	public static String getMaterialType() {
		return materialType;
	}

	public static void setMaterialType(String materialType) {
		Nib.materialType = materialType;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Nib(String materialType, int width) {
		Nib.materialType = materialType;
		this.width = width;
	}

	void display2() {
		System.out.println(materialType + " " + width);
	}

}
