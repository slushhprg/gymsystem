public class Client {

    public String name;
    private int id;
    public double plan;

    public Client(String name, int id, double payment) {
        this.name = name;
        this.id = id;
        this.plan = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getPlan() {
        return plan;
    }

    public void setPlan(double plan) {
        this.plan = plan;
    }

    public String toString() {
        return "Name: "
                + name
                + ", ID :"
                + id
                + ", Amount to pay: U$"
                + String.format("%.2f ", plan);
    }

}
