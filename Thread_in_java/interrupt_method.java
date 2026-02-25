// 2026-02-25
// Multithreading problem and solution

class A extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0; i<5; i++)
            {
                System.out.println("t1 thread running..!");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException i)
        {
            System.out.println("t1 thread terminated..!");
        }
    }
}

public class interrupt_method {
    public static void main(String[] args) {
        A t1=new A();
        
        t1.start();
        t1.interrupt();
    }
}
