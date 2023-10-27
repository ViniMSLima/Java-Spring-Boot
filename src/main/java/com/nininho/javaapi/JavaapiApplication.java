package com.nininho.javaapi;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaapiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(JavaapiApplication.class, args);

		float sum = 0;
		float grade = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de notas a serem somadas\n> ");
		int qtdNotasInt = scan.nextInt();

		for (int i = 0; i < qtdNotasInt; i++)
		{
			System.out.print("Nota " + (i + 1) + "\n> ");

			grade = scan.nextFloat();
			sum += grade;
		}

		float mean = sum/qtdNotasInt;

		System.out.println("Media: " + mean);

		if (mean > 90)
		{
			System.out.print("Parabens!!");
		}
		else if (mean > 70)
		{
			System.out.println("Aprovado!!!");
		}
		else if (mean > 30) 
		{
			System.out.println("Recuperacao!!!");
		} 
		else
		{
			System.out.println("Reprovado!!!");
		}

	}

}
