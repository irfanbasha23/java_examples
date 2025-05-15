package designpatterns.behavioral;

class Request {
    private String request;

    public Request(String request) {
        this.request = request;
    }
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler supportHandler);
}
class Level1SupportHandler implements SupportHandler {
    SupportHandler supportHandler;
    @Override
    public void handleRequest(Request request) {
        if ("level1".equalsIgnoreCase(request.getRequest())) {
            System.out.println("Handled1");
        } else if(supportHandler != null){
            supportHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }
}
class Level3SupportHandler implements SupportHandler {
    SupportHandler supportHandler;
    @Override
    public void handleRequest(Request request) {
        if ("level3".equalsIgnoreCase(request.getRequest())) {
            System.out.println("Handled3");
        } else if(supportHandler != null){
            supportHandler.handleRequest(request);
        }

    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }
}
class Level2SupportHandler implements SupportHandler {
    SupportHandler supportHandler;
    @Override
    public void handleRequest(Request request) {
        if ("level2".equalsIgnoreCase(request.getRequest())) {
            System.out.println("Handled2");
        } else if(supportHandler != null){
            supportHandler.handleRequest(request);
        }

    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }
}
public class ChainOfResponsibility {

    public static void main(String[] args) {
        SupportHandler level1 = new Level1SupportHandler();

        SupportHandler level2 = new Level2SupportHandler();
        SupportHandler level3 = new Level2SupportHandler();

        Request request1 = new Request("level1");
        Request request2 = new Request("level2");
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);
        level3.setNextHandler(null);
        level1.handleRequest(request2);
    }
}
