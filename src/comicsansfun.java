import java.util.Random;

public class comicsansfun extends javax.swing.JFrame {
     
    Random R=new Random();
    int mys;
    int guess;
    int count=1;
    
    public comicsansfun() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mysButton = new javax.swing.JButton();
        guessText = new javax.swing.JTextField();
        responseInfo = new javax.swing.JLabel();
        guessButton = new javax.swing.JButton();
        thanksInfo = new javax.swing.JLabel();
        endgameButton = new javax.swing.JButton();
        titleInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mysButton.setText("Click to pick a mystery number");
        mysButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysButtonActionPerformed(evt);
            }
        });

        guessText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessText.setText("Enter a guess from 1-100");
        guessText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessTextActionPerformed(evt);
            }
        });

        responseInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        responseInfo.setText(" ");

        guessButton.setText("Check guess #1");
        guessButton.setToolTipText("");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        thanksInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thanksInfo.setText(" ");

        endgameButton.setText("End game");
        endgameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endgameButtonActionPerformed(evt);
            }
        });

        titleInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleInfo.setText("The Guessing Game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(thanksInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(endgameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guessText)
                            .addComponent(mysButton, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(responseInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleInfo)
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mysButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guessText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(responseInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endgameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thanksInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysButtonActionPerformed

        mys=R.nextInt(100)+1;
        mysButton.setEnabled(false);
    }//GEN-LAST:event_mysButtonActionPerformed

    private void guessTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessTextActionPerformed

    }//GEN-LAST:event_guessTextActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        count=count+1;
        guessButton.setText("Check guess #"+count);   
        
        guess = Integer.parseInt(guessText.getText());
               if (guess==mys){
                   responseInfo.setText("Got it! Pick a mystery number to play again.");
                   count=1;
                   guessButton.setText("Check guess #"+count); 
                   mysButton.setEnabled(true);
               }
               else if(guess>mys){
                   responseInfo.setText("Too high!");
               }
               else{
                   responseInfo.setText("Too low!");
               }
    }//GEN-LAST:event_guessButtonActionPerformed

    private void endgameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endgameButtonActionPerformed
        mysButton.setEnabled(false);
        guessText.setEnabled(false);
        guessButton.setEnabled(false);
        endgameButton.setEnabled(false);
        responseInfo.setEnabled(false);
        thanksInfo.setText("Thanks for playing!");
    }//GEN-LAST:event_endgameButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comicsansfun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endgameButton;
    private javax.swing.JButton guessButton;
    private javax.swing.JTextField guessText;
    private javax.swing.JButton mysButton;
    private javax.swing.JLabel responseInfo;
    private javax.swing.JLabel thanksInfo;
    private javax.swing.JLabel titleInfo;
    // End of variables declaration//GEN-END:variables
}
