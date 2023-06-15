public class Add implements Operate{
    @Override
    public Double getresult(Double... Operand) {
        Double sum=0.0;
        for(Double num:Operand){
            sum+=num;
        }
    return sum;
    }
}
