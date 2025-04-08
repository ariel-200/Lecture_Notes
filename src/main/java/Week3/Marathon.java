package Week3;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double increase = 1.10; // used to increase by 10%

        marathonSchedule(currentDistance, targetDistance, increase);
    }

        public static void marathonSchedule(double currentDistance, double targetDistance, double increase){
            int week = 1;

            while (currentDistance < targetDistance) {
                System.out.println(week + " " + currentDistance);
                currentDistance = currentDistance * increase;
                week++;
            }

            System.out.println(week + " " + currentDistance);

        }
}
