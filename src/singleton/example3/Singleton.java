package singleton.example3;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();                             
    }
    public static Singleton getInstance() {

        return singleton;
    }
    private void slowdown() {                   
        try {                                   
            Thread.sleep(1000);
        } catch (InterruptedException e) {      
        }                                       
    }                                           
}
