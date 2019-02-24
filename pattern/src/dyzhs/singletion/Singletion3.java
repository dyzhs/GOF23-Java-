package dyzhs.singletion;

/**
 * 双重检查锁
 * @Author dyzhs
 * @Date 2019/2/24 14:24
 **/
public class Singletion3 {

    private static Singletion3 singletion3 = null;

    public Singletion3() {
    }

    public Singletion3 getInstance(){
        if (singletion3 == null) {
            Singletion3 temp;
            synchronized (Singletion3.class) {
                temp = singletion3;
                if (temp == null) {
                    synchronized (Singletion3.class) {
                        if (temp == null) {
                            temp = new Singletion3();
                        }
                    }
                }
            }
            singletion3 = temp;
        }
        return singletion3;
    }

}
