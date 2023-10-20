package Interface.App;

import Interface.Interfaces.DeductionService;

public class MGDeductionService implements DeductionService {
    
    //A notação @Overrride indica que a classe AverageSalary está implementando um método da interface Increase.
    @Override
    public double deduction(double amount){
        return amount * 0.12; //A dedução específica de MG é de 12%
    }

}
