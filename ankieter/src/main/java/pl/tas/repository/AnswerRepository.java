package pl.tas.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tas.model.Answer;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */
public interface AnswerRepository extends CrudRepository<Answer, Long> {
    public Answer getAnswerById(String Id);
}
