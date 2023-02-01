package z_lld.FacebookFeed;

public class FBMain {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.follow(1,2);
        facebook.follow(1,3);
        facebook.follow(1,3);
        facebook.follow(1,4);
        facebook.follow(1,5);
        facebook.follow(1,6);
        facebook.follow(1,7);
        facebook.follow(1,8);
        facebook.follow(1,9);
        facebook.follow(1,10);
        facebook.createPost(1,100);
        facebook.createPost(2,101);
        facebook.createPost(3,102);
        facebook.createPost(4,103);
        facebook.createPost(5,104);
        facebook.createPost(6,105);
        facebook.createPost(7,106);
        facebook.createPost(8,107);
        facebook.createPost(9,108);
        facebook.createPost(10,109);
        facebook.getNewsFeed(1);
        facebook.unfollow(1,10);
        facebook.getNewsFeed(1);
        facebook.getNewsFeedPaginated(1,2);
        facebook.deletePost(9,108);
        facebook.getNewsFeedPaginated(1,1);

    }
}
