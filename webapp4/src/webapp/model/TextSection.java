package webapp.model;

import java.util.Collection;


public class TextSection extends Section {
    Collection <String> content;
    public TextSection(String type) {
        super(type);
    }

    public Collection<String> getContent() {
        return content;
    }

}
