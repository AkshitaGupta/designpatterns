package Behavioral.ChainOfResponsibility.ValueHandlingEg;

public class Driver {


    public static void main(String[] args)
    {
        // Setup Chain of Responsibility
        Handler h1 = new NegativeHandler();
        Handler h2 = new ZeroHandler();
        Handler h3 = new PositiveHandler();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        // Send requests to the chain
        h1.handleRequest(new Request("Negative Value ", -1));
        h1.handleRequest(new Request("Negative Value ",  0));
        h1.handleRequest(new Request("Negative Value ",  1));
        h1.handleRequest(new Request("Negative Value ",  2));
        h1.handleRequest(new Request("Negative Value ", -5));
    }


}
