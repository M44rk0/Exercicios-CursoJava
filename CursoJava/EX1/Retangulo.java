package CursoJava.EX1;

public class Retangulo {

    public double Width;
    public double Height;

    public double Area(){
        return Width * Height;
    }

    public double Perimetro(){
        return Width + Width + Height + Height;

    }

    public double Diagonal(){
        return Math.sqrt((Height*Height) + (Width * Width));

    }
}
