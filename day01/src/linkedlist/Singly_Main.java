package linkedlist;

import java.util.Scanner;

public class Singly_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Singly_LL list = new Singly_LL(null);
        Remove_Cycle list = new Remove_Cycle(null);

        int choice;

        do {
            System.out.println(
                    "\n===== MAIN MENU =====\n1. Insert Operations\n2. Delete Operations\n3. Display Operations\n4. Other Operations\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            // ================= INSERT =================
            case 1:
                int insertChoice;
                do {
                    System.out.println(
                            "\n--- Insert Menu ---\n1. Insert First\n2. Insert Last\n3. Insert At Position\n4. Insert Sorted\n5. Insert Before Data\n6. Insert After Data\n7. Display List\n8. Exit");
                    System.out.print("Enter choice: ");
                    insertChoice = sc.nextInt();

                    if (insertChoice == 8) {
                        System.out.println("Exiting Insert Menu!");
                        break;
                    }

                    if (insertChoice == 7) {
                        list.display();
                        continue;
                    }

                    System.out.print("Enter data: ");
                    int data = sc.nextInt();

                    switch (insertChoice) {
                    case 1:
                        list.insertFirst(data);
                        break;
                    case 2:
                        list.insertLast(data);
                        break;
                    case 3:
                        System.out.print("Enter position: ");
                        int pos = sc.nextInt();
                        list.insertAtPosition(data, pos);
                        break;
                    case 4:
                        list.insertSorted(data);
                        break;
                    case 5:
                        System.out.print("Enter key: ");
                        int key1 = sc.nextInt();
                        list.insertBeforeData(data, key1);
                        break;
                    case 6:
                        System.out.print("Enter key: ");
                        int key2 = sc.nextInt();
                        list.insertAfterData(data, key2);
                        break;
                    default:
                        System.out.println("Invalid Insert Choice!");
                    }
                } while (insertChoice != 8);
                break;

            // ================= DELETE =================
            case 2:
                int deleteChoice;
                do {
                    System.out.println(
                            "\n--- Delete Menu ---\n1. Delete First\n2. Delete Last\n3. Delete At Position\n4. Display List\n5. Exit");
                    System.out.print("Enter choice: ");
                    deleteChoice = sc.nextInt();

                    switch (deleteChoice) {
                    case 1:
                        System.out.println("Deleted: " + list.deleteFirst());
                        break;
                    case 2:
                        System.out.println("Deleted: " + list.deleteLast());
                        break;
                    case 3:
                        System.out.print("Enter position: ");
                        int pos = sc.nextInt();
                        System.out.println("Deleted: " + list.deleteAtPosition(pos));
                        break;
                    case 4:
                        list.display();
                        break;
                    case 5:
                        System.out.println("Exiting Delete Menu!");
                        break;
                    default:
                        System.out.println("Invalid Delete Choice!");
                    }
                } while (deleteChoice != 5);
                break;

            // ================= DISPLAY =================
            case 3:
                int displayChoice;
                do {
                    System.out.println(
                            "\n--- Display Menu ---\n1. Display List\n2. Display Alternate Nodes\n3. Exit");
                    System.out.print("Enter choice: ");
                    displayChoice = sc.nextInt();

                    switch (displayChoice) {
                    case 1:
                        list.display();
                        break;
                    case 2:
                        list.displayAlternateNode();
                        break;
                    case 3:
                        System.out.println("Exiting Display Menu!");
                        break;
                    default:
                        System.out.println("Invalid Display Choice!");
                    }
                } while (displayChoice != 3);
                break;

            // ================= OTHER =================
            case 4:
                int otherChoice;
                do {
                    System.out.println(
                            "\n--- Other Operations ---\n1. Count Nodes\n2. Reverse List\n3. Swap Alternate\n4. Display List\n5. Form Cycle \n6. RemoveCycle \n7. Exit");
                    System.out.print("Enter choice: ");
                    otherChoice = sc.nextInt();

                    switch (otherChoice) {
                    case 1:
                        System.out.println("Node Count: " + list.countNode());
                        break;
                    case 2:
                        list.reversedLinkedList();
                        System.out.println("List Reversed!");
                        break;
                    case 3:
                        list.swapAlternative();
                        System.out.println("Alternate nodes swapped!");
                        break;
                    case 4:
                        list.display();
                        break;
                    case 5:
                    	System.out.print("Enter Data From Where you Want to Form cycle !!!  :");
                    	int fd = sc.nextInt();
                        list.formCycle(fd);
                        break;
                    case 6:
                        list.removeCycle();
                        break;
                    case 7:
                        System.out.println("Exiting Other Menu!");
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                    }
                } while (otherChoice != 7);
                break;

            // ================= EXIT =================
            case 5:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid Main Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}