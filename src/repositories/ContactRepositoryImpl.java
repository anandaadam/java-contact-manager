package repositories;

import entities.Contact;

import java.util.*;

public class ContactRepositoryImpl implements ContactRepository {
    private TreeMap<String, Contact> contacts;
    private HashMap<String, Contact> contactsByPhone;
    private ArrayList<Contact> bookmarkedContacts;
    private HashMap<String, HashSet<Contact>> contactsByTag;

    public ContactRepositoryImpl() {
        this.contacts = new TreeMap<>();  // TreeMap untuk sorting
        this.contactsByPhone = new HashMap<>();
        this.bookmarkedContacts = new ArrayList<>();
        this.contactsByTag = new HashMap<>();
    }

    @Override
    public Contact addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
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
    public List<Contact> viewAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    @Override
    public List<Contact> searchContact(String keyWord) {
        return List.of();
    }

    @Override
    public List<Contact> viewContactByTag(String tag) {
        return List.of();
    }

    @Override
    public List<Contact> viewBookmarkedContact() {
        return List.of();
    }

    @Override
    public boolean contactExists(String name) {
        return false;
    }

    @Override
    public int getTotalContacts() {
        return 0;
    }
}
