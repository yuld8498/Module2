package OOP;

import java.time.LocalTime;
import java.util.Currency;

public class StopWatch {
    private LocalTime Startime;
    private LocalTime Endtime;
    public  StopWatch(LocalTime Startime, LocalTime Endtime){
        this.Startime = Startime;
        this.Endtime=Endtime;
    }

    public LocalTime getStartime() {
        return Startime;
    }

    public void setStartime(LocalTime startime) {
        Startime = startime;
    }

    public LocalTime getEndtime() {
        return Endtime;
    }

    public void setEndtime(LocalTime endtime) {
        Endtime = endtime;
    }
    public void getElapsedTime(){
        System.out.println(getEndtime().toNanoOfDay()-getStartime().toNanoOfDay());
    }

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();

        for (int i=0;i<1000;i++){
            Long endTime = System.currentTimeMillis();
            Long runTime =  endTime - startTime;
            System.out.println(runTime);
        }
    }
}
