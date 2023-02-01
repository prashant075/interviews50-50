package z_lld.FacebookFeed;

public class Post {
   private int postid;
   private int timestamp;
   private Post next;
   private Post prev;

   public Post(){}
   public Post(int id){
       this.postid = id;
       this.timestamp =Facebook.timeStamp;
   }

    public int getPostid() {
        return postid;
    }

    public Post setPostid(int postid) {
        this.postid = postid;
        return this;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public Post setTimestamp(int timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Post getNext() {
        return next;
    }

    public Post setNext(Post next) {
        this.next = next;
        return this;
    }

    public Post getPrev() {
        return prev;
    }

    public Post setPrev(Post prev) {
        this.prev = prev;
        return this;
    }
}
