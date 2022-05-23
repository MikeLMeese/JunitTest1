package junit.test;

public class MyNameIs {
    public static void main(String[] args) throws Exception {
        String firstName = "Michael";
        String lastName = "Moua";
        System.out.println(greet(firstName, lastName));
    }

    public static String greet(String firstName, String lastName) {
        return "My name is " + firstName + " " + lastName + ".";
    }
}
