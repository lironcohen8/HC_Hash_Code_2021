import java.util.*;
import java.util.stream.Collectors;

public class Intersection {

    private int id;
    public Set<Street> incomingStreet = new HashSet<Street>();
    public Set<Street> outcomingStreet = new HashSet<Street>();
    public int priorityInt;


    public Intersection() {

    }

    public Intersection(int id) {
        this.id = id;
    }

    public int getPositiveStreets() {
        int counter = 0;
        for (Street street : incomingStreet) {
            if (street.priorityValue > 0) {
                counter++;
            }
        }
        return counter;
    }

    public int getTotalOutstreetsLength() {
        int len = 0;
        for (Street s : this.incomingStreet) {
            len += s.outTotalLength;
        }
        return len;
    }

    public int longestStreet() {
        int max = 0;
        for (Street s : this.incomingStreet) {
            if (s.length > max) {
                max = s.length;
            }
        }
        return max;
    }

    public ArrayList<Street> incomeOrder() {
        ArrayList<Street> streets = new ArrayList<>(incomingStreet);
        Collections.sort(streets,(o1, o2) -> -1* Integer.compare(o1.startingAmount,o2.startingAmount));
        return streets;
    }


}
