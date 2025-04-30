package advan;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;

public class MultiTextButton extends JButton {
    private String secondaryText = "";
    private int sizeSecondaryText = 1;
    public void setSecondaryText(String text, int size)
    {
        secondaryText = text; sizeSecondaryText = size;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getForeground());
        g.setFont(getFont().deriveFont(Font.PLAIN, sizeSecondaryText)); 
        g.drawString(secondaryText, 10, 15); 
    }
}
