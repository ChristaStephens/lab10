package christasfavoritemovies;

import java.util.ArrayList;
import java.util.List;
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
		Scanner scnr = new Scanner(System.in);
		String userContinue = "yes";
		String userCategory = "";
		String loop = "loop";

		System.out.println(greet());

		while (userContinue.equals("yes")) {
			// reset values
			userCategory = "";
			loop = "loop";
			// prompt and validation
			while (loop.equals("loop")) {
				System.out.println("Enter one of the following genres to display the movies in that catagory.");
				System.out.println(" ");
				System.out.println("========              ===============");
				System.out.println("Adventure             Science Fiction");
				System.out.println("Musical/Adventure     SciFi");
				userCategory = scnr.next();
				if (userCategory.equals("Adventure") || userCategory.equals("Science Fiction")
						|| userCategory.equals("Action") || userCategory.equals("Musical/Adventure")) {
					loop = "Stop";
				} else {
					System.out.println("Please enter an availible category.");
				}

				// MovieConstructors for film

				List<MovieConstructors> movies = new ArrayList<>(10);
				{
					movies.add(new MovieConstructors("Life of Pi", "Adventure"));
					movies.add(new MovieConstructors("Marvel's Black Panther", "Action"));
					movies.add(new MovieConstructors("Marvel's Dr. Strange", "Science Fiction"));
					movies.add(new MovieConstructors("Fast Five", "Action"));
					movies.add(new MovieConstructors("Moana", "Musical/Adventure"));
					movies.add(new MovieConstructors("Rick and Morty", "Adventure"));
					movies.add(new MovieConstructors("Aladdin", "Musical/Adventure"));
					movies.add(new MovieConstructors("The Princess & The Frog", "Musical/Adventure"));
					movies.add(new MovieConstructors("Coco", "Adventure"));
					movies.add(new MovieConstructors("Steven Universe", "Adventure"));

				}

				System.out.println("Enter one of the following genres to display the movies in that catagory.");
				System.out.println(" ");
				System.out.println("========              ===============");
				System.out.println("Adventure             Science Fiction");
				System.out.println("Musical/Adventure     SciFi");

				{

					String title = null;
					String category = null;

					String yourChoice = "yes";

					while (yourChoice.equalsIgnoreCase("yes")) {

						System.out.println("What genre are you interested in?");
						category = scnr.nextLine().toLowerCase();

						System.out.println("\nWould you like to continue? (yes or no)");
						yourChoice = scnr.nextLine();
					}

					System.out.println("Goodbye!");
					scnr.close();
				}
			}
		}
	}

	private static String greet() {
		return "Welcome to Christa's Favorite Movie List!\nThere are 10 movies."
				+ "\nWhat genre are you interested in viewing? \n";
	}

}