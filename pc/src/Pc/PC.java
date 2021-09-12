package Pc;

public class PC {
	CPU cpu;
    Ram ram;
    Mainboard mainboard;
    ID id;
    int sl;
    public PC(CPU cpu, Ram ram, Mainboard mainboard,  int sl) {
    	super();
    	this.cpu = cpu;
    	this.ram = ram;
    	this.mainboard = mainboard;
    	this.sl =sl;
    }
    public CPU getCpu() {
    	return cpu;
    }
    public Ram getRam() {
    	return ram;
    	
    }
    public Mainboard getMain() {
    	return mainboard;
    }
  
    public int getSl() {
    	return sl;
    }
}
