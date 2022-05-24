import java.util.Scanner;

class contaBancaria {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int escolha, continuar;
        continuar = 1;
        
            System.out.println("Bem vindo ao seu banco digital! \n\n");
            System.out.println("Escolha uma das opções: \n 1 para ver saldo \n 2 para sacar \n 3 para depositar");
            escolha = scanf.nextInt();

            switch(escolha){
                case 1:
                    ver_saldo exibir = new ver_saldo();
                    exibir.exibirSaldo();
                    break;
                case 2:
                    operacao Sacar = new operacao();
                    System.out.println("qual valor deseja sacar?");
                    Sacar.sacar(scanf.nextDouble());
                    break;
                case 3:
                    operacao depositar = new operacao();
                    System.out.println("qual valor deseja depositar?");
                    depositar.depositar(scanf.nextDouble());   
            }
            System.out.println("\n Obrigado por usar o seu banco digital!");
            

}
}