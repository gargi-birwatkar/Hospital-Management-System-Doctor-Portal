package content;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class GradientLabel extends JLabel {
    private Color color1;
    private Color color2;
    private int borderRadius = 50; // Radius for the rounded corners

    public GradientLabel(String hexColor1, String hexColor2) {
        this.color1 = Color.decode(hexColor1);
        this.color2 = Color.decode(hexColor2);
        setHorizontalAlignment(SwingConstants.CENTER);
        setForeground(Color.WHITE); // Set text color
        setFont(new Font("Segoe UI", Font.BOLD, 24)); // Set the font
        setOpaque(false); // Make sure the label is transparent to show the gradient
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();

        // Create a rounded shape for the background
        Shape roundedRect = new RoundRectangle2D.Double(0, 0, width, height, borderRadius, borderRadius);

        // Clip the graphics context to the rounded shape
        g2d.setClip(roundedRect);

        // Create the gradient paint
        GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2, true);
        g2d.setPaint(gp);
        g2d.fill(roundedRect);

        // Reset the clipping and draw the border
        g2d.setClip(null); // Reset the clipping

        g2d.setStroke(new BasicStroke(2)); // Border thickness
        g2d.setColor(Color.BLACK); // Border color
        g2d.draw(roundedRect); // Draw the rounded border

        g2d.dispose(); // Dispose the graphics context

        // Paint the text
        super.paintComponent(g);
    }
}
