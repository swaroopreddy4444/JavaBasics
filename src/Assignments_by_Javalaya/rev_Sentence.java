// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      String str= "Swaroop is QA";

String strnew="";

String[] list=str.split(" ");

for(String word:list){
	strnew=word+" "+strnew;
}
System.out.println(strnew.trim());

    }
}
