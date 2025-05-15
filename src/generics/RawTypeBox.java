package generics;

public class RawTypeBox {

    private Object value;

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        RawTypeBox box1 = new RawTypeBox();
        RawTypeBox box2 = new RawTypeBox();
        box1.setValue("abc");
        box2.setValue(123);
        String s1 = (String) box1.getValue();
        String in1 = (String) box2.getValue();
        System.out.println(box1.getValue());
        System.out.println(box2.getValue());
    }
}

