package Models;

public interface IPolicy {
    void applyPolicy(String key, String value);

    void setSizeLimit(int sizeLimit);

    void setDataStore(IDataStore dataStore);

    IDataStore getDataStore();

}
