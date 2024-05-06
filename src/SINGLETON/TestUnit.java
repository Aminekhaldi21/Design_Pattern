package SINGLETON;

public class TestUnit {
    public void testGetInstanceReturnsSameInstance() {
        // Appel à getInstance() pour la première fois
        Singleton instance1;
		try {
			 Singleton s = Singleton.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Appel à getInstance() pour la deuxième fois
         Singleton instance2 = Singleton.getInstance();
    }
    public void testNewInstanceNotCreated() {
        // Appel à getInstance() pour la première fois
    	Singleton instance1 = Singleton.getInstance();
        // Créer une nouvelle instance directement (ce qui est incorrect pour un Singleton)
    	Singleton instance2 = getInstance();
        // Vérifier que les deux instances ne sont pas les mêmes
      
    }
}
