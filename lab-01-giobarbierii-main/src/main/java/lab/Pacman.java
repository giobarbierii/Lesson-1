package lab;

import static jtamaro.en.Colors.*;
import static jtamaro.en.Graphics.*;
import static jtamaro.en.IO.todo;

import jtamaro.en.Graphic;

public class Pacman {

  // Task A1: implement pacman
  public static Graphic pacman(double radius, double mouthAngle) {
    assert radius >= 0;
    assert mouthAngle >= 0;
    assert mouthAngle < 360;
    return rotate(mouthAngle/2, circularSector(radius, 360 - mouthAngle, YELLOW));
  }

}
