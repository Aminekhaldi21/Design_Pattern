package SINGLETON;

public class Singleton {
	public static Singleton s; // création d'un objet singleton.
	 private Singleton() { // création d'un constructeur privé. 
	    	System.out.println("C'est mon singleton");
			}
	    public Singleton get_instance() { // création d'une méthode qui donne l'instance singleton.
	    	return s;
	    }
		public static void main(String[] args) {
			Singleton s=new Singleton();
		}
}




