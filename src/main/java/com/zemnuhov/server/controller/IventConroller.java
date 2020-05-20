package com.zemnuhov.server.controller;



import com.zemnuhov.server.entity.Ivent;
import com.zemnuhov.server.repository.IventRepository;
import com.zemnuhov.server.service.IventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/ivent")
public class IventConroller {

    @Autowired
    private IventService service;

    @RequestMapping(value = "/ivents",method = RequestMethod.GET)
    @ResponseBody
    public List<Ivent> getAllIvents(){
        return service.getAll();
    }

    @RequestMapping(value = "/ivents/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Ivent getIvent(@PathVariable("id") long iventID){
        return service.getById(iventID);
    }

    @RequestMapping(value = "/ivents/save",method = RequestMethod.POST)
    @ResponseBody
    public Ivent saveIvent(@RequestBody Ivent ivent){
        return service.save(ivent);
    }

    @RequestMapping(value = "/iventsdel/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void delete(@PathVariable long id){
        service.delete(id);
    }


}
