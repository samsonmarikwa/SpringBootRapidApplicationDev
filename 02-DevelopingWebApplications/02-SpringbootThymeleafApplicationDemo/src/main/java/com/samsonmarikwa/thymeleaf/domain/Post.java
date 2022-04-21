package com.samsonmarikwa.thymeleaf.domain;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Post {
   private String title;
   private String body;
   private Date posted;
   private String author;
   
}
