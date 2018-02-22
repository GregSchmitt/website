package com.website.app.Controllers;

import com.website.app.daos.GregRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GregController {
    //Repository Fields--->--->--->--->
    @Autowired
    private GregRepository gregRepository;

    //Constructor--->--->--->--->--->
//    public GregController(GregRepository gregRepository) {
//        this.gregRepository = GregRepository;
//    }



}

