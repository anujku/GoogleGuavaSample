package com.anuj.guava.sample;

import com.google.common.base.Preconditions;

public class GuavaPreCondition {

  private int id;
  private String name;

  public GuavaPreCondition(int id, String name) {
    super();
    this.id = Preconditions.checkNotNull(id, "id Cannot be null");
    this.name = Preconditions.checkNotNull(name, "name Cannot be null");
    Preconditions.checkArgument(name.length() < 10);
  }

  public static void main(String[] args) {
    GuavaPreCondition condition = new GuavaPreCondition(1, null);
    condition = new GuavaPreCondition(1, "AnujKulkarni");
    condition = new GuavaPreCondition(1, "Anuj");
  }
}
