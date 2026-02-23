// 2026-02-23
// Thread Priority

class A extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());


    }
}

public class thread_priority {

    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(8);
        t2.setPriority(3);
        t3.setPriority(6);

        t1.start();
        t2.start();
        t3.start();
    }
}