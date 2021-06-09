/*
*Author : Liam
*Date : 09-Jun-2021
*Description :
*/

package liam_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercice2 {

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
	//Lecture
		BufferedReader entree;
		int somme=0;
		entree = new BufferedReader(new FileReader("monCalcul.txt"));
		
		while(entree.ready())
		{
			somme+=Integer.parseInt(entree.readLine());
		}
		entree.close();
		//Écrire
		FileWriter ficAEcrire;
		PrintWriter sortie;
		ficAEcrire=new FileWriter("monResultat.txt");
		sortie=new PrintWriter(ficAEcrire);
		sortie.print(somme);
		sortie.close();

	}

}
