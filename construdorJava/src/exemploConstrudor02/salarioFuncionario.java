/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploConstrudor02;

/**
 *
 * @author 20222TPMI0035
 */
public class salarioFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario meuSalario = new Funcionario();
        
        
        InOut.MsgDeInforma("CPF:", Double.toString(meuSalario.cpf));
        InOut.MsgDeInforma("Nome: ", meuSalario.nome);
        InOut.MsgDeInforma("Horas Trabalhadas", Double.toString(meuSalario.horasTrab));
        InOut.MsgDeInforma("Horas Extras: ", Double.toString(meuSalario.horExt));
        InOut.MsgDeInforma("Salário: ", Double.toString(meuSalario.calculaSalario()));
        
        
        
        
        
        
    
    }
    
}
