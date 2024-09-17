package com.java.basics;

public class FlightScheduling {
    public static void main(String[] args) {
/*
        String [][][] flightSchedule = new String[7][5][3];

        //Sunday[0] Flight Schedule
        flightSchedule [0][0][0] = "Flight AA101, DEL to HYD, 5:00AM";
        flightSchedule[0][0][1] = "Flight AA102, DEL to HYD, 1:00PM";
        flightSchedule[0][0][1] ="Flight AA103, DEL to HYD, 8:00PM";

        //Monday[1] Flight Schedule
        flightSchedule [1][1][0] = "Flight AA201, DEL to CHE, 7:00AM";
        flightSchedule [1][1][1] = "Flight AA202, DEL to CHE, 3:00PM";
        flightSchedule [1][1][2] = "Flight AA203, DEL to CHE, 10:00PM";

        //Tuesday[2] Flight Schedule
        flightSchedule[2][2][0] = "Flight AA301, DEL to BNG, 6:00AM";
        flightSchedule[2][2][1] = "Flight AA302, DEL to BNG, 2:00PM";
        flightSchedule[2][2][2] = "Flight AA303, DEL to BNG, 9:00PM";

        //Wednesday[3] Flight Schedule
        flightSchedule[3][3][0] = "Flight AA401, HYD to VIZ, 7:00PM";
        flightSchedule[3][3][1] = "Flight AA402, HYD to VIZ, 3:00PM";
        flightSchedule[3][3][2] = "Flight AA403, HYD to VIZ, 10:00PM";

        //Thursday[4] Flight Schedule
        flightSchedule[4][4][0] = "Flight AA501, VIZ to BNG, 7:00AM";
        flightSchedule[4][4][1] = "Flight AA502, VIZ to BNG, 3:00PM";
        flightSchedule[4][4][2] = "Flight AA503, VIZ to BNG, 10:00PM";

        //Printing Schedule
        printFLightSchedule(flightSchedule, 0, 0); //Printing DEL to HYD Schedule
        printFLightSchedule(flightSchedule, 1, 1); //Printing DEL to CHE Schedule
        printFLightSchedule(flightSchedule, 4, 4); //Printing VIZ to BNG  Schedule

 */
        String [][][] flightSchedule ={
                {
                        {"Flight AA101, DEL to HYD, 07:00AM","Flight AA102, DEL to HYD, 01:00PM","Flight AA102, DEL to HYD, 01:00PM"},
                        {},
                        {},
                        {}, {}, {}, {}
                },
                {
                        {},
                        {"Flight AA201, DEL to CHE, 06:00AM","Flight AA202, DEL to CHE, 11:00AM","Flight AA203, DEL to CHE, 04:00PM"},
                        {},
                        {},
                        {}, {}, {}, {}
                },
                {
                        {},
                        {},
                        {"Flight AA301, DEL to BNG, 08:00AM","Flight AA302, DEL to BNG, 12:00PM","Flight AA303, DEL to BNG, 05:00PM"},
                        {},
                        {},{}, {}
                },
                {
                        {},
                        {},
                        {},
                        {"Flight AA401, HYD to VIZ, 09:00AM","Flight AA402, HYD to VIZ, 01:00PM","Flight AA403, HYD to VIZ, 09:00PM"},
                        {},{},{}
                },
                {
                        {},
                        {},
                        {},
                        {},
                        {"Flight AA501, VIZ to BNG, 10:00AM","Flight AA502, VIZ to BNG, 2:00PM","Flight AA503, VIZ to BNG, 8:00PM"},
                        {},{}
                }
        };

        printFLightSchedule(flightSchedule);
    }
    /*
    public static void printFLightSchedule(String [][][] schedule, int day, int cityPair){
        String[] dayofWeek = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String[] cityPairs = {"DEL to HYD","DEL to CHE", "DEL to BNG","HYD to VIZ","VIZ to BNG"};
        System.out.println("Flight Schedule for :" + dayofWeek[day] + "(" + cityPairs[cityPair]+ "):");

        for (int i=0; i< schedule[day][cityPair].length; i++){
            System.out.println(schedule[day][cityPair][i]) ;
        }
        System.out.println();
    }

     */
    private static void printFLightSchedule(String[][][] filghtSchedule){
        String[] days = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        for (int day=0; day<filghtSchedule.length; day++){
            System.out.println(days[day] + ".");

            boolean hasFlight = false;
            for (int route = 0; route<filghtSchedule[day].length; route++){
                if(filghtSchedule[day][route].length > 0){
                    hasFlight = true;
                    for (int time =0; time<filghtSchedule[day][route].length; time++){
                        System.out.println(" " + filghtSchedule[day][route][time]);
                    }
                }
            }
            if(!hasFlight){
                System.out.println("No flight schedule");
            }
            System.out.println();
        }
    }
}
