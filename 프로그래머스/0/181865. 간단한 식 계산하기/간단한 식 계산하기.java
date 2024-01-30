class Solution {
    public int solution(String binomial) {
        String[] tokens = binomial.split(" ");

        // 배열의 첫 번째와 세 번째 요소를 정수로 변환
        int operand1 = Integer.parseInt(tokens[0]);
        int operand2 = Integer.parseInt(tokens[2]);

        // 이항식의 연산자에 따라 연산 수행
        switch (tokens[1]) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + tokens[1]);
        }
    }
    }
