package doublyendedqueue;

public class MyMainClass {

	public static void main(String[] args) {
		MyDoublyEndedQueue<Integer> dq=new MyDoublyEndedQueue<>();
		dq.addToHead(20);
		dq.addToHead(40);
		dq.addToHead(60);
		dq.addToHead(80);
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());

	}

}
