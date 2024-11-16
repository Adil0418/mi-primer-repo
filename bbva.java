class Persona{
    String nombre;
    String sexo;
    int edad;

    Persona(String nombre, String sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad =edad;
    }

    void hablar(){
        System.out.println("Hola son una persana");
    }
}

class Programa {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}