package mystack;
import linkedlist.*;
public class MyStack<E> {
	private MyLinkedList<E> ll=new MyLinkedList();
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception{
		if(ll.isEmpty())
			throw new Exception("List is empty");
		return ll.removeLast();
	}
	E peek() throws Exception{
		if(ll.isEmpty())
			throw new Exception("List is empty");
		return ll.getLast();
	}

}
