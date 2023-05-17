package com.vidiri.library;

import java.util.ArrayList;
import java.util.Scanner;

import com.vidiri.library.objects.Item;

public class Main {

	ArrayList<Item> objetosDaLista = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Master lista telefonica by IFBirds");
		while(true) {
			ShowMenu();
			int selectedOption = GetMenuOption();
			switch (selectedOption) {
				case 1: {
					System.out.println("Opção 1.");
					listarTelefones();
					break;
				}
				case 2: {
					System.out.println("Opção 2.");
					cadastrarTelefone();
					break;
				}
				case 3: {
					System.out.println("Opção 3.");
					editarTelefone();
					break;
				}
				case 4: {
					System.out.println("Opção 4.");
					removerTelefone();
					break;
				}
				case 5: {
					System.out.println("Opção 5.");
					procurarTelefone();
					break;
				}
				case 6: {
					break;
				}
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}		
	}

	private static void procurarTelefone() {
		// TODO Auto-generated method stub
		
	}

	private static void removerTelefone() {
		// TODO Auto-generated method stub
		
	}

	private static void editarTelefone() {
		// TODO Auto-generated method stub
		
	}

	private static void cadastrarTelefone() {
		// TODO Auto-generated method stub
		
	}

	private static void listarTelefones() {
		// TODO Auto-generated method stub
		
	}

	private static void ShowMenu() {
		System.out.println("Por favor selecione uma das opções");
		System.out.println("1 - Listar");
		System.out.println("2 - Cadastrar");
		System.out.println("3 - Editar");
		System.out.println("4 - Remover");
		System.out.println("5 - Procurar");
	}
	
	private static int GetMenuOption(){
		Scanner scanner = new Scanner(System.in);
	    return scanner.nextInt();
	}

}
