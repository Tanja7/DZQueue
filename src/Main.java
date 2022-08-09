import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Василий", "Соколов", 5));
        clients.add(new Person("Людмила", "Штакина", 8));
        clients.add(new Person("Владимир", "Емелин", 3));
        clients.add(new Person("Елена", "Чуднова", 4));
        clients.add(new Person("Николай", "Давыдов", 2));
        return clients;
    }

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        while (!queue.isEmpty()) {
            Person s = queue.poll();
            System.out.println(s.name + " " + s.surname + " прокатился на аттракционе.");
            s.numTickets--;
            if (s.numTickets != 0) {
                queue.offer(s);
            }
        }
    }
}
