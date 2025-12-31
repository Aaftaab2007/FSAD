class Box<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
public class Main {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
        intBox.setValue(123);
        System.out.println("Integer Value: " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("String Generics");
        System.out.println("String Value: " + strBox.getValue());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(99.99);
        System.out.println("Double Value: " + doubleBox.getValue());

        Box<Boolean> boolBox = new Box<>();
        boolBox.setValue(true);
        System.out.println("Boolean Value: " + boolBox.getValue());
    }
}