package ZensarTraining;

public class MainPenNibRefill {

	public static void main(String[] args) {

		Pen pen = new Pen();
		pen.setCapLength(3);
		pen.setBrand("nokia");
		pen.refill = new Refill();
		pen.refill.setInkColor("blue");
		pen.refill.setLength(5);

		pen.refill.nib = new Nib();
		pen.refill.nib.setWidth(5);
		pen.refill.nib.setMaterialType("Plastic");

		pen.display();
		pen.refill.display1();
		pen.refill.nib.display2();

		System.out.println("Pen CapLength :"+pen.getCapLength() + "\nPen Brand : " + pen.getBrand() + "\nPen Refill InkColor : " + pen.getRefill().getInkColor()+"\nPen refill Length :"+pen.getRefill().getLength());
		System.out.println("\nPen Refill width :"+
				pen.refill.nib.getWidth() + "\nPen refill nib materialType : " + pen.refill.nib.getMaterialType() + "\nPen Refill Nib : " + pen.refill.getNib());

	}
}
