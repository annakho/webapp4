package webapp.model;

import java.util.Collection;

public class Resume {

    String fullName;
    String location;
    String homePage;
    Collection<Section> sections;
    Collection<Contact> contacts;

    public Resume() {
    }

    public Resume(String fullName, String location) {
        this.fullName = fullName;
        this.location = location;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Collection<Section> getSections() {
        return sections;
    }

    public Collection<Contact> getContacts() {
        return  contacts;
    }

}
