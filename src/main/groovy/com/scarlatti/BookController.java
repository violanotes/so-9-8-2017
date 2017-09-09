package com.scarlatti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 9/8/2017.
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    Logger log = LoggerFactory.getLogger(BookController.class);

    /*
        Controller method that gets us to the adding book page.
    */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addBookPage() {

        log.info("add book page!");

        List<Tag> tags = new ArrayList<>(); //all tags from the database
        tags.add(new Tag("tag1"));
        tags.add(new Tag("tag2"));
        tags.add(new Tag("tag3"));

        ModelAndView modelAndView = new ModelAndView("form-book");
        modelAndView.addObject("book", new Book());
        modelAndView.addObject("tags", tags);

        log.info("return mav");

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addBookProcess(@ModelAttribute Book book) {

        log.info("add book!" + book);

        return new ModelAndView("redirect:/book/add");
    }

    //...

}
