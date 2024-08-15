package queueProgrammes;

public class CircularQueue {
	
	int [] arr;
	int start;
	int end;

	public CircularQueue() {
		
		arr=new int[5];
		start=-1;
		end=-1;
	}
	
	public void enqueuCircular(int value) {
		
		if((start-end) != 1 || (start==0 && end!=arr.length-1)) {
			
			if(end==arr.length-1) {
				end=0;
				arr[end]=value;
			}else {
			end++;
			arr[end]=value;
			}
			
			if(start==-1) {
				start++;
			}
		}else {
			System.out.println("Circular Queue is full!");
		}
		
	}
	
	public int dequeueCircular() {
		int value=0;
		if(start!=-1) {
			arr[start]=value;

			if(start==end){
				start=-1;
				end=-1;}
			else if(start==arr.length-1) {
				start=0;
			}
			else{
				start++;
			}

		}else {
			System.out.println("Circular Queue is empty!");
		}
		return value;
	}
	
	public String toString() {
		System.out.println(start+" to string "+end);
		String string="";
		int a=start;
		if(start!=-1) {
		while(true) {
			
			string=string + arr[a] + " ";
			if(a==end) {
				break;
			}
			if(a==arr.length-1) {
				a=-1;
			}
			a++;
		}
		}else {
			return "Circular Queue is empty!";
		}
		return string;
	}
	
}
