package services;

import dto.CreateContactRequest;
import entities.Contact;

public interface ContactService {
    // Basic CRUD Contact
    Contact addContact(CreateContactRequest request);
    Contact updateContact(String contactName, CreateContactRequest request);
    boolean removeContact(String contactName);

    // Bookmark Management
    boolean addToBookmark(String contactName);
    boolean removeBookmark(String contactName);

    // Query Methods
    void viewAllContacts();
    void searchContact(String keyWord);
    void viewContactByTag(String tags);
    void viewBookmarkedContact();

    // Utility
    boolean contactExists(String contactName);
    void getTotalContacts();
}
