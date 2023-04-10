package patterns.proxy;

public class Main {
    public static void main(String[] args) {
        Library nativeLibrary = new NativeLibrary();
        Library proxyLibrary = new ProxyLibrary(nativeLibrary);
        proxyLibrary.getProductByUid("1");
        proxyLibrary.getProductByUid("1");
    }
}
