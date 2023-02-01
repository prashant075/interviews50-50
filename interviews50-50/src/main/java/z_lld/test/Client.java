package z_lld.test;

import java.util.List;

public class Client {
    public static void main(String[] args) {
          SuggestionIndex index = new Suggestion();
          index.add("Hello");
          index.add("Hi");
          index.add("Goodbye");
          index.add("Hierarchy");
        System.out.println(index.find("G"));
        System.out.println(index.find("He"));
//          var result = index.find("H");
//          assert result.size() == 3;
//          assert List.of(result).containsAll(List.of("Hi", "Hello", "Hierarchy"));
//
//          result = index.find("Hi");
//          assert result.size() == 2;
//          assert List.of(result).containsAll(List.of("Hi", "Hierarchy"));
//
//          result = index.find("X");
//          assert result.size() == 0;
    }
}
