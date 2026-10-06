class A extends Thread
{
    public void run()
    {
        System.out.println("Thread A started");

        for(int i = 1; i <= 4; i++)
        {
            System.out.println("From thread A i = " + i);
        }

        System.out.println("Exit from A");
    }
}

class B extends Thread
{
    public void run()
    {
        System.out.println("Thread B started");

        for(int j = 1; j <= 4; j++)
        {
            System.out.println("From thread B j = " + j);
        }

        System.out.println("Exit from B");
    }
}

class C extends Thread
{
    public void run()
    {
        System.out.println("Thread C started");

        for(int j = 1; j <= 4; j++)
        {
            System.out.println("Thread C = " + j);
        }

        System.out.println("Exit from C");
    }
}

class ThreadPriority
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");
        System.out.println("Start thread B");
        System.out.println("Start thread C");

        a.setPriority(3);
        b.setPriority(5);
        c.setPriority(7);

        a.start();
        b.start();
        c.start();

        System.out.println("End of main thread");
    }
}