Program to Demonstrate Thread Methods yield(), sleep() and Thread Execution in Java

Aim:
To write and execute a Java program to demonstrate thread creation and the use of yield() and sleep() methods.

Algorithm:
Create three thread classes A, B, and C by extending Thread.
Override the run() method in each thread.
Use yield() in thread A to give other threads a chance to execute.
Use break in thread B when j reaches 3.
Use sleep() in thread C for 1500 milliseconds.
Create objects for all three threads.
Start the threads using the start() method.
Display the messages produced by the threads.

Program:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}

Output:

Start thread A
exit from main thread
from thread B j=1
from thread B j=2
from thread B j=3
exit from B
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
thread C = 1
thread C = 2
thread C = 3
thread C = 4
thread C = 5

Result:
Thus, the program successfully demonstrates thread execution using yield(), sleep(), and multiple threads in Java
