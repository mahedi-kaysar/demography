package demograpy.controllers;

import demograpy.forms.PersonDetailForm;
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
public class PersonDetailFormController {
    @Autowired
    PeopleInfoService peopleInfoService;

    @RequestMapping("/person/add")
    public String showPeopleDetailForm(Model model){
        PersonDetailForm personDetailForm = new PersonDetailForm();
        model.addAttribute("personDetailForm", personDetailForm);
        return "posts/person_detail_form";
    }

    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public String addNewRecord(@Valid @ModelAttribute PersonDetailForm personDetailForm, BindingResult bindingResult, Model model){

        System.out.println(personDetailForm);
        if (bindingResult.hasErrors()) {
            System.out.println("personDetailForm Error");
            return "posts/person_detail_form";
        }
        peopleInfoService.add(new Person(personDetailForm.getName(),
                personDetailForm.getPps(), personDetailForm.getBirthday(),
                personDetailForm.getMobileNumber()));
        List<Person> persons = peopleInfoService.findAll();
        model.addAttribute("personList",persons);
        System.out.println("personDetailForm success");
        return "posts/person_list";
    }
}
