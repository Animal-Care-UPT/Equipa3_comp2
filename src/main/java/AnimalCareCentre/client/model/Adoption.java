package AnimalCareCentre.client.model;

import AnimalCareCentre.client.enums.*;
import java.time.LocalDate;

/**
 * This class describes the model of an Adoption.
 *
 */
public class Adoption {

  private long id;
  private User user;
  private ShelterAnimal animal;
  private LocalDate requestDate;
  private LocalDate adoptionDate;
  private AdoptionType type;
  private Status status;

  public Adoption() {}

  // Getters and setters area
  public User getUser() {
    return user;
  }

  public ShelterAnimal getAnimal() {
    return animal;
  }

  public LocalDate getRequestDate() { return requestDate; }

  public LocalDate getAdoptionDate() { return adoptionDate; }

  public void setAdoptionDate(LocalDate adoptionDate) { this.adoptionDate = adoptionDate; }

  public Status getStatus() { return status; }

  public void setStatus(Status status) { this.status = status; }

  public AdoptionType getType() { return type; }

    @Override
    public String toString() {
        return "Adoption{" +
                "id=" + id +
                ", user=" + user +
                ", animal=" + animal.getName() +
                ", date of request =" + requestDate +
                ", status=" + status +
                '}';
    }
}
