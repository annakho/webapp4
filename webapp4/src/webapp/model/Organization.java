package webapp.model;

import sun.plugin.javascript.navig.Link;

import java.util.Collection;


public class Organization {

    Link organization;
    Collection <Period> periods;

    public Link getOrganization() {
        return organization;
    }

    public Collection<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(Collection<Period> periods) {
        this.periods = periods;
    }
}
