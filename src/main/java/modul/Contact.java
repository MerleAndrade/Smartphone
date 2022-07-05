package modul;

public abstract class Contact {

    protected String name;

    public Contact (){  // Calling a superclass constructor
        super();
    }
    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;
    }
}

