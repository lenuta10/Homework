package functions_homework;

public class SalesRepresentative {

    private int nrOfSales;
    private double quota;

    public SalesRepresentative(int nrOfSales, double quota) {
        this.nrOfSales = nrOfSales;
        this.quota = quota;
    }

    public void setNrOfSales(int nrOfSales) {
        this.nrOfSales = nrOfSales;
    }

    public int getNrOfSales() {
        return this.nrOfSales;
    }

    public double getQuota() {
        return this.quota;
    }

    public double calculateRevenue() {
        return this.nrOfSales * this.quota;
    }

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "nrOfSales=" + nrOfSales +
                ", quota=" + quota +
                '}';
    }
}
