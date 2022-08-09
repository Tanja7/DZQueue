public class Person {

    //   Каждый человек, который посетил парк аттракционов, должен описываться вашим классом Person.
    //   Про каждого человека известно его имя, фамилия и количество билетов.

    public String name;
    public String surname;
    public int numTickets;

    public Person(String name, String surname, int numTickets) {
        this.name = name;
        this.surname = surname;
        this.numTickets = numTickets;
    }

}
