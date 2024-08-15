package queueProgrammes;

public class Queue {
		
	int [] arr;
	int start;
	int end;
	
	public Queue() {
		arr=new int[5];
		start=-1;
		end=-1;
	}
	
	public void enqueue(int value) {
		
		if(end<arr.length-1) {
			end++;
			arr[end]=value;
			
			if(start==-1) {
				start++;
			}
		}else {
			System.out.println("Queue is full!");
		}
		
	}
	
	public int dequeue() {
		int value=0;
		if(start!=-1) {
			if(start==end) {
				value=arr[start];
				start=-1;
				end=-1;

			}else {
			 value=arr[start];
			start++;
			}
			
		}else {
			System.out.println("Queue is empty!");
		}
		
		
		return value;
	}
	
	public String toString() {
		String string="";
		if(end==-1) {
			string="Queue is empty";
			return string;
		}
		for(int a=start;a<=end;a++) {
			
			string=string + arr[a] +" ";
		}
		return string;
	}
	
}
