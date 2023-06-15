public class Multiply implements Operate{
    @Override
    public Double getresult(Double... Operand) {
        Double res=1.0;
        for(Double num:Operand){
            res*=num;
        }
        return res;
    }
}
