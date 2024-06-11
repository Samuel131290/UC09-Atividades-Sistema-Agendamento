package telas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ListaPacientes;
import model.Pacientes;

public class Inicial extends javax.swing.JFrame 
{
    //Métodos
    private final String[] tableColumns = {"Paciente", "CPF", "Telefone", "Data da Consulta", "Já é Paciente?", "Consulta Realizada?"};
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    private List<Pacientes> listaPacientes = ListaPacientes.Listar(); 
   
    public Inicial() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boasVindas = new javax.swing.JLabel();
        jTabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        nConsultaBtn = new javax.swing.JButton();
        eConsultaBtn = new javax.swing.JButton();
        ffConsultaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        boasVindas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boasVindas.setForeground(new java.awt.Color(102, 102, 102));
        boasVindas.setText("Boas Vindas ao Sistema de Agendamento");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data da Consulta", "Já é Paciente?", "Consulta Realizada?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTabela.setViewportView(tabela);

        nConsultaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nConsultaBtn.setForeground(new java.awt.Color(102, 102, 102));
        nConsultaBtn.setText("Nova Consulta");
        nConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nConsultaBtnActionPerformed(evt);
            }
        });

        eConsultaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eConsultaBtn.setForeground(new java.awt.Color(102, 102, 102));
        eConsultaBtn.setText("Excluir Consulta");
        eConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eConsultaBtnActionPerformed(evt);
            }
        });

        ffConsultaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ffConsultaBtn.setForeground(new java.awt.Color(102, 102, 102));
        ffConsultaBtn.setText("Finalizar Consulta");
        ffConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffConsultaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabela)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(eConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ffConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 435, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ffConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nConsultaBtnActionPerformed
    NovaConsulta telanConsulta = new NovaConsulta();
    telanConsulta.setVisible(true);
    dispose();
    }//GEN-LAST:event_nConsultaBtnActionPerformed

    private void eConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eConsultaBtnActionPerformed
    excluirTabela(getPosicaoPaciente());
    }//GEN-LAST:event_eConsultaBtnActionPerformed

    private void ffConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffConsultaBtnActionPerformed
        int posPaciente = getPosicaoPaciente();
        if (posPaciente >= 0) 
        {
            Pacientes paciente = ListaPacientes.Listar().get(posPaciente);
            FinalizarConsulta telaFinalizarConsulta = new FinalizarConsulta();
            telaFinalizarConsulta.setConsultaRealizada(paciente.getConsultaRealizada());
            telaFinalizarConsulta.setReceitaObservacoes(paciente.getReceitaObservacoes());
            telaFinalizarConsulta.setPosicaoPaciente(posPaciente); // Envia a posição do paciente no array, após clicar em "Finalizar"
            telaFinalizarConsulta.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ffConsultaBtnActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    atualizarTabela();
    }//GEN-LAST:event_formWindowGainedFocus
     public static void main(String args[]) 
     {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boasVindas;
    private javax.swing.JButton eConsultaBtn;
    private javax.swing.JButton ffConsultaBtn;
    private javax.swing.JScrollPane jTabela;
    private javax.swing.JButton nConsultaBtn;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JTextField nPacienteTf;
    private javax.swing.JTextField telefoneTf;
    private javax.swing.JTextField cpfTf;
    private javax.swing.JTextField dataTf;
    private javax.swing.JTextField jaPaciente;
    
    public void atualizarTabela()
    {   
        if (!listaPacientes.isEmpty())
        {
            Pacientes paciente;
            tableModel = new DefaultTableModel(tableColumns, 0);
            for (int i = 0; i < listaPacientes.size(); i++) 
            {
                paciente = listaPacientes.get(i);
                String pacienteGrid = "Não";
                if(paciente.getJaPaciente())
                {
                    pacienteGrid = "Sim";
                }
                
                String consultaGrid = "Não Realizada";
                if(paciente.getConsultaRealizada())
                {
                    consultaGrid = "Já Realizada";
                }
                String[] rowData = {paciente.getNome(), String.valueOf(paciente.getCPF()), String.valueOf(paciente.getTelefone()), String.valueOf(paciente.getdataConsulta()), pacienteGrid, consultaGrid};
                tableModel.addRow(rowData);
            }
            tabela.setModel(tableModel);
        }
        else
        {
            tableModel = new DefaultTableModel(tableColumns, 0);
            tabela.setModel(tableModel);
        } 
    } 
  
    private int getPosicaoPaciente()
    {
        int posPaciente = tabela.getSelectedRow();
        if(posPaciente == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Selecione um paciente!!");
        }
        return posPaciente;
    }
  
    private void excluirTabela(int posPaciente) 
    {
        if (posPaciente >= 0) 
        {
            String[] options = { "Sim", "Não" };
            int deletar = JOptionPane.showOptionDialog
            (
                rootPane,
                "Tem certeza que deseja excluir?",
                "Exclusão de paciente",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
            );
            if (deletar == 0) 
            {
                ListaPacientes.Remover(posPaciente);
                atualizarTabela();
            } 
            else
            {   
                tabela.clearSelection();
            }
        }
    }
}              
