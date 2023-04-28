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
        int N = A.length;
        if(N==0)
            return A;
        for(int i=1;i<=K;i++){
            int last = A[N-1];
            for(int j=N-1;j>0;j--){
                A[j]=A[j-1];
            }
            A[0]=last;
        }
        return A;
    }
}
