import java.util.*;

public class FitLogger {
    private ArrayList<String> meals = new ArrayList<>();
    private ArrayList<Integer> calories = new ArrayList<>();

    public void addMeal(String meal, int calorie) throws OverLimitException {
        meals.add(meal.trim());
        calories.add(calorie);
        if (getTotalCalories() > 2500) {
            throw new OverLimitException("Calorie limit exceeded! Current total: " + getTotalCalories());
        }
    }

    public int getTotalCalories() {
        int total = 0;
        for (int cal : calories) {
            total += cal;
        }
        return total;
    }

    public String getMealReport() {
        if (meals.isEmpty()) return "No meals logged.";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < meals.size(); i++) {
            sb.append(meals.get(i)).append(" - ").append(calories.get(i)).append(" cal\n");
        }
        sb.append("Total: ").append(getTotalCalories()).append(" cal");
        return sb.toString();
    }
}
