public class LinkedList {

    class Node {
        private int value;
        private LinkedList.Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private LinkedList.Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int value) {
       Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current.next = current;
            }
            current = newNode;
        }
    }

    public boolean remove(int value) {
        if (head == null) {
            return false;
        } else {
            if (head.value == value) {
                return true;
            }
        }
        Node removeValue = head;
        while (removeValue.next != null) {
            if (removeValue.next.value == value) {
                removeValue.next = removeValue.next.next;
                return true;
            }
            removeValue = removeValue.next;
        }
        return false;
    }

    public boolean contains(int value) {
        Node containsValue = head;

        while (containsValue != null) {
            if (containsValue.next.value == value) {
                return true;
            }
            containsValue=containsValue.next;
        }

        return false;
    }

    public void printList() {
        Node printCurrent = head;
        if (printCurrent==null){
            System.out.println("List is empty");
        }
        while (printCurrent!=null){
            System.out.println(printCurrent.value + "->");
            printCurrent.next=printCurrent;
        }
    }
//32 min
}
