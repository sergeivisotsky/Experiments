package DataStructures;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapTest {
    static class Fields {
        String key;
        int value;
    }

    public static void main(String[] args) {
        Fields fields = new Fields();
        Map<String, String> animals = new Map<String, String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(String key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(@NotNull Map<? extends String, ? extends String> m) {

            }

            @Override
            public void clear() {

            }

            @NotNull
            @Override
            public Set<String> keySet() {
                return null;
            }

            @NotNull
            @Override
            public Collection<String> values() {
                return null;
            }

            @NotNull
            @Override
            public Set<Entry<String, String>> entrySet() {
                return null;
            }
        };
    }
}
