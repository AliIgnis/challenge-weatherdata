package de.exxcellent.challenge;
public class fotballTeam {
    private int goals;
    private int goalsAllowed;
    private String teamName;

    fotballTeam(String teamName, int goals, int goalsAllowed) {
        this.teamName = teamName;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public int goalSpread() {
        int spread = goalsAllowed - goals;
        return (spread < 0 ? spread * -1 : spread);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
