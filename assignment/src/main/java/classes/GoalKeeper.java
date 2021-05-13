package classes;

import java.util.Date;

public class GoalKeeper {
    private int playerId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String team;
    private int height;
    private int weight;
    private int dryGames;
    private double saveRatio;

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

    public int getDryGames() {
        return dryGames;
    }

    public void setDryGames(int dryGames) {
        this.dryGames = dryGames;
    }

    public double getSaveRatio() {
        return saveRatio;
    }

    public void setSaveRatio(double saveRatio) {
        this.saveRatio = saveRatio;
    }
}
