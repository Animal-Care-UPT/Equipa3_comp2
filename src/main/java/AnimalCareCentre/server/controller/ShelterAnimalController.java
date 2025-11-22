package AnimalCareCentre.server.controller;

import AnimalCareCentre.server.model.Shelter;
import AnimalCareCentre.server.model.ShelterAnimal;
import AnimalCareCentre.server.service.ShelterService;
import AnimalCareCentre.server.service.ShelterAnimalService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shelteranimals/")
public class ShelterAnimalController {

  private final ShelterAnimalService shelterAnimalService;
  private final ShelterService shelterService;

  public ShelterAnimalController(ShelterAnimalService shelterAnimalService,
      ShelterService shelterService) {
    this.shelterAnimalService = shelterAnimalService;
    this.shelterService = shelterService;
  }

  @PostMapping("/register")
  public ResponseEntity<?> registerShelterAnimal(@Valid @RequestBody ShelterAnimal shelterAnimal,
                                                 @RequestParam String shelterEmail) {
      Shelter shelter = shelterService.findByShelterEmail(shelterEmail);

      if (shelter == null) return ResponseEntity.status(404).body("The shelter doesn't exist!");

      shelterAnimal.setShelter(shelter);
      ShelterAnimal savedAnimal = shelterAnimalService.registerShelterAnimal(shelterAnimal);

      return ResponseEntity.status(201).body(savedAnimal);
    }


}
