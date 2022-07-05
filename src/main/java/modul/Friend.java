package modul;

public class Friend extends Contact {

    public Friend(String name, String phoneNumber){
        super(name);
        this.phoneNumber = phoneNumber;
    }

    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;}

}
