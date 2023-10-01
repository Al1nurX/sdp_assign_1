public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.myMessage();
        s2.myMessage();

        if (s1 == s2) {
            System.out.println("Both are the same");
        } else {
            System.out.println("Both are different");
        }

        System.out.println(s1.equals(s2));
    }
}