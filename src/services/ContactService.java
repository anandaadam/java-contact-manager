package services;

import entities.Contact;

import java.util.List;

public interface ContactService {
    // Basic CRUD Contact
    Contact addContact(Contact contact);
    Contact updateContact(String name, Contact contact);
    boolean removeContact(String name);

    // Bookmark Management
    boolean addToBookmark(String name);
    boolean removeBookmark(String name);

    // Query Methods
    void viewAllContacts();
    void searchContact(String keyWord);
    void viewContactByTag(String tag);
    void viewBookmarkedContact();

    // Utility
    boolean contactExists(String name);
    void getTotalContacts();
}
