package Media_Aluno;

import java.util.*;

public class Media_Aluno {

	public static void main(String[] args) {
				
				Scanner in = new Scanner(System.in); // Uma Variavel do tipo Scanner.
				
				System.out.print(" Digite a primeira nota por favor: ");
				double nota1 = in.nextDouble();
				System.out.print(" Digite a segunda nota por favor: ");
				double nota2 = in.nextDouble();
				System.out.print(" Digite a terceira nota por favor: ");
				double nota3 = in.nextDouble();
				System.out.print(" Digite a quarta nota por favor: ");
				double nota4 = in.nextDouble();
				
				double media = (nota1 +nota2 + nota3 + nota4)/4;
				System.out.println(" A média de todas as notas é: " + media);
				
				if(media <= 30){
					System.out.println(" REPROVADO DIRETO.");
				}else if(media <= 69 && media > 30) {
					System.out.println(" Está em Recuperação.");
				}else {
					System.out.println(" PARABÉNS APROVADO");
				}		
	}
}
