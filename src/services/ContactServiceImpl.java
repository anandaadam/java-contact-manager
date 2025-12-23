package services;

import entities.Contact;
import repositories.ContactRepository;

public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact addContact(Contact contact) {
        return null;
    }

    @Override
    public Contact updateContact(String name, Contact contact) {
        return null;
    }

    @Override
    public boolean removeContact(String name) {
        return false;
    }

    @Override
    public boolean addToBookmark(String name) {
        return false;
    }

    @Override
    public boolean removeBookmark(String name) {
        return false;
    }

    @Override
    public void viewAllContacts() {

    }

    @Override
    public void searchContact(String keyWord) {

    }

    @Override
    public void viewContactByTag(String tag) {

    }

    @Override
    public void viewBookmarkedContact() {

    }

    @Override
    public boolean contactExists(String name) {
        return false;
    }

    @Override
    public void getTotalContacts() {

    }
}
