package ru.VolkovS.lessons.lesson6.HW7;

public class Train extends Transport{
    private int wagons;
    public Train(int wearLevel, int number, String color, int wagoos) {
        super(wearLevel, number, color);
        this.wagons = wagoos;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        if (wagons < 1){
            throw new IllegalArgumentException("Exception:wagons must be > 0");
        }
        this.wagons = wagons;
    }
    @Override
    public void setColor(String color){
        if(color != "Green"){
            super.setColor("Green") ;
            //throw new IllegalArgumentException("Must be Green ");

        }
    }


}
