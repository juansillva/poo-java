package exame;

public class Exame  {
    int idExame;
    int nivelGlicose;

    Exame (int idExame, int nivelGlicose){
        this.idExame = idExame;
        this.nivelGlicose = nivelGlicose;
    }

    String obterExame (){
        if (nivelGlicose <= 99){
            return "Normal";
        }else if (nivelGlicose<=125){
            return "Pré-diabetes";
        }else{
            return "Diabetes";
        }
    }
}

