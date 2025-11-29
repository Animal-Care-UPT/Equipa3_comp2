package AnimalCareCentre.server.controller;

import AnimalCareCentre.server.model.Adoption;
import AnimalCareCentre.server.model.ShelterAnimal;
import AnimalCareCentre.server.model.User;
import AnimalCareCentre.server.enums.Status;
import AnimalCareCentre.server.service.AdoptionService;
import AnimalCareCentre.server.service.ShelterAnimalService;
import AnimalCareCentre.server.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@RestController
@RequestMapping("/adoptions/")
public class AdoptionController {

    private final AdoptionService adoptionService;
    private final UserService userService;
    private final ShelterAnimalService shelterAnimalService;


    public AdoptionController(AdoptionService adoptionService, ShelterAnimalService shelterAnimalService, UserService userService) {

        this.adoptionService = adoptionService;
        this.userService = userService;
        this.shelterAnimalService = shelterAnimalService;
    }


    // Pedido de adoção
    @PostMapping("/request")
    public ResponseEntity<?> requestAdoption(@RequestParam String email, @RequestParam Long animalId) {

        User user = userService.findByEmail(email);

        if (user == null) {
            return ResponseEntity.status(404).body("That Id doesn't correspond to any user!");
        }


        ShelterAnimal animal = shelterAnimalService.findByShelterAnimalById(animalId);

        if(animal==null){
            return ResponseEntity.status(404).body("That Id doesn't correspond to any animal!");
        }

        Adoption adoption = adoptionService.requestAdoption(user, animal);

        return ResponseEntity.ok().body(adoption);
    }

    // Alterar estado do pedido
    @PostMapping("/changeStatus")
    public ResponseEntity<?> changeStatus(@RequestParam Long adoptionId, @RequestParam Status status) {

        Adoption adoption = adoptionService.findAdoptionById(adoptionId);
        if (adoption == null) {
            return ResponseEntity.status(404).body("That Id doesn't correspond to any adoption!");
        }

        Adoption changedAdoption = adoptionService.changeStatus(adoption, status);

        return ResponseEntity.ok().body(changedAdoption);
    }


    // Pedidos pendentes de um shelter
    @GetMapping("/pending")
    public List<Adoption> pendingRequests(@RequestParam Long shelterId) {
        return adoptionService.getPendingRequestsByShelter(shelterId);
    }


    @GetMapping("/user/adoptions")
    public ResponseEntity<?> userAdoptions(@RequestParam String email) {
        User user = userService.findByEmail(email);

        if (user == null) {
            return ResponseEntity.status(404).body("That Id doesn't correspond to any user!");
        }

        List<Adoption> userAdoptions = adoptionService.getUserAdoptions(user);

        return ResponseEntity.ok().body(userAdoptions);
    }

}

