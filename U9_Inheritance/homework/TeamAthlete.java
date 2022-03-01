package U9_Inheritance.homework;

public class TeamAthlete extends Athlete{
    private String teamName;
    private String sport;

    public TeamAthlete(int age, String name, String teamName, String sport) {
        super(age, name);
        this.teamName = teamName;
        this.sport = sport;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
