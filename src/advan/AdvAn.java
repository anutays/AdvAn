package advan;

import java.awt.Dimension;
import java.awt.Toolkit;

public class AdvAn {
    static final Dimension WINDOW_SIZE = new Dimension(900, 700);
    public static void main(String[] args) {
        MainWindow win = ShowWin();
        
    }
    static MainWindow ShowWin()
    {
        MainWindow win = new MainWindow();
        win.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        win.setBounds(screenSize.width / 2 - (WINDOW_SIZE.width / 2), screenSize.height / 2 - (WINDOW_SIZE.height / 2), 
                WINDOW_SIZE.width, WINDOW_SIZE.height);
        return win;
    }   
}
