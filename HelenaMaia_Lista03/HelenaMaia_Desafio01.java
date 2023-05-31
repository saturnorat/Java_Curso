/*
 * algoritmo que conta de 0 até 200 mostrando os multiplos de 10
 * 17/05/2023
 * Helena Maia
 */
public class HelenaMaia_Desafio01{
    public static void main(String[] args){
        //variaveis e inicialização
        int cont1 = 0;
        //laço for
        for(int cont = 0; cont < 200; cont++){
            if(cont1 == 10){
                System.out.println("O número "+cont+" é múltiplo de 10");
                cont1 = 0;
            }else{
                System.out.println(cont);
            }
            cont1++;
        }
    }
}