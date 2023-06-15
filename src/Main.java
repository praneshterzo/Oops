import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        String input=readinput.inp();
        Queue<String> Operator;
        Queue<String> Operand;
        String operat[]=input.split("[-+/*]");
        String operand[]=input.split("[0-9]+");
        Operator=new LinkedList<>(Arrays.asList(operat));
        Operand=new LinkedList<>(Arrays.asList(operand));
        Double res= Double.parseDouble(Operand.poll());
        while(!Operand.isEmpty()){
            String op=Operator.poll();
            Operate operate;
            switch(op){
                case ("+"):
                    operate=new Add();
                    break;
                case ("-"):
                    operate=new Subtract();
                    break;
                case ("*"):
                    operate=new Multiply();
                    break;
                case ("/"):
                    operate=new Divide();
                    break;
                default:
                    continue;
            }
            double num=Double.parseDouble(Operand.poll());
            res=operate.getresult(res,num);
        }
        System.out.println(res);
    }
}