public class Task017 {
    public static void main(String[] args) {
      Person myObj = new Person();
      myObj.name = "John";              //  ERROR: name has private access
      System.out.println(myObj.name);   //  ERROR: name has private access
    }
  }