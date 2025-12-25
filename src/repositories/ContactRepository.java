package repositories;

import entities.Contact;

import java.util.List;

public interface ContactRepository {
    // Basic CRUD Contact
    Contact addContact(Contact contact);
    Contact updateContact(String contactName, Contact contact);
    boolean removeContact(String contactName);

    // Bookmark Management
    boolean addToBookmark(String contactName);
    boolean removeBookmark(String contactName);

    // Query Methods
    List<Contact> viewAllContacts();
    List<Contact> searchContact(String keyWord);
    List<Contact> viewContactByTag(String tag);
    List<Contact> viewBookmarkedContact();

    // Utility
    boolean contactExists(String contactName);
    int getTotalContacts();
}
