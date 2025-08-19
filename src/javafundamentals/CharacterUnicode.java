package javafundamentals;

public class CharacterUnicode {
        public static void main(String[] args) {
            char letter = 'A';

            int unicode = (int) letter;
            System.out.println("Unicode of A: " + unicode);

            char nextLetter = (char) (letter + 1);
            System.out.println("Next letter: " + nextLetter);
        }
    }


