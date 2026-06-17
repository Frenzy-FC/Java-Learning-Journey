public class T9 {
    public static void main(String[] args){
        // String Methods Functions/Logics

        String name = "Frenz Carlo";
        int lenght = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("r");

        String name1 = name.toUpperCase();
        String name2 = name.toLowerCase();
        String name3 = name.trim();
        String name4 = name.replace("e", "a");

        System.out.println(lenght);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);

        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");

        }
        else{
            System.out.println("Your name doesn't contain any spaces");
        }

        if(name.equalsIgnoreCase("Password")){
            System.out.println("Your name can't be password");

        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
