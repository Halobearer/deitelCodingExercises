package PhoneBook;

public class Contacts {

    //ArrayList<Contacts> contacts = new ArrayList<>();

    private String name;

    private String address;

    private long phoneNumber;

    //    public Contacts(String password, String userName) {
//        this.password = password;
//        this.userName = userName;
//    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("""
                        ############################
                        name: %s
                        Address: %s
                        Phone Number: %s
                        ############################
                        """,
                name, address, phoneNumber).toString();
    }


}
