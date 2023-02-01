package z_lld.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Suggestion implements SuggestionIndex{
   private volatile  List<String> list ;
   Suggestion(){
       list= new ArrayList<>();
   }
    @Override
    public void add(String token) {
        list.add(token);
    }

    @Override
    public  synchronized List<String> find(String prefix) {
        List<String> res = new ArrayList<>();
       int index = Collections.binarySearch(list, prefix); //O(log(n))
       if(index <0){
          index=0;
       }
       for(int i=index;i<list.size();i++){ //O(n)
           if(list.get(i).startsWith(prefix)){
               res.add(list.get(i));
           }
       }
        return res;
    }

}


/**
 * Interface to index tokens and retrieve them later.
 *
 * Can be used for search engines to have a suggester based on some user input.
 *
 * Example:
 * <blockquote><pre>{@code
 * SuggestionIndex index = ...
 * index.add("Hello");
 * index.add("Hi");
 * index.add("Goodbye");
 * index.add("Hierarchy");
 *
 * var result = index.find("H");
 * assert result.length == 3;
 * assert List.of(result).containsAll(List.of("Hi", "Hello", "Hierarchy"));
 *
 * result = index.find("Hi");
 * assert result.length == 2;
 * assert List.of(result).containsAll(List.of("Hi", "Hierarchy"));
 *
 * result = index.find("X");
 * assert result.length == 0;
 * }</pre></blockquote>
 */