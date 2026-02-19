// 2026-02-19

/* Sleep Method */

class A extends Thread
{
    public void run()
    {
        String n=Thread.currentThread().getName();
        try
        {
            for(int i = 0; i < 3; i++)
            {
                System.out.println(n);
                Thread.sleep(2000);
            }
        }

        catch(InterruptedException i)
        {

        }
    }
}

public class sleep_method {
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
