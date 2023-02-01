package z_lld.concurrency.studentLibrary;

import z_lld.hotel_booking.dao.BookingDao;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {

    private int id;
    private Lock lock;

    public Book(int id){
        this.id = id;
        this.lock = new ReentrantLock();
    }
    public void read(Student student) throws InterruptedException{
//        if(lock.tryLock(10, TimeUnit.SECONDS)){
//            System.out.println(student+" started reading "+this);
//            Thread.sleep(2000);
//            lock.unlock();
//            System.out.println(student+" finished reading "+this);
//        }
            lock.lock();
            System.out.println(student+" started reading "+this);
            Thread.sleep(2000);
            lock.unlock();
            System.out.println(student+" finished reading "+this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                '}';
    }
}
