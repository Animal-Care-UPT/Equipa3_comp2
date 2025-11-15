package AnimalCareCentre.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AnimalCareCentre.server.service.SponsorshipService;

@RestController
@RequestMapping("/sponsorships/")
public class SponsorshipController {

  private final SponsorshipService sponsorshipService;

  public SponsorshipController(SponsorshipService sponsorshipService) {
    this.sponsorshipService = sponsorshipService;
  }

}
