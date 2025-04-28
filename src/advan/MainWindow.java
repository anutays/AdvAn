package advan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.plaf.basic.BasicScrollBarUI;
public class MainWindow extends javax.swing.JFrame {
    public MainWindow() {
        initComponents();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setSize(this.getSize());
        blackPanel.setLocation(0, 0);
        this.setGlassPane(blackPanel);
        setBlackPanel(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 700));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        rightPanel.setBackground(new java.awt.Color(255, 51, 51));
        rightPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rightPanel.setAlignmentX(0.2F);
        rightPanel.setAlignmentY(0.0F);
        rightPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        rightPanel.setLayout(null);
        getContentPane().add(rightPanel);
        rightPanel.setBounds(310, 0, 90, 300);

        bottomPanel.setBackground(new java.awt.Color(153, 255, 51));
        bottomPanel.setLayout(null);

        infoPanel.setBackground(new java.awt.Color(102, 0, 153));

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        bottomPanel.add(infoPanel);
        infoPanel.setBounds(180, 0, 130, 70);

        getContentPane().add(bottomPanel);
        bottomPanel.setBounds(0, 230, 310, 70);

        mainPanel.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 310, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (resizeWindow)
        {
            repaintComponents();
        }  
    }//GEN-LAST:event_formComponentResized

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setComponents();
        repaintComponents();
        setBlackPanel(false);
        currentMap.resetMap("maps/1.txt");
        drawMap(currentMap);
        setButtons("main");
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    private void setComponents()
    {
        this.setLayout(null);
        insets = this.getInsets();
        for (int i = 0; i < cellsWidth; i++)
        {
            for (int j = 0; j < cellsHeight; j++)
            {
                mainPanels[i][j] = new javax.swing.JPanel();
                mainPanels[i][j].setBackground(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
                mainPanel.add(mainPanels[i][j]);
            }
        }  
        
        for (int i = 0; i < 9; i++)
        {
            buttons[i] = new javax.swing.JButton();
            bottomPanel.add(buttons[i]);
        }
        
        try {
            currentImage = ImageIO.read(MainWindow.class.getResource("pictures/1.PNG"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        mainPictureBox.setImage(currentImage);
        rightPanel.add(mainPictureBox);
        
        
        
        mainText.setLineWrap(true);
        mainText.setWrapStyleWord(true); 
        mainText.setEditable(false);  
        mainText.setBackground(null);  
        mainText.setBorder(null);  
        
        scrollMainText = new JScrollPane(mainText);
        scrollMainText.setBackground(null);
        scrollMainText.setBorder(null);
        scrollMainText.getViewport().setBackground(null);
        JScrollBar verticalBar = scrollMainText.getVerticalScrollBar();
        verticalBar.setUI(new CustomScrollBarUI());
        rightPanel.add(scrollMainText);

        infoText.setLineWrap(true);
        infoText.setWrapStyleWord(true); 
        infoText.setEditable(false);  
        infoText.setBackground(null);  
        infoText.setBorder(null);
        
        
        scrollInfoText = new JScrollPane(infoText);
        scrollInfoText.setBackground(null);
        scrollInfoText.setBorder(null);
        scrollInfoText.getViewport().setBackground(null);
        JScrollBar verticalBarInfo = scrollInfoText.getVerticalScrollBar();
        verticalBarInfo.setUI(new CustomScrollBarUI());
        infoPanel.add(scrollInfoText);

        String temp = "";
        for (int i = 0; i < 100; i++) temp += "rerererere\n";
        temp += "fsdfd dfdsf dfghg  jnjnhub vcfcfgv hbnjhinjin vftrcrdc hnjinjin mimjin vftcdrc gvhubhnji nihnhubgy rcrdcxrdc bhubjinjin ijnhubnhubgv tfcdrcftc gvhubhubnhn hubgyv";
        mainText.setText(temp);
        infoText.setText(temp);
        
        for (int i = 0; i < 2; i++)
        {
            mainButtons[i] = new javax.swing.JButton();
            rightPanel.add(mainButtons[i]);
        }
        mainButtons[0].setText("Save");
        mainButtons[1].setText("Load");
        resizeWindow = true;
    }
    private void repaintComponents()
    {
        for (int i = 0; i < cellsWidth; i++)
            {
                for (int j = 0; j < cellsHeight; j++)
                {
                mainPanels[i][j].setSize((int)((double)this.getSize().width * 0.8) / cellsWidth, 
                        (int)((double)this.getSize().height * 0.8) / cellsHeight);
                mainPanels[i][j].setLocation(mainPanels[i][j].getSize().width * i, mainPanels[i][j].getSize().height * j);
                mainPanels[i][j].repaint();
                }
            }
            
            mainPanel.setSize(mainPanels[0][0].getSize().width * cellsWidth, mainPanels[0][0].getSize().height * cellsHeight);
            bottomPanel.setSize(mainPanels[0][0].getSize().width * cellsWidth, this.getSize().height - mainPanel.getSize().height);
            bottomPanel.setLocation(0, this.getSize().height - bottomPanel.getSize().height);
            
            rightPanel.setSize(this.getSize().width - mainPanel.getSize().width, this.getSize().height);
            rightPanel.setLocation(this.getSize().width - rightPanel.getSize().width, 0);
            
            for (int i = 0; i < 9; i++)
            {
                buttons[i].setSize(bottomPanel.getSize().width / 6, (bottomPanel.getSize().height - insets.top - 13) / 3);
                if (i <= 2) buttons[i].setLocation(buttons[i].getSize().width * i, 0);
                else if (i <= 5) buttons[i].setLocation(buttons[i].getSize().width * (i - 3), buttons[i].getSize().height);
                else if (i <= 8) buttons[i].setLocation(buttons[i].getSize().width * (i - 6), buttons[i].getSize().height * 2);
            }
            infoPanel.setLocation(buttons[0].getSize().width * 3, 0);
            infoPanel.setSize(bottomPanel.getSize().width / 2, bottomPanel.getSize().height - insets.top - 13);
            
            mainPictureBox.setImage(currentImage);
            mainPictureBox.setSize(rightPanel.getSize().width - 20, rightPanel.getSize().height / 2);
            
            scrollMainText.setLocation(0, mainPictureBox.getSize().height);
            scrollMainText.setSize(mainPictureBox.getSize().width, mainPictureBox.getSize().height * 9 / 10 - insets.top);
            scrollMainText.revalidate();
            
            for (int i = 0; i < 2; i++)
            {
                mainButtons[i].setLocation(i * (rightPanel.getSize().width / 2 - 10), mainPictureBox.getSize().height + scrollMainText.getSize().height);
                mainButtons[i].setSize(rightPanel.getSize().width / 2 - 10, rightPanel.getSize().height - mainPictureBox.getSize().height
                - scrollMainText.getSize().height - insets.top - 13);
            }
            
            scrollInfoText.setLocation(0, 0);
            scrollInfoText.setSize(infoPanel.getSize().width, infoPanel.getSize().height);
            scrollInfoText.revalidate();
    }
    private void setBlackPanel(boolean is)
    {
        if (is)
        {
            blackPanel.setVisible(true);
        }
        else
        {
            blackPanel.setVisible(false);
        }
    }
    private void drawMap(MapData map)
    {
        for (int i = 0; i < cellsWidth; i++)
        {
            for (int j = 0; j < cellsHeight; j++)
            {
                if (map.places[i][j] == TypePlace.nothing) 
                {
                    mainPanels[i][j].setBackground(Color.GRAY);
                }
                if (map.places[i][j] == TypePlace.block) 
                {
                    mainPanels[i][j].setBackground(Color.BLUE);
                }
                if (map.places[i][j] == TypePlace.error) 
                {
                    mainPanels[i][j].setBackground(Color.RED);
                }
                if (i == playerXY.x && j == playerXY.y) mainPanels[i][j].setBackground(Color.YELLOW);
            }
        }
        
    }
    private void setButtons(String mode)
    {
        if (mode.equals("main"))
        {
            buttons[1].setAction(new buttonMovePlayerUp());
            buttons[3].setAction(new buttonMovePlayerLeft());
            buttons[5].setAction(new buttonMovePlayerRight());
            buttons[7].setAction(new buttonMovePlayerDown());
            buttons[1].setText("Up");
            buttons[3].setText("Left");
            buttons[5].setText("Right");
            buttons[7].setText("Down");
            setKeyStroke("W", "up");
            setKeyStroke("S", "down");
            setKeyStroke("D", "right");
            setKeyStroke("A", "left");
        }
    }
    private void setKeyStroke(String key, String action)
    {
        KeyStroke keyStroke = KeyStroke.getKeyStroke(key);
        InputMap inputMap = bottomPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke, action);
        ActionMap actionMap = bottomPanel.getActionMap();
        if (action.equals("up")) actionMap.put(action, new buttonMovePlayerUp());
        if (action.equals("down")) actionMap.put(action, new buttonMovePlayerDown());
        if (action.equals("right")) actionMap.put(action, new buttonMovePlayerRight());
        if (action.equals("left")) actionMap.put(action, new buttonMovePlayerLeft());
    }
    class buttonMovePlayerUp extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (playerXY.y == 0) return;
            if (currentMap.places[playerXY.x][playerXY.y - 1] == TypePlace.block) return;
            playerXY.y -= 1;
            drawMap(currentMap);
        }
    }
    class buttonMovePlayerDown extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (playerXY.y == cellsHeight - 1) return;
            if (currentMap.places[playerXY.x][playerXY.y + 1] == TypePlace.block) return;
            playerXY.y += 1;
            drawMap(currentMap);
        }
    }
    class buttonMovePlayerRight extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (playerXY.x == cellsWidth - 1) return;
            if (currentMap.places[playerXY.x + 1][playerXY.y] == TypePlace.block) return;
            playerXY.x += 1;
            drawMap(currentMap);
        }
    }
    class buttonMovePlayerLeft extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (playerXY.x == 0) return;
            if (currentMap.places[playerXY.x - 1][playerXY.y] == TypePlace.block) return;
            playerXY.x -= 1;
            drawMap(currentMap);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel blackPanel = new javax.swing.JPanel();
    JScrollPane scrollMainText = null;
    javax.swing.JTextArea mainText = new javax.swing.JTextArea();
    
    JScrollPane scrollInfoText = null;
    javax.swing.JTextArea infoText = new javax.swing.JTextArea();
    
    javax.swing.JButton[] buttons = new javax.swing.JButton[9];
    javax.swing.JButton[] mainButtons = new javax.swing.JButton[2];
    PictureBox mainPictureBox = new PictureBox();
    Image currentImage = null;
    int cellsWidth = 28;
    int cellsHeight = 20;
    private javax.swing.JPanel[][] mainPanels = new javax.swing.JPanel[cellsWidth][cellsHeight];
    private java.util.Random rnd = new java.util.Random();
    boolean resizeWindow = false;
    Insets insets;
    MapData currentMap = new MapData();
    
    Point playerXY = new Point(1, 1);
}
class PictureBox extends javax.swing.JLabel
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
class CustomScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            this.thumbColor = Color.YELLOW; 
            this.trackColor = Color.BLUE;
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
