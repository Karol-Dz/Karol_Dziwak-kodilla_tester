public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {

        User[] users = {
                new User("Anna", 25),
                new User("Bartek", 30),
                new User("Celina", 22),
                new User("Darek", 35),
                new User("Ewa", 28)
        };
        double sum = 0;
        for (User u : users) {
            sum += u.getAge();
        }
        double average = sum / users.length;

        System.out.println("Average age: " + average);
        System.out.println("Users under average age:");

        for (User u : users) {
            if (u.getAge() < average) {
                System.out.println(u.getName());
            }
        }
    }
}
