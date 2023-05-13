package Class13;

public class E6StringDemo {
    /*
    Create a String that should be combination of letters, numbers and special characters.
    Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
     */
    public static void main(String[] args) {
        String data="347423jdhfghAJHGDFH&#^$&#173";
        data=data.replaceAll("[!-/^]","");
        System.out.println(data.length());

        }
    }


