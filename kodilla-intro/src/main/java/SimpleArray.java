public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[] {"Harry Potter", "Lord of the Rings", "Forrest Gump", "Alien", "Alien 2"};
        String movie = movies [3];
        System.out.println("pod indeksem znajduje sie: " + movie);
        int numberOfElements = movies.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementow");
    }
}
