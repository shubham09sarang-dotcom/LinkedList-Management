package LinkedListManagement;
public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at Position
    public void insertAtPosition(int data, int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Insert After a Node
    public void insertAfter(int target, int data) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == target) {

                Node newNode = new Node(data);

                newNode.next = temp.next;
                temp.next = newNode;

                return;
            }

            temp = temp.next;
        }

        System.out.println("Value not found.");
    }

    // Insert Before a Node
    public void insertBefore(int target, int data) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == target) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == target) {

                Node newNode = new Node(data);

                newNode.next = temp.next;
                temp.next = newNode;

                return;
            }

            temp = temp.next;
        }

        System.out.println("Value not found.");
    }

    // Delete from Beginning
    public void deleteFromBeginning() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
    }

    // Delete from End
    public void deleteFromEnd() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete from Position
    public void deleteFromPosition(int position) {

        if (head == null || position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }

        temp.next = temp.next.next;
    }

    // Delete by Value
    public void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == value) {
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value not found.");
    }

    // Search
    public void search(int value) {

        Node temp = head;
        int position = 1;

        while (temp != null) {

            if (temp.data == value) {
                System.out.println("Found at position: " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println("Value not found.");
    }

    // Update
    public void update(int oldValue, int newValue) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value not found.");
    }

    // Display
    public void display() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        System.out.print("Singly List: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Count Nodes
    public int countNodes() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Maximum
    public void findMaximum() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int max = head.data;
        Node temp = head.next;

        while (temp != null) {

            if (temp.data > max) {
                max = temp.data;
            }

            temp = temp.next;
        }

        System.out.println("Maximum: " + max);
    }

    // Minimum
    public void findMinimum() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int min = head.data;
        Node temp = head.next;

        while (temp != null) {

            if (temp.data < min) {
                min = temp.data;
            }

            temp = temp.next;
        }

        System.out.println("Minimum: " + min);
    }

    // Middle
    public void findMiddle() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element: " + slow.data);
    }

    // Reverse
    public void reverse() {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    // Sort
    public void sort() {

        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;

        do {

            swapped = false;
            Node temp = head;

            while (temp.next != null) {

                if (temp.data > temp.next.data) {

                    int value = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = value;

                    swapped = true;
                }

                temp = temp.next;
            }

        } while (swapped);
    }

    // Remove Duplicates
    public void removeDuplicates() {

        Node current = head;

        while (current != null) {

            Node temp = current;

            while (temp.next != null) {

                if (temp.next.data == current.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }

            current = current.next;
        }
    }
}