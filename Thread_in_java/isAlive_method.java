// 2026-02-25
// Multithreading problem and solution

class A extends Thread
{
    public void run()
    {
        System.out.println("This is a isAlive method program..!");
    }
}

public class isAlive_method {
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Sakib");
        t2.setName("Gp");
        t3.setName("Robi");

        System.out.println(t1.isAlive());

        t1.start();
        t2.start();
        t3.start();

        System.out.println(t3.isAlive());
    }
}
