package ch.swaechter.sortmylife;

public class Application {

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new Application().getGreeting());
    }
}
