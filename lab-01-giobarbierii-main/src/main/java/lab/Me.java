package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Fonts.*;
import static jtamaro.en.Graphics.*;

import jtamaro.en.Graphic;

public class Me {
  
  // Task L2: implement twistedName
  public static Graphic twistedName(double fontSize) {
    return above(
      text(Toolbelt.firstName(), SANS_SERIF, fontSize, BLUE), 
      rotate(180, text(Toolbelt.lastName(), SANS_SERIF, fontSize, RED))
    );
  }
}
