package Gun30_Veriables._02_FinalVariables.Example2;

public class Constants {
    final static int aNumberofHoursperDay = 24;
    final static int NumberofMinutesinanHour = 60;
    final static int oneSecondsperMinute = 60;

    public static int byCount(int day, int hour, int minute) {
        int totalMinute = day * Constants.aNumberofHoursperDay
                * Constants.NumberofMinutesinanHour
                * Constants.oneSecondsperMinute

                + hour

                * Constants.NumberofMinutesinanHour
                * Constants.oneSecondsperMinute

                + minute

                * Constants.oneSecondsperMinute;

        return totalMinute;

    }

}
