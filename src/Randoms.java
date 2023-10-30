import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();

    public Randoms(int min, int max) {
        random.nextInt(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            boolean isExist = true;
            int next;
            @Override
            public boolean hasNext() {
                if (isExist){
                    if (next == 0){
                        return false;
                    }else return true;
                }
                else return false;
            }

            @Override
            public Integer next() {
                if (isExist) {
                    if (next == 0) {
                        next = random.nextInt();
                    }
                }
                return next;
            }
        };
    }
}