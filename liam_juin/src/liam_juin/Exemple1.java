/*
*Author : Liam
*Date : 04-Jun-2021
*Description :
*/

package liam_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemple1 {

	public static void main(String[] args) 
	{
		FileReader ficALire;
		BufferedReader entree;
		char c;
		
		try {
			ficALire=new FileReader("monFichier.txt");
			entree = new BufferedReader(ficALire);
			c=(char) entree.read();
			System.out.println(c);
			entree.close();
			ficALire.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Le fichier ne peut pas être lu");
			
		} catch(IOException ioe)
		{
			System.out.println("Erreur de lecture");
		}
		
	}

 }
