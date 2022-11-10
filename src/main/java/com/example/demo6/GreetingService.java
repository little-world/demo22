package com.example.demo6;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

  @PostConstruct
  public void init() {
    // ..
  }

  public String getGreetingTemplate(String language) {
    String result = "Hello %s";
        /*
        switch (language) {
            case "fr" : result = "Bonjour %s"; break;
            case "de" : result = "Willkommen, %s"; break;
        }
         */
    return result;
  }
}
