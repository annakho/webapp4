package main;

import webapp.model.Resume;
import webapp.model.Section;
import webapp.model.TextSection;

/**
 * User: gkislin
 * Date: 16.06.2014
 */
public class Main {
    /**
     * First java program
     *
     * @param args args[0]: name
     */
    public static void main(String[] args) {
        Resume r = new Resume("Ivan Ivanov", "address 1");
        Resume r2 = new Resume();
/*
        r.setFullName("Ivan Ivanov");
        System.out.println(r2.getFullName());
*/
        System.out.println(r2.getClass());
        System.out.println(Resume.class);
        System.out.println(Resume.class==r.getClass());

        Section c = new Section("Qualifications");
        if (c instanceof TextSection) { // not object oriented
            //usually used in exceptions
            //better be avoided
            ((TextSection) c).getContent();
        }

        //widegets oif are reloadable they could be

    }
}
