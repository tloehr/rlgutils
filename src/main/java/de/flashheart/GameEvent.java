package de.flashheart;

import java.util.LinkedHashMap;

/**
 * Created by tloehr on 25.04.15.
 */
public class GameEvent {


    // Events for farcry
    public static final String RESUMED = "RESUMED";
    public static final String FUSED = "FUSED";
    public static final String DEFUSED = "DEFUSED";
    public static final String START_GAME = "START_GAME"; // von Standby nach Active
    public static final String EXPLODED = "EXPLODED";
    public static final String DEFENDED = "DEFENDED";

    // Common Events
    public static final String PREGAME = "PREGAME";
    public static final String GOING_TO_PAUSE = "GNGPAUSE";
    public static final String PAUSING = "PAUSING"; // Box pausiert
    public static final String GOING_TO_RESUME = "GNGRESUM";
    public static final String GAME_ABORTED = "GAME_ABORTED"; // wenn das Spiel beendet wurde
    public static final String LAST_EVENT_REVERTED = "LAST_EVENT_REVERTED"; // wenn das Spiel beendet wurde

    // Events for centerflag
    public static final String FLAG_NEUTRAL = "FLAG_NEUTRAL";
    public static final String BLUE_ACTIVATED = "BLUE_ACTIVATED";
    public static final String RED_ACTIVATED = "RED_ACTIVATED";
    public static final String YELLOW_ACTIVATED = "YELLOW_ACTIVATED";
    public static final String GREEN_ACTIVATED = "GREEN_ACTIVATED";
    public static final String GAME_OVER = "GAME_OVER"; // wenn die Spielzeit abgelaufen ist
    public static final String RESULT_RED_WON = "RESULT_RED_WON";
    public static final String RESULT_BLUE_WON = "RESULT_BLUE_WON";
    public static final String RESULT_DRAW = "RESULT_DRAW"; // Unentschieden
    public static final String RESULT_GREEN_WON = "RESULT_GREEN_WON";
    public static final String RESULT_YELLOW_WON = "RESULT_YELLOW_WON";
    public static final String RESULT_MULTI_WINNERS = "RESULT_MULTI_WINNERS"; // wenn mehr als einer die bestzeit erreicht hat (seeeeehr unwahrscheinlich)

    public static final String[] GAME_OVER_EVENTS = new String[]{GAME_ABORTED, GAME_OVER, EXPLODED, DEFENDED};

    private long pit;
    private String event;
    private long gametime;
    private LinkedHashMap<String, Integer> teamranking = null;

    public GameEvent() {
    }

    public GameEvent(String event, long gametime) {
        this.pit = System.currentTimeMillis();
        this.event = event;
        this.gametime = gametime;
    }


    public GameEvent(String event, long gametime, LinkedHashMap<String, Integer> teamranking) {
        this(event, gametime);
        this.teamranking = teamranking;
    }

    public long getPit() {
        return pit;
    }

    public void setPit(long pit) {
        this.pit = pit;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public long getGametime() {
        return gametime;
    }

    public void setGametime(long gametime) {
        this.gametime = gametime;
    }

    public LinkedHashMap<String, Integer> getTeamranking() {
        return teamranking;
    }

    public void setTeamranking(LinkedHashMap<String, Integer> teamranking) {
        this.teamranking = teamranking;
    }

    @Override
    public String toString() {
        return "de.flashheart.gamestate.GameEvent{" +
                "pit=" + pit +
                ", event='" + event + '\'' +
                ", gametime=" + gametime +
                '}';
    }

}