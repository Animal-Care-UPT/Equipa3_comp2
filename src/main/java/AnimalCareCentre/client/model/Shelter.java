package AnimalCareCentre.client.model;

import AnimalCareCentre.client.enums.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class describes the model of a Shelter.
 *
 */
public class Shelter extends Account {

  private Integer foundationYear;
  private String contact;
  private Status status;
  private List<ShelterAnimal> animals = new ArrayList<>();

  protected Shelter() {
  }

  @Override
  public String toString() {
    return super.toString() + "\nFoundation Year: " + foundationYear + "\nContact: " + contact;
  }

  public Integer getFoundationYear() {
    return foundationYear;
  }

  public void setFoundationYear(Integer foundationYear) {
    this.foundationYear = foundationYear;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public List<ShelterAnimal> getAnimals() {
    return animals;
  }

  public void setAnimals(List<ShelterAnimal> animals) {
    this.animals = animals;
  }

}
