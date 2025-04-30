package advan;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class CustomScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            this.thumbColor = new Color(220, 220, 220); 
            this.trackColor = new Color(33, 33, 34);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createColoredButton(Color.BLUE); 
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createColoredButton(Color.BLUE);
        }

        private JButton createColoredButton(Color color) {
            JButton button = new JButton();
            button.setBackground(color);
            button.setBorder(BorderFactory.createEmptyBorder());
            return button;
        }
    }
