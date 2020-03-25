package prototype;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();

        Product product = new MessageBox('*');

        manager.register("strong message", product);

        Product p1 = manager.create("strong message");
        p1.use("Hello");
    }
}
