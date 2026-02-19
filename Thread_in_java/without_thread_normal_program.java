//2026-02-18

/* Without thread normal java program  */

class A extends Thread {
    public void fun() {

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

public class without_thread_normal_program {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.fun();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Islam");
            Thread.sleep(1000);
        }
    }
}
