package advan;

import java.awt.Color;
public class MainWindow extends javax.swing.JFrame {
    public MainWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        textPanel = new javax.swing.JPanel();
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

        menuPanel.setBackground(new java.awt.Color(255, 51, 51));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPanel.setAlignmentX(0.2F);
        menuPanel.setAlignmentY(0.0F);
        menuPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        getContentPane().add(menuPanel);
        menuPanel.setBounds(310, 0, 98, 248);

        textPanel.setBackground(new java.awt.Color(153, 255, 51));

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(textPanel);
        textPanel.setBounds(0, 150, 310, 100);

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
        mainPanel.setBounds(0, 0, 310, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (resizeWindow)
        {
            menuPanel.setSize(this.getSize().width / 5, this.getSize().height);
            menuPanel.setLocation(this.getSize().width - menuPanel.getSize().width, 0);
        
            textPanel.setSize((int)((double)this.getSize().width * 0.8), this.getSize().height / 5);
            textPanel.setLocation(0, this.getSize().height - textPanel.getSize().height);
        
            mainPanel.setSize((int)((double)this.getSize().width * 0.8), (int)((double)this.getSize().height * 0.8));
            mainPanel.setLocation(0, 0);
        
            for (int i = 0; i < cellsWidth; i++)
            {
                for (int j = 0; j < cellsHeight; j++)
                {
                mainPanels[i][j].setSize(mainPanel.getSize().width / cellsWidth, mainPanel.getSize().height / cellsHeight);
                mainPanels[i][j].setLocation(mainPanels[i][j].getSize().width * i, mainPanels[i][j].getSize().height * j);
                mainPanels[i][j].repaint();
                }
            }
        }
    }//GEN-LAST:event_formComponentResized

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLayout(null);
        menuPanel.setSize(this.getSize().width / 5, this.getSize().height);
        menuPanel.setLocation(this.getSize().width - menuPanel.getSize().width, 0);
        
        textPanel.setSize((int)((double)this.getSize().width * 0.8), this.getSize().height / 5);
        textPanel.setLocation(0, this.getSize().height - textPanel.getSize().height);
        
        mainPanel.setSize((int)((double)this.getSize().width * 0.8), (int)((double)this.getSize().height * 0.8));
        mainPanel.setLocation(0, 0);
        
        for (int i = 0; i < cellsWidth; i++)
        {
            for (int j = 0; j < cellsHeight; j++)
            {
            mainPanels[i][j] = new javax.swing.JPanel();
            mainPanels[i][j].setBackground(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
            mainPanels[i][j].setSize(mainPanel.getSize().width / cellsWidth, mainPanel.getSize().height / cellsHeight);
            mainPanels[i][j].setLocation(mainPanels[i][j].getSize().width * i, mainPanels[i][j].getSize().height * j);
            mainPanel.add(mainPanels[i][j]);
            
            mainPanels[i][j].repaint();
            }
        }
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
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel textPanel;
    // End of variables declaration//GEN-END:variables
    int cellsWidth = 13;
    int cellsHeight = 10;
    private javax.swing.JPanel[][] mainPanels = new javax.swing.JPanel[cellsWidth][cellsHeight];
    private java.util.Random rnd = new java.util.Random();
    boolean resizeWindow = false;
}
