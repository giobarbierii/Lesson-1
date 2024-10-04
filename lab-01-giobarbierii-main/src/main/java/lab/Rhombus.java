package lab;

import static jtamaro.en.Graphics.*;
import static jtamaro.en.IO.todo;

import jtamaro.en.Color;
import jtamaro.en.Graphic;

public class Rhombus {

  // Task F1: implement rhombus.
  public static Graphic rhombus(double side, double angle, Color color) {
    assert side >= 0;
    assert angle >= 0;
    assert angle <= 179;
    return beside(
      rotate( -angle/2, Toolbelt.isoscelesTriangle(side, angle, color)),
      rotate(180-(angle/2), Toolbelt.isoscelesTriangle(side, angle, color))
    );
  }

}
