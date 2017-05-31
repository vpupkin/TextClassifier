package com.irvil.nntextclassifier.model;

import java.util.List;

public class Characteristic {
  private int id;
  private String name;
  private List<CharacteristicValue> possibleValues;

  private Characteristic(int id, String name, List<CharacteristicValue> possibleValues) {
    this.id = id;
    this.name = name;
    this.possibleValues = possibleValues;
  }

  public Characteristic(int id, String name) {
    this(id, name, null);
  }

  public Characteristic(String name, List<CharacteristicValue> possibleValues) {
    this(0, name, possibleValues);
  }

  public Characteristic(String name) {
    this(0, name, null);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public List<CharacteristicValue> getPossibleValues() {
    return possibleValues;
  }

  public void setPossibleValues(List<CharacteristicValue> possibleValues) {
    this.possibleValues = possibleValues;
  }

  @Override
  public boolean equals(Object o) {
    return ((o instanceof Characteristic) && (this.name.equals(((Characteristic) o).getName())));
  }

  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
}