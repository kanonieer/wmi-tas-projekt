package pl.tas.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String content;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
