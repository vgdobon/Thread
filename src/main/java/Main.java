import com.tecnara.thread.ChildThread;

public class Main {

    public static void main(String[] args) {
        ChildThread chil1 = new ChildThread();
        ChildThread chil2 = new ChildThread();
        ChildThread chil3 = new ChildThread();

        chil1.start();
        chil2.start();
        chil3.start();
    }
}
