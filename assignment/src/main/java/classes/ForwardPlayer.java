package classes;

import java.util.Date;

public class ForwardPlayer {
    private int playerId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String team;
    private int height;
    private int weight;
    private int games;
    private int pucks;
    private int total;
    private int assists;
    private double utilityIndicator;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getPucks() {
        return pucks;
    }

    public void setPucks(int pucks) {
        this.pucks = pucks;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public double getUtilityIndicator() {
        return utilityIndicator;
    }

    public void setUtilityIndicator(double utilityIndicator) {
        this.utilityIndicator = utilityIndicator;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}
