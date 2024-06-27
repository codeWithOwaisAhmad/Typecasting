
public class toString {
  private String name;
  private int age;

  // Constructor
  public toString(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Override the toString method
  @Override
  public String toString() {
      return "Person{name='" + name + "', age=" + age + "}";
  }

  // Main method to test the toString method
  public static void main(String[] args) {
      toString person = new toString("Alice", 30);
      System. out.println(person); // Calls person.toString() implicitly
  }
}

