package Behavioral.ChainOfResponsibility.ValueHandlingEg;

public class NegativeHandler  extends Handler {

    public void handleRequest(Request request){
        if(request.getValue() < 0){
            System.out.println("Negative values are being handles by Negative handler:");
            System.out.println("\tNegativeHandler.HandleRequest : " + request.getDescription() + request.getValue());
        }
//        else{
//            super.handleRequest(request);
//        }
    }
}
