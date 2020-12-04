package queue;
import linkedlist.MyLinkedList.Node;
public class MyMainClass {

	public static void main(String[] args) {
		MyQueue<Integer> mq=new MyQueue<>();
		mq.enqueue(20);
		mq.enqueue(40);
		mq.enqueue(60);
		mq.enqueue(80);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
	}

}
