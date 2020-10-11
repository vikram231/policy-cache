import Models.IDataStore;
import Models.IPolicy;
import Models.InMemory;
import Models.Lifo;

public class CacheService {
    IPolicy policy;
    IDataStore dataStore;

    public IPolicy getPolicy(String policyType, int dataStoreSize, String dbType) {
        if (policyType.toLowerCase().equals("lifo")) {
            policy = new Lifo();
            policy.setSizeLimit(dataStoreSize);
        }

        if (dbType.toLowerCase().equals("inmemory")) {
            dataStore = new InMemory();
        }

        policy.setDataStore(dataStore);
        return policy;
    }
}
