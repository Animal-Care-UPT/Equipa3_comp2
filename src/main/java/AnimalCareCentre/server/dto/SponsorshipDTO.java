package AnimalCareCentre.server.dto;

import jakarta.validation.constraints.NotNull;
import AnimalCareCentre.server.model.*;

public class SponsorshipDTO {

  private User user;
  @NotNull
  private Long animalId;

  @NotNull
  private String animalName;

  @NotNull
  private Float amount;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Long getAnimalId() {
    return animalId;
  }

  public void setAnimalId(Long animalId) {
    this.animalId = animalId;
  }

  public String getAnimalName() {
    return animalName;
  }

  public void setAnimalName(String animalName) {
    this.animalName = animalName;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

}
