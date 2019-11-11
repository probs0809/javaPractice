class Count extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
                System.out.println(" "+i);
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
    }
}

public class Counter{
    public static void main(String[] args) {
        Count c = new Count();
        c.start();
    }
}