/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploContrudor03;

/**
 *
 * @author 20222TPMI0035
 */
public class ContaBancaria {
   int numeroConta;
   int agencia;
   String cliente;
   double saldo;
   double chequeEspecial;
   double retirada;
   double deposito;
   
   ContaBancaria(){
       numeroConta = InOut.leInt("Informe o número da conta; ");
       agencia = InOut.leInt("Informe a agência bancária: ");
       cliente= InOut.leString("Informe o nome do cliente: ");
       saldo = InOut.leDouble("Informe o saldo: ");
       chequeEspecial =InOut.leDouble("Informe o cheque Especial: ");
       retirada = InOut.leDouble("Informe a retirada: ");
       deposito = InOut.leDouble("Informe o depósito: ");
       
    }
   public double calculaDeposito(){
       return saldo = saldo + deposito;  
   }
   public boolean VerificaSaldo(){
       double saldche = saldo + chequeEspecial;
       if(retirada<=saldo){
           return true;     
       }else if(retirada<= saldche){
           return true;
       }else{
           return false;
       }
   }
   public double calculaSaque(){
      double saldche = saldo + chequeEspecial;
      double saldoSaque=0;
       if(retirada<=saldo){
           saldoSaque = saldo - retirada;
           return saldoSaque;     
       }else if(retirada<= saldche){
           saldoSaque = saldo - retirada;
           saldoSaque = chequeEspecial - saldoSaque;
           return saldoSaque; 
       }else{
           return saldoSaque;
       }
   }
  
  
 
    
}
