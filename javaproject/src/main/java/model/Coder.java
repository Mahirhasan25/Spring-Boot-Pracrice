package model;

public class Coder {
    private int id;
    private String name;
    private String language;
    private Computer computer;

    public Coder() {
        System.out.println("NO - Args");
    }

    public Coder(int id, String name, String language, Computer com) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.computer = com;
        System.out.println("All - Args");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer com) {
        this.computer = com;
    }


}
