package Models;

import java.util.HashMap;

public class InMemory implements IDataStore {
    private final HashMap<String, String> inmemory;

    public InMemory() {
        inmemory = new HashMap<>();
    }

    @Override
    public int getSize() {
        return inmemory.size();
    }

    @Override
    public void save(String key, String value) {
        getInmemory().put(key, value);
    }

    @Override
    public void delete(String key) {
        getInmemory().remove(key);
    }

    @Override
    public void showDb() {
        System.out.println(inmemory);
    }

    @Override
    public String getValue(String key) {
        return inmemory.get(key);
    }

    public HashMap<String, String> getInmemory() {
        return inmemory;
    }

}
