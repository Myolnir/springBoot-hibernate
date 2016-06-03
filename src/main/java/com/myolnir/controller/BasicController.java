package com.myolnir.controller;

import com.myolnir.dto.ObjectDto;
import com.myolnir.model.User;
import com.myolnir.service.RelationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/basicController")
public class BasicController {

    @Autowired
    private RelationalService relationalService;

    @RequestMapping (value = "/insertObject", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus (HttpStatus.OK)
    public void insertObjectToBD (@RequestBody ObjectDto object) {
        User relationalObject = new User(object.getFoo(), "comentarios");
        relationalService.save(relationalObject);
    }

    @RequestMapping(value = "/getObjects", method = RequestMethod.GET, consumes = "application/json")
    @ResponseStatus (HttpStatus.OK)
    public List<User> getObjectsFromDB() {
        return relationalService.findAll()
                .orElse(new ArrayList<>());
    }

}
