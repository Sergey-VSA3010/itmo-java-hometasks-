package ru.VolkovS.lessons.lesson6.Climbers;

public class Climber {
    public String name;
    public String country;

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

    public String getFullName() {
        return   "Climber{" + "name='" + name + '\'' + "," +
                " countyOfResidence='" + country + '\'' + '}';

    }
}


