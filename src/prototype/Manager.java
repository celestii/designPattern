package prototype;

import java.util.HashMap;

public class Manager {

    private HashMap<String, Product> showCase = new HashMap<>();

    public void register(String name, Product proto) {

        showCase.put(name, proto);
    }

    public Product create(String name) {

        Product p = showCase.get(name);

        return p.createClone();
    }
}
