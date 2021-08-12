package General;

class Timer extends Thread {
    public void run() { //Abstract Method
        int hr = 0;
        int minute = 0;
        int second = 0;
        try {
            while (true) {
                System.out.print('\u000C');
                System.out.println("HR:MIN:SEC = " + hr + " : " + minute + " : " + second);
                sleep(1000);
                second++;
                if (second > 60) {
                    minute = minute + 1;
                    second = 0;
                }
                if (minute > 60) {
                    hr = hr + 1;
                    minute = 0;
                }
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

    }
}
class ThreadClock {
    public static void main(String[] args) {
        Timer t1 = new Timer();

        t1.start();

    }
}


