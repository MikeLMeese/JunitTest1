package junit.test;

public class Vacation {
    public static void main(String[] args) throws Exception {
        String vacationSpot1 = "Seoul";
        String vacationSpot2 = "Tokyo";
        String vacationSpot3 = "Maldives";
        itinerary(vacationSpot1, vacationSpot2, vacationSpot3);
    }

    public static String itinerary(String spot1, String spot2, String spot3) {
        return "I want to visit " + spot1 + ", " + spot2 + ", and the " + spot3 + ".";
    }
}
