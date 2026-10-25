package LinkedListManagement;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        SinglyLinkedList singly = new SinglyLinkedList();
        DoublyLinkedList doubly = new DoublyLinkedList();

        while (true) {

            System.out.println("\n======================================");
            System.out.println("      LINKED LIST MANAGEMENT SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Compare Singly vs Doubly Linked List");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    singlyMenu(singly);
                    break;

                case 2:
                    doublyMenu(doubly);
                    break;

                case 3:
                    compareLists();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ================= SINGLY MENU =================

    static void singlyMenu(SinglyLinkedList list) {

        while (true) {

            System.out.println("\n======================================");
            System.out.println("        SINGLY LINKED LIST");
            System.out.println("======================================");

            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Insert After a Node");
            System.out.println("5. Insert Before a Node");
            System.out.println("6. Delete from Beginning");
            System.out.println("7. Delete from End");
            System.out.println("8. Delete from Position");
            System.out.println("9. Delete by Value");
            System.out.println("10. Search");
            System.out.println("11. Update");
            System.out.println("12. Display");
            System.out.println("13. Count Nodes");
            System.out.println("14. Find Maximum");
            System.out.println("15. Find Minimum");
            System.out.println("16. Find Middle Element");
            System.out.println("17. Reverse");
            System.out.println("18. Sort");
            System.out.println("19. Remove Duplicates");
            System.out.println("20. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int data = sc.nextInt();

                    System.out.print("Enter position: ");
                    int position = sc.nextInt();

                    list.insertAtPosition(data, position);
                    break;

                case 4:
                    System.out.print("Enter target value: ");
                    int target = sc.nextInt();

                    System.out.print("Enter new value: ");
                    data = sc.nextInt();

                    list.insertAfter(target, data);
                    break;

                case 5:
                    System.out.print("Enter target value: ");
                    target = sc.nextInt();

                    System.out.print("Enter new value: ");
                    data = sc.nextInt();

                    list.insertBefore(target, data);
                    break;

                case 6:
                    list.deleteFromBeginning();
                    break;

                case 7:
                    list.deleteFromEnd();
                    break;

                case 8:
                    System.out.print("Enter position: ");
                    list.deleteFromPosition(sc.nextInt());
                    break;

                case 9:
                    System.out.print("Enter value: ");
                    list.deleteByValue(sc.nextInt());
                    break;

                case 10:
                    System.out.print("Enter value: ");
                    list.search(sc.nextInt());
                    break;

                case 11:
                    System.out.print("Enter old value: ");
                    int oldValue = sc.nextInt();

                    System.out.print("Enter new value: ");
                    int newValue = sc.nextInt();

                    list.update(oldValue, newValue);
                    break;

                case 12:
                    list.display();
                    break;

                case 13:
                    System.out.println("Total Nodes: " + list.countNodes());
                    break;

                case 14:
                    list.findMaximum();
                    break;

                case 15:
                    list.findMinimum();
                    break;

                case 16:
                    list.findMiddle();
                    break;

                case 17:
                    list.reverse();
                    System.out.println("List reversed successfully.");
                    break;

                case 18:
                    list.sort();
                    System.out.println("List sorted successfully.");
                    break;

                case 19:
                    list.removeDuplicates();
                    System.out.println("Duplicates removed successfully.");
                    break;

                case 20:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ================= DOUBLY MENU =================

    static void doublyMenu(DoublyLinkedList list) {

        while (true) {

            System.out.println("\n======================================");
            System.out.println("        DOUBLY LINKED LIST");
            System.out.println("======================================");

            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Insert After a Node");
            System.out.println("5. Insert Before a Node");
            System.out.println("6. Delete from Beginning");
            System.out.println("7. Delete from End");
            System.out.println("8. Delete from Position");
            System.out.println("9. Delete by Value");
            System.out.println("10. Search");
            System.out.println("11. Update");
            System.out.println("12. Display Forward");
            System.out.println("13. Display Backward");
            System.out.println("14. Count Nodes");
            System.out.println("15. Find Maximum");
            System.out.println("16. Find Minimum");
            System.out.println("17. Find Middle Element");
            System.out.println("18. Reverse");
            System.out.println("19. Sort");
            System.out.println("20. Remove Duplicates");
            System.out.println("21. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int data = sc.nextInt();

                    System.out.print("Enter position: ");
                    int position = sc.nextInt();

                    list.insertAtPosition(data, position);
                    break;

                case 4:
                    System.out.print("Enter target value: ");
                    int target = sc.nextInt();

                    System.out.print("Enter new value: ");
                    data = sc.nextInt();

                    list.insertAfter(target, data);
                    break;

                case 5:
                    System.out.print("Enter target value: ");
                    target = sc.nextInt();

                    System.out.print("Enter new value: ");
                    data = sc.nextInt();

                    list.insertBefore(target, data);
                    break;

                case 6:
                    list.deleteFromBeginning();
                    break;

                case 7:
                    list.deleteFromEnd();
                    break;

                case 8:
                    System.out.print("Enter position: ");
                    list.deleteFromPosition(sc.nextInt());
                    break;

                case 9:
                    System.out.print("Enter value: ");
                    list.deleteByValue(sc.nextInt());
                    break;

                case 10:
                    System.out.print("Enter value: ");
                    list.search(sc.nextInt());
                    break;

                case 11:
                    System.out.print("Enter old value: ");
                    int oldValue = sc.nextInt();

                    System.out.print("Enter new value: ");
                    int newValue = sc.nextInt();

                    list.update(oldValue, newValue);
                    break;

                case 12:
                    list.displayForward();
                    break;

                case 13:
                    list.displayBackward();
                    break;

                case 14:
                    System.out.println("Total Nodes: " + list.countNodes());
                    break;

                case 15:
                    list.findMaximum();
                    break;

                case 16:
                    list.findMinimum();
                    break;

                case 17:
                    list.findMiddle();
                    break;

                case 18:
                    list.reverse();
                    System.out.println("List reversed successfully.");
                    break;

                case 19:
                    list.sort();
                    System.out.println("List sorted successfully.");
                    break;

                case 20:
                    list.removeDuplicates();
                    System.out.println("Duplicates removed successfully.");
                    break;

                case 21:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ================= COMPARE =================

    static void compareLists() {

        System.out.println("\n==============================================");
        System.out.println("       SINGLY vs DOUBLY LINKED LIST");
        System.out.println("==============================================");

        System.out.println("\n1. Structure");
        System.out.println("Singly : Each node has data and next.");
        System.out.println("Doubly : Each node has data, previous and next.");

        System.out.println("\n2. Traversal");
        System.out.println("Singly : Forward traversal only.");
        System.out.println("Doubly : Forward and backward traversal.");

        System.out.println("\n3. Memory");
        System.out.println("Singly : Requires less memory.");
        System.out.println("Doubly : Requires more memory because of prev pointer.");

        System.out.println("\n4. Reverse Traversal");
        System.out.println("Singly : Cannot directly move backward.");
        System.out.println("Doubly : Can directly move backward.");

        System.out.println("\n5. Deletion");
        System.out.println("Singly : Previous node is generally required.");
        System.out.println("Doubly : Previous and next links make deletion easier.");

        System.out.println("\n6. Implementation");
        System.out.println("Singly : Simpler.");
        System.out.println("Doubly : More complex because two links must be maintained.");

        System.out.println("\n7. Applications");
        System.out.println("Singly : Simple lists, stacks, basic data storage.");
        System.out.println("Doubly : Browser history, undo/redo, navigation.");

        System.out.println("\n==============================================");
    }
}
