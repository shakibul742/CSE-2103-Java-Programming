//2026-02-18

/* By implementing Runnable interface */

class A implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Child thread");
        }
    }
}


public class Multithreading_by_implementing_Runnable_interface {
    public static void main(String[] args) {

        A r = new A();
        Thread t = new Thread(r);
        t.start();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Main thread");
        }
        
    }
}
