package Class25;

import java.util.ArrayList;
import java.util.List;

public class E2Arraylist {
    public static void main(String[] args) {
        Headset headset1=new Headset("Redragon H901 Gaming Headset",19.99,222);
        Headset headset2=new Headset("SteelSeries New Arctis Nova",152.99,12018);
        Headset headset3=new Headset("BENGOO G9000 Stereo Gaming Headset",21.99,99780);
        Headset headset4=new Headset("Logitech G PRO X Gaming Headset",76.88,10076);
        List<Headset>headsets=new ArrayList<>();
        headsets.add(headset1);
        headsets.add(headset2);
        headsets.add(headset3);
        headsets.add(headset4);
        for (Headset headset:headsets){
           // headset.printInfo();
           // System.out.println(headset.toString());
            System.out.println(headsets);
        }
    }
    public static void printList(List<Headset>headsets){
        for (Headset headset:headsets){
            headset.printInfo();
        }
    }
}
class Headset{
    private String title;
    private double price;
    private int noOfReviews;

    public Headset(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }
    public void printInfo(){
        System.out.println();
    }


    @Override
    public String toString() {
        return "Headset{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", noOfReviews=" + noOfReviews +
                '}';
    }
}