import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int MIN, MAX;

    public Randoms(int min, int max) {
        MIN = min;
        MAX = max;
        random.nextInt(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                if (next == 0) {
                    return false;
                } else return true;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return next;
                } else {
                    next = random.nextInt(MIN, MAX);
                    return next;
                }
            }
        };
    }
}
