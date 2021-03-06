package com.infosys.servicedemo.servicedemo.Controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.infosys.servicedemo.servicedemo.Models.BlogsModel;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController @RequestMapping("/blogs")
public class Blogs {
    @CrossOrigin(origins = "*")
    @GetMapping(value="getall")
    public List<BlogsModel> getAllBlogs() {
        List<BlogsModel> blogList = new ArrayList<>();
        blogList.add(new BlogsModel(1,"fitstBlog", "hey! my first blog", "this is my first blog, so lots are waiting to cme in future.", "hope everything is fine :)", "Vijayashankar", new Date()));
        blogList.add(new BlogsModel(2,"secondBlog", "hey! my sencond blog", "this is my second blog, so lots are waiting to cme in future.", "hope everything is fine :)", "Vijayashankar", new Date()));

        return blogList;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value="getaone")
    public BlogsModel getOneBlogs( @RequestParam int id ) {
    	if (id == 1) {
    		return new BlogsModel(1,"fitstBlog", "hey! my first blog", "this is my first blog, so lots are waiting to cme in future.", "hope everything is fine :)", "Vijayashankar", new Date());
    	}else if (id ==2 ) {
			return new BlogsModel(2,"secondBlog", "hey! my sencond blog", "this is my second blog, so lots are waiting to cme in future.", "hope everything is fine :)", "Vijayashankar", new Date());
		}
		return null;
    }
    
}