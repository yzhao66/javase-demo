package generic;

/**
 * @author zoh66
 * @Description
 * @create 2023-04-21 16:03
 */
public class Notepad<K, V> {

    private K key;

    private V value;

    public Notepad(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Notepad() {

    }

    public static void main(String[] args) {
        Notepad<Integer, String> notepad = new Notepad<>();
        notepad.setKey(123);
        notepad.setValue("123");

        Notepad<Double, String> notepad2 = new Notepad<>();
        notepad2.setKey(123.0);
        notepad2.setValue("123");
        System.out.printf(notepad.toString());
        System.out.printf(notepad.toString());
        System.out.printf(notepad2.toString());
        System.out.printf(notepad2.toString());
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
