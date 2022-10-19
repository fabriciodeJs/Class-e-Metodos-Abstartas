package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Pessoa> list = new ArrayList<>();

		System.out.printf("Entre com os numero dos Pagadores: ");
		int loop = sc.nextInt();

		for (int i = 1; i <= loop; i++) {
			System.out.println("DADOS DO PAGADOR #" + i);
			System.out.printf("Pessoa FISICA ou JURIDICA (F/J): ");
			char tipoDePessoa = sc.next().charAt(0);
			System.out.printf("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.printf("Renda Anual: ");
			double renda = sc.nextDouble();
			if (tipoDePessoa == 'f') {
				System.out.printf("Dispesas Medicas: ");
				double dispesas = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, dispesas));
			} else {
				System.out.printf("Quantidade de Fucionarios: ");
				int fucionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, renda, fucionarios));
			}
		}

		double soma = 0;
		System.out.println("");
		System.out.println("TAXAS PAGAS: ");
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + " $ " + String.format("%.2f", pessoa.taxa()));
			soma += pessoa.taxa();
		}

		System.out.println("");
		System.out.println(String.format("%.2f", soma));

		sc.close();
	}

}
