// 2026-02-23
// Synchronization in java

class Bus implements Runnable
{
    int available=1, passenger;
    Bus(int passenger)
    {
        this.passenger=passenger;
    }

    public synchronized void run()
    {
        String name=Thread.currentThread().getName(); 
        if(available>=passenger)
        {
            System.out.println(name + " got seat!");
            available=available-passenger;
        }
        else
        {
            System.out.println(name + " Sorry seat not available");
        }
    }
}

public class synchronization {
    public static void main(String[] args) {
        Bus r=new Bus(1);

        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);

        t1.setName("Sakib");
        t2.setName("Rakib");
        t3.setName("Rafiq");

        t1.start();
        t2.start();
        t3.start();
    }
}
