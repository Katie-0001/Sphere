//Author: Teta K. Tucker//
// Project 4.3//
//Class Name: Sphere//
//Write a class called Sphere that contains instance data that represents the sphere’s diameter//
//Define the Sphere constructor to accept and initialize the diameter, and include getter and setter methods for the diameter.//
//Include methods that calculate and return the volume and surface area of the sphere (see PP 3.6 for the formulas).//
//Include a toString method that returns a one-line description of the sphere.//

package com.katie.hw;

public class Sphere {

  private int diameter;
  private double area;
  private double volume;

  public Sphere(int diameter) {
    this.diameter = diameter;
    setVolume();
    setArea();
  }

  public void setDiameter(int diameter) {
    this.diameter = diameter;
  }

  public int getDiameter() {
    return diameter;
  }
  
  public double getRadius(){
   return this.getDiameter()/2.0;
  }

  public void setVolume() {
    volume = Math.PI * (4.0 / 3.0) * Math.pow((double) diameter / 2.0, 3);
  }

  public double getVolume() {
    return volume;
  }

  public double getArea() {
    return area;
  }

  public void setArea() {
    area = Math.PI * 4.0 * Math.pow((double) diameter / 2.0, 2);
  }
  
  public double getSurface(){ 
   return 4 * Math.PI * this.getRadius();
  }

  public String toString() {
    String info1 = Integer.toString(diameter);
    String info2 = Double.toString(area);
    String info3 = Double.toString(volume);
    return ("Diameter: " +info1 +"\t" +"Area: " +info2 +"\t" +"Volume: " +info3 +"\t");
  }
}
