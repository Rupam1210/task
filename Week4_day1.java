class Thread1 extends Thread{
    // public void run(){
    // //     while (true){
    // //     System.out.println("Welcome");
    // // }
    //    System.out.println("Welcome");
    // }
  public void run(){
      try {
          Thread.sleep(200);
      }
      catch (InterruptedException e) {
          e.printStackTrace();
      }
      System.out.println("After delay of 200ms : Welcome");
  }
}
class Thread2 extends Thread {
    public void run() {
        // while (true) {
        //     System.out.println("Good morning");
        // }
      
       System.out.println("Problem 2:  Good morning");
    }
}
 

public class Main {
    public static void main(String[] args) {
      //-----------------------------
      //Problem 1
      //--------------------------
       System.out.println("Problem 1:Write a program to print Good morning and Welcome continuously on the screen in Java using threads.");
      System.out.println();
      
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
      
       System.out.println();
      //-----------------------------
      //Problem 2
      //--------------------------
      System.out.println("Problem 2:Add a step method in the welcome thread of question 1 to delay its execution for 200ms.");
      System.out.println();
      t1.start();
      t2.start();
       System.out.println();
      //-----------------------------
      //Problem 3
      //--------------------------
      System.out.println("Problem 1:Demonstrate gerPriority() and setPriority() methods in Java threads..");
      System.out.println();
      t1.setPriority(5);
      t2.setPriority(1);
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());
       System.out.println();
      //-----------------------------
      //Problem 4
      //--------------------------
      System.out.println("Problem 4: How do you get the state of a given thread in Java?");
      System.out.println();
      System.out.println("Answer : getState() method is used to get the state of a given thread in Java.");
       System.out.println("this is the getstate of thread_2 --> "+t2.getState());
      
       System.out.println();
      //-----------------------------
      //Problem 5
      //--------------------------
      System.out.println("Problem 5:How do you get the reference to the current thread in Java?");
      System.out.println();
      System.out.println("Answer: currentThread() method is used to reference the current thread in Java.");
      System.out.println( "This is the current Thread : "+Thread.currentThread().getState());
     
       System.out.println();
      
    }
}
 
