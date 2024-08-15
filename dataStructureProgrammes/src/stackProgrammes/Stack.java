package stackProgrammes;

public class Stack {
	
	int [] arr ;
	int top ;
	
	public Stack() {
		 arr = new int[5];
		 top = -1;
	}
	
	public Stack(int size) {
	      arr = new int[size];
		  top = -1;
	}
	
	public void push(int value) {
		
		if(top+1<arr.length) {
		top++;
		arr[top]=value;
		}else {
			System.out.println("Stack overflow while pushing "+value+" on index "+top);
		}
		
	}
	
	public void pop() {
		
		if(top>-1) {
			top--;
		}else {
			System.out.println("Stack underflow while popping on index "+top);
		}
	}
	
	public void peek() {
		if(top>-1) {
			System.out.println("Top element of stack"+arr[top]);
		}
	}
	
	public String toString() {
		String arrStr="";
		for(int i=0;i<top+1;i++) {
			arrStr=arrStr+arr[i]+" ";
			System.out.println(arr[i]+" ");
		}
		return arrStr;
		
	}

}
