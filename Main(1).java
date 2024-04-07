public class Main {
    public static void main(String[] args) {
        Event event = new Event();
        event.OrganizeEvent();
        System.out.println(event);
        System.out.println("Total number of attendees: " + event.getEventAttendees().size());
    }
}
