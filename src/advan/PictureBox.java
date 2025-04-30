package advan;

import java.awt.Graphics;
import java.awt.Image;

public class PictureBox extends javax.swing.JLabel
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
        double imgRatio = (double) image.getWidth(null) / image.getHeight(null);
        double labelRatio = (double) getWidth() / getHeight();

        int newWidth, newHeight;
        if (labelRatio > imgRatio) {
            newHeight = getHeight();
            newWidth = (int) (newHeight * imgRatio);
        } else {
            newWidth = getWidth();
            newHeight = (int) (newWidth / imgRatio);
        }
        int x = (getWidth() - newWidth) / 2;
        int y = (getHeight() - newHeight) / 2;

        image = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        g.drawImage(image, x, y, newWidth, newHeight, this);
    }
}
}
