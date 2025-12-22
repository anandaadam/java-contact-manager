package entities;

import java.util.ArrayList;
import java.util.Objects;

public class Contact {
    private String name;
    private ArrayList<String> phoneNumbers;
    private String email;
    private String address;
    private String tag;
    private boolean bookmark;

    public Contact(String name, ArrayList<String> phoneNumbers, String email, String address, String tag, boolean bookmark) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
        this.address = address;
        this.tag = tag;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
                ", tag='" + tag + '\'' +
                ", bookmark=" + bookmark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;
        return bookmark == contact.bookmark && Objects.equals(name, contact.name) && Objects.equals(phoneNumbers, contact.phoneNumbers) && Objects.equals(email, contact.email) && Objects.equals(address, contact.address) && Objects.equals(tag, contact.tag);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(phoneNumbers);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(address);
        result = 31 * result + Objects.hashCode(tag);
        result = 31 * result + Boolean.hashCode(bookmark);
        return result;
    }
}
