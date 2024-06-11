package model;
import java.time.LocalDate;

public class Pacientes 
{
    private String nome;
    private int telefone;
    private long cpf;
    private LocalDate dataConsulta;
    private boolean jaPaciente;
    private boolean consultaRealizada;
    private String receitaObservacoes;
      
    /**
    * @return the nome
    */
    public String getNome() 
    {
        return nome;
    }
      
    /**
    * @param nome the nome to set
    */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
    * @return the telefone
    */ 
    public Integer getTelefone() 
    {
        return telefone;
    }
      
    /**
    * @param telefone the telefone to set
    */
    public void setTelefone(Integer telefone) 
    {
        this.telefone = telefone;
    }

    /**
    * @return the cpf
    */
    public Long getCPF() 
    {
        return cpf;
    }

    /**
    * @param cpf the cpf to set
    */
    public void setCPF(Long cpf) 
    {
        this.cpf = cpf;
    }
      
    /**
    * @return the dataConsulta
    */
    public LocalDate getdataConsulta() 
    {
        return dataConsulta;
    }
      
    /**
    * @param dataConsulta the dataConsulta to set
    */ 
    public void setdataConsulta(LocalDate dataConsulta) 
    {
        this.dataConsulta = dataConsulta;
    }
      
    /**
    * @return the jaPaciente
    */
    public boolean getJaPaciente() 
    {
        return jaPaciente;
    }
      
    /**
    * @param jaPaciente the jaPaciente to set
    */ 
    public void setJaPaciente(boolean jaPaciente) 
    {
        this.jaPaciente = jaPaciente;
    }

    /**
    * @return the consultaRealizada
    */
    public boolean getConsultaRealizada() 
    {
        return consultaRealizada;
    }
      
    /**
    * @param consultaRealizada the consultaRealizada to set
    */ 
    public void setConsultaRealizada(boolean consultaRealizada) 
    {
        this.consultaRealizada = consultaRealizada;
    }
        
    /**
    * @return the receitaObservacoes
    */
    public String getReceitaObservacoes() 
    {
        return receitaObservacoes;
    }

    /**
    * @param receitaObservacoes the receitaObservacoes to set
    */ 
    public void setReceitaObservacoes(String receitaObservacoes) 
    {
        this.receitaObservacoes = receitaObservacoes;
    }
    
    
    
    
    
    
    
    
    
    
    
}
