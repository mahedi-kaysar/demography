package demograpy.controllers;

import demograpy.forms.PeopleDetailForm;
import demograpy.models.Person;
import demograpy.services.PeopleInfoService;
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
public class PeopleDetailFormController {
    @Autowired
    PeopleInfoService peopleInfoService;

    @RequestMapping("/person/add")
    public String showDemographicFrom(Model model){

        model.addAttribute("peopleDetailForm",new PeopleDetailForm());
        return "posts/people_detail_form";
    }

    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public String addNewRecord(@Valid @ModelAttribute PeopleDetailForm demographicForm, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()) {
            return "posts/people_detail_form";
        }
        peopleInfoService.add(new Person(demographicForm.getName(),
                demographicForm.getPps(),demographicForm.getBirthday(),
                demographicForm.getMobileNumber()));
        List<Person> persons = peopleInfoService.findAll();
        model.addAttribute("personList",persons);
        return "posts/person_list";
    }
}
