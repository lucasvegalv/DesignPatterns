// Context
public class Traveler {

  // Attribute to reference and store the strategy
  private TravelStrategy strategy;

  // Method to set and change between strategies
  public void setTravelStrategy(TravelStrategy strategy) {
    this.strategy = strategy;
  }

  // General method and algorithm that differ depends on the strategy
  public void travel() {
    if(strategy != null) {
      // Use the interface to call the method
      strategy.travel();
    } else {
      System.out.print("Please set a travel strategy!");
    }
  }
}


// Interface
public Interface TravelStrategy {
  void travel();
}

// Concrete strategies
public class CarStrategy implements TravelStrategy {
  
  @Override
  public void travel() {
    System.out.print("Traveling by car!");
  }
}

public class WalkingStrategy implements TravelStrategy {
  
  @Override
  public void travel() {
    System.out.print("Traveling by walking! I'm tired...");
  }
}

public class BicycleStrategy implements TravelStrategy {
  
  @Override
  public void travel() {
    System.out.print("Traveling by bike! My legs hurts a bit...");
  }
}

// EXAMPLE OF USE

Traveler traveler = new Traveler();

// Travel by car
traveler.setTravelStrategy(new CarStrategy());
traveler.travel();