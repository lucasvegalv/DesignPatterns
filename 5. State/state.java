// CONTEXT
public class VendingMachineContext {

  public VendingMachineContext() {
    // Initial State
    this.state = new ReadyState();
  };

  private state: VendingMachineState;

  public void setState(VendingMachineState state) {
    this.state = state;
  }

  public void request(){  
    // Delegate the work to the interface and let it decide how to handle the request
    state.handleRequest();
  }
}

// STATE INTERFACE
public interface VendingMachineState {
  public void handleRequest(VendingMachineContext context) {};
}


// CONCRETE STATES
public class ReadyState implements VendingMachineState {

  @Override
  public void handleRequest(VendingMachineContext context) {
    System.out.print("Ready state: Please select a product");
  }
}

public class OutOfStockState implements VendingMachineState {

  @Override
  public void handleRequest(VendingMachineContext context) {
    System.out.print("Out of stock state: Product unavailable. Please select another product.");
  }
}

public class PaymentPendingState implements VendingMachineState {

  @Override
  public void handleRequest(VendingMachineContext context) {
    System.out.println("Payment pending state: Dispensing product.");
  }
}

public class ProductSelectedState implements VendingMachineState {

  @Override
  public void handleRequest(VendingMachineContext context) {
    System.out.println("Product selected state: Processing payment.");
  }
}