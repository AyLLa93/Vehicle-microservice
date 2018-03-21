package Model;

public class VoziloRacun {

    private int id;
    private int voziloID;
    private double costPerDay;
    private double deposit;

    public VoziloRacun() {}

    public VoziloRacun(int id, int voziloID, double costPerDay, double deposit) {
        this.id = id;
        this.voziloID = voziloID;
        this.costPerDay = costPerDay;
        this.deposit = deposit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVoziloID() {
        return voziloID;
    }

    public void setVoziloID(int voziloID) {
        this.voziloID = voziloID;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(float costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }
}
