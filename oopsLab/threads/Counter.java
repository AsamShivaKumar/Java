package oopsLab.threads;

public class Counter {

	public static void main(String[] args) {
		   MyThread t1 = new MyThread("One",0);
		   MyThread t2 = new MyThread("Two",1);
		   
		   t1.start();t2.start();
		   
		   try {
			   t1.join();t2.join();
		   }catch(InterruptedException e) {
			   System.out.println(e);
		   }
		   System.out.println("Done!");
	}

}

class MyThread extends Thread{
	  
	  static volatile int curr = 0;
	  static volatile int counter = 0;
	  static volatile Object lock = new Object();
	  int pre;
	  
	  MyThread(String name,int pre){
		  super(name);
		  this.pre = pre;
	  }
	  
	  @Override
	  public void run() {
		     
		     while(counter < 10000) {
		    	 while(this.pre != curr);
		    	 if(counter < 10000) {
		    		 synchronized(lock){
		    			 counter++;
		    			 curr = (pre == 0)? 1:0;
		    			 System.out.println(this.getName() + " Counter: " + counter);
		    		 }
		    	 }
		     }
	  }
}
