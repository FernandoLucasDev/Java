class operacao extends ver_saldo {
    ver_saldo operar = new ver_saldo();
    
    double sacar(double valorSaque){
        operar.saldo =  operar.saldo - valorSaque;
        System.out.println("Você sacou " + valorSaque + " reais. O seu novo saldo é de " + operar.saldo + "!");
        return operar.saldo;
    }
    double depositar(double valorDeposito){
        operar.saldo = operar.saldo + valorDeposito;
        System.out.println("Você depositou " + valorDeposito + " reais. O seu novo saldo é de " + operar.saldo + "!");
        return operar.saldo;
    }

}