package Miniprojet;

public abstract class Person
{

    String firstName;
    String lastName;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract String getColaboreterId();
}


