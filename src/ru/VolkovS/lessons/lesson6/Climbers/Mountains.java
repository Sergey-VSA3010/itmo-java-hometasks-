package ru.VolkovS.lessons.lesson6.Climbers;

public class Mountains {
    private String name;
    private String country;
    private int height;

    public Mountains(String name, String country, int height) {

        this.name = name;
        this.country = country;
        this.height = height;

    }

    public void setName(String name) {
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("Exception: name не менее 4 символов");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setСountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Exception: country не менее 4 символов");
        }
        this.country = country;
    }

    public String getСountry() {
        return country;
    }

    public void setHeight(int height) {
        if (height < 100) {
            throw new IllegalArgumentException("Exception: height должно быть больше 100 метров");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getFullName() {
        String fullName = name + " " + country + " " + height;
        return fullName;
    }
}
