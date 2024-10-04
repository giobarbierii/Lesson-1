package lab;

import static jtamaro.en.IO.todo;
import static jtamaro.en.Colors.*;
import static jtamaro.en.Graphics.*;
import static jtamaro.en.Sequences.*;

import jtamaro.en.Graphic;
import jtamaro.en.Color;

/**
 * Put together your own Toolbelt class.
 * Over the course of the semester,
 * add methods you write and want to reuse in future assignments.
 */
public final class Toolbelt {

  // Task B1: implement square
  public static Graphic square(double sideLength, Color color) {
    return rectangle(sideLength, sideLength, color);
  }

  // Task B2: implement circle.
  public static Graphic circle(double radius, Color color) {
    return circularSector(radius, 360, color); 
  }
  // Task B3: implement equilateralTriangle.
  public static Graphic equilateralTriangle(double sideLength, Color color) {
    return triangle(sideLength, sideLength, 60, color);
  }
  // Task B4: implement isoscelesTriangle.
  public static Graphic isoscelesTriangle(double side, double angle, Color color) {
    return triangle(side, side, angle, color);
  }
  // Task B4: implement rightTriangle.
  public static Graphic rightTriangle(double side1, double side2, Color color) {
    return triangle( side1, side2, 90, color);
  }
  // Task H1: commonize rhombus.

  public static Graphic rhombus(double side, double angle, Color color) {
    assert side >= 0;
    assert angle >= 0;
    assert angle <= 179;
    return beside(
      rotate( -angle/2, Toolbelt.isoscelesTriangle(side, angle, color)),
      rotate(180-(angle/2), Toolbelt.isoscelesTriangle(side, angle, color))
    );
  }
  // Task L1: implement firstName.
  public static String firstName() {
    return  "Giovanni";
  }
  // Task L1: implement lastName.
  public static String lastName() {
    return  "Barbieri";
  }
  // Task L1: implement fullName.
  public static String fullName() {
    return  firstName() + lastName();
  }
  // Task L1: implement usiUsername.
  public static String usiUsername() {
    return  "barbig";
  }
  // Task L1: implement usiLongEmail.
  public static String usiLongEmail() {
    return firstName() + "." + lastName() + "@usi.ch";
  }
  // Task L1: implement usiShortEmail.
  public static String usiShortEmail() {
    return  usiUsername() + "@usi.ch";
  }
  // Task L1: implement gitHubUsername.
  public static String gitHubUsername() {
    return  "gio_barbierii";
  }
}
