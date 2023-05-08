package com.consuming.consumingrestservice.controller;

import com.consuming.consumingrestservice.model.Contact;
import com.consuming.consumingrestservice.proxy.ContactProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactProxy contactProxy;
  @GetMapping("/getMessages")
    public List<Contact> getMessages(@RequestParam("status") String status){
        return contactProxy.getMessagesByStatus(status);
    }



}
