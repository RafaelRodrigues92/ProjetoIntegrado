package projeto;

import java.util.Scanner;

public class Cadastro {
	
		private String nome;
		private String identidadeGenero;
		private String orientacaoSexual;
		private String etnia;
		private double salario;
		
		Scanner entradaUsuario = new Scanner(System.in);
		
		
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getIdentidadeGenero() {
			return identidadeGenero;
		}
		
		public void setIdentidadeGenero(String identidadeGenero) {
			this.identidadeGenero = identidadeGenero;
		}

		public String getOrientacaoSexual() {
			return orientacaoSexual;
		}

		public void setOrientacaoSexual(String orientacaoSexual) {
			this.orientacaoSexual = orientacaoSexual;
		}

		public String getEtnia() {
			return etnia;
		}

		public void setEtnia(String etnia) {
			this.etnia = etnia;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		void imprimir(){
			System.out.println("Digite seu Nome: ");
			String nome = entradaUsuario.nextLine();
			//entradaUsuario.nextLine();
			System.out.println("Com qual genero você se identifica: ");
			String identidadeGenero = entradaUsuario.nextLine();
			//entradaUsuario.nextLine();
			System.out.println("Qual a sua orientação sexual: ");
			String orientacaoSexual = entradaUsuario.nextLine();
			//entradaUsuario.nextLine();
			System.out.println("Qual a sua etnia: ");
			String etnia = entradaUsuario.nextLine();
			//entradaUsuario.nextLine();
			System.out.println("Qual o seu salário: ");
			double salario = entradaUsuario.nextDouble();
			System.out.println("O Usuario "+nome+", que se identifica como "+identidadeGenero+
					". Sua orientação é: "+orientacaoSexual+", sua entia: "+etnia+". Com salario de: "+salario);
			}
			}