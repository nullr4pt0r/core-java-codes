package Djikstra_probelms.barberProblem;

public class WaitingRoom {
    int seats;
    int occupiedSeat;
    WaitingRoom(int num ){
        seats = num;
        occupiedSeat = 0;
    }

    void addCustomer(){
        if(occupiedSeat < seats)
            occupiedSeat++;
    }
    void removeCustomer(){
        if(occupiedSeat > 0)
            occupiedSeat--;
    }
    boolean isFull(){
        return seats == occupiedSeat;
    }
}
