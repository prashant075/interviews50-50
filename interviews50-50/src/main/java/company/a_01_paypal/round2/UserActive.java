package company.a_01_paypal.round2;

import java.util.ArrayList;
import java.util.List;

/*
 * Find max Active User of an  hours in App
 * */
public class UserActive {
    public static void main(String[] args) {
        List<UserEvent> events = new ArrayList<>();
        events.add(new UserEvent("a", 7, 10));
        events.add(new UserEvent("b", 7, 8));
        events.add(new UserEvent("c", 6, 9));
        int[] userTime = new int[12];
        int max = Integer.MIN_VALUE;
        for (UserEvent event : events) {
            for (int i = event.getLoginTime(); i < event.getLogoutTIme(); i++) {
                userTime[i] += 1;
            }
            int logout = event.getLogoutTIme();
            if (userTime[logout] > 0)
                userTime[logout] -= 1;
            for (int i = event.getLoginTime(); i <= event.getLogoutTIme(); i++) {
                if (userTime[i] > max)
                    max = i;
            }
        }
        // Arrays.stream(userTime).forEach(System.out::print);

        System.out.println(max);
    }

    static class UserEvent {
        String userId;
        int loginTime;
        int logoutTIme;

        public UserEvent(String userId, int loginTime, int logoutTIme) {
            this.userId = userId;
            this.loginTime = loginTime;
            this.logoutTIme = logoutTIme;
        }

        public String getUserId() {
            return userId;
        }

        public int getLoginTime() {
            return loginTime;
        }

        public int getLogoutTIme() {
            return logoutTIme;
        }
    }
}
