package Class26;

import java.util.HashSet;
import java.util.Set;

public class EntryTester {
    public static void main(String[] args) {
        Set<Entry> entrySet=new HashSet<>();
        entrySet.add(new Entry("Coke", 2.95));
        entrySet.add(new Entry("Milk", 2.95));
        entrySet.add(new Entry("Juice", 0.95));
        entrySet.add(new Entry("Coffee", 1.95));
        entrySet.add(new Entry("Tea", 1.45));
        /*for (Entry entry:entrySet){
            if (entry.getKey().contains("o")&&entry.getValue()>2.5)
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
        entrySet.removeIf(x->x.getKey().contains("i") &&x.getValue()>2);
        System.out.println(entrySet);
    }
}
