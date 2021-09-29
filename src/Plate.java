public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (!enoughFood(appetite)) {
            System.out.println("Еды в тарелке недостаточно, чтобы накормить животное");
        } else {
            food = food - appetite;
        }
    }

    public boolean enoughFood(int appetite) {
        return appetite < food;
    }
}