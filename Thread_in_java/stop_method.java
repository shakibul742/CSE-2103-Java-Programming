// 2026-02-25
// Multithreading problem and solution

class A extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(name);
        }
    }
}

public class stop_method {
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Sakib");
        t2.setName("Gp");
        t3.setName("Robi");

        t1.start();
        t2.start();
        t3.start();

        t2.stop();
    }
}
