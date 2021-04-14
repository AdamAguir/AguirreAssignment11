public class Player {

    private String fName;
    private String lName;
    private double shootPct;
    private int rebounds;
    private int assists;
    private int turnOvers;

    public Player(String fName, String lName, double shootPct, int rebounds, int assists, int turnOvers){
        this.fName = fName;
        this.lName = lName;
        this.shootPct = shootPct;
        this.rebounds = rebounds;
        this.assists = assists;
        this.turnOvers = turnOvers;
    }

    public String getfName() {
        return fName;
    }
    public String getlName() {
        return lName;
    }
    public double getShootPct() {
        return shootPct;
    }
    public int getRebounds() {
        return rebounds;
    }
    public int getAssists() {
        return assists;
    }
    public int getTurnOvers() {
        return turnOvers;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public void setShootPct(double shootPct) {
        this.shootPct = shootPct;
    }
    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }
    public void setAssists(int assists) {
        this.assists = assists;
    }
    public void setTurnOvers(int turnOvers) {
        this.turnOvers = turnOvers;
    }
    @Override
    public String toString() {
        return "Player:[fname: " + getfName() + ", lname: " + getlName() + ", shootPct:" + getShootPct() + 
               ", Rebounds:" + getRebounds() + ", Assists:" + getAssists() + ", Turn Overs:" + getTurnOvers() + "]";
    }
}
