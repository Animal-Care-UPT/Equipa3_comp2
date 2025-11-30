package AnimalCareCentre.client.model;

import AnimalCareCentre.client.enums.*;
import java.time.LocalDate;

/**
 * This class describes the model of a Donation with its attributes and how it
 * works.
 *
 */
public class Donation {
  
  private long id;
  private float amount;
  private LocalDate donationDate;
  private Sponsorship sponsorship;

  public Donation() {  
  }
  
  public float getAmount() {
    return amount;
  }

  public LocalDate getDonationDate() {
    return donationDate;
  }
  
  
  public void setSponsorship(Sponsorship sponsorship) {
	this.sponsorship = sponsorship;
}

// ToString from the class
  @Override
  public String toString() {
    return "Donation{" +
        ", amount=" + amount +
        ", donationDate=" + donationDate +
        '}';
  }
}
