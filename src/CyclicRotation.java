public class CyclicRotation {
    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] result ;
        result = cyclicRotation.solution(new int[] {3, 8, 9, 7, 6},3);
        for(int i:result){
            System.out.println(i);
        }
    }
    public int[] solution(int[] A, int K){
        int[] result = A;
        for(int i=1;i<=K;i++){
            result=rotate(result);
        }
        return result;
    }
    public int[] rotate(int[] A){
        int length = A.length;
        int[] B = new int[length];
        B[0] = A[length-1];
        System.arraycopy(A, 0, B, 1, length - 1);
        return B;
    }
}
