import java.util.Map;
import java.util.Map.Entry;

public abstract class Configurable {
    public void configure(Map<String, Object> config) {
        for(Entry<String, Object> entry : config.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            try {
                getClass().getField(key).set(this, value);
            } catch (IllegalAccessException e) {
                System.err.println(e);
            } catch (NoSuchFieldException e) {
                System.err.println(e);
            }
        }
    }
}
