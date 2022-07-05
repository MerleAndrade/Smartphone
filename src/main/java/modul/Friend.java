package modul;

import java.util.Objects;

public class Friend extends Contact {

    public Friend(String name, String telephoneNumber){ // erbt hier, hääte das auch mit super funktioniert?
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    private String telephoneNumber;  // Attribut Telefonnummer

    public Friend(){ //  to invoke a superclass's constructor.
        super();
    }

    public String getTelephoneNumber() {
        return telephoneNumber;}

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return telephoneNumber.equals(friend.telephoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephoneNumber);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telephoneNumber='" + telephoneNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
