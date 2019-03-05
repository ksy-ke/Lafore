package com.ksy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class UserTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testUnableToModifyFriendsByGetter() {
        // given
        User user = User.getInstance("Name", asList("dude", "koresh"));

        // when
        user.getFriends().set(0, "lol");

        // then
        assertEquals(asList("dude", "koresh"), user.getFriends());
    }

    @Test
    public void testUnableToModifyFriendsByLeftLink() {
        // given
        List<String> sourceFriends = asList("dude", "koresh");
        User user = User.getInstance("Name", sourceFriends);

        // when
        sourceFriends.set(0, "lol");

        // then
        assertEquals(asList("dude", "koresh"), user.getFriends());
    }
}