package principal;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		/*
		 1 = voto em Gabriel 2 = voto em Maiara 3 = voto em Carlos 4 =
		 * voto em Janaina 5 = voto em Lucas
		 */	
		int votosGabriel = 1;
		int votosMaiara = 2;
		int votosCarlos = 3;
		int votosJanaina = 4;
		int votosLucas = 5;
		
		Random random = new Random();

		int votos[] = new int[1000];
			
		for (int i = 0; i < votos.length; i++)	{
			votos[i] = random.nextInt(5) + 1;
		   
		   if (votos[i] == 1) {
			   votosGabriel += 1;		   
		   } else if (votos[i] == 2) {
			   votosMaiara += 1;
		   } else if (votos[i] == 3) {
			   votosCarlos += 1;
		   } else if (votos[i] == 4) {
			   votosJanaina += 1;
		   } else if (votos[i] == 5) {
			   votosLucas += 1;
		   }				   		   		   				
			}
		
		System.out.println("Votos para Gabriel: " + votosGabriel);
		System.out.println("Votos para Maiara: " + votosMaiara);
		System.out.println("Votos para Carlos: " + votosCarlos);
		System.out.println("Votos para Janaina: " + votosJanaina);
		System.out.println("Votos para Lucas: " + votosLucas);
		
		if (votosGabriel > votosMaiara && votosGabriel > votosCarlos && votosGabriel > votosJanaina && votosGabriel > votosLucas) {
			System.out.println("Gabriel foi o vencedor da eleição com " + votosGabriel + " votos");
		} else if (votosMaiara > votosGabriel && votosMaiara > votosCarlos && votosMaiara > votosJanaina && votosMaiara > votosLucas) {
			System.out.println("Maiara foi a vencedora da eleição com " + votosMaiara + " votos");
		} else if (votosCarlos > votosGabriel && votosCarlos > votosMaiara && votosCarlos > votosJanaina && votosCarlos > votosLucas) {
			System.out.println("Carlos foi o vencedor da eleição com " + votosCarlos + " votos");
		} else if (votosJanaina > votosGabriel && votosJanaina > votosMaiara && votosJanaina > votosCarlos && votosJanaina > votosLucas) {
			System.out.println("Janaina foi a vencedora da eleição com " + votosJanaina + " votos");
		} else {
			System.out.println("Lucas foi o vencedor da eleição com " + votosLucas + " votos");
		}
		
		}
	}

