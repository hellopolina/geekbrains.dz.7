public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.enoughFood(appetite) && !satiety) {
            System.out.println(name + " поел");
            plate.decreaseFood(appetite);
            satiety = true;
        } else if (!plate.enoughFood(appetite)) {
            System.out.println(name + " не хватило еды");
        } else if (satiety) {
            System.out.println(name + " сытый");
        }
    }
}