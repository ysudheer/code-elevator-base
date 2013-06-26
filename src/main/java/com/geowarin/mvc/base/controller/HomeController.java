package com.geowarin.mvc.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(value = "/reset", method = RequestMethod.GET)
    public @ResponseBody String reset() {
        System.out.println("HomeController.reset");
        return "OK";
    }

	@RequestMapping(value = "/call", method = RequestMethod.GET)
    public @ResponseBody String call(@RequestParam("atFloor") Integer atFloor,
                                     @RequestParam("to") Integer to) {
        System.out.println("HomeController.call");
        return "OK";
	}

    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public @ResponseBody String reset(@RequestParam("floorToGo") Integer floorToGo) {
        System.out.println("HomeController.reset");
        return "OK " + floorToGo;
    }

    @RequestMapping(value = "/nextCommand", method = RequestMethod.GET)
    public @ResponseBody String nextCommand() {
        System.out.println("HomeController.nextCommand");
        return "OK";
    }

    @RequestMapping(value = "/userHasEntered", method = RequestMethod.GET)
    public @ResponseBody String userHasEntered() {
        System.out.println("HomeController.userHasEntered");
        return "OK";
    }

    @RequestMapping(value = "/userHasExited", method = RequestMethod.GET)
    public @ResponseBody String userHasExited() {
        System.out.println("HomeController.userHasExited");
        return "OK";
    }
}
