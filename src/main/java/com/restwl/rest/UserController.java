package com.restwl.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "/wordladder",method = RequestMethod.GET)//,consumes="application/json")
    public String getLadder(@RequestParam String w1,@RequestParam String w2) {
        return "Welcome," + w1 + "--->" + w2 + wl.wordladder.runMain(w1,w2);
    }
}