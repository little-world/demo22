package com.example.demo6;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Date;

@RequestScoped
@Named
public class AjaxBean extends HelloBean {

  public String getNow() {
    return new Date().toString();
  }
}
