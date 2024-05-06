package STRATEGY;

interface Strategy {
    void execute();
}

// Stratégie concrète A
class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Exécution de la stratégie A");
        // Implémentation spécifique de la stratégie A
    }
}

// Stratégie concrète B
class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Exécution de la stratégie B");
        // Implémentation spécifique de la stratégie B
    }
}

// Classe Context
class Context {
    private Strategy strategy;

    // Setter pour changer la stratégie
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Méthode pour exécuter la stratégie actuelle
    public void executeStrategy() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("Aucune stratégie définie.");
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        Context context = new Context();

        // Utiliser la stratégie A
        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();

        // Changer pour utiliser la stratégie B
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
