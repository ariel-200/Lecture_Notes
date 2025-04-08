package Week3;

public class CorporateSponsors {
    public static void main(String[] args) {


        // modify array, make strings uppercase
        String[] sponsors = { "ikea", "at&t", "cvs", "3m"};

        for (int x = 0; x < sponsors.length; x++) {
            sponsors[x] = sponsors[x].toUpperCase();

        }

        System.out.println(java.util.Arrays.toString(sponsors));
    }
}
