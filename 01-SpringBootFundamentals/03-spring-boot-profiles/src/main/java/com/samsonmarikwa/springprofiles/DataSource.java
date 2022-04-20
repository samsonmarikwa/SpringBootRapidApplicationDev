package com.samsonmarikwa.springprofiles;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DataSource {
   private String server;
   private int port;
   
}
