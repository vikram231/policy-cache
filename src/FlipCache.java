import Models.IPolicy;

import java.util.Scanner;

public class FlipCache {
    static Scanner sc = new Scanner(System.in);
    private final CacheService cacheService;

    FlipCache() {
        cacheService = new CacheService();
    }

    public CacheService getCacheService() {
        return cacheService;
    }

    public static void main(String[] args) {
        System.out.println("Enter dataStore size");
        int dataStoreSize = sc.nextInt();
        System.out.println("Enter Policy Type");
        String policyType = sc.next();
        System.out.println("Enter DataStore Type");
        String dbType = sc.next();
        FlipCache flipCache = new FlipCache();
        IPolicy policy = flipCache.getCacheService().getPolicy(policyType, dataStoreSize, dbType);
        System.out.println(policy);
        while (true) {
            System.out.println("Enter 1 to insert , Enter 2 to get , else anything to break");
            String flag = sc.next();
            if (flag.toLowerCase().equals("1")) {
                System.out.println("Enter Key");
                String key = sc.next();
                System.out.println("Enter Value");
                String value = sc.next();
                policy.applyPolicy(key, value);
                System.out.println(policy);
            } else if (flag.toLowerCase().equals("2")) {
                System.out.println("Enter key");
                String key = sc.next();
                String value = policy.getDataStore().getValue(key);
                System.out.println("value for key = " + key + " = " +  value);
            }
            else break;
            }
        }
    }
