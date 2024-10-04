package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Graphics.*;

import jtamaro.en.Graphic;

public class FourPetalFlower {

  // Task J1: implement flower.
  public static Graphic flower(double diameter) {
    assert diameter >= 0;
    return overlay(
      Toolbelt.circle(diameter, YELLOW),
       overlay(
        above(
          Toolbelt.circle(diameter, GREEN), Toolbelt.circle(diameter, GREEN)),
          beside(
            Toolbelt.circle(diameter, GREEN),
            Toolbelt.circle(diameter, GREEN))
          )
         );
  }
}
