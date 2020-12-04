package linkedlist;
import java.util.*;
public class MyLinkedList<E> {
	Node<E> head;
	public void add(E data) {
		Node<E> toAdd=new Node(data);
		if(isEmpty()) {
			head=toAdd;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	public boolean isEmpty() {
		return head==null;
			
	}
	void print() {
		Node<E> temp=head;
		while(temp!=null) {
			 System.out.print(temp.data + " ");
			 temp=temp.next;
		}
	}
	public E removeLast() throws Exception{
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("Cannot remove");
		}
		if(temp.next==null) {
			Node<E> toRemove=head;
			head=null;
			return toRemove.data;
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toRemove=temp;
		temp.next=null;
		return toRemove.data;
	}
	public E getLast() throws Exception{
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("Cannot peek");
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp.data;
	}
	public static class Node<E>{
		public E data;
		public Node<E> next;
		public Node(E data) {
			this.data=data;
			next=null;
		}

	}

}
