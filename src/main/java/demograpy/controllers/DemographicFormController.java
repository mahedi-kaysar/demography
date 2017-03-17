package demograpy.controllers;

import demograpy.forms.DemographicForm;
import demograpy.models.Person;
import demograpy.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by mahedi on 3/16/2017.
 */
@Controller
public class DemographicFormController {
    @Autowired
    PersonService personService;

    @RequestMapping("/person/add")
    public String showDemographicFrom(Model model){

        model.addAttribute("demographicForm",new DemographicForm());
        return "posts/demographic_form";
    }

    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public String addNewRecord(@Valid @ModelAttribute DemographicForm demographicForm, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()) {
            return "posts/demographic_form";
        }
        personService.add(new Person(demographicForm.getName(),
                demographicForm.getPps(),demographicForm.getBirthday(),
                demographicForm.getMobileNumber()));
        List<Person> persons = personService.findAll();
        model.addAttribute("personList",persons);
        return "posts/person_list";
    }
}
