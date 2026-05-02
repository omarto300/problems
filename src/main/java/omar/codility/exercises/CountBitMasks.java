package omar.codility.exercises;

public class CountBitMasks {
    private final int bits;

    public CountBitMasks(int bits) {
        this.bits = bits;
    }

    public int solution(int A, int B, int C) {
        int cerosA = cuentaCombinaciones(A);
        int cerosB = cuentaCombinaciones(B);
        int cerosC = cuentaCombinaciones(C);
        long sumaIndividuales = cerosA+cerosB+cerosC;

        long convinacionAB = cuentaCombinaciones(A | B);
        long convinacionAC = cuentaCombinaciones(A | C);
        long convinacionBC = cuentaCombinaciones(B | C);
        long sumasGrupales = convinacionAB+convinacionAC+convinacionBC;

        long sumaTres = cuentaCombinaciones(A | B | C);

        System.out.println("sumaIndividuales: "+sumaIndividuales);
        System.out.println("sumasGrupales: "+sumasGrupales);
        System.out.println("sumaTres: "+sumaTres);
        return (int) (sumaIndividuales - sumasGrupales + sumaTres);
    }

    private int cuentaCombinaciones(int N){
        int ceros = bits - Integer.bitCount(N);
        return 1 << ceros;
    }
}
