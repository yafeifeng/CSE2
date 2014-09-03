//////////////////////////////////////////
// Yafei Feng
// cse2 lab02 Cyclometer.java
// print the number of minutes for each trip
// print the number of counts for each tirp
// print the distance of each trip in miles
// print the distance for the two trips combined

public class Cyclometer {
    public static void main(String[] args){
        int secsTrip1=480;  //trip 1 took
        int secsTrip2=3220;  //trip 1 took
        int countsTrip1=1561;  //trip 2 counts
        int countsTrip2=9037;  //trip 2 counts
        double wheelDiameter=27.0, //
        PI=3.14159, //
        feetPerMile=5280, // Convertion between feet and mile
        inchesPerFoot=12, // Convertion between inche and mile
        secondsPerMinute=60; // Convertion between seconds and minutes
        double distanceTrip1, distanceTrip2,totalDistance;
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}
