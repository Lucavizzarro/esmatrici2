public class Main {
 public static void main(String[] args) {
        int[][] matrice = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        if (simmetrico(matrice)) {
            System.out.println("La matrice è simmetrica rispetto alla diagonale principale.");
        } else {
            System.out.println("La matrice non è simmetrica rispetto alla diagonale principale.");
        }

 }


   
    public static boolean simmetrico(int[][] matrice) {
        int n = matrice.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrice[i][j] != matrice[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

   
    
}