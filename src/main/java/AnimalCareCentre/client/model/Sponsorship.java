package AnimalCareCentre.client.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * This class describes the model of a sponsorhip to the animals and how it
 * works.
 *
 */

public class Sponsorship {

  private long id;
  private User user;
  private ShelterAnimal animal;
  private LocalDate startDate;
  private Float amount;
  private List<Donation> donations = new ArrayList<>();

  public Sponsorship() {
  }

  @Override
  public String toString() {
    return "\nUser: " + user.getName() + "\nStart date: " + startDate + "\nAmount: " + amount + "\nAnimal: "
        + animal.getName() + "\nShelter: " + animal.getShelter().getName();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public ShelterAnimal getAnimal() {
    return animal;
  }

  public void setAnimal(ShelterAnimal animal) {
    this.animal = animal;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public List<Donation> getDonations() {
    return donations;
  }

  public void setDonations(List<Donation> donations) {
    this.donations = donations;
  }

}
