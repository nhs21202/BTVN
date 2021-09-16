package Bai2_kethua;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		ArrayList<Guard>lsbv = new ArrayList<Guard>();
		lsbv.add(new Guard("A",40,"BV190"));
		lsbv.add(new Guard("B",45,"BV112"));
		lsbv.add(new Guard("C",40,"BV216"));
		ArrayList<Janitor>lsvs = new ArrayList<Janitor>();
		lsvs.add(new Janitor("E",55,"VS192"));
		lsvs.add(new Janitor("D",53,"VS209"));
		lsvs.add(new Janitor("F",43,"VS332"));
		ArrayList<Teacher_Sub>lsgv = new ArrayList<Teacher_Sub>();
		lsgv.add(new Teacher_Sub("G",25,"GV1244","Toan"));
		lsgv.add(new Teacher_Sub("H",50,"GV1423","Van"));
		lsgv.add(new Teacher_Sub("I",36,"GV2392","Anh"));
		ArrayList<Student>lshs = new ArrayList<Student>();
		lshs.add(new Student("K",17,"HS2342","11D3"));
		lshs.add(new Student("L",17,"HS2340","11A5"));
		lshs.add(new Student("M",17,"HS7464","11D2"));
		System.out.println("Choose your list: ");
		System.out.println("1.Guard");
		System.out.println("2.Janitor");
		System.out.println("3.Student");
		System.out.println("4.Teacher");
		System.out.print("Your choice: ");
		choice = input.nextInt();
		switch(choice) {
		case 1:
			for(int i=1;i<=3;i++) {
				System.out.println(lsbv.get(i).getTen()+" "+lsbv.get(i).getTuoi()+" "+lsbv.get(i).getCCCD());
			}
		case 2:
			for(int i=1;i<=3;i++) {
				System.out.println(lsvs.get(i).getTen()+" "+lsvs.get(i).getTuoi()+" "+lsvs.get(i).getCCCD());
			}
		case 3:
			for(int i=1;i<=3;i++) {
				System.out.println(lshs.get(i).getTen()+" "+lshs.get(i).getTuoi()+" "+lshs.get(i).getCCCD()+" "+lshs.get(i).getLop());
			}
		case 4:
			for(int i=1;i<=3;i++) {
				System.out.println(lsgv.get(i).getTen()+" "+lsgv.get(i).getTuoi()+" "+lsgv.get(i).getCCCD()+" "+lsgv.get(i).getMon());
			}
		}
	}
}
