public class Main
{
	public static void main(String[] args) {
		Queue queue = new Queue(8);

		for (int i = 1; i <= 20; i++)
			queue.enqueue(i);

		while (!queue.empty())
			System.out.print(queue.dequeue() + " ");
	}
}

class Queue {
	private int[] array;
	private int capacity;
	private int front;
	private int rear;
	private int size;

	public Queue(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}

	public void enqueue(int data) {
		if (size == capacity) {
			int[] newArray = new int[capacity * 2];

			for (int i = 0; i < size; i++)
				newArray[i] = array[(front + i) % capacity];

			array = newArray;
			front = 0;
			rear = size;
			capacity *= 2;
		}

		array[rear] = data;
		rear = (rear + 1) % capacity;
		size++;
	}

	public int dequeue() {
		int data = array[front];
		front = (front + 1) % capacity;
		size--;
		return data;
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}

