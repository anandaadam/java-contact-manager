package repositories;

import entities.Contact;

import java.util.List;

public interface ContactRepository {
    // Basic CRUD Contact
    Contact addContact(Contact contact);
    Contact updateContact(String name, Contact contact);
    boolean removeContact(String name);

    // Bookmark Management
    boolean addToBookmark(String name);
    boolean removeBookmark(String name);

    // Query Methods
    List<Contact> viewAllContacts();
    List<Contact> searchContact(String keyWord);
    List<Contact> viewContactByTag(String tag);
    List<Contact> viewBookmarkedContact();

    // Utility
    boolean contactExists(String name);
    int getTotalContacts();
}
