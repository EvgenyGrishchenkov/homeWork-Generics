import java.util.Random;

public class MagicBox <T> {
    private T[] item;

    public MagicBox(int maxItems) {
        this.item = (T[]) new Object[maxItems];
    }

    public boolean add(T newItem) {
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                item[i] = newItem;
                return true;
            }
        }
        return false;
    }


    public void pick() {
        int emptyItems = 0;
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                emptyItems++;
            }
        }
        if (emptyItems != 0) {
            throw new RuntimeException("Ещё не все ячейки заполнены, осталось заполнить " + emptyItems);
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(item.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
            System.out.println(item[randomInt]);
        }
    }

}
