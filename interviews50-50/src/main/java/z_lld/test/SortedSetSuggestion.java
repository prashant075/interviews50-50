package z_lld.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortedSetSuggestion implements SuggestionIndex{
    List<String> list = new ArrayList<>(

    );

    @Override
    public void add(String token) {
        list.add(token);
    }

    @Override
    public List<String> find(String prefix) {
        List<String> res = new ArrayList<>();
        int index = Collections.binarySearch(list, prefix); //O(log(n))
        if(index <0){
            index=0;
        }
        for(int i=index;i<list.size();i++){ //O(n)
            if(list.get(i).startsWith(prefix)){
                res.add(list.get(i));
            }else{
                break;
            }
        }
        return res;
    }

}