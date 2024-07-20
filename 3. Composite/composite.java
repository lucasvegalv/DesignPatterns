// Component
public interface FileSystemComponent {

  // Common methods that Files and Directories can do
  public void display();
  public int getSize();
}

// Leaf
public class File implements FileSystemComponent {

  String name;
  int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override 
  public void display() {
    System.out.print("This is the file!")
  }

  public int getSize() {
    System.out.print("This is the size: " + this.size);
  }
}


// Composite
public class Directory implements FileSystemComponent {

  // Can contain other files or directories 
  List<FileSystemComponent> components = new ArrayList<>();
  String name;

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public void display() {
      System.out.println("Directory: " + name);
      for (FileSystemComponent component : components) {
          component.display();
      }
  }

  @Override
  public int getSize() {
      int totalSize = 0;
      for (FileSystemComponent component : components) {
          totalSize += component.getSize();
      }
      return totalSize;
  }
}

// DEMO USE CASE

  // Create some files and directories
File textFile = new File("letter.txt", 15);
File resume = new File("resume.pdf", 15);

Directory personal = new Directory("personal");
Directory work = new Directory("work");

  // Add files to directories
personal.add(textFile);
work.add(resume);  
  
  // Add directories to other directories
personal.add(work);