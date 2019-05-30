package com.handson.java.hacker_earth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/tutorial/
 * 
 * @author prakash
 *
 */
public class QueueForMicro {

	public static void main(String args[]) throws IOException {
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		String noOfInputsStr = bis.readLine();
		int noOfInputs = Integer.parseInt(noOfInputsStr);
		Queue queue = new Queue(noOfInputs);
		for (int index = 0; index < noOfInputs; index++) {
			String input = bis.readLine();
			if (input.contains("E")) {
				queue.enqueue(input.split(" ")[1]);
				System.out.println(queue.queueSize());
			} else if (input.contains("D")) {
				String value = queue.dequeue();
				if (value == null || value.equals("")) {
					System.out.println("-1 " + queue.queueSize());
				} else {
					System.out.println(value + " " + queue.queueSize());
				}

			}
		}
	}
}

/*
 * Input 5
 * 
 * E 2
 * 
 * D
 * 
 * D
 * 
 * E 3
 * 
 * D
 * 
 * Output
 * 
 * 1
 * 
 * 2 0
 * 
 * -1 0
 * 
 * 1
 * 
 * 3 0
 */
class Queue {

	String[] queueElements;
	int front = -1;
	int rear = -1;

	Queue(int size) {
		queueElements = new String[size];
	}

	void enqueue(String element) {
		if (!isFull()) {
			rear++;
			queueElements[rear] = element;
			
		}
	}

	String dequeue() {
		String element = "";
		if (!isEmpty()) {
			front++;
			element = queueElements[front];
			
		}
		return element;
	}

	boolean isEmpty() {
		return front >= rear;
	}

	boolean isFull() {
		return rear >= queueElements.length-1;
	}

	int queueSize() {
		return front > rear ? 0 : rear  - front;
	}

}
