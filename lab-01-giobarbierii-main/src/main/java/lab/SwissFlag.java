package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Graphics.*;

import jtamaro.en.Graphic;

public class SwissFlag {

  // Task 9: implement flag.
  public static Graphic flagRectangle(double unit) {
    return rectangle(20*unit, 6*unit, WHITE);
  }

  public static Graphic flag(double unit) {
    return overlay(
      overlay(
        flagRectangle(unit), 
        rotate(90, flagRectangle(unit))), 
      Toolbelt.square(32*unit, RED));
  }

}
