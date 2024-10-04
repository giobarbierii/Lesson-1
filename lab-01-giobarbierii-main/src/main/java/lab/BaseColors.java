package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Graphics.*;

import jtamaro.en.Color;
import jtamaro.en.Graphic;

public class BaseColors {

  // Task D1: implement rgbCircles.
  public static Graphic rgbCircles(double diameter) {
    assert diameter >=0;
    return beside(
      Toolbelt.circle(diameter, RED), 
      beside(
        Toolbelt.circle(diameter, GREEN),
        Toolbelt.circle(diameter, BLUE)
      )
    );
  }

  // Task D2: implement cmySquares.
  public static Graphic cmySquares(double side) {
    assert side >=0;
    return beside(
      Toolbelt.square(side, CYAN), 
      beside(
        Toolbelt.square(side, MAGENTA),
        Toolbelt.square(side, YELLOW)
      )
    );
  }
}
