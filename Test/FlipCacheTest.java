import Models.IPolicy;

class FlipCacheTest {
    public static void main(String[] args) {
        FlipCache flipCache = new FlipCache();
        IPolicy policy = flipCache.getCacheService().getPolicy("lifo", 3, "inmemory");
        System.out.println(policy);
        policy.applyPolicy("3", "4");
        System.out.println(policy);
        policy.getDataStore().showDb();
        policy.applyPolicy("5", "6");
        System.out.println(policy);
        policy.getDataStore().showDb();
        policy.applyPolicy("7", "8");
        System.out.println(policy);
        policy.getDataStore().showDb();
        policy.applyPolicy("9", "18");
        System.out.println(policy);
        policy.getDataStore().showDb();
    }
}