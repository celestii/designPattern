package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IdCardFactory;

public class Main {

    public static void main(String[] args) {

        Factory factory = new IdCardFactory();

        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감");

        card1.use();
        card2.use();
        card3.use();
    }
}
