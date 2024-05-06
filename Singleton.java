package SINGLETON;
public class TestUnit {
    @Test
    public void testGetInstanceReturnsSameInstance() {
        // Appel à getInstance() pour la première fois
        Singleton instance1 = Singleton.getInstance();
        // Appel à getInstance() pour la deuxième fois
        Singleton instance2 = Singleton.getInstance();
        // Vérifier que les deux instances sont les mêmes
    }
    @Test
    public void testNewInstanceNotCreated() {
        // Appel à getInstance() pour la première fois
        Singleton instance1 = Singleton.getInstance();
        // Créer une nouvelle instance directement (ce qui est incorrect pour un Singleton)
        Singleton instance2 = new Singleton();

        // Vérifier que les deux instances ne sont pas les mêmes
        
    }
}



