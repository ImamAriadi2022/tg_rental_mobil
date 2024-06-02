public abstract  class user {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumbers;
    private String password;

    public user() {}

    public int getID() {
        return ID;
    }

    public void setID (int ID){
        this.ID = ID;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumbers;
    }

    public void setPhoneNumbers (String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public abstract void showList();
}
