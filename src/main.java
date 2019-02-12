import java.util.Map;

import static java.util.Map.entry;

public class main {

    static class Dataclass extends Configurable {
        public String foo = "a";
        public String abra = "cadabra";

        @Override
        public String toString() {
            return String.format("%s %s", foo, abra);
        }
    }

    public static void main(String[] args) {
        Map<String, Object> config = Map.ofEntries(
                entry("foo", "c"),
                entry("abra", "kazam")
        );
        Dataclass instance = new Dataclass();
        System.out.println(instance);
        instance.configure(config);
        System.out.println(instance);
    }
}
