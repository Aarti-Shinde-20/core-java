package ZensarTraining;

public class Person  {

	
	int pid;
	String pname;
	Vehicle vehicle;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Person(int pid,String pname,Vehicle vehicle) {
		this.pid=pid;
		this.pname=pname;
		this.vehicle=vehicle;
	}
	void display() {
		System.out.println(pid+" "+pname+" "+vehicle);
	 
		System.out.println("Person id :"+pid+"\nPerson name: "+pname);
		 System.out.println("Vehicle id: "+vehicle.vid+"\nVehicle name :"+vehicle.vname);
	      
	}
	public static void main(String[] args) {
      Vehicle vehicle1=new Vehicle(1, "Auto");
    
      Person p1=new Person(101, "Aarti",vehicle1);
     
      p1.display();
      System.out.println("Person id "+p1.pid+" Person name: "+p1.pname);
	  System.out.println("Vehicle id: "+p1.vehicle.vid+" Vehicle name :"+p1.vehicle.vname);
      
	}

}
