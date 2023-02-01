package z_lld.serveyRatingService;



import java.util.ArrayList;
import java.util.List;

public class Questions extends BaseEntity {

    private List<Answers> answersList;
    public Questions(){
    }
    public Questions(int id, String name){
        this.id = id;
        this.name = name;
        answersList = new ArrayList<>();
    }
    public void addAnswers(Answers answers){
        answersList.add(answers);
    }

    public List<Answers> getAnswersList() {
        return answersList;
    }

    public Questions setAnswersList(List<Answers> answersList) {
        this.answersList = answersList;
        return this;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "answersList=" + answersList +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
