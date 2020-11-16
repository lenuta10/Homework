package homework3.model;

public class Country {

    private String name;
    private String capital;
    private long population;

    public Country(String name, String capital, long population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" + "name='" + name + '\'' + ", capital='" + capital + '\'' + ", population=" + population + '}';
    }
}
