// Problem: Cinema Seating Arrangement

// A cinema hall has 12 seats in each row. A total of 125 people have come to watch a movie.

// Write a Java program to find:
// How many complete rows can be filled?
// How many people will be seated in the last (incomplete) row?

// Input:
// Total Audience = 125
// Seats Per Row = 12

// Output:
// Complete Rows = 10
// People in Last Row = 5


package arithmetic;

class cinema 
{
    public static void main(String[] args)
    {
        int totalAudience = 121;
        int seatsPerRow = 15;

        int completeRows = totalAudience / seatsPerRow;
        int PeopleinLastRow = totalAudience % seatsPerRow;

        System.out.println("Complete Rows: "+completeRows);
        System.out.println("People in Last Row: "+PeopleinLastRow);





    }
    
}
