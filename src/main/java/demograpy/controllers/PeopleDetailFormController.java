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
    public String showPeopleDetailForm(Model model){
        PeopleDetailForm peopleDetailForm = new PeopleDetailForm();
        model.addAttribute("peopleDetailForm",peopleDetailForm);
        return "posts/people_detail_form";
    }

    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public String addNewRecord(@Valid @ModelAttribute PeopleDetailForm peopleDetailForm, BindingResult bindingResult, Model model){

        System.out.println(peopleDetailForm);
        if (bindingResult.hasErrors()) {
            System.out.println("peopleDetailForm Error");
            return "posts/people_detail_form";
        }
        peopleInfoService.add(new Person(peopleDetailForm.getName(),
                peopleDetailForm.getPps(),peopleDetailForm.getBirthday(),
                peopleDetailForm.getMobileNumber()));
        List<Person> persons = peopleInfoService.findAll();
        model.addAttribute("personList",persons);
        System.out.println("peopleDetailForm success");
        return "posts/person_list";
    }
}
