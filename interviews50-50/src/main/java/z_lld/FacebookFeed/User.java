package z_lld.FacebookFeed;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User {
    private int userid;
    private Set<Integer> follows;
    private Map<Integer, Post> postMap;
    private Post head;
    private Post tail;
    public User(int id){
        this.userid = id;
        this.follows = new HashSet<>();
        follow(id);
        this.postMap = new HashMap<>();
        this.head = new Post(-1);
        this.tail = new Post(-1);
        this.head.setPrev(null);
        this.tail.setNext(null);
        this.head.setNext(tail);
        this.tail.setPrev(head);
    }

    public void deletePost(int postId){
        Post post = postMap.get(postId);
        postMap.remove(postId);
        Post next = post.getNext();
        Post prev = post.getPrev();
        prev.setNext(next);
        next.setPrev(prev);
    }
    public void createPost(int postId){
        Post post = new Post(postId);
        postMap.put(postId,post);
        Post next = head.getNext();
        head.setNext(post);
        next.setPrev(post);

        post.setPrev(head);
        post.setNext(next);
    }

    public void unfollow(int userId){
        follows.remove(userId);
    }
    public void follow(int userId){
        follows.add(userId);
    }
    public int getUserid() {
        return userid;
    }

    public User setUserid(int userid) {
        this.userid = userid;
        return this;
    }

    public Set<Integer> getFollows() {
        return follows;
    }

    public User setFollows(Set<Integer> follows) {
        this.follows = follows;
        return this;
    }

    public Map<Integer, Post> getPostMap() {
        return postMap;
    }

    public User setPostMap(Map<Integer, Post> postMap) {
        this.postMap = postMap;
        return this;
    }

    public Post getHead() {
        return head;
    }

    public User setHead(Post head) {
        this.head = head;
        return this;
    }

    public Post getTail() {
        return tail;
    }

    public User setTail(Post tail) {
        this.tail = tail;
        return this;
    }
}
