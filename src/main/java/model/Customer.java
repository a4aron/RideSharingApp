package model;

public class Customer extends Person {

    public Customer(long id) {
        super(id);
    }

    public Customer(long id, String firstName, String lastName, String phone, String address) {
        this(firstName, lastName, phone, address);
        this.setId(id);
    }

    public Customer(String firstName, String lastName, String phone, String address) {
        super(firstName, lastName, phone, address);
    }

}
