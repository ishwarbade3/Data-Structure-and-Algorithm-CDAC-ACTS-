package doubly_linked_list;

import java.util.Scanner;

public class Doubly_Main {
	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);
		Doubly_LinkedList list = new Doubly_LinkedList();

		int choice, data, pos, result;

		do {
			System.out.println("\n===== DOUBLY LINKED LIST MENU =====");
			System.out.println("1. Insert First");
			System.out.println("2. Insert Last");
			System.out.println("3. Insert At Position");
			System.out.println("4. Delete First");
			System.out.println("5. Delete Last");
			System.out.println("6. Delete By Position");
			System.out.println("7. Display");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			choice = kbd.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter data: ");
				data = kbd.nextInt();
				list.insertFirst(data);
				System.out.println("Node inserted at first.");
				break;

			case 2:
				System.out.print("Enter data: ");
				data = kbd.nextInt();
				list.insertLast(data);
				System.out.println("Node inserted at last.");
				break;

			case 3:
				System.out.print("Enter data: ");
				data = kbd.nextInt();
				System.out.print("Enter position: ");
				pos = kbd.nextInt();
				list.insertAtPos(data, pos);
				System.out.println("Node inserted at position " + pos);
				break;

			case 4:
				result = list.deleteFirst();
				if (result == -1)
					System.out.println("List is empty.");
				else
					System.out.println("Deleted first node: " + result);
				break;

			case 5:
				result = list.deleteLast();
				if (result == -1)
					System.out.println("List is empty.");
				else
					System.out.println("Deleted last node: " + result);
				break;

			case 6:
				System.out.print("Enter position: ");
				pos = kbd.nextInt();
				result = list.deleteByPos(pos);

				if (result == -1)
					System.out.println("Deletion failed.");
				else
					System.out.println("Deleted node: " + result);
				break;

			case 7:
				System.out.println("Linked List:");
				list.display();
				break;

			case 8:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 8);

		kbd.close();
	}

}
