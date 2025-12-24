package entities;

import java.util.ArrayList;
import java.util.Objects;

public class Contact {
    private String name;
    private ArrayList<String> phoneNumbers;
    private String email;
    private String address;
    private ArrayList<String> tags;
    private boolean bookmark;

    public Contact(String name, ArrayList<String> phoneNumbers, String email, String address, ArrayList<String> tags, boolean bookmark) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
        this.address = address;
        this.tags = tags;
        this.bookmark = bookmark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public boolean isBookmark() {
        return bookmark;
    }

    public void setBookmark(boolean bookmark) {
        this.bookmark = bookmark;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", tags=" + tags +
                ", bookmark=" + bookmark +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;
        return bookmark == contact.bookmark && Objects.equals(name, contact.name) && Objects.equals(phoneNumbers, contact.phoneNumbers) && Objects.equals(email, contact.email) && Objects.equals(address, contact.address) && Objects.equals(tags, contact.tags);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(phoneNumbers);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(address);
        result = 31 * result + Objects.hashCode(tags);
        result = 31 * result + Boolean.hashCode(bookmark);
        return result;
    }
}
