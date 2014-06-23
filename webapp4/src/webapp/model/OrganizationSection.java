package webapp.model;

import java.util.Collection;


public class OrganizationSection extends Section {
    Collection <Organization> organizations;
    public OrganizationSection(String type) {
        super(type);
    }

    public Collection<Organization> getOrganizations() {
        return organizations;
    }
}
