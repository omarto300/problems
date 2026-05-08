package omar.codility.exercises;

public class ArrListLen {
  public int solution(int[] A) {
    int initial = A[0];
    int contador = 1;
    while(initial != -1){
      contador++;
      initial = A[initial];
    }
    System.out.println(contador);
    return contador;
  }
}
