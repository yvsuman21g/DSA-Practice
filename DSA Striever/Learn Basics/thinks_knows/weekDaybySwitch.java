import java.util.Scanner;

public class weekDaybySwitch {
    public static void main(String args[]){

        // User input for day
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        String dayString;
        String dayType;

        switch(days){
            case 1: 
            dayString = "Monday";
            break;

            case 2: 
            dayString = "Tuesday";
            break;

            case 3: 
            dayString = "Wednesday";
            break;

            case 4: 
            dayString = "Thursday";
            break;

            case 5:
            dayString = "Friday";
            break;

            case 6: 
            dayString = "Saturday";
            break;

            case 7:
            dayString ="Sunday";
            break;

            default:
            dayString = "Invalid Day";
        }
        // System.out.print(dayString);

        switch(days){
            case 1: 
            case 2:
            case 3:
            case 4: 
            case 5:
                dayType = "WeekDays";
                break;
        
            case 6:
            case 7:
                dayType ="weekend";
                break;
            default: 
            dayType ="Invalid dataType";
        }
        System.out.print(dayString + " is a " + dayType);
           sc.close();
    }
}
