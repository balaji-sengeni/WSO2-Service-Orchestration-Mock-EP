package com.examples.rest;

public class Name
{
  private String foreName;
  private String surName;
  
  public Name()
  {
    this.foreName = "ForeName";
    this.surName = "SurName";
  }
  
  public String getForeName()
  {
    return this.foreName;
  }
  
  public void setForeName(String foreName)
  {
    this.foreName = foreName;
  }
  
  public String getSurName()
  {
    return this.surName;
  }
  
  public void setSurName(String surName)
  {
    this.surName = surName;
  }
}
