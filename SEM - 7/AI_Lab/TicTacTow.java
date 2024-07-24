import java.util.*;
class TicTacTow {
    public static void main(String[] args) {
        System.out.println(" 0 | 1 | 2 ");
        System.out.println("---|---|---");
        System.out.println(" 3 | 4 | 5 ");
        System.out.println("---|---|---");
        System.out.println(" 6 | 7 | 8 ");
        System.out.println("---|---|---");

        System.out.println("There are Two Users : (1st User <<X>> & 2nd User<<O>>)");
        System.out.println("First Turn Is 1st User <<X>>");

        int[] a = new int[9];
        for(int i=0; i<9; i++)
        {   
            a[i] = 0;
        }
        boolean turn = true;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<9; i++)
        {
            if(turn)
            {
                System.out.println("----Turn For User <<X>>----");
            }
            else
            {
                System.out.println("----Turn For User <<O>>----");
            }

            System.out.print("\nEnter Your Index : ");
            int index = sc.nextInt();

            if(turn)
            {
                a[index] = 1;
            }
            else
            {
                a[index] = 2;
            }

            for(int j=0; j<3; j++)
            {
                System.out.print(a[j]+"|\t");
            }
            // System.out.print("---|---|---\n");
            for(int j=3; j<6; j++)
            {
                System.out.print(a[j]+"|\t");
            }
            // System.out.print("---|---|---\n");
            for(int j=6; j<9; j++)
            {
                System.out.print(a[j]+"|\t");
            }
            // System.out.print("---|---|---\n");

            if(win(a) == 1){
                System.out.println("!!------ 1st <<X>> User Win ------!!");
                return;
            }
            else if(win(a) == 2){
                System.out.println("!!------ 2nd <<O>> User Win ------!!");
                return;
            }
            turn = !turn;
        }
        System.out.println("Match Tie Please Run a Program Again");
    }

    public static int win(int[] a)
    {
        for(int i=0; i<2; i++)
        {
            if(i == 0 || i == 2)
            {
                if(i == 0)
                {
                    boolean check = true;
                    for(int j=0; j<=8; j+=4)
                    {
                        if(a[j] != 1){
                            check = false;
                        }
                    }
                    if(check){
                        return 1;
                    }
                }
                if(i == 2)
                {
                    boolean check = true;
                    for(int j=2; j<=6; j+=2)
                    {
                        if(a[j] != 1){
                            check = false;
                        }
                    }
                    if(check){
                        return 1;
                    }
                }
            }
        }

        for(int i=0; i<9; i++)
        {
            if(i == 0 || i == 2)
            {
                if(i == 0)
                {
                    boolean check = true;
                    for(int j=0; j<=8; j+=4)
                    {
                        if(a[j] != 2){
                            check = false;
                        }
                    }
                    if(check){
                        return 2;
                    }
                }
                if(i == 2)
                {
                    boolean check = true;
                    for(int j=2; j<=6; j+=2)
                    {
                        if(a[j] != 2){
                            check = false;
                        }
                    }
                    if(check){
                        return 2;
                    }
                }
            }
        }

        for(int k=0; k<2; k++)
        {
            int cnt = 1;
            int index = k;
            boolean check = true;
            while(cnt <= 3)
            {
                if(a[index] != 1){
                    check = false;
                }
                index += 3;
                cnt++;
            }
            if(check){
                return 1;
            }
        }

        for(int k=0; k<2; k++)
        {
            int cnt = 1;
            int index = k;
            boolean check = true;
            while(cnt <= 3)
            {
                if(a[index] != 2){
                    check = false;
                }
                index += 3;
                cnt++;
            }
            if(check){
                return 2;
            }
        }

        for(int i=0; i<=6; i+=3)
        {
            int limit = i + 2;
            boolean check = true;
            for(int j=i; j<=limit; j++)
            {
                if(a[j] != 1){
                    check = false;
                }
            }
            if(check){
                return 1;
            }
        }

        for(int i=0; i<=6; i+=3)
        {
            int limit = i + 2;
            boolean check = true;
            for(int j=i; j<=limit; j++)
            {
                if(a[j] != 2){
                    check = false;
                }
            }
            if(check){
                return 2;
            }
        }
        return -1;
    }
}