package prototype;

public class MessageBox extends Product {

    private char decochar;

    public MessageBox(char decochar) {

        this.decochar = decochar;
    }

    @Override
    public void use(String str) {

        for (int i = 0; i < str.length() + 4; i++) {

            System.out.print(decochar);
        }

        System.out.println();
        System.out.println(decochar + " " + str + " " + decochar);

        for (int i = 0; i < str.length() + 4; i++) {

            System.out.print(decochar);
        }
    }

    @Override
    public Product createClone() {

        Product p = null;

        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
