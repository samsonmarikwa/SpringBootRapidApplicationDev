package com.samsonmarikwa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
   
   @Value("${pageController.msg}")
   private String pageControllerMsg;
   @Value("${my.secret}")
   private String mySecret;
   @Value("${my.bignumber}")
   private String myBigNumber;
   @Value("${my.number.less.than.ten}")
   private String myNumberLess;
   @Value("${my.number.between.ten.and.twenty}")
   private String myNumberBetween;
   
   @RequestMapping("/")
   public String home() {
      return pageControllerMsg;
   }
   
   @RequestMapping("/numbers")
   public String numbers() {
      return "my.secret=" + mySecret +
            "\nmy.bignumber=" + myBigNumber +
            "\nmy.number.less.than.ten=" + myNumberLess +
            "\nmy.number.between.ten.and.twenty=" + myNumberBetween;
   }
   
}
