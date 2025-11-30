package AnimalCareCentre.client.model;

import AnimalCareCentre.client.enums.*;

public abstract class Animal {

  private long id;

  private String name;

  private AnimalType type;

  private AnimalRace race;

  private AnimalSize size;

  private AnimalGender gender;

  private AnimalColor color;

  private String description;

  public Animal() {
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nType: " + type + "\nRace: " + race + "\nSize: " + size + "\nGender: " + gender +
        "\nColor: " + color + "\nDescription: " + description;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public AnimalRace getRace() {
    return race;
  }

  public void setRace(AnimalRace race) {
    this.race = race;
  }

  public AnimalSize getSize() {
    return size;
  }

  public void setSize(AnimalSize size) {
    this.size = size;
  }

  public AnimalGender getGender() {
    return gender;
  }

  public void setGender(AnimalGender gender) {
    this.gender = gender;
  }

  public AnimalColor getColor() {
    return color;
  }

  public void setColor(AnimalColor color) {
    this.color = color;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
