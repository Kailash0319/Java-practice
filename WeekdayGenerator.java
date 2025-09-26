import java.util.Scanner; 
 
public class WeekdayGenerator { 
    public static void main(String[] args) { 
           System.out.println("Kailash Kumawat"); 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter any integer: "); 
        int input = scanner.nextInt(); 
 
        
        int dayNumber = (input % 7); 
        if (dayNumber == 0) { 
            dayNumber = 7; 
        } 
 
        String dayName; 
 
        switch (dayNumber) { 
            case 1: dayName = "Monday"; break; 
            case 2: dayName = "Tuesday"; break; 
            case 3: dayName = "Wednesday"; break; 
            case 4: dayName = "Thursday"; break; 
            case 5: dayName = "Friday"; break; 
            case 6: dayName = "Saturday"; break; 
            case 7: dayName = "Sunday"; break; 
            default: dayName = "Invalid day";  
        } 
 
        System.out.println("The weekday is: " + dayName); 
 
        scanner.close(); 
    } 
} 