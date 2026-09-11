import java.util.ArrayList;
import java.util.List;

public class Clinica {

    List<Animal> animais = new ArrayList();
    public void addAnimal( Animal a ){
        animais.add(a);
    }

    public void fazOrcamento( boolean temExame ) {
        for( Animal a : animais ){
            fazOrcamento(a,temExame);
        }
    }
    public void fazOrcamento(){
        fazOrcamento(false);
    }

    public void fazOrcamento( Animal a, boolean temExame ){
        int total = 0;
        total += a.getValorDaConsulta();
        if(temExame){
            total += a.getValorDoExame();
        }
        System.out.println(a.getEspecie() + " - " + a.getNome() + " - R$" + total);
    }

    public void fazOrcamento(Animal a){
        fazOrcamento(a,false);
    }

    public void fazOrcamento( Animal[] animais, boolean temExame ){
        int total = 0;
        for( Animal a : animais ){
            fazOrcamento(a,temExame);
            total += a.getValorDaConsulta();
            if(temExame){
                total += a.getValorDoExame();
            }
        }
        System.out.println("Total R$" + total);
    }

    public void fazOrcamento( Animal[] animais ){
        fazOrcamento(animais,false);
    }
}
