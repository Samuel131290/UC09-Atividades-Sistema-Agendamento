package model;
import java.util.ArrayList;
import java.util.List;

public class ListaPacientes
{
    private static final List<Pacientes> lista = new ArrayList<>(); // Cria um lista vazia para armazenar os paciente.
      
    public static List<Pacientes> Listar() 
    {
        return lista;
    }
      
    public static void Adicionar(Pacientes paciente) // Adiciona os pacientes e retorna para a lista.
    {
            lista.add(paciente);
    } 
      
    public static void Remover(int index) // Remove os paciente da lista, de acordo com o index.
    {
        if (index >= 0 && index < lista.size()) 
        {
            lista.remove(index);
        }
    }
}
