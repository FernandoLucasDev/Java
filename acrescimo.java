import java.util.Scanner;
class teste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double horas;
        double dias; 
        double w; 
        Float tarifa;
        System.out.println("Informe o período em horas que o aparelho fica ligado: ");
        horas = leia.nextDouble();
        System.out.println("Informe o período em dias que o aparelho fica ligado: ");
        dias = leia.nextDouble();
        System.out.println("Informe a potência em Watts do aparelho: ");
        w = leia.nextDouble();
        System.out.println("Iforme a tarífa de sua fornecedora de  energia: ");
        tarifa = leia.nextFloat();
        System.out.println("O aparelho acrescenta em Reais: R$:" + (horas*dias*(w/1000)*tarifa/30));
    }
}
