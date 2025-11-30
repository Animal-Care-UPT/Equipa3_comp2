package AnimalCareCentre.client.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * This class describes the model of a User from the system, its attributes and
 * what it can do.
 *
 */
public class User extends Account {

  private String contact;
  private LocalDate birthDate;
  private List<Adoption> adoptions;
  private List<Sponsorship> sponsorships = new ArrayList<>();

  protected User() {
  }

  @Override
  public String toString() {
    return super.toString() + "\nContact: " + contact;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public List<Adoption> getAdoptions() {
    return adoptions;
  }

  public void setAdoptions(List<Adoption> adoptions) {
    this.adoptions = adoptions;
  }

  public List<Sponsorship> getSponsorships() {
    return sponsorships;
  }

  public void setSponsorships(List<Sponsorship> sponsorships) {
    this.sponsorships = sponsorships;
  }

}
