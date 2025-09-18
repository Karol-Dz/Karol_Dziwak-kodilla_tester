public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price >= 600 && this.price < 1000 ) {
            System.out.println("This price is good.");
        }
        if (this.price >= 1000) {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        }
        if (this.weight >= 700 && this.weight < 1300) {
            System.out.println("This notebook is quite heavy.");
        }
        if (this.weight >= 1300) {
            System.out.println("This notebook is heavy.");
        }
    }
    public void checkYear() {
        if (this.year == 2015) {
            System.out.println("Production year 2015");
        }
        if (this.year == 2020) {
            System.out.println("Production year 2020");
        }
        if (this.year == 2025) {
            System.out.println("Production year 2025");
        }
    }
}

