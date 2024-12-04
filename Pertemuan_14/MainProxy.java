// Subject Interface
interface RealSubject {
    void request();
}

// RealSubject
class RealSubjectImpl implements RealSubject {
    @Override
    public void request() {
        System.out.println("Request processed by RealSubject");
    }
}

// Proxy
class Proxy implements RealSubject {
    private RealSubjectImpl realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubjectImpl();
        }
        realSubject.request();
    }
}

// Client
public class MainProxy {
    public static void main(String[] args) {
        RealSubject proxy = new Proxy();
        proxy.request();
    }
}
