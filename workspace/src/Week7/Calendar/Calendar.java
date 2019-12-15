package Week7.Calendar;

public class Calendar {
    EventList events;

    public void addNewEvent(Event event) {
        if (events == null)
            events = new EventList(event);
        else
            events = events.add(event);
    }

    public Event[] eventsAt(int day) {
        if (events == null)
            return new Event[0];

        // Determine the number of appointments at the given day.
        int anzahl = 0;
        for (EventList tl = events; tl != null; tl = tl.getNext()) {
            if (tl.getEvent().diff(day) == 0)
                anzahl++;
        }

        // Create and fill an array containing the appointments at the given day.
        Event[] result = new Event[anzahl];
        int index = 0;
        for (EventList tl = events; tl != null; tl = tl.getNext()) {
            if (tl.getEvent().diff(day) == 0) {
                result[index] = tl.getEvent();
                index++;
            }
        }
        return result;
    }

    public Event nextEvent(int day) {
        if (events == null)
            return null;

        Event nextEvent = null;
        int minDays = Integer.MAX_VALUE;
        for (EventList current = events; current != null; current = current.getNext()) {
            if (current.getEvent().diff(day) >= 0 && current.getEvent().diff(day) < minDays) {
                nextEvent = current.getEvent();
                minDays = current.getEvent().diff(day);
            }
        }
        return nextEvent;
    }

}
