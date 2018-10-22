package christasfavoritemovies;

import java.util.Scanner;

public class MoviesApp {
	public static void main(String[] args) {
		// Project Goals: Create a Class called: Movies:
		// Two Fields Title & Categories (like RectEx)
		// They are both Strings. Do these steps in MovCon
		// Create a List of Movies, 10 total
		// Loop through list of movies
		// Print out movies
		// Only print out movies from that category (arraylist) 

		
		System.out.println(greet());
		
		MovieConstructors films = new MovieConstructors();
		
		System.out.println(films.genre());//maybe use .getcategories to have user pick

		Scanner scnr = new Scanner(System.in);
		String genres = scnr.nextLine();
		
	
		
		
		//Object reqCategory;
		//((Object) reqCategory).set(films.get(genre));
		
		//System.out.println();
		//System.out.print(films.genres());
		
		films.setTitles( genres);
		//I think that this combo will work but maybe with movies.setgenres? I can't get it to work.
		
		//movies.set(films.get(genres));
		
	}
	
	
	private static String greet() {
		return "Welcome to Christa's Favorite Movie List!\nThere are 10 categories of movies."
				+ "\nWhat category are you interested in viewing? \n";
	}
	
}