package pl.tas.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tas.model.Survey;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */
public interface SurveyRepository extends CrudRepository<Survey, Long> {
    public Survey getSurveyById(String Id);
}
