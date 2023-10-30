import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int MIN, MAX;

    public Randoms(int min, int max) {
        MIN = min;
        MAX = max + 1;
        random.nextInt(min, max + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                next = random.nextInt(MIN, MAX);
                return next;
            }
        };
    }
}
