package ru.VolkovS.lessons.lesson6.Climbers;

public class Climber {
    public String name;
    public String country;

    public Climber(String name, String country) {

        setName(name);
        setCountryClimber(country);
    }

    public void setName(String name) {

        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("name не менее 3 символов");
        }
        this.name = name;
    }

    public void setCountryClimber(String country) {

        if (country == null || country.length() <= 5) {
            throw new IllegalArgumentException("Country не менее 5 символов");
        }
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountryClimber() {
        return country;
    }

    public String getFullName() {
        String fullName = name + " " + country;
        return fullName;
    }
}


