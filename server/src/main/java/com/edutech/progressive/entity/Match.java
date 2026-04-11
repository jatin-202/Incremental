package com.edutech.progressive.entity;

// entity/Match.java

import java.util.Date;

public class Match {
    private int matchld;
    private int firstTeamld;
    private int secondTeamld;
    private Date matchDate;
    private String venue;
    private String result;
    private String status;
    private int winnerTeamld;

    public Match() {
    }

    public Match(int matchld, int firstTeamld, int secondTeamld, Date matchDate, String venue, String result,
            String status, int winnerTeamld) {
        this.matchld = matchld;
        this.firstTeamld = firstTeamld;
        this.secondTeamld = secondTeamld;
        this.matchDate = matchDate;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winnerTeamld = winnerTeamld;
    }

    public int getMatchld() {
        return matchld;
    }

    public void setMatchld(int matchld) {
        this.matchld = matchld;
    }

    public int getFirstTeamld() {
        return firstTeamld;
    }

    public void setFirstTeamld(int firstTeamld) {
        this.firstTeamld = firstTeamld;
    }

    public int getSecondTeamld() {
        return secondTeamld;
    }

    public void setSecondTeamld(int secondTeamld) {
        this.secondTeamld = secondTeamld;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWinnerTeamld() {
        return winnerTeamld;
    }

    public void setWinnerTeamld(int winnerTeamld) {
        this.winnerTeamld = winnerTeamld;
    }
}
