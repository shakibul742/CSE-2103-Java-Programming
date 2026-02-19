//2026-02-18

/* By extending thread class  */

class A extends Thread {
    @Override
    public void run() {

        try{
                for(int i = 0; i < 5; i++)
            {
                System.out.println("Shakibul");
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException i){

        }
    }
}

public class Multithreading_by_extending_Thread_class {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Islam");
            Thread.sleep(1000);
        }
    }
}
