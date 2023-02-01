package z_lld.FacebookFeed;

import java.util.*;

public class Facebook {
    public static int timeStamp;
    public static Map<Integer, User> userMap;
    public static Integer PAGE_NUMBER;
    private static  Integer FEED_SIZE;

    public Facebook(){
        timeStamp=0;
        userMap = new HashMap<>();
        PAGE_NUMBER=2;
        FEED_SIZE=10;
    }
    public void createPost(int userId, int postId){
        User user = userMap.get(userId);
        if(user==null){
            user = new User(userId);
            userMap.put(userId,user);
        }
        user.createPost(postId);
        System.out.println("User "+userId+" Created Post "+postId);
    }
    public void follow(int followerId, int followeeId){
        User user = userMap.get(followerId);
        if(user==null){
            user = new User(followerId);
            userMap.put(followerId,user);
        }
        User followee= userMap.get(followeeId);
        if(followee==null){
            followee = new User(followeeId);
            userMap.put(followeeId,followee);
        }
        user.follow(followeeId);
        System.out.println("User "+followerId+" Followed "+followeeId);
    }
    public void unfollow(int followerId, int followeeId){
        User user = userMap.get(followerId);
        if(user==null){
            user = new User(followerId);
            userMap.put(followerId,user);
        }
        User followee= userMap.get(followeeId);
        if(followee==null){
            followee = new User(followeeId);
            userMap.put(followeeId,followee);
        }
        user.unfollow(followeeId);
        System.out.println("User "+followerId+" UnFollowed "+followeeId);

    }
    public void deletePost(int userId, int postId){
        User user = userMap.get(userId);
        if(user==null){
            user = new User(userId);
            userMap.put(userId,user);
        }
        user.deletePost(postId);
        System.out.println("User "+userId+" Deleted the Post "+postId);
    }
    public void getNewsFeed(int userId){
        List<Post> posts = getTopNpost(userId, FEED_SIZE);
        System.out.println("Feed for User "+userId);
        for(int i=0;i<posts.size();i++){
            System.out.println("Post " +(i+1) +" "+posts.get(i).getPostid());
        }
    }

    public void getNewsFeedPaginated(int userId, int pageNumber){
        int endSize = pageNumber*FEED_SIZE;
        if(pageNumber<=0){
            return ;
        }
        List<Post> posts = getTopNpost(userId, endSize);
        int start = FEED_SIZE*(pageNumber-1);
        int end = Math.min(posts.size(), endSize);
        if(start>end) return;
        List<Post> paginatedPost = posts.subList(start,end);
        System.out.println("Page number " + pageNumber + " of user " + userId + " feed");
        for (int i = 0; i < paginatedPost.size(); i++)
            System.out.println("Post " + (i + 1) + " " + paginatedPost.get(i).getPostid());
    }
    public List<Post> getTopNpost(int userId, int N){
        User user = userMap.get(userId);
        if(user==null) return null;
        Set<Integer> followed = user.getFollows();
        PriorityQueue<Post>  queue = new PriorityQueue<>((a,b)->(b.getTimestamp()-a.getTimestamp()));
        for(Integer currId:followed){
            User curruser = userMap.get(currId);
            Post head = curruser.getHead();
            Post tail = curruser.getTail();
            if(head.getNext()!=tail){
                queue.add(head.getNext());
            }
        }
        List<Post> res = new LinkedList<>();
        int i=0;
        while (!queue.isEmpty() && i<N){
            Post curr = queue.poll();
            res.add(curr);
            i++;
            if(curr.getNext().getPostid()!=-1){
                queue.add(curr.getNext());
            }
        }
        return res;
    }
}
