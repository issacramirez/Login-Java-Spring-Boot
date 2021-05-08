package com.fcfm.controller;

import com.fcfm.model.ContactModel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

    @GetMapping("/checkrest")
    public ResponseEntity<ContactModel> checkRest(){
        ContactModel cm = new ContactModel(2, "Jose", "Ramirez", "8127536744", "mty");
        return new ResponseEntity<ContactModel>(cm, HttpStatus.OK);
    }

}