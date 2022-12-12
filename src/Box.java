public class Box <T>{
    T var;

    public Box(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public static <T> String Box  (T var) {
        return "Box{" +
                "var=" + var +
                '}';
    }
}
