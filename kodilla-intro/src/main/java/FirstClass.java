public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 900, 2015);
        System.out.println("notebook.weight: " + notebook.weight + " notebook.price: " + notebook.price  + " notebook.year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + " heavyNotebook.price: " + heavyNotebook.price + " heavyNotebook.year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2025);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight + " oldNotebook.price: " + oldNotebook.price + " oldNotebook.year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
    }
}

