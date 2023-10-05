import java.awt.Color;
import java.awt.Graphics;

public class Horse extends Actor {

  protected Horse(Cell inLoc, Boolean isHuman) {
    super(inLoc, Color.BLACK, isHuman, 2);
  }
  // Task 22
  @Override
  public void paint(Graphics g) {
    Motif horse = new Motif("assets/Chess_tile_nl.png");
    horse.draw(g, loc.x, loc.y, color);

  }
  @Override
  protected void setPoly() {
  }
}