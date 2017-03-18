package demograpy.controllers;

import demograpy.models.Person;
import demograpy.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by mahedi on 3/16/2017.
 */
@Controller
public class PersonListController {

    @Autowired
    PersonService personService;
    /**
     *
     * This method return person_list.html along with personList model.
     * The list is sorted by record creation date in descending order
     * @param model
     * @return person_list.html
     */
    @RequestMapping("/persons")
    public String getUserListView(Model model){
        List<Person> newPersonList = personService.findAllSortedByCreateTimeDesc();
        model.addAttribute("newPersonList",newPersonList);
        return "posts/person_list";
    }
}
