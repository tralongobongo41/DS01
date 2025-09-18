//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyLL<Integer> myLL = new MyLL<>();

        for(int i = 0; i < 10; i++)
        {
            myLL.addFirst(i);
        }

        //System.out.println(myLL.contains(123));
        myLL.display();

    }
}