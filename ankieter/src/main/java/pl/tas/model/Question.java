package pl.tas.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String content;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers;
    @Column(nullable = false)
    private QuestionType type;
    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    public enum QuestionType {
        SINGLE_CHOICE,
        MULTIPLE_CHOICE,
        FILL_IN
    }

    public Question() {
    }

    public Question(String content, List<Answer> answers, QuestionType type) {
        this.content = content;
        this.answers = answers;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }
}
