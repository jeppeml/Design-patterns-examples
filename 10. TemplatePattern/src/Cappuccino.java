public class Cappuccino extends CoffeeMachine{

    private void makeFrothedMilk(){
        System.out.println("Frothing... PSFFST");
    }
    @Override
    public void addIngredients() {
        makeFrothedMilk();
        System.out.println("Pouring milk into drink...");
    }
}
