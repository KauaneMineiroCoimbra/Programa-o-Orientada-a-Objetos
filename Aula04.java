public class Aula04 {
    public static void main(String[] args){
        //Animal a1 = new Animal("Belinha", 20, "cachorro");
        Animal a1 = new Cachorro("Belinha", 20);
        //Animal a2 = new Animal("Sheldon", 4, "gato");
        Animal a2 = new Gato("Sheldon", 4);

        System.out.println(a1);
        System.out.println(a2.toString());


        Clinica c = new Clinica();
        c.fazOrcamento(a1,true);
        c.fazOrcamento(a2);

        Animal[] animais = {
            a1,
            a2,
            new Cachorro("Pitoco", 6),
            new Cachorro("Sofia",5),
            new Gato("Nata",5),
            new Viralata("Lilica", 10),
            new Viralata(12)
        };
        c.fazOrcamento(animais,true);

        //Object o = new Cachorro("Pitoco", 10);
        //o.toString();
        //System.out.println();
        //System.out.println("xasad\fas");
        //System.out.println(1);
        //System.out.println(1.0);
        //System.out.println(1f);
        //System.out.println(true);

        //Teste t = new Teste();
        //t.soma(1,2);
        //t.soma(3,7,2);

        //--Fazendo com listas:
        c.addAnimal( a1 );
        c.addAnimal( a2 );
        c.addAnimal( new Viralata(15) );
        c.addAnimal( new Cachorro("Spike", 10));
        c.addAnimal( new Gato("Guto", 6) );
        c.fazOrcamento();

    }
}