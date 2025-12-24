package dto;

public class CreateContactRequest {
    private String name;
    private String phoneNumbers;
    private String email;
    private String address;
    private String tags;
    private boolean bookmark;

    public CreateContactRequest(String name, String phoneNumbers, String email, String address, String tags, boolean bookmark) {
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

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getTags() {
        return tags;
    }

    public boolean isBookmark() {
        return bookmark;
    }
}
