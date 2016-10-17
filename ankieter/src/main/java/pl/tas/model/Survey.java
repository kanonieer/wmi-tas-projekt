package pl.tas.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */

@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
    private List<Question> questions;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Account author;
    @Column(nullable = false)
    private SurveyType type;

    public enum SurveyType {
        ANONYMOUS,
        REGISTERED
    }

    public Survey() {
    }

    public Survey(String name, List<Question> questions, Account author, SurveyType type) {
        this.name = name;
        this.questions = questions;
        this.author = author;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Account getAuthor() {
        return author;
    }

    public void setAuthor(Account author) {
        this.author = author;
    }

    public SurveyType getType() {
        return type;
    }

    public void setType(SurveyType type) {
        this.type = type;
    }
}
