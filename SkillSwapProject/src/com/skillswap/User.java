package com.skillswap;

public class User {
    private int id;
    private String name;
    private String location;
    private String skillsOffered;
    private String skillsWanted;
    private String availability;
    private boolean isPublic;

    public User(int id, String name, String location, String skillsOffered, String skillsWanted, String availability, boolean isPublic) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.skillsOffered = skillsOffered;
        this.skillsWanted = skillsWanted;
        this.availability = availability;
        this.isPublic = isPublic;
    }

    public User(String name, String location, String skillsOffered, String skillsWanted, String availability, boolean isPublic) {
        this(0, name, location, skillsOffered, skillsWanted, availability, isPublic);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getSkillsOffered() { return skillsOffered; }
    public String getSkillsWanted() { return skillsWanted; }
    public String getAvailability() { return availability; }
    public boolean isPublic() { return isPublic; }
}