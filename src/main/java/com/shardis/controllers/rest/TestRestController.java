package com.shardis.controllers.rest;


import com.shardis.dto.commons.ValueObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tomasz Kucharzyk
 */

@RestController
@RequestMapping("/api")
public class TestRestController {

  @RequestMapping("/title")
  public ValueObject getTitle() {
    return new ValueObject("API SERVER IS ALIVE");

  }


}