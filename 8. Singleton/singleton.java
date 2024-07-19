public class Singleton {

  // 1. Private and static variable to store our Singleton instance
  private static Singleton instance = null;

  // 2. Private constructor
  private Singleton(){}

  // 3. Static method to instantiate a Singleton just one time
  public static Singleton getInstance() {

    // Validation so we create just one instance of our Singleton
    if(instance == null) {
      instance = new Singleton();
    }

    return instance;
  }
}