package advan;

import java.awt.Color;
import java.awt.Insets;
public class MainWindow extends javax.swing.JFrame {
    public MainWindow() {
        initComponents();
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

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        getContentPane().add(rightPanel);
        rightPanel.setBounds(310, 0, 90, 300);

        bottomPanel.setBackground(new java.awt.Color(153, 255, 51));

        infoPanel.setBackground(new java.awt.Color(102, 0, 153));

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addGap(0, 153, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(bottomPanel);
        bottomPanel.setBounds(0, 230, 310, 70);

        mainPanel.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 310, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (resizeWindow)
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
        
            bottomPanel.setSize((int)((double)this.getSize().width * 0.8), this.getSize().height - mainPanel.getSize().height);
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
        }  
    }//GEN-LAST:event_formComponentResized

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLayout(null);
        insets = this.getInsets();
        for (int i = 0; i < cellsWidth; i++)
        {
            for (int j = 0; j < cellsHeight; j++)
            {
                mainPanels[i][j] = new javax.swing.JPanel();
                mainPanels[i][j].setBackground(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
                mainPanels[i][j].setSize((int)((double)this.getSize().width * 0.8) / cellsWidth, 
                        (int)((double)this.getSize().height * 0.8) / cellsHeight);
                mainPanels[i][j].setLocation(mainPanels[i][j].getSize().width * i, mainPanels[i][j].getSize().height * j);
                mainPanel.add(mainPanels[i][j]);
                mainPanels[i][j].repaint();
                
            }
        }
            
        mainPanel.setSize(mainPanels[0][0].getSize().width * cellsWidth, mainPanels[0][0].getSize().height * cellsHeight);
        mainPanel.setLocation(0, 0);
        
        bottomPanel.setSize((int)((double)this.getSize().width * 0.8), this.getSize().height - mainPanel.getSize().height);
        bottomPanel.setLocation(0, this.getSize().height - bottomPanel.getSize().height);
            
        rightPanel.setSize(this.getSize().width - mainPanel.getSize().width, this.getSize().height);
        rightPanel.setLocation(this.getSize().width - rightPanel.getSize().width, 0);
        
        for (int i = 0; i < 9; i++)
        {
            buttons[i] = new javax.swing.JButton();
            bottomPanel.add(buttons[i]);
            buttons[i].setSize(bottomPanel.getSize().width / 6, (bottomPanel.getSize().height - insets.top - 13) / 3);
            if (i <= 2) buttons[i].setLocation(buttons[i].getSize().width * i, 0);
            else if (i <= 5) buttons[i].setLocation(buttons[i].getSize().width * (i - 3), buttons[i].getSize().height);
            else if (i <= 8) buttons[i].setLocation(buttons[i].getSize().width * (i - 6), buttons[i].getSize().height * 2);
            buttons[i].setText(String.valueOf(bottomPanel.getSize().height / 3));
        }
        
        //infoPanel.setLocation(bottomPanel.getSize().width / 2, WIDTH);
        
        
        
        resizeWindow = true;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
    javax.swing.JButton[] buttons = new javax.swing.JButton[9];
    int cellsWidth = 14;
    int cellsHeight = 10;
    private javax.swing.JPanel[][] mainPanels = new javax.swing.JPanel[cellsWidth][cellsHeight];
    private java.util.Random rnd = new java.util.Random();
    boolean resizeWindow = false;
    Insets insets;
}
