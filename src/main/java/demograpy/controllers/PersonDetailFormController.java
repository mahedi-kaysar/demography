package demograpy.controllers;

import demograpy.forms.PersonDetailForm;
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
 *
 * Created by mahedi on 3/16/2017.
 */
@Controller
public class PersonDetailFormController {

    @Autowired
    PersonService personService;

    /**
     *
     * This method only returns the person_detail_form for input details
     * along with the instance of PersonDetailForm bean class.
     *
     * @param model
     * @return person_detail_form
     */
    @RequestMapping("/person/add")
    public String showPeopleDetailForm(Model model){
        PersonDetailForm personDetailForm = new PersonDetailForm();
        model.addAttribute("personDetailForm", personDetailForm);
        return "demography/person_detail_form";
    }

    /**
     * This method receive the http post request from the person_detail_form
     * with the BindingResult. It also handles the different types of form error.
     * Some custom form validators have been created for this method
     *
     * @param personDetailForm
     * @param bindingResult
     * @param model
     * @return person_list or person_detail_form if error
     */
    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public String addNewRecord(@Valid @ModelAttribute PersonDetailForm personDetailForm, BindingResult bindingResult, Model model){

        System.out.println(personDetailForm);
        if (bindingResult.hasErrors()) {
            return "demography/person_detail_form";
        }
        personService.create(new Person(personDetailForm.getName(),
                personDetailForm.getPps(), personDetailForm.getBirthday(),
                personDetailForm.getMobileNumber()));
        List<Person> newPersonList = personService.findAllSortedByCreateTimeDesc();
        model.addAttribute("newPersonList",newPersonList);

        return "redirect:/persons";
    }
}
