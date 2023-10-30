import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random= new Random();
    List<Integer> randomList = new ArrayList<>();

    public Randoms(int min, int max) {
        for (int i = 0; i < 1000; i ++){
            randomList.add(random.nextInt(min, max+1));
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            boolean isList = true;
            int next = 0;


            @Override
            public boolean hasNext() {
                if (isList) {
                    if (next < randomList.size()) {
                        return true;
                    } else return isList;
                } else return false;
            }

            @Override
            public Integer next() {
                if (isList) {
                    if (next < randomList.size()){
                        int nextRan = randomList.get(next);
                        next++;
                        return nextRan;
                    }else{
                        int nextRan = randomList.get(0);
                        next = 1;
                        return nextRan;
                    }
                }
                else {
                    isList = false;
                    int nextRan = 0;
                    next = 0;
                    return nextRan;
                }
            }
        };
    }
}
