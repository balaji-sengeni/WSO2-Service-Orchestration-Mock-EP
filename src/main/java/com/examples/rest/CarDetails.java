package com.examples.rest;

import com.google.gson.annotations.Expose;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarDetails
{
  @Expose
  private String model;
  @Expose
  private String yearOfMake;
  @Expose
  private List<String> history;
  
  public CarDetails()
  {
    this.model = "Vectra";
    this.yearOfMake = "2000";
    setHistory(Arrays.asList(new String[] { "History-1", "History-2" }));
  }
  
  public String getModel()
  {
    return this.model;
  }
  
  public void setModel(String model)
  {
    this.model = model;
  }
  
  public String getYearOfMake()
  {
    return this.yearOfMake;
  }
  
  public void setYearOfMake(String yearOfMake)
  {
    this.yearOfMake = yearOfMake;
  }
  
  public List<String> getHistory()
  {
    return this.history;
  }
  
  public void setHistory(List<String> history)
  {
    this.history = history;
  }
}
