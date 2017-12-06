package org.javacrackers;
//How to display all running Thread?


public class allrunningThread extends Thread {
	   public static void main(String[] args) {
	      allrunningThread t1 = new allrunningThread();
	      t1.setName("thread1");
	      t1.start();
	      ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
	      int noThreads = currentGroup.activeCount();
	      Thread[] lstThreads = new Thread[noThreads];
	      currentGroup.enumerate(lstThreads);
	      
	      for (int i = 0; i < noThreads; i++) System.out.println("Thread No:" + i + " = " + lstThreads[i].getName());
	   }
	}