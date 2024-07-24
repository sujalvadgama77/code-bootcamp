import java.util.*;
class TicTacTowBot
{
    public static void main(String[] args)
    {
        System.out.println(" 0 | 1 | 2 ");
        System.out.println("---|---|---");
        System.out.println(" 3 | 4 | 5 ");
        System.out.println("---|---|---");
        System.out.println(" 6 | 7 | 8 ");
        System.out.println("---|---|---");

        System.out.println("There are Two Users : (1st User <<X>> & 2nd User(BOT)<<O>>)");
        System.out.println("First Turn Is 1st User <<X>>");

        int[] a = new int[9];
        boolean turn = false;
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> user = new HashSet<>();
        HashSet<Integer> bot = new HashSet<>();

        for(int i=0; i<9; i++)
        {
            if(turn)
            {
                System.out.print("\nTurn For You (Enter Index To Mark <<X>>) :- ");
                int index = sc.nextInt();
                a[index] = 1;
                turn = !turn;
                user.add(index);
            }
            else
            {
                int index = bot(i,a,user,bot); 
                System.out.println(index);
                a[index] = 2;
                turn = !turn;
                bot.add(index);
            }

            System.out.print("\n\n----------Matrix-----------\n\n");
            int cnt = 0;
            for(int j=0; j<9; j++)
            {
                if(cnt == 3)
                {
                    System.out.println();
                    cnt = 0;
                }
                System.out.print(a[j]+"\t");
                cnt++;
            }
            if(win(a) == 1){
                System.out.println("!!------ 1st <<X>> User Win ------!!");
                return;
            }
            else if(win(a) == 2){
                System.out.println("!!------ 2nd <<O>> BOT Win ------!!");
                return;
            }
        }
        System.out.println("Match Tie Please Run a Program Again");
    }

    public static int bot(int i, int[] a, HashSet<Integer> user, HashSet<Integer> bot)
    {
        if(i == 0 || i == 2)
        {
            boolean filled = false;
            while(!filled)
            {
                Random rand = new Random();
                int randomNumber = rand.nextInt(9);
                if(a[randomNumber] == 0)
                {
                    return randomNumber;
                }
            }
        }
        int[] magic = {2,7,6,9,5,1,4,3,8};
        int total = 0;
        Iterator<Integer> iterator = bot.iterator();
        while (iterator.hasNext())
        {
            int number = iterator.next(); 
            total += magic[number];
        }
        int putindex = 15 - total;
        int putindex1 = 0;
        if(!user.contains(putindex) && putindex < 9)
        {
            return putindex-1;
        }
    
            int usertotal = 0;
            Iterator<Integer> k = user.iterator();
            while (k.hasNext())
            {
                int number = k.next(); 
                total += magic[number];
            }
            putindex1 = 15 - total;
        return putindex1-1;
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