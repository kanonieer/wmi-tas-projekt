package pl.tas.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tas.model.Question;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {
    public Question getQuestionById(String Id);
}
