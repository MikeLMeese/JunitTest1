package junit.test;

public class HiFriend {
    
    public static void main(String[] args) throws Exception {
        String princessBride = "Inigo Montoya";
        System.out.println(hello(princessBride));
    }

    public static String hello(String name) {
        return "My name is " + name + ". You killed my father. Prepare to die.";
    }

}
