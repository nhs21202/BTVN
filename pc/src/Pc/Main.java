package Pc;
import java.util.ArrayList;
import Pc.CPU;
import Pc.ID;
import Pc.Mainboard;
import Pc.Ram;
public class Main {
	public static void main (String[] args) {
		ArrayList<ID> lst_id = new ArrayList<ID>();
		lst_id.add(new ID ("AB123"));
		lst_id.add(new ID ("AB135"));
		lst_id.add(new ID ("BC144"));
		ArrayList<CPU> lst_cpu = new ArrayList<CPU>();
		lst_cpu.add(new CPU("Intel Core i9 10900k",lst_id.get(0)));
		lst_cpu.add(new CPU("AMD Ryzen 9 5900X",lst_id.get(1)));
		lst_cpu.add(new CPU("AMD Ryzen 5 5600X",lst_id.get(2)));
		ArrayList<Mainboard> lst_main = new ArrayList<Mainboard>();
		lst_main.add(new Mainboard("XT123",lst_id.get(0)));
		lst_main.add(new Mainboard("D1103",lst_id.get(1)));
		lst_main.add(new Mainboard("CAD110",lst_id.get(2)));
		ArrayList<Ram> lst_ram = new ArrayList<Ram>();
		lst_ram.add(new Ram("Intel Core i9 10900k",lst_id.get(0)));
		lst_ram.add(new Ram("AMD Ryzen 9 5900X",lst_id.get(1)));
		lst_ram.add(new Ram("AMD Ryzen 5 5600X",lst_id.get(2)));
		ArrayList<PC> lst_pc = new ArrayList<PC>();
		lst_pc.add(new PC(lst_cpu.get(0),lst_ram.get(0),lst_main.get(0),5));
		lst_pc.add(new PC(lst_cpu.get(1),lst_ram.get(1),lst_main.get(1),8));
		lst_pc.add(new PC(lst_cpu.get(2),lst_ram.get(2),lst_main.get(2),10));
		System.out.printf("%s %s %s %d", lst_pc.get(0).getCpu().getName(), lst_pc.get(0).getRam().getName(),
                lst_pc.get(0).getMain().getName(), lst_pc.get(0).getSl());
		System.out.printf("%s %s %s %d", lst_pc.get(1).getCpu().getName(), lst_pc.get(1).getRam().getName(),
                lst_pc.get(1).getMain().getName(), lst_pc.get(1).getSl());
		System.out.printf("%s %s %s %d", lst_pc.get(2).getCpu().getName(), lst_pc.get(2).getRam().getName(),
                lst_pc.get(2).getMain().getName(), lst_pc.get(2).getSl());
    }
	}
