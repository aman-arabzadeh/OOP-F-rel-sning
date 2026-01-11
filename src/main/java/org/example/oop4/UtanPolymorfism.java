package org.example.oop4;

public class UtanPolymorfism {
    public static void main(String[] args) {
        Person[] personer = {
                new Student("Anna", "anna@uni.se", "Gatan 1", "s123", "CS"),
                new Larare("Ola", "ola@uni.se", "Gatan 2", "a777", "Lektor"),
                new Person("Erik", "erik@exempel.se", "Storgatan 10")
        };

        for (Person p : personer) {
            if (p instanceof Larare l) {
                System.out.println(l.kontaktInfoLarare());
            } else if (p instanceof Student s) {
                System.out.println(s.kontaktInfoStudent());
            } else {
                System.out.println(p.kontaktInfo());
            }
            System.out.println("---------");
        }
    }
}
