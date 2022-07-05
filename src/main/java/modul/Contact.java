package modul;

public abstract class Contact { // Parent class, Oberklasse

    protected String name;

    public Contact (){  // Calling a superclass constructor
        super();
    }
    public Contact(String name) {  //brauchen wir nicht
        this.name = name;
    }

    public String getName() {
        return name;}

    public void setName(String name) { //brauchen wir nicht
        this.name = name;
    }
}

