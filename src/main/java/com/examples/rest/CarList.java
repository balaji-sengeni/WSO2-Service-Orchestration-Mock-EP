package com.examples.rest;

import java.util.Arrays;
import java.util.List;

public class CarList
{
  private List<String> carNos;
  
  public CarList()
  {
    this.carNos = Arrays.asList(new String[] { "X922_LER", "X922_LER", "X923_LER" });
  }
  
  public List<String> getCarNos()
  {
    return this.carNos;
  }
  
  public void setCarNos(List<String> carNos)
  {
    this.carNos = carNos;
  }
}
