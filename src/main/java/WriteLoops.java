public class WriteLoops {


    private static final int _3 = 3;

    public int oneToFive() {
        int w = 0;
        for (int z = 0; z < 5; z++)
        w = w + 1;

        return w;
    }

    public int oneToTen() {
        int w = 0;

        for (int z = 0; z < 10; z++)
        w = w + 1;
        // each time through the loop

        return w;
    }

    public int startAtTwentyOne() {
        int w = 0;

        for (int z = 21; z <= 31; z++)

        w = w + 1;
        // each time through the loop

        return w;
    }

    public int countDown() {
        int w = 0;

     for (int z = 100; z >= 0; z--)
        w = w + 1;


        return w;
    }

    public int byTwoTo32() {
        int w = 0;


        for (int z = 0; z <=32; z += 2)
        w = w + 1;
        // each time through the loop
        return w;
    }

    public int countDownFrom5000() {
        int w = 0;

        for (int z = 5000; w > 0; w -= 11)
        // Write a FOR loop from 1 to less than 5001 by 11s.
        // calling
        w = w + 1;
        // each time through the loop

        return w;
    }

    public int nestedFors() {
        int w = 0;
        for (int z = 0; z < 20; z++) {
            for (int k = 0; k <= 4; k++) {
                // Write a nested FOR loop(s), where one counts from
                // 0 to less than 20 and the inner one counts from 0 to 4
                // calling
                w = w + 1;
                // each time through the inner loop


            }
        }
        return w;
    }

    public int helloZipCode() {
        int w = 0;


        for (int z = 5; z < 105; z++) {
            // Write a FOR loop that counts from 5 to 105. Put an IF
            // statement inside the loop that checks the
            // loop index counter and if it’s greater than 51,
            // prints “Hello Zipcode” instead of the statement w = w + 1;
            if (z > 51) {
                System.out.println("Hello Zipcode");
                break;
            }
                // Write a FOR loop that counts from 5 to 105. Put an IF
                // statement inside the loop that checks the
                // loop index counter and if it’s greater than 51,
                // prints “Hello Zipcode” instead of the statement w = w + 1;

                // calling
                w = w + 1;
                // each time through the inner loop


            }

            return w;
        }


    public void simpleLoops() {
        int i = 0;

        // sample while loop
        while (i <= 5) {
            System.out.println("Eww.");
            i = i + 1;
        }

        // sample do...while loop
        i = 8;
        do {
            System.out.println("Eww.");
            i = i - 1;
        } while (i > 0);
        // what's the primary difference between them?!?
    }

    // Write a WHILE loop that checks “gpsCurrentLocation()”
    // and if that is not equal to “Home” then and it calls “driveSomeMore()”.
    // After the loop is done, print “Honey, I’m Home!”
    public int driveHome() {
        int w = 0;

        while (!gpsCurrentLocation().equals("Home")) {
            driveSomeMore();

            // you need to use a .equals for two Strings.
            // calling
            w = w + 1;
        }
        // each time through the inner loop
        System.out.println("Honey, I'm Home!");
        return w;
    }

    private void driveSomeMore() {
    }

    private void gpsCurrentLocation() {
    }


    // Getting harder...
    // First declare and set “highestScore” to 236. Then set “currentScore” to
    // “gameNextScore()”. Then write a WHILE loop that checks "runningScore"
    // is less than “highestScore” and if it is, adds “currentScore” to
    // "runningScore"
    // and then sets “currentScore” to “gameNextScore()”
    public int checkGameScore() {
        int w = 0;
        int highestScore = 236;
        int currentScore = gameNextScore();
        int runningScore = 0;

        // do your while loop here
        while(runningScore < highestScore) {
            runningScore += currentScore;
            currentScore = gameNextScore();
            // calling
            w = w + 1;
            // each time through the inner loop
        }
        return w; // >= 3;
    }

    private int gameNextScore() {
        return 0;
    }

    // Rewrite the previous WHILE loop as a DO..WHILE loop.
    // Notice how the “runningScore” variable usage is different.
    public boolean checkGameScoreDoWhile() {
        int w = 0;
        int highestScore = 236;
        int currentScore = gameNextScore();
        int runningScore = 0;
        // do your while loop here
        do {
            runningScore -= currentScore;
            currentScore = gameNextScore();
            // calling
            w = w + 1;
            // each time through the inner loop
        } while
        (runningScore < highestScore);
        return w >= 3;
    }


    // Write a WHILE loop that checks “serverIsRunning()” and if true
    // calls “waitFor(5)” After the loop, write an IF and check “serverIsRunning()”
    // is false, and if so, call “sendEmergencyText(“Help!”, adminPhoneNumber)”
    // and also calls “tryServerRestart()”
    public int checkServerStatus() {
        int w = 0;
        String adminPhoneNumber = "+1 202 456 1111";

        while(serverIsRunning()) {
            waitFor(5);
            // calling
            w = w + 1;
            // each time through the inner loop
        }
        if (!serverIsRunning()) {
            sendEmergencyText("Help!", adminPhoneNumber);
            tryServerRestart("Help", adminPhoneNumber);
        }

        return w;
    }

    private void waitFor(int i) {
    }

    private void tryServerRestart(String help, String adminPhoneNumber) {
    }

    private void sendEmergencyText(String s, String adminPhoneNumber) {
    }

    private boolean serverIsRunning() {
        return false;
    }


}
