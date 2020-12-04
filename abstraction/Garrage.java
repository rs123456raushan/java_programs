package abstraction;

public class Garrage {

	public static void main(String[] args) {
		BMW bmw=new BMW();
		Bugaati bugaati=new Bugaati();
		repairShop(bmw);
		repairShop(bugaati);
		bmw.accelerating();
		bugaati.accelerating();
		
	}
	static void repairShop(Car car) {       /*Car is only concept so i have only declared a method
	                                         in Car class but not defined it*/
			System.out.println("Your car is repaired");
	}

}
