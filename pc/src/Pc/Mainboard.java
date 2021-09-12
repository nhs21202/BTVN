package Pc;

public class Mainboard {
	private String name;
    private ID id;
    
   public Mainboard(String name,ID id) {
	   this.name = name;
	   this.id = id;
   }

    public String getName() {
        return name;
    }

    public ID getID() {
        return id;
    }
}
