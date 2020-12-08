package ed2.projeto.algoritmosordenacao;

import java.util.Scanner;
import java.util.Timer;

public class Principal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int entrada = 1;
        
		while (entrada > 0) {
			System.out.println("\n------\nEscolha um dos algoritmos de ordenação:");
			System.out.println("1 - Bubble Sort");
			System.out.println("2 - Insertion Sort");
			System.out.println("3 - Merge Sort");
			System.out.println("4 - Quick Sort");
			System.out.println("5 - Selection Sort");
			
			// Entrada do usuario
			System.out.print("NUMERO: ");
			try {
				entrada = sc.nextInt();
				executar(entrada);
			} catch(Exception e) {
				System.out.println("Entrada inválida.");
				entrada = 0;
			}
		}
	}

	// Executa a ordenação selecionada
	public static void executar(int numero) {
		// Primeiro geramos um array, usando a classe Utils
		int[] numeros = Utils.gerarVetor(10, 20);
		System.out.println("\nNumeros Gerados:");
		Utils.imprimirVetor(numeros); // classe Utils tbm
		
		switch (numero) {
			case 1: // Bubble Sort
				BubbleSort bubble = new BubbleSort();
				bubble.ordenarVetor(numeros); // <- Ordena
				break;
			case 2: // Insertion Sort
				InsertionSort insertion = new InsertionSort();				
				insertion.ordenarVetor(numeros); // <- Ordena
				break;
			case 3: // Merge Sort
				MergeSort merge = new MergeSort();				
				merge.ordenarVetor(numeros); // <- Ordena
				break;
			case 4: // Quick Sort
				QuickSort quick = new QuickSort();				
				quick.ordenarVetor(numeros); // <- Ordena
				break;
			case 5: // Selection Sort
				SelectionSort selection = new SelectionSort();				
				selection.ordenarVetor(numeros); // <- Ordena
				break;
		}
		
		System.out.println("\nNumeros Ordenados:");
		Utils.imprimirVetor(numeros); // Imprime novamente para exibir ordenado...
//
//		Timer timer = new Timer();
//		try {
//			timer.wait(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}
