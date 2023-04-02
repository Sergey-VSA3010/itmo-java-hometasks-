package ru.VolkovS.lessons.lesson6.HW7;

public class Remzone {
    String[] colors = new String[]{"Green", "Red", "Black", "Yellow", "White",};
    Transport[] transports = new Transport[10];

    public Remzone() {
    }

    public Remzone(String[] colors, Transport[] transports) {
        this.colors = colors;
        this.transports = transports;
    }


    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public Transport[] getTransports() {
        return transports;
    }

    public void setTransports(Transport[] transports) {
        if (transports.length > 10) {
            throw new IllegalArgumentException(" not must be > 10 ");
        }
        this.transports = transports;
    }

    public void addTransports(Transport transport, int post) {
        if (transports[post] == null) {
            transports[post] = transport;
        } else throw new IllegalArgumentException(" not null! ");



    }
    public void fixWearLevel(Transport transport){

        transport.setWearLevel(transport.wearLevel - 1);
        if (transport instanceof Bus) {
            if(((Bus) transport).isWifi() == false){
                ((Bus) transport).setWifi(true);
            }
        }
    }

}
