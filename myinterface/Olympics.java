package myinterface;

public class Olympics implements MyInterface {
	public void race(int time) {
		System.out.println("Race will start after "+time+" minutes");
	}
	public void soccer(int time) {
		System.out.println("Soccer will start after "+time+" minutes");
	}

}
