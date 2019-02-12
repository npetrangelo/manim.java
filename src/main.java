import java.util.Map;

import static java.util.Map.entry;

public class main {

    static class Dataclass extends Configurable {
        public String foo = "a";
        public int num = 2;

        @Override
        public String toString() {
            return String.format("%s %d", foo, num);
        }
    }

    public static void main(String[] args) {
        Map<String, Object> config = Map.ofEntries(
                entry("foo", "c"),
                entry("num", 3)
        );
        Dataclass instance = new Dataclass();
        System.out.println(instance);
        instance.configure(config);
        System.out.println(instance);
    }
}