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

        for (String phone : contact.getPhoneNumbers()) {
            contactsByPhone.put(phone, contact);
        }

        for (String tag : contact.getTags()) {
            contactsByTag
                    .computeIfAbsent(tag, k -> new HashSet<>())
                    .add(contact);
        }

        if (contact.isBookmark()) {
            bookmarkedContacts.add(contact);
        }

        return contact;
    }

    @Override
    public Contact updateContact(String contactName, Contact contact) {
        Contact oldContact = contacts.get(contactName);
        if (oldContact != null) {
            contacts.remove(contactName);
            contacts.put(contact.getName(), contact);

            return contact;
        }

        return null;
    }

    @Override
    public boolean removeContact(String contactName) {
        Contact contact = contacts.get(contactName);
        if (contact != null) {
            contacts.remove(contactName);
            return true;
        }

        return false;
    }

    @Override
    public boolean addToBookmark(String contactName) {
        Contact contact = contacts.get(contactName);
        if (contact != null) {
            contact.setBookmark(true);
            contacts.put(contactName, contact);
            return true;
        }

        return false;
    }

    @Override
    public boolean removeBookmark(String contactName) {
        Contact contact = contacts.get(contactName);
        if (contact != null) {
            contact.setBookmark(false);
            contacts.put(contactName, contact);
            return true;
        }

        return false;
    }

    @Override
    public List<Contact> viewAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    @Override
    public List<Contact> searchContact(String keyWord) {
        Set<Contact> result = new HashSet<>();

        for (Contact contact : contacts.values()) {
            if (contact.getName().toLowerCase().contains(keyWord.toLowerCase())) {
                result.add(contact);
            }
        }

        Contact byPhone = contactsByPhone.get(keyWord);
        if (byPhone != null) {
            result.add(byPhone);
        }

        Set<Contact> byTag = contactsByTag.get(keyWord);
        if (byTag != null) {
            result.addAll(byTag);
        }

        return new ArrayList<>(result);
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
    public boolean contactExists(String contactName) {
        return false;
    }

    @Override
    public int getTotalContacts() {
        return 0;
    }
}
