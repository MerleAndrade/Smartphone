package modul;

import java.util.Arrays;

public class Smartphones implements Radio, GPS{

private String model;
private String producer;

private Contact [] contacts;


    public Smartphones (){
        super();
    }

    public Smartphones(String model, String producer, Contact[] contacts) {
        this.model = model;
        this.producer = producer;
        this.contacts = contacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphones{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
