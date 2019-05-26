package com.ruanzz.sso.cas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhenZhuo.Ruan
 */
@RestController
public class TestController {

  @GetMapping("/test")
  public String test() {
    return "hello CAS";
  }
}
