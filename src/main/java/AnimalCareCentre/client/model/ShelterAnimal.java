package AnimalCareCentre.client.model;

import AnimalCareCentre.client.enums.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class describes the model of an Animal.
 *
 */
public class ShelterAnimal extends Animal {

  private Shelter shelter;

  private boolean isVacinated;

  private Status status;

  private AdoptionType adoptionType;

  List<Adoption> adoptions = new ArrayList<>();
  List<Sponsorship> sponsors = new ArrayList<>();

  public ShelterAnimal() {
    super();
  }

  public void addSponsor(Sponsorship sponsor) {
    sponsors.add(sponsor);
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + "Listed for: " + adoptionType;
  }

  public Shelter getShelter() {
    return shelter;
  }

  public void setShelter(Shelter shelter) {
    this.shelter = shelter;
  }

  public boolean isVacinated() {
    return isVacinated;
  }

  public void setVacinated(boolean isVacinated) {
    this.isVacinated = isVacinated;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public AdoptionType getAdoptionType() {
    return adoptionType;
  }

  public void setAdoptionType(AdoptionType adoptionType) {
    this.adoptionType = adoptionType;
  }

  public List<Adoption> getAdoptions() {
    return adoptions;
  }

  public void setAdoptions(List<Adoption> adoptions) {
    this.adoptions = adoptions;
  }

  public List<Sponsorship> getSponsors() {
    return sponsors;
  }

  public void setSponsors(List<Sponsorship> sponsors) {
    this.sponsors = sponsors;
  }
}
