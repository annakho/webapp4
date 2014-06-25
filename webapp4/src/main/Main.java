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
        //Resume r2 = new Resume();
/*
        r.setFullName("Ivan Ivanov");
        System.out.println(r2.getFullName());
*/
        System.out.println(r.getClass());
        System.out.println(Resume.class);
        System.out.println(Resume.class==r.getClass());

        Section c = new Section("Qualifications");
        if (c instanceof TextSection) { // not object oriented
            //usually used in exceptions
            //better be avoided
            ((TextSection) c).getContent();
        }

        //widegets oif are reloadable they could be

        //diffrence between the following is that we can assign
        //null to i, but can
        Integer i = 5;
        int i2 = 5; // int i2 = i.intValue();

        boolean b = true; //2 values -- true/false
        Boolean b1 = null; // 3 values -- true/false/null

        Resume r3 = new Resume();
        Resume.create("","");

    }

    static void print (int i) {
        System.out.print(i); // bydet nullPointerException -- vsegda obrashenie k NULL privet k etomy exception
        //primitivnij tip vsegda predpochtitelnej tak kak on mesta men'she zanimaet
        //
    }
}
