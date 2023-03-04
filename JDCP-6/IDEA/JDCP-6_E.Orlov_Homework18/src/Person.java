public class Person {
    private String name;
    private String lastName;
    private int tickets;

    public Person(String name, String lastName, int tickets) {
        this.name = name;
        this.lastName = lastName;
        setTickets(tickets);
    }

    @Override// для контроля
    public String toString() {
        return name + " " + lastName + " " + tickets;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        if (tickets < 0) return;
        this.tickets = tickets;
    }
}
