package services;

import dto.CreateContactRequest;
import entities.Contact;
import repositories.ContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact addContact(CreateContactRequest request) {
        String name = request.getName();
        String email = request.getEmail();
        String address = request.getAddress();
        boolean bookmark = request.isBookmark();

        String phonesInput = request.getPhoneNumbers();
        ArrayList<String> phoneNumbers = new ArrayList<>();
        for (String phone : phonesInput.split(",")) {
            phoneNumbers.add(phone);
        }

        String tagsInput = request.getTags();
        ArrayList<String> tags = new ArrayList<>();
        for (String tag :  tagsInput.split(",")) {
            tags.add(tag);
        }

        Contact contact = new Contact(name, phoneNumbers, email, address, tags, bookmark);
        contactRepository.addContact(contact);

        return contact;
    }

    @Override
    public Contact updateContact(String contactName, CreateContactRequest request) {
        String name = request.getName();
        String email = request.getEmail();
        String address = request.getAddress();
        boolean bookmark = request.isBookmark();

        String phonesInput = request.getPhoneNumbers();
        ArrayList<String> phoneNumbers = new ArrayList<>();
        for (String phone : phonesInput.split(",")) {
            phoneNumbers.add(phone);
        }

        String tagsInput = request.getTags();
        ArrayList<String> tags = new ArrayList<>();
        for (String tag :  tagsInput.split(",")) {
            tags.add(tag);
        }

        Contact contact = new Contact(name, phoneNumbers, email, address, tags, bookmark);

        return contactRepository.updateContact(contactName, contact);
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
        List<Contact> contacts = contactRepository.viewAllContacts();
        if (contacts.isEmpty()) {
            System.out.println("No contact found");
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
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
