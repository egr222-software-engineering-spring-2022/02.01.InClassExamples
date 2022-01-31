import java.awt.*;

public class RectangleStairs {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(160, 160);
        Graphics g = panel.getGraphics();

        for (int i = 0; i < 10; i++) {
            g.drawRect(110 - 10 * i, 20 + 10 * i, 10 + 10 * i, 10);
        }
    }
}
