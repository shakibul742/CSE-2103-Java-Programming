// 2026-03-01
// synchronized block in java multithreading

class msg
{
    public void show(String name)
    {
        ;;;;;;

    synchronized(this)
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("How are you, " + name);
        }
    }

        ;;;;;;
    }
}

class ourThread extends Thread
{
    msg m;
    String name;
    
    ourThread(msg m, String name)
    {
        this.m=m;
        this.name=name;
    }

    public void run()
        {
            m.show(name);
        }
}

public class synchronized_block {
    public static void main(String[] args) {

        msg m=new msg();

        ourThread t1=new ourThread(m, "Sakib");
        ourThread t2=new ourThread(m, "Rakib");

        t1.start();
        t2.start();
    }
}
