package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Graphics.*;
import static jtamaro.en.IO.todo;

import jtamaro.en.Color;
import jtamaro.en.Graphic;

public class House {

  // Task C1: implement house.
  public static Graphic house(double width, Color roofColor, Color wallColor) {
    assert width >= 0;
    return above( Toolbelt.equilateralTriangle(width, roofColor), Toolbelt.square(width, wallColor)
    );
  }

  // Task C2: implement berneseHouse.
  public static Graphic berneseHouse(double width) {
    assert width >= 0;
    return above( Toolbelt.equilateralTriangle(width, GREEN), Toolbelt.square(width, GREEN)
    );
  }
}
