package views;

import dto.CreateContactRequest;
import entities.Contact;
import services.ContactService;

import java.util.Scanner;

public class ContactView {
    private ContactService contactService;
    private Scanner scanner = new Scanner(System.in);

    public ContactView(ContactService contactService) {
        this.contactService = contactService;
    }

    public void showMenu() {
        while (true) {
            System.out.println("=== Contact Manager ===");
            System.out.println("1. View All Contacts");
            System.out.println("2. Add Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Remove Contact");
            System.out.println("5. Add Contact to Bookmark");
            System.out.println("6. Remove Contact from Bookmark");
            System.out.println("7. Search Contact");
            System.out.println("8. View Contacts by Tag");
            System.out.println("9. View Bookmarked Contacts");
            System.out.println("10. Done");

            System.out.print("Choose: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> viewAllContacts();
                case "2" -> addContact();
                case "3" -> updateContact();
                case "4" -> removeContact();
                case "5" -> addToBookmark();
                case "6" -> removeFromBookmark();
//                case "7" -> searchContact();
//                case "8" -> viewByTag();
//                case "9" -> viewBookmarked();
                case "10" -> {
                    System.out.println("Goodbye 👋");
                    return; //
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public void viewAllContacts() {
        contactService.viewAllContacts();
    }

    public void addContact() {
        System.out.println("Add Contact");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone numbers (comma separated): ");
        String phoneNumbers = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Tags (comma separated): ");
        String tags = scanner.nextLine();

        boolean bookmark = false;

        CreateContactRequest request = new CreateContactRequest(name, phoneNumbers, email, address, tags, bookmark);
        Contact result =  contactService.addContact(request);

        System.out.println(result);
    }

    public void updateContact() {
        System.out.println("Update Contact");

        viewAllContacts();

        System.out.print("Choose contact name: ");
        String contactName = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone numbers (comma separated): ");
        String phoneNumbers = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Tags (comma separated): ");
        String tags = scanner.nextLine();

        boolean bookmark = false;

        CreateContactRequest request = new CreateContactRequest(name, phoneNumbers, email, address, tags, bookmark);
        Contact result = contactService.updateContact(contactName, request);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Contact is not listed");
        }
    }

    public void removeContact() {
        System.out.println("Remove Contact");

        viewAllContacts();

        System.out.print("Choose contact name: ");
        String contactName = scanner.nextLine();

        boolean isDelete = contactService.removeContact(contactName);

        if (isDelete) {
            System.out.println("Success to remove");
        } else {
            System.out.println("Contact is not listed");
        }
    }

    public void addToBookmark() {
        System.out.println("Add to Bookmark");

        viewAllContacts();

        System.out.print("Choose contact name: ");
        String contactName = scanner.nextLine();

        boolean success = contactService.addToBookmark(contactName);
        if (success) {
            System.out.println("Success add to bookmark");
        } else {
            System.out.println("Contact is not listed");
        }
    }

    public void removeFromBookmark() {
        System.out.println("Remove from Bookmark");

        viewAllContacts();

        System.out.print("Choose contact name: ");
        String contactName = scanner.nextLine();

        boolean success = contactService.removeBookmark(contactName);
        if (success) {
            System.out.println("Success remove from bookmark");
        } else {
            System.out.println("Contact is not listed");
        }
    }
}
