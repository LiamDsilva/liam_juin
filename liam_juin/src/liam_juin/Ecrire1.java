/*
*Author : Liam
*Date : 05-Jun-2021
*Description :
*/

package liam_juin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ecrire1 {

	public static void main(String[] args) {
		String Fichier="ecrire.txt";
		final String s1="Voici ce que je voudrais";
		final String s2="écrire";
		
		FileWriter ficAEcrire;
		PrintWriter sortie;
		try
		{
			ficAEcrire=new FileWriter(Fichier);
			sortie=new PrintWriter(ficAEcrire);
			sortie.print(s1);
			sortie.print(s2);
			sortie.close();
		}catch(IOException ioe)
		{
			System.out.println("Erreur entrée/sortie");
		}

	}

}
