// Classes that represent a "complex" system

public class Television {
  public void turn_on() {
    System.out.print("Turning on the TV");
  }

  public void turn_off() {
    System.out.print("Turning off the TV");
  }
}


public class SoundSystem {
  public void turn_on() {
    System.out.print("The SS is on");
  }

  public void turn_off() {
    System.out.print("The SS is off");
  }

  public void setVolume(int level) {
    System.out.println("Sound system volume set to " + level);
}
}


public class DVDPlayer {
  public void turn_on() {
    System.out.print("DVD Player is on");
  }

  public void turn_off() {
    System.out.print("DVD Player is off");
  }

  public void play(String movie) {
    System.out.println("Playing movie: " + movie);
}
}


// Facade
public class HomeTheaterFacade {
  public Television tv;
  public DVDPlayer dvd;
  public SoundSystem soundSystem;

  public HomeTheaterFacade(TV tv, DVDPlayer dvd, SoundSystem soundSystem) {
    this.tv = tv;
    this dvd = dvd;
    this.soundSystem = soundSystem;
  }

  // Functions to interact with the system
  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    tv.on();
    soundSystem.on();
    soundSystem.setVolume(5);
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }

  public void endMovie() {
    System.out.println("Shutting down...");
    tv.off();
    soundSystem.off();
    dvdPlayer.off();
  }
}