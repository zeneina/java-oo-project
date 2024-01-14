package HomeWork.chapter11.Model;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        User user = new User(1L, "Erling", "Haaland");
        UserCredentials userCredentials = new UserCredentials(1L, "Erling_Haaland", "9999");

        User user1 = new User(2L, "Taylor","Swift");
        UserCredentials userCredentials1 = new UserCredentials(2L, "Taylor_Swift", "55487");

        User user2 = new User(3L, "Diego", "Pigeon");
        UserCredentials userCredentials2 = new UserCredentials(3L, "Diego_Pigeon", "78789");

        System.out.println("User: {" + user.getId() + ", " + user.getFirstname() + ", " + user.getLastname() + "}");
        System.out.println("UserCredentials: {" + userCredentials.getId() + ", " + userCredentials.getUsername() + ", " + userCredentials.getPassword() + "}");

        System.out.println("User1: {" + user1.getId() + ", " + user1.getFirstname() + ", " + user1.getLastname() + "}");
        System.out.println("UserCredentials1: {" + userCredentials1.getId() + ", " + userCredentials1.getUsername() + ", " + userCredentials1.getPassword() + "}");

        System.out.println("User2: {" + user2.getId() + ", " + user2.getFirstname() + ", " + user2.getLastname() + "}");
        System.out.println("UserCredentials2: {" + userCredentials2.getId() + ", " + userCredentials2.getUsername() + ", " + userCredentials2.getPassword() + "}");

    }
}