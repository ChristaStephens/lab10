package christasfavoritemovies;


import java.util.ArrayList;
import java.util.Map;

public class MovieConstructors {
	//all of these thing are called java beans
	//thinking of building these like the hash map
	//from the last lab but using an arrayList.

	private String titles = ("");
	private String categories = ("");
	
	public String getTitles() {
		return titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public MovieConstructors() {}
	
	public MovieConstructors(String titles, String categories) {
		this.titles = titles;
		this.categories = categories;
		
		
	}
	
	public <ArrayList> String genre () {
		return " Drama " + " Adventure " + " Action " +" Science Fiction "+ 
				" Horror " +" Musical/Adventure " + " Animation/Romance " +" Family Film " +" Cartoon "; // may need to add types of categories here?
	}
	
	public <ArrayList> String movies() {
		return " Forest Gump " + " Life of Pi " + " Marvel's Black Panther" +
				" Marvel's Dr. Strange "+" The Signal "+" Moana " + " Aladdin " +" Coco "+ " Steven Universe ";
	}
	
//	@Override
//	public String toString() {
//		return reqCategory();
//	}

	public Object get(String genre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

//	public Object get(String genre) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public Object getCategory(String genre) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
