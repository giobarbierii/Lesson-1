package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Graphics.*;

import jtamaro.en.Color;
import jtamaro.en.Graphic;

public class YinYang {

  // Task L2: implement yinYang.
  public static Graphic yinYang(double diameter) {
    assert diameter >= 0;
    return overlay(
      above(
        overlay(
          Toolbelt.circle(diameter/6, BLACK), 
        Toolbelt.circle(diameter/2, WHITE)),
        overlay(Toolbelt.circle(diameter/6, WHITE), 
        Toolbelt.circle(diameter/2, BLACK))),
        beside(
          rotate(90, circularSector(diameter, 180, WHITE)),
          rotate(270, circularSector(diameter, 180, BLACK))
          )
        );
  }
}
