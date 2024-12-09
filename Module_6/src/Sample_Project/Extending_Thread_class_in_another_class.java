package Sample_Project;

class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i =0;
        while(i<2)
        {
            System.out.println("Thread 1 is Running...");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i =0;
        while(i<5)
        {
            System.out.println("Thread 2 is running...");
            System.out.println("I am so happy....!");
            i++;
        }
    }
}

public class Extending_Thread_class_in_another_class 
{
    public static void main(String[] args) 
    {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
    }
}