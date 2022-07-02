package ChocolateFactory;

public class ChocolateBoiler {
    private static ChocolateBoiler boiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (boiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (boiler == null) {
                    boiler = new ChocolateBoiler();
                }
            }
        }
        return boiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling boiler by the chocolate and milk");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Draining hot milk and chocolate");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("Boiling milk and chocolate");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
