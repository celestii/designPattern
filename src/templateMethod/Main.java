package templateMethod;

public class Main {

    public static void main(String[] args) {

        AbstractDisplay abstractDisplay = new CharDisplay('H');

        abstractDisplay.display();
    }
}
