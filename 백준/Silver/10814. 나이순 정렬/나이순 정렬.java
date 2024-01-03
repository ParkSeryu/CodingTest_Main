import java.util.*;

public class Main {

    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Member[] members = new Member[N];
        int idx = 0;
        while (N-- > 0) {
            int age = sc.nextInt();
            String name = sc.next();
            members[idx++] = new Member(age, name);
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Member member : members) {
            System.out.println(member.getAge() + " " + member.getName());
        }


    }
}