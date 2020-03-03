package mooc.week1.Ex23_Temperature;

public class test {

    public static void main(String[] args)
    {
//        System.out.println(Graph.class);
//        Console console = System.console();
//
//        console.printf("Please enter your username: ");
//        String username = console.readLine();
//        console.printf(username + "\n");
//
//        console.printf("Please enter your password: ",console.readLine());
//        char[] passwordChars = console.readPassword();
//        String passwordString = new String(passwordChars);
//        console.printf("\nAfiseaza parola: " + passwordString + "\n");

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

        int luck = 10;
        if((luck>10 ? luck++: --luck)<10) {
        System.out.print("Bear");
        }
    }
}
