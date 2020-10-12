package ui;

import helpers.ExecuteAlgorithms;
import io.FileIO;
import java.awt.Color;
import java.util.ArrayList;

public class Menu extends javax.swing.JFrame {
    private Color purpleColor = new Color(54,33,89);
    private Color selectedButtonColor = new Color(85, 65, 118);
    private ArrayList<Object> algorithmElements = new ArrayList<Object>();
    private ArrayList<Object> fileElements = new ArrayList<Object>();
    private ArrayList<Object> statisticsElements = new ArrayList<Object>();

    public Menu() {
        initComponents();
        getContentPane().setBackground(purpleColor);
        btnAlgoritmos.setOpaque(true);
        btnArquivos.setOpaque(true);
        btnEstatisticas.setOpaque(true);
        btnAlgoritmos.setBackground(selectedButtonColor);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAlgoritmos = new javax.swing.JLabel();
        btnEstatisticas = new javax.swing.JLabel();
        btnArquivos = new javax.swing.JLabel();
        pnScreen = new javax.swing.JPanel();
        pnHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnBody = new javax.swing.JPanel();
        lblPage = new javax.swing.JLabel();
        pnAction = new javax.swing.JPanel();
        pnAlgorithm = new javax.swing.JPanel();
        btnExecutar = new javax.swing.JButton();
        pnFile = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnStatistics = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmos de Ordenação");
        setAlwaysOnTop(true);

        pnMenu.setBackground(new java.awt.Color(54, 33, 89));
        pnMenu.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Mono Light for Powerline", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 207, 212));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APS");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        btnAlgoritmos.setBackground(new java.awt.Color(54, 33, 89));
        btnAlgoritmos.setFont(new java.awt.Font("Roboto Mono Light for Powerline", 0, 18)); // NOI18N
        btnAlgoritmos.setForeground(new java.awt.Color(255, 255, 255));
        btnAlgoritmos.setText("Algoritmos");
        btnAlgoritmos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlgoritmos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlgoritmosMouseClicked(evt);
            }
        });

        btnEstatisticas.setBackground(new java.awt.Color(54, 33, 89));
        btnEstatisticas.setFont(new java.awt.Font("Roboto Mono Light for Powerline", 0, 18)); // NOI18N
        btnEstatisticas.setForeground(new java.awt.Color(255, 255, 255));
        btnEstatisticas.setText("Estatísticas");
        btnEstatisticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstatisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstatisticasMouseClicked(evt);
            }
        });

        btnArquivos.setBackground(new java.awt.Color(54, 33, 89));
        btnArquivos.setFont(new java.awt.Font("Roboto Mono Light for Powerline", 0, 18)); // NOI18N
        btnArquivos.setForeground(new java.awt.Color(255, 255, 255));
        btnArquivos.setText("Arquivos");
        btnArquivos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArquivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArquivosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(btnAlgoritmos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstatisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btnArquivos, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlgoritmos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArquivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstatisticas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnScreen.setBackground(new java.awt.Color(255, 254, 249));

        pnHeader.setBackground(new java.awt.Color(255, 254, 249));

        jLabel2.setFont(new java.awt.Font("Roboto Mono Light for Powerline", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Algoritmos de Ordenação");

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnBody.setForeground(new java.awt.Color(122, 72, 221));

        lblPage.setBackground(new java.awt.Color(169, 144, 225));
        lblPage.setFont(new java.awt.Font("Roboto Mono Light for Powerline", 1, 24)); // NOI18N
        lblPage.setForeground(new java.awt.Color(54, 33, 89));
        lblPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPage.setText("Execução dos Algoritmos");

        javax.swing.GroupLayout pnBodyLayout = new javax.swing.GroupLayout(pnBody);
        pnBody.setLayout(pnBodyLayout);
        pnBodyLayout.setHorizontalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBodyLayout.setVerticalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        pnAction.setBackground(new java.awt.Color(250, 250, 250));
        pnAction.setPreferredSize(new java.awt.Dimension(290, 290));
        pnAction.setLayout(new java.awt.CardLayout());

        pnAlgorithm.setBackground(new java.awt.Color(250, 250, 250));

        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAlgorithmLayout = new javax.swing.GroupLayout(pnAlgorithm);
        pnAlgorithm.setLayout(pnAlgorithmLayout);
        pnAlgorithmLayout.setHorizontalGroup(
            pnAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        pnAlgorithmLayout.setVerticalGroup(
            pnAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlgorithmLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pnAction.add(pnAlgorithm, "card2");

        pnFile.setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jButton1.setText("Criar os arquivos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alterar o valor dos Arquivos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnFileLayout = new javax.swing.GroupLayout(pnFile);
        pnFile.setLayout(pnFileLayout);
        pnFileLayout.setHorizontalGroup(
            pnFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnFileLayout.setVerticalGroup(
            pnFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFileLayout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pnAction.add(pnFile, "card3");

        pnStatistics.setBackground(new java.awt.Color(250, 250, 250));

        jLabel5.setText("Estatísticas");

        javax.swing.GroupLayout pnStatisticsLayout = new javax.swing.GroupLayout(pnStatistics);
        pnStatistics.setLayout(pnStatisticsLayout);
        pnStatisticsLayout.setHorizontalGroup(
            pnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatisticsLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel5)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        pnStatisticsLayout.setVerticalGroup(
            pnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatisticsLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel5)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pnAction.add(pnStatistics, "card4");

        javax.swing.GroupLayout pnScreenLayout = new javax.swing.GroupLayout(pnScreen);
        pnScreen.setLayout(pnScreenLayout);
        pnScreenLayout.setHorizontalGroup(
            pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnScreenLayout.setVerticalGroup(
            pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnScreenLayout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlgoritmosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlgoritmosMouseClicked
        // TODO add your handling code here:
        btnAlgoritmos.setBackground(selectedButtonColor);
        lblPage.setText("Execução dos Algoritmos");
        btnArquivos.setBackground(purpleColor);
        btnEstatisticas.setBackground(purpleColor);
        pnAlgorithm.setVisible(true);
        pnFile.setVisible(false);
        pnStatistics.setVisible(false);
    }//GEN-LAST:event_btnAlgoritmosMouseClicked

    private void btnArquivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArquivosMouseClicked
        // TODO add your handling code here:
        btnAlgoritmos.setBackground(purpleColor);
        btnArquivos.setBackground(selectedButtonColor);
        lblPage.setText("Criação dos Arquivos");
        btnEstatisticas.setBackground(purpleColor);
        pnAlgorithm.setVisible(false);
        pnFile.setVisible(true);
        pnStatistics.setVisible(false);
    }//GEN-LAST:event_btnArquivosMouseClicked

    private void btnEstatisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticasMouseClicked
        // TODO add your handling code here:
        btnAlgoritmos.setBackground(purpleColor);
        btnArquivos.setBackground(purpleColor);
        btnEstatisticas.setBackground(selectedButtonColor);
        lblPage.setText("Exibição das Estatísticas");
        pnAlgorithm.setVisible(false);
        pnFile.setVisible(false);
        pnStatistics.setVisible(true);
    }//GEN-LAST:event_btnEstatisticasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FileIO(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new FileIO(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        // TODO add your handling code here:
        ExecuteAlgorithms execute = new ExecuteAlgorithms();
    }//GEN-LAST:event_btnExecutarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAlgoritmos;
    private javax.swing.JLabel btnArquivos;
    private javax.swing.JLabel btnEstatisticas;
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPage;
    private javax.swing.JPanel pnAction;
    private javax.swing.JPanel pnAlgorithm;
    private javax.swing.JPanel pnBody;
    private javax.swing.JPanel pnFile;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnScreen;
    private javax.swing.JPanel pnStatistics;
    // End of variables declaration//GEN-END:variables
}
