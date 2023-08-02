package Interface.App;

import Interface.Interfaces.DeductionService;

public class SPDeductionService implements DeductionService {
    
    //A notação @Overrride indica que a classe HighSalary está implementando um método da interface Increase.
    @Override
    public double deduction(double amount){
        return amount * 0.1; //A dedução específica de SP é de 10%
    }
}
