import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContactMangement manager = new ContactMangement();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. delete Contact");
            System.out.println("5. update contact");
            System.out.println("6. Exit");
            System.out.println("choose an option");
            //any change.

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character.

            switch (choice){
                case 1: //Add contact
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();
                    manager.addContact(new Contact(name, phoneNumber, email));
                    break;

                case 2: // display Contacts
                    manager.displayContacts();
                    break;

                case 3: //Search contact
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Contact foundContact = manager.searchContact(searchName);
                    if(foundContact != null){
                        System.out.println("Contact found: " + foundContact);
                    }else{
                        System.out.println("contact not found.");
                    }
                    break;

                case 4: //Delete contact.
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    manager.deleteContact(deleteName);
                    break;

                case 5: //update contact
                    System.out.println("Enter name to update: ");
                    String updateName = scanner.nextLine();
                    System.out.println("Enter new phone number: ");
                    String newphoneNumber = scanner.nextLine();
                    System.out.println("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    manager.updateContacts(updateName, newphoneNumber, newEmail);
                    break;

                case 6: // Exit
                    System.out.println("Exiting the Contact Management system.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. please try again.");
                    break;
            }
        }

    }
}