package pl.camp.it;

public class Main {
    public static void main(String[] args) {
        User user = new User("Mateusz", "mateusz");

        User userCopy = user.copy();

        System.out.println(user);
        System.out.println(userCopy);

        System.out.println(user.getName());
        System.out.println(user.getPass());

        System.out.println(userCopy.getName());
        System.out.println(userCopy.getPass());
    }
}
