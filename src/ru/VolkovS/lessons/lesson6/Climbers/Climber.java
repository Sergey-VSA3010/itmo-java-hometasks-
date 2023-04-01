package ru.VolkovS.lessons.lesson6.Climbers;

public class Climber {
    public String name;
    public String country;

    @Override
    public String toString() {
        return
                "name=" + name + '\'' +
                ", country='" + country + '\'';
    }

    public Climber(String name, String country) {


        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Exception: name не менее 3 символов");
        }
        if (country == null || country.length() <= 5) {
            throw new IllegalArgumentException("Exception: Country не менее 5 символов");
        }

        this.name = name;
        this.country = country;
    }

    public String fullName() {
        return    "name= " + name +   "," + " country= " + country   ;

    }
}


