package rozarpay;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Survey {
    List<Questions> question;
    Map<Integer, Integer> map ;
    public Survey(){
        map = new HashMap<>();
    }

    public List<Questions> getQuestion() {
        return question;
    }

    public Survey setQuestion(List<Questions> question) {
        this.question = question;
        return this;
    }
}
