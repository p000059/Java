package Interface.App;

import Interface.Interfaces.DeductionService;

public class PayService {
    
    //Essa classe Payment tem uma dependência com o Increase mas não sabe qual será a implementação se, MG ou SP.
    private DeductionService deductionService;

    //Mas para saber qual a implementação se MG ou SP, é necessário um construtor recebendo um tipo de Increase, que pode ser SP ou MG.
    public PayService(DeductionService deductionService){

        //Aqui é atribuído a esta deductionService declarada nesta classe o valor deductionService enviado pela classe principal que controla quem vem se, SP ou MG.
        this.deductionService = deductionService;
    }

    public double tax(double amount){
        
        //Ambas a classes MG e SP possuem o método deduction pois estas implementam a interface Increase,
        //pois de trata de um mesmo cálculo mas com valores de deduções diferentes de cada estado.
        amount = amount - deductionService.deduction(amount);
        return amount * 0.2;
    }
}
