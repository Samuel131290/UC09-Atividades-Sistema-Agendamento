package telas;
import model.Pacientes;
import model.ListaPacientes;

public class FinalizarConsulta extends javax.swing.JFrame
{
    private int posPaciente;
    public FinalizarConsulta() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalhesConsulta = new javax.swing.JLabel();
        cRealizadaCbx = new javax.swing.JCheckBox();
        receitaObservacoes = new javax.swing.JLabel();
        receitaObservacoesTf = new javax.swing.JTextField();
        fConsultaBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        detalhesConsulta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        detalhesConsulta.setForeground(new java.awt.Color(102, 102, 102));
        detalhesConsulta.setText("Detalhes da Consulta");

        cRealizadaCbx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cRealizadaCbx.setForeground(new java.awt.Color(102, 102, 102));
        cRealizadaCbx.setText(" Consulta Realizada");
        cRealizadaCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRealizadaCbxActionPerformed(evt);
            }
        });

        receitaObservacoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        receitaObservacoes.setForeground(new java.awt.Color(102, 102, 102));
        receitaObservacoes.setText("Receita e Observações");
        receitaObservacoes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        receitaObservacoesTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receitaObservacoesTfActionPerformed(evt);
            }
        });

        fConsultaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fConsultaBtn.setForeground(new java.awt.Color(102, 102, 102));
        fConsultaBtn.setText("Finalizar");
        fConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fConsultaBtnActionPerformed(evt);
            }
        });

        voltarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltarBtn.setForeground(new java.awt.Color(102, 102, 102));
        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receitaObservacoesTf)
                    .addComponent(detalhesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receitaObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cRealizadaCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detalhesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRealizadaCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receitaObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(receitaObservacoesTf, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fConsultaBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fConsultaBtnActionPerformed
        if (posPaciente >= 0) 
        {
            Pacientes paciente = ListaPacientes.Listar().get(posPaciente);
            if (cRealizadaCbx.isSelected())
            {
                paciente.setConsultaRealizada(true);
            }
            else
            {
                paciente.setConsultaRealizada(false);
            }
            paciente.setReceitaObservacoes(receitaObservacoesTf.getText());
            Inicial telanInicial = new Inicial();
            telanInicial.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_fConsultaBtnActionPerformed

    private void receitaObservacoesTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receitaObservacoesTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receitaObservacoesTfActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
    Inicial telanInicial = new Inicial();
    telanInicial.setVisible(true);
    dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void cRealizadaCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRealizadaCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRealizadaCbxActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new NovaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cRealizadaCbx;
    private javax.swing.JLabel detalhesConsulta;
    private javax.swing.JButton fConsultaBtn;
    private javax.swing.JLabel receitaObservacoes;
    private javax.swing.JTextField receitaObservacoesTf;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
    public boolean isConsultaRealizada() 
    {
        return cRealizadaCbx.isSelected();
    }

    public void setConsultaRealizada(boolean consultaRealizada) 
    {
        cRealizadaCbx.setSelected(consultaRealizada);
    }

    public String getReceitaObservacoes() 
    {
        return receitaObservacoesTf.getText();
    }

    public void setReceitaObservacoes(String observacoes) 
    {
        receitaObservacoesTf.setText(observacoes);
    }
    
    public void setPosicaoPaciente(int posPaciente) 
    {
        this.posPaciente = posPaciente;
    }
}
