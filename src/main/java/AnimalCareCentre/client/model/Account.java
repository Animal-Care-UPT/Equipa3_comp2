package AnimalCareCentre.client.model;

import AnimalCareCentre.client.enums.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class describes the model of an Account.
 *
 */
public class Account {

  private long id;
  private String name;
  private String email;
  private String location;
  private SecurityQuestion securityQuestion;
  private List<LostAnimal> lostAnimals = new ArrayList<>();

  public Account() {
  }

  // toString from the class Account
  @Override
  public String toString() {
    return "Name: " + name + "\nLocation: " + location;
  }

  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public SecurityQuestion getSecurityQuestion() {
    return securityQuestion;
  }

  public void setSecurityQuestion(SecurityQuestion securityQuestion) {
    this.securityQuestion = securityQuestion;
  }

  public List<LostAnimal> getLostAnimals() {
    return lostAnimals;
  }

  public void setLostAnimals(List<LostAnimal> lostAnimals) {
    this.lostAnimals = lostAnimals;
  }

}
