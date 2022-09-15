public class GuavaCacheDemo {
    @Test
    public void whenCacheMiss_thenValueIsComputed() {
        CacheLoader<String, String> loader;
        loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return key.toUpperCase();
            }
        };
        LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(loader);
        System.out.println(cache.size());
        System.out.println(cache.getUnchecked("hello"));
        System.out.println(cache.size());
    }

    @Test
    public void whenCacheReachMaxSize_theEviction() {
        CacheLoader<String, String> loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return key.toUpperCase();
            }
        };
        LoadingCache<String, String> cache;
        cache = CacheBuilder.newBuilder().maximumSize(3).build(loader);
        System.out.println(cache.getUnchecked("first"));
        System.out.println(cache.getUnchecked("second"));
        System.out.println(cache.getUnchecked("third"));
        System.out.println(cache.getUnchecked("forth"));

        System.out.println(cache.size());
        System.out.println(cache.getIfPresent("first"));
        System.out.println(cache.getIfPresent("forth"));
    }

    @Test
    public void whenEntryIdle_thenEviction() throws InterruptedException {
        CacheLoader<String, String> loader;
        loader = new CacheLoader<String, String>() {
            @Override
            public String load(String s) throws Exception {
                return s.toUpperCase();
            }
        };

        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .expireAfterAccess(2, TimeUnit.MILLISECONDS)
                .build(loader);

        System.out.println(cache.getUnchecked("hello"));
        System.out.println(cache.size());
        System.out.println(cache.getUnchecked("hello"));
        Thread.sleep(300);

        cache.getUnchecked("test");
        System.out.println(cache.size());
        System.out.println(cache.getIfPresent("hello"));
    }
}public class GuavaCacheDemo {
    @Test
    public void whenCacheMiss_thenValueIsComputed() {
        CacheLoader<String, String> loader;
        loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return key.toUpperCase();
            }
        };
        LoadingCache<String, String> cache =
CacheBuilder.newBuilder().build(loader);
        System.out.println(cache.size());
        System.out.println(cache.getUnchecked("hello"));
        System.out.println(cache.size());
    }

    @Test
    public void whenCacheReachMaxSize_theEviction() {
        CacheLoader<String, String> loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return key.toUpperCase();
            }
        };
        LoadingCache<String, String> cache;
        cache = CacheBuilder.newBuilder().maximumSize(3).build(loader);
        System.out.println(cache.getUnchecked("first"));
        System.out.println(cache.getUnchecked("second"));
        System.out.println(cache.getUnchecked("third"));
        System.out.println(cache.getUnchecked("forth"));

        System.out.println(cache.size());
        System.out.println(cache.getIfPresent("first"));
        System.out.println(cache.getIfPresent("forth"));
    }

    @Test
    public void whenEntryIdle_thenEviction() throws InterruptedException {
        CacheLoader<String, String> loader;
        loader = new CacheLoader<String, String>() {
            @Override
            public String load(String s) throws Exception {
                return s.toUpperCase();
            }
        };

        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .expireAfterAccess(2, TimeUnit.MILLISECONDS)
                .build(loader);

        System.out.println(cache.getUnchecked("hello"));
        System.out.println(cache.size());
        System.out.println(cache.getUnchecked("hello"));
        Thread.sleep(300);

        cache.getUnchecked("test");
        System.out.println(cache.size());
        System.out.println(cache.getIfPresent("hello"));
    }
}public class GuavaCacheDemo {
    @Test
    public void whenCacheMiss_thenValueIsComputed() {
        CacheLoader<String, String> loader;
        loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return key.toUpperCase();
            }
        };
        LoadingCache<String, String> cache =
CacheBuilder.newBuilder().build(loader);
        System.out.println(cache.size());
        System.out.println(cache.getUnchecked("hello"));
        System.out.println(cache.size());
    }

    @Test
    public void whenCacheReachMaxSize_theEviction() {
        CacheLoader<String, String> loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return key.toUpperCase();
            }
        };
        LoadingCache<String, String> cache;
        cache = CacheBuilder.newBuilder().maximumSize(3).build(loader);
        System.out.println(cache.getUnchecked("first"));
        System.out.println(cache.getUnchecked("second"));
        System.out.println(cache.getUnchecked("third"));
        System.out.println(cache.getUnchecked("forth"));

        System.out.println(cache.size());
        System.out.println(cache.getIfPresent("first"));
        System.out.println(cache.getIfPresent("forth"));
    }

    @Test
    public void whenEntryIdle_thenEviction() throws InterruptedException {
        CacheLoader<String, String> loader;
        loader = new CacheLoader<String, String>() {
            @Override
            public String load(String s) throws Exception {
                return s.toUpperCase();
            }
        };

        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .expireAfterAccess(2, TimeUnit.MILLISECONDS)
                .build(loader);

        System.out.println(cache.getUnchecked("hello"));
        System.out.println(cache.size());
        System.out.println(cache.getUnchecked("hello"));
        Thread.sleep(300);

        cache.getUnchecked("test");
        System.out.println(cache.size());
        System.out.println(cache.getIfPresent("hello"));
    }
}
