public class Main {
    public static void main(String[] args) {
        /*
        String constructors
         */

        System.out.println("//Builds a string with the string passed as argument");
        new String("this is a string ");

        System.out.println("//Builds a string with the char array passed...");
        new String (new char[]{'d', 'a', 'v', 'i', 'd'});

        System.out.println("//Substring of the given char array" +
                " from second argument index to third argument position");
        String subName = new String(new char[]{'d', 'a', 'v', 'i', 'd'}, 0, 3);
        System.out.println(subName);

        
    }
}
