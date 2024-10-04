package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Fonts.*;
import static jtamaro.en.Graphics.*;

import jtamaro.en.Graphic;

public class DoubleBlackDiamond {

  // Task G1: implement blackDiamond.
  public static Graphic blackDiamond(double side) {
    assert side >= 0;
    return rotate(0, Toolbelt.rhombus(side, 110, BLACK));

  }
  // Task G2: implement doubleBlackDiamond.
  public static Graphic doubleBlackDiamond(double side) {
    assert side >= 0;
    return beside( 
    blackDiamond(side),
    blackDiamond(side)
    );
  }
  // Task G3: implement labeledDoubleBlackDiamond.
  public static Graphic labeledDoubleBlackDiamond(double side) {
    assert side >= 0;
    return above(
      doubleBlackDiamond(side),
      text("EXPERTS ONLY", SANS_SERIF, side/2, BLACK )
      );
  }
}
