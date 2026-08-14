import java.util.Scanner;

public class Primenumbers {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

int n, count = 0, num = 2;

System.out.print("Enter the value of n: ");
n = sc.nextInt();

System.out.println("First " + n + " Prime Numbers are:");

while (count < n) {
boolean isPrime = true;

for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
isPrime = false;
break;
}
}

if (isPrime) {
System.out.print(num + " ");
count++;
}

num++;
}

sc.close();
}
}