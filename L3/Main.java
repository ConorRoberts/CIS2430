public class Main{

  public static void main(String[] args){
      WordCount x = new WordCount();
      x.addWord("greg");
      x.addWord("oranges");
      System.out.println(x.countWord("greg") + " : "+x.countWord("oranges"));
  }
}
