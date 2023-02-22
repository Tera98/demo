package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService ts;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return ts.test();
    }
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save(@RequestParam("value") String value){
        return ts.save(value);
    }
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam("id") Long id){
        return ts.search(id);
    }
    @RequestMapping("/apple")
    public String apple(){
        return "apple";
    }

}
