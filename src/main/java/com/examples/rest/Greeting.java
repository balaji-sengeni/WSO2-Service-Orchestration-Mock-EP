package com.examples.rest;

public class Greeting
{
  private Integer id;
  private String Name;
  
  public Greeting(Integer i, String name)
  {
    this.id = i;
    this.Name = name;
  }
  
  public Integer getId()
  {
    return this.id;
  }
  
  public void setId(Integer id)
  {
    this.id = id;
  }
  
  public String getName()
  {
    return this.Name;
  }
  
  public void setName(String name)
  {
    this.Name = name;
  }
  
  public String toString()
  {
    return "Greeting [id=" + this.id + ", Name=" + this.Name + "]";
  }
}
