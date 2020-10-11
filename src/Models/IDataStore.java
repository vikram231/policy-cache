package Models;

public interface IDataStore {
    int getSize();

    void save(String key, String value);

    void delete(String key);

    void showDb();

    String getValue(String key);
}
