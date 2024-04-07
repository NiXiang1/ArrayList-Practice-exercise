import java.util.ArrayList;
import java.util.Scanner;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private String eventDate;
    private ArrayList<String> eventAttendees;

    public Event() {
        eventID = "";
        eventName = "";
        eventVenue = "";
        eventDate = "";
        eventAttendees = new ArrayList<>();
    }

    // Getters and Setters

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void addAttendee(String name) {
        eventAttendees.add(name);
    }

    public boolean removeAttendee(String name) {
        return eventAttendees.remove(name);
    }

    public String updateAttendee(int index, String newName) {
        if (index >= 0 && index < eventAttendees.size()) {
            eventAttendees.set(index, newName);
            return "Updated";
        } else {
            return "Attendee not found";
        }
    }

    public int findAttendee(String name) {
        for (int i = 0; i < eventAttendees.size(); i++) {
            if (eventAttendees.get(i).equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return "Event ID: " + eventID + "\n" +
               "Event Name: " + eventName + "\n" +
               "Venue: " + eventVenue + "\n" +
               "Date: " + eventDate + "\n" +
               "Attendees: " + eventAttendees.toString() + "\n";
    }

    public void OrganizeEvent() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the event ID: ");
            setEventID(scanner.nextLine());
            
            System.out.print("Enter the event name: ");
            setEventName(scanner.nextLine());
            
            System.out.print("Enter the venue: ");
            setEventVenue(scanner.nextLine());
            
            System.out.print("Enter the event date (YYYY-MM-DD): ");
            setEventDate(scanner.nextLine());
            
            while (true) {
                System.out.println("Enter the name of the attendee (or 'done' to finish): ");
                String input = scanner.nextLine();
                if ("done".equalsIgnoreCase(input)) {
                    break;
                }
                addAttendee(input);
            }
        }
    }
}

