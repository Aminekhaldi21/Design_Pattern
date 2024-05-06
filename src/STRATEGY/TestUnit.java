package STRATEGY;
import static org.junit.Assert.*;
import org.junit.Test;
public class StrategyPatternTest {
    @Test
    public void testConcreteStrategyA() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        // Utiliser un ByteArrayOutputStream pour capturer la sortie console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Exécuter la stratégie
        context.executeStrategy();
        // Vérifier que la sortie de la console correspond à l'attente
        assertEquals("Exécution de la stratégie A\n", outputStream.toString());
    }
    @Test
    public void testConcreteStrategyB() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyB());
        // Utiliser un ByteArrayOutputStream pour capturer la sortie console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Exécuter la stratégie
        context.executeStrategy();
        // Vérifier que la sortie de la console correspond à l'attente
        assertEquals("Exécution de la stratégie B\n", outputStream.toString());
    }
    @Test
    public void testNoStrategySet() {
        Context context = new Context();
        // Utiliser un ByteArrayOutputStream pour capturer la sortie console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Exécuter la stratégie sans avoir défini de stratégie
        context.executeStrategy();
        // Vérifier que la sortie de la console correspond à l'attente
        assertEquals("Aucune stratégie définie.\n", outputStream.toString());
    }
}
