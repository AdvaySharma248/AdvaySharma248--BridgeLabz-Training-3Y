import java.util.*;

public class CinemaTime {
    private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
    }

    public boolean isValidTime(String time) {
        try {
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int min = Integer.parseInt(parts[1]);
            return (hour >= 0 && hour < 24 && min >= 0 && min < 60);
        } catch (Exception e) {
            return false;
        }
    }

    public void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < movieTitles.size(); i++) {
            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + movieTitles.get(i) + " at " + showTimes.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movie found with keyword: " + keyword);
        }
    }

    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println((i+1) + ". " + movieTitles.get(i) + " - " + showTimes.get(i));
        }
    }

    public void generateReport() {
        String[] titlesArr = movieTitles.toArray(new String[0]);
        String[] timeArr = showTimes.toArray(new String[0]);
        System.out.println("\n--- Printable Report ---");
        for (int i = 0; i < titlesArr.length; i++) {
            System.out.println(titlesArr[i] + " - " + timeArr[i]);
        }
    }
}
