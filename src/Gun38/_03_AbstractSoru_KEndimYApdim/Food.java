package Gun38._03_AbstractSoru_KEndimYApdim;

public abstract class Food {
   private String name;
   abstract void madeln();
   abstract  void taste();



   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
