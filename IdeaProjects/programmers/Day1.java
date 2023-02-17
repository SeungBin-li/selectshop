import java.time.*;
public class Day1 {
    public String solution(String s) {
        String answer = "";
        String[] input = s.split(" ");

        int prime_max = 0;
        int prime_min = 9999999;

        for (int i = 0; i < input.length; i++ ){
            int num = Integer.parseInt(input[i]);

            if (isPrime(num)){
                // input[i]가 소수일 때
                if(prime_max<num){
                    prime_max=num;
                }
            } else {
                // input[i]가 소수가 아닐 때
                if(prime_min>num){
                    prime_min=num;
                }
            }
            answer = prime_min+" "+prime_max;
        }
        return answer;
    }

    public static void main(String[] args) {
        Day1 method = new Day1();
        String s = "97 75 88 6 95 92 73";
        System.out.println(method.solution(s));
    }
    public boolean isPrime(int num) {
        boolean isprime = true;
        for(int i=2; i<num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

}

