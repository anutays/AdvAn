package advan;

import java.awt.Graphics;
import java.awt.Image;

public class PictureMainPanel extends javax.swing.JLabel
{
    Image image;
    void setImage(Image _image)
    {
        image = _image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            image = image.getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH);
            g.drawImage(image, 0, 0, getSize().width, getSize().height, this);
        }
    }
}

