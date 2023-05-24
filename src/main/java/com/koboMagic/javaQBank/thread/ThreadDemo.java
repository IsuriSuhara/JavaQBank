package main.java.com.koboMagic.javaQBank.thread;

//class Hi extends Thread{
//    public void run(){
//        for(int i = 0; i <5; i++){
//            System.out.println("Hi");
//            try{Thread.sleep(1000);} catch (Exception e){}
//        }
//    }
//}

//class Hi implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//        }
//    }
//}

//class Hello extends Thread{
//    public void run(){
//        for(int i = 0; i <5; i++){
//            System.out.println("Hello");
//            try{Thread.sleep(1000);} catch (Exception e){}
//        }
//    }
//}

//class Hello implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//        }
//    }
//}

public class ThreadDemo {

    public static void main(String[] args) throws Exception{

//        Hi hi = new Hi();
//        Hello hello = new Hello();
        //or
        //if you use runnable pass the runnable object inside a thread constructor before starting.

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi " +Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }, "Hello Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getName());
        System.out.println(t1.getName());

        System.out.println(t2.getPriority());
        System.out.println(t1.getPriority());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("Bye");


    }
}
