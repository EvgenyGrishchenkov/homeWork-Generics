public class Main {
    public static void main(String[] args) {
        MagicBox <String> magicBox1 = new MagicBox(3);
        MagicBox <Integer> magicBox2 = new MagicBox<>(3);

        magicBox1.add("Редька");
        magicBox1.add("Хреновина41");
        magicBox1.add("Памперсы");
        magicBox1.add("Молоток");

        magicBox2.add(1249);
        magicBox2.add(456);
        magicBox2.add(352);
        magicBox2.add(8934);
        
        magicBox1.pick();
        magicBox2.pick();
    }
}