// Класс, представляющий узел связного списка
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

// Класс Queue, реализующий очередь с использованием связного списка
class Queue {
    private Node front;  // Указывает на начало очереди
    private Node rear;   // Указывает на конец очереди

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Метод для добавления элемента в конец очереди
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Метод для удаления элемента из начала очереди
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        int value = front.value;
        front = front.next;

        // Если после удаления очередь стала пустой, сбрасываем rear
        if (front == null) {
            rear = null;
        }
        return value;
    }

    // Метод для проверки, пуста ли очередь
    public boolean isEmpty() {
        return front == null;
    }
}

// Пример использования
public class QueueLinkedRealisation {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());  // Вывод: 10
        System.out.println(queue.isEmpty());  // Вывод: false
        System.out.println(queue.dequeue());  // Вывод: 20
        System.out.println(queue.isEmpty());  // Вывод: true
    }
}

