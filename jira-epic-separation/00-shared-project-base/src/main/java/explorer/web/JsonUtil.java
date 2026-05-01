package explorer.web;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class JsonUtil {
    private JsonUtil() {
    }

    public static String toJson(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof String text) {
            return "\"" + escape(text) + "\"";
        }
        if (value instanceof Number || value instanceof Boolean) {
            return value.toString();
        }
        if (value instanceof Map<?, ?> map) {
            StringBuilder json = new StringBuilder("{");
            Iterator<? extends Map.Entry<?, ?>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<?, ?> entry = iterator.next();
                json.append(toJson(String.valueOf(entry.getKey())));
                json.append(":");
                json.append(toJson(entry.getValue()));
                if (iterator.hasNext()) {
                    json.append(",");
                }
            }
            return json.append("}").toString();
        }
        if (value instanceof List<?> list) {
            StringBuilder json = new StringBuilder("[");
            for (int i = 0; i < list.size(); i++) {
                json.append(toJson(list.get(i)));
                if (i < list.size() - 1) {
                    json.append(",");
                }
            }
            return json.append("]").toString();
        }
        return toJson(String.valueOf(value));
    }

    private static String escape(String value) {
        return value
            .replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t");
    }
}
