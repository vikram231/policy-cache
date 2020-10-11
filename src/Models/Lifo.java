package Models;

import java.util.Stack;

public class Lifo implements IPolicy {
    private Stack<String> lifo;
    private IDataStore dataStore;
    private int sizeLimit;

    public Lifo() {
        lifo = new Stack<>();
    }

    public void setDataStore(IDataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public IDataStore getDataStore() {
        return dataStore;
    }

    @Override
    public void applyPolicy(String key, String value) {
        if (sizeLimit == lifo.size()) {
            String deleteKey = lifo.pop();
            dataStore.delete(deleteKey);
        }
        dataStore.save(key, value);
        lifo.push(key);
    }

    @Override
    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    public String toString() {
        return "Lifo{" +
                "lifo=" + lifo +
                ", dataStore=" + dataStore +
                '}';
    }
}
