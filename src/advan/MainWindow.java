package advan;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
public class MainWindow extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="public MainWindow()">
    public MainWindow() {
        initComponents();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setSize(this.getSize());
        blackPanel.setLocation(0, 0);
        this.setGlassPane(blackPanel);
        setBlackPanel(true);
    }
    // </editor-fold>
    
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

        rightPanel.setBackground(new java.awt.Color(90, 104, 183));
        rightPanel.setAlignmentX(0.2F);
        rightPanel.setAlignmentY(0.0F);
        rightPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        rightPanel.setLayout(null);
        getContentPane().add(rightPanel);
        rightPanel.setBounds(310, 0, 90, 300);

        bottomPanel.setBackground(new java.awt.Color(90, 104, 183));
        bottomPanel.setLayout(null);

        infoPanel.setBackground(new java.awt.Color(90, 104, 183));

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

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 310, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold defaultstate="collapsed" desc="private void formComponentResized(java.awt.event.ComponentEvent evt)">
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (resizeWindow)
        {
            repaintComponents();
        }  
    }//GEN-LAST:event_formComponentResized
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="private void formWindowOpened(java.awt.event.WindowEvent evt)">
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        currentMap.resetMap("maps/1.txt");
        setComponents();
        repaintComponents();
        setBlackPanel(false);
        drawMap(currentMap);
        setButtons("main");
    }//GEN-LAST:event_formWindowOpened
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="public static void main(String args[])">
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
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="private void setComponents()">
    private void setComponents()
    {
        this.setLayout(null);
        insets = this.getInsets();
        for (int i = 0; i < cellsWidth; i++)
        {
            for (int j = 0; j < cellsHeight; j++)
            {
                mainPanels[i][j] = new javax.swing.JPanel();
                mainPanels[i][j].setLayout(null);
                mainPanels[i][j].setBackground(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
                picturesOnMainPanels[i][j] = new PictureMainPanel();
                picturesOnMainPanels[i][j].setLocation(0, 0);
                mainPanels[i][j].add(picturesOnMainPanels[i][j]);
                mainPanel.add(mainPanels[i][j]);
            }
        }  
        
        for (int i = 0; i < 9; i++)
        {
            buttons[i] = new MultiTextButton();
            bottomPanel.add(buttons[i]);
        }
        
        try {
            currentImage = ImageIO.read(MainWindow.class.getResource("pictures/main/back1.png"));
            mapEmpty = ImageIO.read(MainWindow.class.getResource("pictures/map/empty.png"));
            mapBlock = ImageIO.read(MainWindow.class.getResource("pictures/map/block.png"));
            mapPlayer = ImageIO.read(MainWindow.class.getResource("pictures/map/player.png"));
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
        for (int i = 0; i < 100; i++) temp += "test\n";
        mainText.setText(temp);
        infoText.setText(temp);
        
        for (int i = 0; i < 2; i++)
        {
            mainButtons[i] = new javax.swing.JButton();
            rightPanel.add(mainButtons[i]);
        }
        mainButtons[0].setText("Save");
        mainButtons[1].setText("Load");
        
        try
        {
             Font customFont = Font.createFont(Font.TRUETYPE_FONT, MainWindow.class.getResourceAsStream("/fonts/FriendInfo.ttf"));
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(customFont);
             for (int i = 0; i < 9; i++) buttons[i].setFont(customFont.deriveFont(Font.PLAIN, sizeFont));
             mainText.setFont(customFont.deriveFont(Font.PLAIN, sizeFont));
             infoText.setFont(customFont.deriveFont(Font.PLAIN, sizeFont));
             mainButtons[0].setFont(customFont.deriveFont(Font.PLAIN, sizeFont));
             mainButtons[1].setFont(customFont.deriveFont(Font.PLAIN, sizeFont));
        }
        catch (IOException | FontFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Ошибка загрузки шрифта", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
        
        
        resizeWindow = true;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="private void repaintComponents()">
    private void repaintComponents()
    {
        for (int i = 0; i < cellsWidth; i++)
            {
                for (int j = 0; j < cellsHeight; j++)
                {
                mainPanels[i][j].setSize((int)((double)this.getSize().width * 0.8) / cellsWidth, 
                        (int)((double)this.getSize().height * 0.8) / cellsHeight);
                mainPanels[i][j].setLocation(mainPanels[i][j].getSize().width * i, mainPanels[i][j].getSize().height * j);
                picturesOnMainPanels[i][j].setSize(mainPanels[i][j].getSize());
                mainPanels[i][j].repaint();
                }
            }
            drawMap(currentMap);
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
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="private void setBlackPanel(boolean is)">
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
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="private void drawMap(MapData map)">
    private void drawMap(MapData map)
    {
        for (int i = 0; i < cellsWidth; i++)
        {
            for (int j = 0; j < cellsHeight; j++)
            {
                if (map.places[i][j] == TypePlace.nothing) 
                {
                    mainPanels[i][j].setBackground(Color.GRAY);
                    picturesOnMainPanels[i][j].setImage(mapEmpty);
                }
                if (map.places[i][j] == TypePlace.block) 
                {
                    mainPanels[i][j].setBackground(Color.BLUE);
                    picturesOnMainPanels[i][j].setImage(mapBlock);
                }
                if (map.places[i][j] == TypePlace.error) 
                {
                    mainPanels[i][j].setBackground(Color.RED);
                }
                if (i == playerXY.x && j == playerXY.y)
                {
                    mainPanels[i][j].setBackground(Color.YELLOW);
                    picturesOnMainPanels[i][j].setImage(mapPlayer);
                }
                    
            }
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="private void setButtons(String mode)">
    private void setButtons(String mode)
    {
        if (mode.equals("main"))
        {
            buttons[1].setAction(new buttonMovePlayerUp());
            buttons[3].setAction(new buttonMovePlayerLeft());
            buttons[5].setAction(new buttonMovePlayerRight());
            buttons[7].setAction(new buttonMovePlayerDown());
            buttons[1].setText("Up");
            buttons[1].setSecondaryText("W", sizeFont - 2);
            buttons[3].setText("Left");
            buttons[3].setSecondaryText("A", sizeFont - 2);
            buttons[5].setText("Right");
            buttons[5].setSecondaryText("D", sizeFont - 2);
            buttons[7].setText("Down");
            buttons[7].setSecondaryText("S", sizeFont - 2);
            setKeyStroke("W", "up");
            setKeyStroke("S", "down");
            setKeyStroke("D", "right");
            setKeyStroke("A", "left");
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="private void setKeyStroke(String key, String action)">
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
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="classes buttonMovePlayer">
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
    // </editor-fold>

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
    MultiTextButton[] buttons = new MultiTextButton[9];
    javax.swing.JButton[] mainButtons = new javax.swing.JButton[2];
    PictureBox mainPictureBox = new PictureBox();
    Image currentImage = null;
    int cellsWidth = 28;
    int cellsHeight = 20;
    private javax.swing.JPanel[][] mainPanels = new javax.swing.JPanel[cellsWidth][cellsHeight];
    private PictureMainPanel[][] picturesOnMainPanels = new PictureMainPanel[cellsWidth][cellsHeight];
    private java.util.Random rnd = new java.util.Random();
    boolean resizeWindow = false;
    Insets insets;
    MapData currentMap = new MapData();
    int sizeFont = 15;
    Point playerXY = new Point(2, 2);
    Image mapEmpty = null;
    Image mapBlock = null;
    Image mapPlayer = null;
    int w;
}

