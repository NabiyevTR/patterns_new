package patterns.proxy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Slf4j
public class ProxyLibrary implements Library  {

    private final Library nativeLibrary;
    private final Map<String, Book> cache = new HashMap<>();

    @Override
    public Book getProductByUid(String uid) {
        if (cache.containsKey(uid)) {
            log.info("Load book with id '{}' from cache", uid );
            return cache.get(uid);
        }
        Book book =  nativeLibrary.getProductByUid(uid);
        cache.put(uid, book);
        log.info("Load book with id '{}' from library", uid );
        return book;
    }
}
