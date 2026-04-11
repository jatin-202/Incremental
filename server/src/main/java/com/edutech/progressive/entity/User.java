// entity/Team.java
package com.edutech.progressive.entity;

public class Team {
    private int teamld;
    private String teamName;
    private String location;
    private String ownerName;
    private int establishmentYear;

    public Team() {}

    public Team(int teamld, String teamName, String location, String ownerName, int establishmentYear) {
        this.teamld = teamld;
        this.teamName = teamName;
        this.location = location;
        this.ownerName = ownerName;
        this.establishmentYear = establishmentYear;
    }

    public int getTeamld() { return teamld; }
    public void setTeamld(int teamld) { this.teamld = teamld; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public int getEstablishmentYear() { return establishmentYear; }
    public void setEstablishmentYear(int establishmentYear) { this.establishmentYear = establishmentYear; }
}
