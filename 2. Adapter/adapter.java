// TARGET
public interface OldJoystickImp {
  public void connectOldJoystick() {}
}

public class OldJoystick implements OldJoystickImp {
  @Override
  public void connectOldJoystick() {
    System.out.print("Connecting the old joystick!")
  }
}

// ADAPTEE
public class USBJoystick {

  public USBJoystick(){}

  public void connectUSB() {
    System.out.print("Connecting with USB!");
  }
}

// ADAPTER
public class JoystickAdapter implements OldJoystickImp {
  
  // Instantiate our USBJoystick class
  USBJoystick usbJoystick = new USBJoystick();

  public JoystickAdapter(USBJoystick usbJoystick) {
    this.usbJoystick = usbJoystick;
  }
  
  // Implement target the method we want to adapt
  @Override
  public void connectOldJoystick() {
    // Use *our* way to do it
    usbJoystick.connectUSB();
  }
}