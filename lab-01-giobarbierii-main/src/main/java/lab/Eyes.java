package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Graphics.*;

import jtamaro.en.Graphic;

public class Eyes {

  // Task I1: implement eye.
  public static Graphic eye(double diameter) {
  assert diameter >= 0;
  return overlay(
    Toolbelt.circle(diameter*0.55, BLACK),
     Toolbelt.circle(diameter, WHITE));
  }
  // Task I2: implement eyes.
  public static Graphic eyes(double diameter) {
    assert diameter >= 0;
    return beside(Eyes.eye(diameter),
     Eyes.eye(diameter)
     );
  }
}
