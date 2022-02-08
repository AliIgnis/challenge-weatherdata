package de.exxcellent.challenge;
public class fotballTeam{
    private int goals;
    private int goalsAllowed;
    private String teamName;

    fotballTeam(String teamName, int goals, int goalsAllowed) {
        this.teamName = teamName;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
    }

    void init(String fileLine) {
        String fields[] = fileLine.split(",");
        teamName = fields[0];
        goalsAllowed = Integer.parseInt(fields[1]);
        goals = Integer.parseInt(fields[2]);
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

    public double calcSpread() {
        return helperFunction.calcSpread(goals, goalsAllowed);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
