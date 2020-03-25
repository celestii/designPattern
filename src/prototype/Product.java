package prototype;

public abstract class Product implements Cloneable {

    public abstract void use(String str);
    public abstract Product createClone();
}
