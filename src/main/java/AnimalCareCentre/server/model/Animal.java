package AnimalCareCentre.server.model;

import AnimalCareCentre.server.enums.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
abstract class Animal {

  @Id
  @Column(name = "animal_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @NotBlank(message = "Please insert a name")
  private String name;
  @Enumerated(EnumType.STRING)
  @NotNull(message = "Please define the type of animal")
  private AnimalType type;
  @NotBlank(message = "Please insert the race of the animal")
  private String race;
  @Enumerated(EnumType.STRING)
  @NotNull(message = "Please insert the size of the animal")
  private AnimalSize size;
  @Enumerated(EnumType.STRING)
  @NotNull(message = "Please define the gender of the animal")
  private AnimalGender gender;
  @Enumerated(EnumType.STRING)
  @NotNull(message = "Please insert the colour of the animal")
  private AnimalColor color;

  private String description;

  public Animal() {
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnimalType getType() {
    return type;
  }

  public void setType(AnimalType type) {
    this.type = type;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public AnimalSize getSize() {
    return size;
  }

  public AnimalGender getGender() {return gender;}

  public Animal(String name, AnimalType type, String race, AnimalSize animalSize, AnimalGender gender, AnimalColor animalColor,
      String description) {
    this.name = name;
    this.type = type;
    this.race = race;
    this.size = animalSize;
    this.color = animalColor;
    this.description = description;
    this.gender = gender;
  }

  public AnimalColor getColor() {
    return color;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nType: " + type + "\nRace: " + race + "\nSize: " + size +  "\nGender: " + gender +
            "\nColor: " + color + "\nDescription: " + description;
  }

}
