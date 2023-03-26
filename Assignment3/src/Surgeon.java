
public class Surgeon extends Doctor{
	
	boolean isOperating;
	public String isHeOperating = "not operating";
public Surgeon(String name, int number, String specialty, boolean isOperating) {
		super(name, number, specialty);
		this.isOperating = isOperating;
}

	

@Override
public String toString() {
	return " " + name + " " + number + " " + specialty + " " +isOperating;
}
@Override

public void work()  {
	if(isOperating == true) {
		isHeOperating = "operating";
	}
	System.out.println (name + " works for the hospital."+name+" is"+ isHeOperating+ " now");
}
	

}
