public abstract class CoffeeMachine {
    public final void makeDrink(){
        // Template methods
        heatWater();
        brewCoffee();
        pourInCup();

        // Special methods
        addIngredients();
    }

    public void heatWater(){
        System.out.println("Heating Water...");
    }

    public void brewCoffee(){
        System.out.println("Brewing Coffee...");
    }

    public void pourInCup(){
        System.out.println("Pouring Cup...");
    }

    public abstract void addIngredients();
}
