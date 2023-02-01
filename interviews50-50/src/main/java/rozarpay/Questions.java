package rozarpay;

import java.util.List;

public class Questions extends  BaseEntity{
    List<Answers> answers;

    public List<Answers> getAnswers() {
        return answers;
    }

    public Questions setAnswers(List<Answers> answers) {
        this.answers = answers;
        return this;
    }
}
