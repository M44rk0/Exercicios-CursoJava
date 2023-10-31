package CursoJava.EX17;

public class PessoaPublica extends Pessoa{

    private Double healthCosts;

    public PessoaPublica(){
        super();
    }

    public PessoaPublica(String name, Double anualIncome, Double healthCosts) {
        super(name, anualIncome);
        this.healthCosts = healthCosts;
    }

    public Double getHealthCosts() {
        return healthCosts;
    }

    public void setHealthCosts(Double healthCosts) {
        this.healthCosts = healthCosts;
    }

    @Override
    public Double tax() {
        if(getAnualIncome() < 20000.00){
            return(getAnualIncome() * 0.15 - healthCosts * 0.5);
        }
        else{
            return(getAnualIncome() * 0.25 - healthCosts * 0.5);
        }
    }
}
