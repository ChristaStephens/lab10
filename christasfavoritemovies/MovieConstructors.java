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
