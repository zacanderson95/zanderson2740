public class ZAnderson2740Ex1B {
    public static void main(String[] args)  {
        int customerNum = 101;
        String lName = " Anderson ";
        String fName = " Zac";
        int thermometerNum = 1001;
        int time1 = 0;
        int temp1 = 100;
        int time2 = 10;
        int temp2 = 100;
        int time3 = 20;
        int temp3 = 100;
        int time4 = 30;
        int temp4 = 100;
        int time5 = 40;
        int temp5 = 120;

        double avg1 = (time2 - time1)*(temp1);
        double avg2 = (time3 - time2)*(temp2);
        double avg3 = (time4 - time3)*(temp3);
        double avg4 = (time5 - time4)*(temp4);

        double avgTemp = (double)(avg1 + avg2 + avg3 + avg4)/(time5);

        String message = "Customer: " + customerNum + fName + lName + "\n"
                + "Thermometer#: " + thermometerNum + "\n"
                + "Average temperature: " + avgTemp;
        System.out.println(message);
    }
 }
