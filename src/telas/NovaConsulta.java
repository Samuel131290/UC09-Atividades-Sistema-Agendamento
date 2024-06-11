package telas;
import javax.swing.JOptionPane;
import model.Pacientes;
import model.ListaPacientes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class NovaConsulta extends javax.swing.JFrame 
{
    public NovaConsulta() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarConsulta = new javax.swing.JLabel();
        nomePaciente = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        dataConsulta = new javax.swing.JLabel();
        nPacienteTf = new javax.swing.JTextField();
        telefoneTf = new javax.swing.JTextField();
        cpfTf = new javax.swing.JTextField();
        dataTf = new javax.swing.JTextField();
        jaPacienteCbx = new javax.swing.JCheckBox();
        cConsultaBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        cadastrarConsulta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cadastrarConsulta.setForeground(new java.awt.Color(102, 102, 102));
        cadastrarConsulta.setText("Cadastrar Consulta");

        nomePaciente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomePaciente.setForeground(new java.awt.Color(102, 102, 102));
        nomePaciente.setText("Nome do(a) Paciente:");

        telefone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telefone.setForeground(new java.awt.Color(102, 102, 102));
        telefone.setText("Telefone:");

        cpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cpf.setForeground(new java.awt.Color(102, 102, 102));
        cpf.setText("CPF:");

        dataConsulta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dataConsulta.setForeground(new java.awt.Color(102, 102, 102));
        dataConsulta.setText("Data da Consulta:");

        nPacienteTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nPacienteTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPacienteTfActionPerformed(evt);
            }
        });

        telefoneTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telefoneTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTfActionPerformed(evt);
            }
        });

        cpfTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTfActionPerformed(evt);
            }
        });

        dataTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dataTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTfActionPerformed(evt);
            }
        });

        jaPacienteCbx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jaPacienteCbx.setForeground(new java.awt.Color(102, 102, 102));
        jaPacienteCbx.setText(" Já é Paciente");
        jaPacienteCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaPacienteCbxActionPerformed(evt);
            }
        });

        cConsultaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cConsultaBtn.setForeground(new java.awt.Color(102, 102, 102));
        cConsultaBtn.setText("Cadastrar");
        cConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cConsultaBtnActionPerformed(evt);
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
                    .addComponent(cadastrarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nPacienteTf))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(dataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dataTf))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cpfTf))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(telefoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jaPacienteCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nPacienteTf, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneTf, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfTf, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(dataTf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jaPacienteCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        dataConsulta.getAccessibleContext().setAccessibleDescription("dd-mm-aaaa");
        cpfTf.getAccessibleContext().setAccessibleDescription("Informe apenas números");
        dataTf.getAccessibleContext().setAccessibleName("");
        dataTf.getAccessibleContext().setAccessibleDescription("dd-mm-aaaa");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nPacienteTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPacienteTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPacienteTfActionPerformed

    private void telefoneTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneTfActionPerformed

    private void cpfTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTfActionPerformed

    private void dataTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTfActionPerformed

    private void cConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cConsultaBtnActionPerformed
    if(!validFields())
    {
        inserirPaciente(getPacientes());
        nPacienteTf.setText("");
        cpfTf.setText("");
        telefoneTf.setText("");
        dataTf.setText("");
        nPacienteTf.requestFocus(); 
        JOptionPane.showMessageDialog(rootPane, "Paciente cadastrado com SUCESSO!");
        Inicial telanInicial = new Inicial();
        telanInicial.setVisible(true);
    }


    }//GEN-LAST:event_cConsultaBtnActionPerformed
    private boolean validFields()
    {
        boolean empty = true; 
        if (nPacienteTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O campo 'Nome do(a) Paciente' não pode ser vazio.");
        } 
        else if (isNumeric(nPacienteTf.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O campo 'Nome do(a) Paciente' não pode ser um valor numérico.");
        }
        else if(telefoneTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O campo 'Telefone' não pode ser vazio.");
        } 
        else if (!isValidTelefone(telefoneTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O campo 'Telefone' deve ter 9 dígitos.");
        }
        else if (cpfTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O campo 'CPF' não pode ser vazio.");
        }
        else if (!isValidCPF(cpfTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O campo 'CPF' deve ter 11 dígitos.");
        } 
        else if(dataTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O campo 'Data da Consulta' não pode ser vazio.");
        }
        else if (!isValidDateFormat(dataTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O campo 'Data da Consulta' deve estar no formato dd-mm-aaaa.");
        }  
        else
        {
         empty = false;
        }
        return empty;
    }
    
    private boolean isNumeric(String str) 
    {
        return str.matches("\\d+");
    }
    
    private boolean isValidTelefone(String telefone) 
    {
        return telefone.matches("\\d{9}");
    }
    
    private boolean isValidCPF(String cpf) 
    {
        return cpf.matches("\\d{11}");
    }
    
    private boolean isValidDateFormat(String input) 
    {
    try 
        {
            LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            return true;  // A data está no formato correto.
        }
    catch (DateTimeParseException e) 
        {
            return false; // A data não está no formato correto.
        }
    }
    
    private Pacientes getPacientes()
    {
        Pacientes paciente = new Pacientes();
        paciente.setNome(nPacienteTf.getText().toUpperCase());
        paciente.setCPF(Long.parseLong(cpfTf.getText()));
        paciente.setTelefone(Integer.parseInt(telefoneTf.getText()));
        try 
        {
            // Utiliza o formato desejado para converter a string em LocalDate.
            LocalDate dataConsulta = LocalDate.parse(dataTf.getText(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            paciente.setdataConsulta(dataConsulta);
        } 
        catch (DateTimeParseException e) 
        {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data da Consulta inválida.");
            return null;
        }
        
        if(jaPacienteCbx.isSelected())
        {
            paciente.setJaPaciente(true);
        }
        else
        {
            paciente.setJaPaciente(false);
        } 
        return paciente;    
    }

    private void inserirPaciente(Pacientes paciente) 
    {
        paciente.setConsultaRealizada(false);
        paciente.setReceitaObservacoes(null);

        ListaPacientes.Adicionar(paciente);
        dispose();
    }
    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
    Inicial telanInicial = new Inicial();
    telanInicial.setVisible(true);
    dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jaPacienteCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaPacienteCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jaPacienteCbxActionPerformed
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
    private javax.swing.JButton cConsultaBtn;
    private javax.swing.JLabel cadastrarConsulta;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpfTf;
    private javax.swing.JLabel dataConsulta;
    private javax.swing.JTextField dataTf;
    private javax.swing.JCheckBox jaPacienteCbx;
    private javax.swing.JTextField nPacienteTf;
    private javax.swing.JLabel nomePaciente;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField telefoneTf;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
