package z_lld.concurrency.studentLibrary;

import java.util.Random;

//EVery student is thread so need to implement Runnable interface
public class Student implements Runnable {
    private int id;
    private Book[] books;
    private Random random;

    public Student(int id, Book[] books){
        this.id = id;
        this.books = books;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true){
            int bookId = random.nextInt(Constants.NUM_OF_BOOKS);
            try {
                books[bookId].read(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
