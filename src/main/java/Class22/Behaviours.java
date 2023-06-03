package Class22;

public abstract class Behaviours {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need
    Microsoft word to be installed etc.
     */
    private String name;
    private int fileSize;
    public Behaviours(String name, int fileSize){
        this.name=name;
        this.fileSize=fileSize;
    }
    void printInfo(){
        System.out.println(name+" "+fileSize);
    }
    abstract void open();
    void edit(){
        System.out.println();
    }
    void close(){

    }

}
class JavaFile extends Behaviours{

    public JavaFile(String name, int fileSize) {
        super(name, fileSize);
    }

    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}
class WordFile extends Behaviours{

    public WordFile(String name, int fileSize) {
        super(name, fileSize);
    }

    @Override
    void open() {
        System.out.println("to open Wordfile we need MS word");
    }
}
class PdfFile extends Behaviours{

    public PdfFile(String name, int fileSize) {
        super(name, fileSize);
    }

    @Override
    void open() {
        System.out.println("to open .PDF file we need Acrobat reader");
    }
}

class BehavioursTester {
    public static void main(String[] args) {
        Behaviours[] behaviours = {new JavaFile("Coding", 30),
                new WordFile("Application", 18),
                new PdfFile("CV", 32)
        };
        for (Behaviours behaviour : behaviours) {
            behaviour.open();
            behaviour.close();
            behaviour.edit();
            behaviour.printInfo();
        }
    }
}