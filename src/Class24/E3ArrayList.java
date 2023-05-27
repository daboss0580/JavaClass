package Class24;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('D');
        characters.add('E');
        characters.add('T');
        characters.add('A');
        characters.add('I');
        characters.add('L');
        System.out.println(characters);
        System.out.println(characters.indexOf('I'));
        System.out.println(characters.contains('D'));
        System.out.println(characters.isEmpty());
        characters.set(0,'R');
        System.out.println(characters);
    }

}
