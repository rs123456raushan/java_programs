package mystack;

public class MyMainClass {

	public static void main(String[] args) throws Exception{
		MyStack<Integer> ms=new MyStack();
		ms.push(20);
		ms.push(40);
		ms.push(60);
		ms.push(80);
		ms.push(100);
		int pop=ms.pop();
		int peek=ms.peek();
		System.out.println(pop);
		System.out.println(peek);
	}

}
