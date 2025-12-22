package repositories;

import entities.Contact;

public interface ContactRepository {
    Contact addContact(Contact contact);
    Contact updateContact(String name, Contact contact);
    boolean removeContact(String name);
    Contact addPhoneNumber(String name, String phoneNumber);
    boolean addToBookmark(String name);
    Contact[] viewAllContacts();
    Contact[] searchContact(String keyWord);
    Contact[] viewContactByTag(String tag);
    Contact[] viewBookmarkedContact();
}
