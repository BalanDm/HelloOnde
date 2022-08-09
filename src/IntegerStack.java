import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class IntegerStack implements IStack<Integer> {
    private final List<AbstractMap.SimpleEntry<Integer, Integer>> data = new ArrayList<>();
    private Integer min = null;

    @Override
    public void push(Integer element) {
        if (min == null) {
            min = element;
        } else if (element.compareTo(min) < 0) {
            data.add(new AbstractMap.SimpleEntry<>(2 * element - min, element));
            min = element;
            return;
        }
        data.add(new AbstractMap.SimpleEntry<>(element, null));
    }

    @Override
    public Integer pop() {
        if (data.size() == 0) {
            throw new EmptyStackException();
        }
        try {
            AbstractMap.SimpleEntry<Integer, Integer> last = data.get(data.size() - 1);
            if (last.getKey().compareTo(min) < 0) {
                min = 2 * min - last.getKey();
            }
            return last.getValue() == null ? last.getKey() : last.getValue();
        } finally {
            data.remove(data.size() - 1);
        }
    }

    @Override
    public Integer getMin() {
        if (data.size() == 0) {
            throw new EmptyStackException();
        }
        return min;
    }
}
