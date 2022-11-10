
package com.example.demo6;




import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class HelloBean {

  @Inject
  private GreetingService greetingService;

  private String name;
  private String greeting;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGreeting() {
    return greeting;
  }

  public void doGreeting() {
    greeting = String.format(greetingService.getGreetingTemplate(null), name);
  }
}
