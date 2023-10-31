package CursoJava.EX12;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String name;
    private Double salario;
    private Integer id;

    public Funcionario(Integer id, String name, Double salario) {
        this.name = name;
        this.salario = salario;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalario() {
        return salario;
    }

    public void salaryIncrease(double porcentagem) {

        this.salario += (salario * (porcentagem / 100));
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salario);
    }
}