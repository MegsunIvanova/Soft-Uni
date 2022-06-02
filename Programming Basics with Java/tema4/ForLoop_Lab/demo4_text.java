package tema4.ForLoop_Lab;

public class demo4_text {
    public static void main(String[] args) {
        //Можем да вземем дължината на текст:
        String text = "SoftUni";
        int length = text.length();
        System.out.println(length);

        //Можем да вземем  символ от текст по индекс:
        // Индексът при текст започва от 0, т.е. първият символ е на НУЛЕВА позиция
        char letter = text.charAt(4);
        System.out.println(letter);

    }
}
