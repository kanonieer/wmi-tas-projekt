package pl.tas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tas.model.Survey;
import pl.tas.repository.SurveyRepository;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */

@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private SurveyRepository repo;

    @RequestMapping(method = RequestMethod.GET, value = "{Id}")
    public Survey getSurveyById(@PathVariable("Id") String Id) {
        return repo.findOne(Long.parseLong(Id));
    }

    //DOKONCZYC
    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String create(@RequestBody Survey survey) {
        repo.save(survey);
        return "Survey created";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{Id}")
    public String delete(@PathVariable("Id") String Id) {
        repo.delete(Long.parseLong(Id));
        return "Survey deleted";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "update/{Id}")
    public String update(@PathVariable("Id") String Id, @RequestBody Survey survey) {
        Survey update = repo.findOne(Long.parseLong(Id));

        update.setName(survey.getName());
        update.setQuestions(survey.getQuestions());
        update.setType(survey.getType());

        repo.save(update);
        return "Survey updated";
    }

}
