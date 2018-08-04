package controller;

import model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.VisitService;

/**
 * Created by CoT on 8/3/18.
 */
@RestController
public class VisitController {

    @Autowired
    private VisitService visitService;

    @RequestMapping(path = "visits", method = RequestMethod.POST)
    public void addVisit(@RequestBody Visit visit){
        visitService.addVisit(visit);
    }

}
