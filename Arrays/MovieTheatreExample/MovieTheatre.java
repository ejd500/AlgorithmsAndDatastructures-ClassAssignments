package Arrays.MovieTheatreExample;

import java.util.Arrays;

public class MovieTheatre{

    String[][] seatingChart;

    public MovieTheatre(String[][] seatingChart) {
        for (int i = 0; i < seatingChart.length; i++) {
            for (int j = 0; j < seatingChart[i].length; j++) {
                seatingChart[i][j] = "O"; // Set all seats to letter O to signify open.
            }
        }
        this.seatingChart = seatingChart;
    }

    public String[][] getSeatingChart() {
        return seatingChart;
    }

    public void setSeatingChart(String[][] seatingChart) {
        this.seatingChart = seatingChart;
    }

    public void markSeatAsTaken(int rowIndex, int colIndex, String valueToSignifyAsTaken){
        seatingChart[rowIndex][colIndex] = valueToSignifyAsTaken;
    }

    @Override
    public String toString() {
        return "Movie Theatre Seating Chart = " + Arrays.deepToString(seatingChart);
    }

    public static void main(String[] args) {
        String[][] array2D = new String[3][4];
        MovieTheatre theatre = new MovieTheatre(array2D);
        System.out.println(theatre);
        theatre.markSeatAsTaken(1, 3, "X");
        System.out.println(theatre);
    }
}
