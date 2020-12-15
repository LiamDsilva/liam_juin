
/*
* Author : Liam
* Date : 15 Dec, 2020
* Trouver les 4 erreurs majeurs qui sont dans le code
*	1. Sur ligne 11, le public class n'est pas bonne (c'est appellé quel que chose d'autre)
*	2. Fabrique une variable(string) John sur ligne 15
*	3. Sur ligne 16, saluerAmi était rouge donc j'ai changé a static. 
*	4. Sur ligne25, tu dois écrire return message pour que sa fonctionne
*/
public class Erreurs
	{
		public static void main(String[] args)
		{
			String John = "John";
			System.out.println(saluerAmi(John));
		}
		/*
		 * Méthode permettant de saluer un ami 
		 * utilisant son nom
		 */
		public static String saluerAmi(String nom)
		{
				String message = "Bonjour mon ami " + nom;
				return message; 
		}

	}
