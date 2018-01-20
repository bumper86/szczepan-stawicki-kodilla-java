package com.kodilla.testing.Lotto;

import java.util.List;

public class Machine {
    private Database database;

    public Machine(Database database) {
        this.database = database;
    }

    public int miniLotto(List<Integer> user){
        List<Integer> random = database.wylosuj(5);
        int result = 0;
        for (Integer check : user) {
           if(random.contains(check)){
                result = result + 1;
            }

        }
        return result;
    }

    public int jackpot(List<Integer> user){
        List<Integer> random = database.wylosuj(user.size());
        int result = 0;
        for (Integer check : user) {
            if (random.contains(check)){
                result = result + 1;
            }
        }
        return result;
    }



}

