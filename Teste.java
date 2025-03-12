import java.util.Scanner;
	
public class Teste {
public static void main(String[] args) {
	
   Scanner keyandmous = new Scanner(System.in);
   
   System.out.println("Olá, digite um número qualquer:");
   int numeroUm = keyandmous.nextInt();
   
   System.out.println("Olá, digite um número qualquer:");
   int numeroDois = keyandmous.nextInt();
   
  int resultadoUm = (numeroUm + numeroDois);
  int resultadoDois = (numeroUm - numeroDois);
  int resultadoTres = (numeroUm / numeroDois);
  float resultadoQuatro = (numeroUm * numeroDois);
  
  String texto = "A soma do número "+numeroUm+" e do número "+numeroDois+" é de "+resultadoUm+"";
  System.out.println(texto);
  String textoDois = "A subtração do número "+numeroUm+" e do número "+numeroDois+" é de "+resultadoDois+"";
  System.out.println(textoDois);
  String textoTres = "A divisao do número "+numeroUm+" e do número "+numeroDois+" é de "+resultadoTres+"";
  System.out.println(textoTres);
  String textoQuatro = "A multiplicação do número "+numeroUm+" e do número "+numeroDois+" é de "+resultadoQuatro+"";
  System.out.println(textoQuatro);
  
  /*
  aqui coloquei o "print" em Strings
  pois é mais fácil ao mostrar ao úsuario
  basta alterar somente as váriaveis em cada um e printar somente o string
  poderia utilizar um sistema que substitui as variaveis após ela ser usada
  iria poupar linhas e processamento da maquina, porém como é um projeto pequeno
  não há tanta diferença

  */
   } 
}

