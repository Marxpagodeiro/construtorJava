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
public class Funcionario {
    int cpf;
    String nome;
    double horasTrab;
    double valorHora;
    double horExt;
    Funcionario(){
        cpf = InOut.leInt("Informe o cpf: ");
        nome = InOut.leString("Informe o nome: ");
        horasTrab = InOut.leDouble("Informe Horas Trabalhadas: ");
        valorHora = InOut.leDouble("Informe valor hora: ");
        horExt = InOut.leDouble("Informe hora extra: ");
    }
     
    public double calculaSalario(){
        return valorHora*(horasTrab+ horExt);
        
    }
    
}
