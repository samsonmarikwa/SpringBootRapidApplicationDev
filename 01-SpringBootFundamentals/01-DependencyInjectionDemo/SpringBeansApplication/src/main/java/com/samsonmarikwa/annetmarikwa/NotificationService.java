package com.samsonmarikwa.annetmarikwa;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// Stereotypes
//@Component
//@Controller // @RestController
//@Repository
//@Service
@Service("userNotifyService")  // The bean name takes the name of the class as default.
                        // You can override the default name
public class NotificationService {
   
   public NotificationService() {
   }
   
   public void send() {
      // do something
   }
   
   public void sendAsync() {
      // do something
   }
   
   @Override
   public String toString() {
      return "NotificationService{}";
   }
}
