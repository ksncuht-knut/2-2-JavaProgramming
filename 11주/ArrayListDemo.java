import java.util.*;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        int data;
        int sum = 0;

        while ((data = in.nextInt()) >= 0)
        {
            scores.add(data);
        }
        for (int i = 0; i < scores.size(); i++)
        {
            sum = sum + scores.get(i);
        }
        System.out.println("평균 = " + sum / scores.size());
    }
}