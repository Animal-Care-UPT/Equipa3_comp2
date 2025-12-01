package AnimalCareCentre.client.records;

import java.util.List;

import AnimalCareCentre.client.enums.*;

public record ShelterAnimal(long id, String name, AnimalType type, AnimalRace race, AnimalSize size, AnimalGender gender, AnimalColor color, String description, Shelter shelter, boolean isVacinated, Status status, AdoptionType adoptionType, List<Adoption> adoptions, List<Sponsorship> sponsors) {}
