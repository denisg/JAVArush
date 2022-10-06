package Enumeraciones;

public enum Continentes {
    AFRICA(36),
    EUROPA(48),
    ASIA(19),
    AMERICA(34),
    OCEANIA(14);

    //atributo paises
    private final int paises;

    //constructor de cada elemento
    Continentes(int paises) {
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }

}
