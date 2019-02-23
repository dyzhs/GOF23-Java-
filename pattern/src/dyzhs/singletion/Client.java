package dyzhs.singletion;

public class Client {

    public static void main(String[] args) {
        Singletion1 singletion1 = Singletion1.getInstance();
        System.out.println(singletion1);

        Singletion2 singletion2 = Singletion2.getInstance();
        System.out.println(singletion2);
    }
}
