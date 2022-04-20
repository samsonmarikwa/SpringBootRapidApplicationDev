package com.samsonmarikwa.SpringBeansApplication;

import com.samsonmarikwa.annetmarikwa.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
   
   /*
      Property based injection
      ========================
      @Autowired
      private NotificationService notificationService;
   */
   
   /*
      Setter based injection
      ======================
      @Autowired
      private NotificationService notificationService;
      public void setNotificationService(NotificationService notificationService) {
         this.notificationService = notificationService;
      }
   */
   
   // Constructor-based injection
   @Autowired
   private NotificationService notificationService;
   PageController(NotificationService notificationService) {
      this.notificationService = notificationService;
   }
   
   @RequestMapping("/")
   public String home() {
      return notificationService.toString();
   }
}
