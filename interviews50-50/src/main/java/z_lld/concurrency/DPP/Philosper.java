package z_lld.concurrency.DPP;

import java.util.Random;

public class Philosper  implements Runnable{
    private int id;
    private volatile boolean isFull;
    private Chopstick left;
    private Chopstick right;
    private Random random;
    private int eatingCounter;

    public Philosper(int id, Chopstick left, Chopstick right) {
        this.id = id;
        this.left = left;
        this.right = right;
        this.random = new Random();
    }

    @Override
    public void run() {
        try{
            //after eating much i will terminate thread
            while (!isFull){
                think();
                if(left.pickUp(this, State.LEFT)) {
                    if (right.pickUp(this, State.RIGHT)) {
                        eat();
                        right.putDown(this, State.RIGHT);
                    }
                    left.putDown(this, State.LEFT);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void think() throws InterruptedException{
        System.out.println(this+" is thinking...");
        Thread.sleep(random.nextInt(1000));
    }
    private void eat() throws InterruptedException{
        System.out.println(this+" is eating...");
        eatingCounter++;
        Thread.sleep(random.nextInt(1000));
    }
    public void setFull(boolean full){
        this.isFull =full;
    }
    public boolean isFull(){
        return this.isFull;
    }
    @Override
    public String toString(){
        return "Philosopher "+id;
    }

    public int getEatingCounter() {
        return this.eatingCounter;
    }
}
