package queueProgrammes;

public class QueueMain {

	public static void main(String[] args) {

		
//		Queue queue=new Queue();
//		queue.enqueue(5);
//		queue.enqueue(3);
//		queue.enqueue(2);
//		queue.enqueue(6);
//		queue.enqueue(1);
//		queue.enqueue(1);
//		System.out.println(queue);
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		System.out.println(queue);
		
		
		
		CircularQueue cq=new CircularQueue();
		cq.enqueuCircular(2);
		cq.enqueuCircular(7);
		cq.enqueuCircular(3);
		cq.enqueuCircular(9);
		cq.enqueuCircular(5);
		cq.dequeueCircular();
		cq.dequeueCircular();
		System.out.println(cq);
		cq.enqueuCircular(6);
		cq.enqueuCircular(1);
		cq.enqueuCircular(1);
		cq.dequeueCircular();
		cq.dequeueCircular();
		cq.dequeueCircular();
		cq.dequeueCircular();
		cq.dequeueCircular();
		cq.dequeueCircular();
		cq.enqueuCircular(3);
		cq.enqueuCircular(9);
		cq.enqueuCircular(5);
		System.out.println(cq);

	}

}
