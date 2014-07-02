package webapp.model;

import java.io.Serializable;
import java.util.Collection;

public class Resume  implements  Serializable { // }, Comparable {

    String uuid;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public static Resume create(String fullName, String location) {
        return new Resume(fullName,location);
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

    @Override
    public String toString() {
        return "Resume{" +
                "uuid='" + uuid + '\'' +
                ", fullName='" + fullName + '\'' +
                ", location='" + location + '\'' +
                ", homePage='" + homePage + '\'' +
                ", sections=" + sections +
                ", contacts=" + contacts +
                '}';
    }
}
