public class Subtract implements Operate{
    @Override
    public Double getresult(Double... Operand) {
        Double res=Operand[0];
        for(int i=1;i<Operand.length;i++){
            res-=Operand[i];
        }
        return res;
    }
}
