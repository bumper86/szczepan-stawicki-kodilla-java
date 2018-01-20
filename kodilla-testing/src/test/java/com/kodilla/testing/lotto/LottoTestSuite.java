package com.kodilla.testing.lotto;

import com.kodilla.testing.Lotto.Database;
import com.kodilla.testing.Lotto.Machine;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LottoTestSuite {
    @Test
    public void testeMiniLotto() {
        //Given
        Database databaseMock = mock(Database.class);
        Machine machine = new Machine(databaseMock);
        List<Integer> user = new ArrayList<>();
        user.add(11);
        user.add(19);
        user.add(23);
        user.add(9);
        user.add(34);
        List<Integer> random = new ArrayList<>();
        random.add(11);
        random.add(10);
        random.add(24);
        random.add(19);
        random.add(4);
        when(databaseMock.wylosuj(5)).thenReturn(random);
        //When
        int result = machine.miniLotto(user);
        //Then
        Assert.assertEquals(2,result);
    }

    @Test
    public void testJackpotTwo(){
        //Given
        Database databaseMock = mock(Database.class);
        Machine machine = new Machine(databaseMock);
        List<Integer> user = new ArrayList<>();
        user.add(11);
        user.add(19);
        List<Integer> random = new ArrayList<>();
        random.add(11);
        random.add(10);
        when(databaseMock.wylosuj(2)).thenReturn(random);
        //When
        int result = machine.jackpot(user);
        //Then
        Assert.assertEquals(1,result);
    }

    @Test
    public void testJackpotFive(){
        //Given
        Database databaseMock = mock(Database.class);
        Machine machine = new Machine(databaseMock);
        List<Integer> user = new ArrayList<>();
        user.add(11);
        user.add(19);
        user.add(23);
        user.add(9);
        user.add(34);
        List<Integer> random = new ArrayList<>();
        random.add(11);
        random.add(10);
        random.add(24);
        random.add(19);
        random.add(4);
        when(databaseMock.wylosuj(5)).thenReturn(random);
        //When
        int result = machine.jackpot(user);
        //Then
        Assert.assertEquals(2,result);
    }
}
