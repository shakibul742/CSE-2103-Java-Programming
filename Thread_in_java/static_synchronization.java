// 2026-03-01
// static synchronization

class Bank extends Thread
{
    static int balance=1000;
    static int withdraw;

    Bank(int withdraw)
    {
        this.withdraw=withdraw;
    }

    public static synchronized void withdraw()
    {
        String name=Thread.currentThread().getName();

        if(withdraw<=balance)
        {
            System.out.println(name+" withdraw money");
            balance=balance-withdraw;
        }
        else
        {
            System.out.println(name+" Insufficient balance");
        }
    }

    public void run()
    {
        withdraw();
    }
}

public class static_synchronization {
    public static void main(String[] args) {

        Bank obj1=new Bank(5000);

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj1);

        t1.setName("Sakib");
        t2.setName("Rakib");

        Bank obj2=new Bank(1000);

        Thread t3=new Thread(obj2);
        Thread t4=new Thread(obj2);

        t3.setName("Hosain Ali");
        t4.setName("Rakib");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
