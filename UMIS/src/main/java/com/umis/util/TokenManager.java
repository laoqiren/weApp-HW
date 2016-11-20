package com.umis.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.umis.entity.Users;
/*
public class TokenManager {

    private static final Long Second = 1000L;

    private static final Long Minute = Second * 60L;

    private static final Long Hour = Minute * 60L;

    public static final Long Time_Out = 2L * Hour;

    private static Map<String, String> tokenMap = new ConcurrentHashMap<>();

    private static Map<String, String> userMap = new ConcurrentHashMap<>();

    private static Map<String, Long> timeMap = new ConcurrentHashMap<>();

    private static Map<String, Integer> levelMap = new ConcurrentHashMap<>();

    private static TokenManager ourInstance = new TokenManager();

    public static TokenManager getInstance() {
        return ourInstance;
    }

    private TokenManager() {
    }


    public String getToken(Users user) {
        String username = user.getUserName();
        Integer level = user.getStaff().getLevel();
        Long currentTimeMillis = System.currentTimeMillis();
        if (tokenMap.containsKey(username)) {
            removeToken(username);
        }
        return newToken(username, level, currentTimeMillis);
    }

    public Integer getTokenLevel(String token) {
        return levelMap.get(token);
    }

    public String getUsernameByToken(String token) {
        return userMap.get(token);
    }

    public Boolean isTokenValid(String token) {
        Long currentTimeMillis = System.currentTimeMillis();
        try {
            Long timeMillis = timeMap.get(token);
            if (currentTimeMillis - timeMillis > Time_Out) {
                removeToken(getUsernameByToken(token));
                return false;
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    private String newToken(String username, Integer level, Long timeMillis) {
        removeToken(username);
        String token = Cryptogram.SHA1(username + level.toString() + timeMillis.toString());
        tokenMap.put(username, token);
        timeMap.put(token, timeMillis);
        levelMap.put(token, level);
        userMap.put(token, username);
        return token;
    }

    private void removeToken(String username) {
        if (tokenMap.containsKey(username)) {
            String tempToken = tokenMap.get(username);
            timeMap.remove(tempToken);
            levelMap.remove(tempToken);
            userMap.remove(tempToken);
            tokenMap.remove(username);
        }
    }
}
*/

