

package com.edutech.progressive.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="match_id")
    private int matchId;
    @Column(name="first_team_id")
    private int firstTeamId;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="first_team_id",insertable = false,updatable = false)
    private Team firtTeam;
    @Column(name="second_team_id")
    private int secondTeamId;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="second_team_id",insertable = false,updatable = false)
    private Team secondTeam;
    @Temporal(TemporalType.DATE)
    @Column(name="match_date")
    private Date matchDate;
    private String venue;
    private String result;
    private String status;
    @Column(name="winner_team_id")
    private int winnerTeamId;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="winner_team_id",insertable = false,updatable = false)
    private Team winnerTeam;

    public Match() {
    }
   
    public Match(int matchId, int firstTeamId, int secondTeamId, Date matchDate, String venue, String result,
            String status, int winnerTeamId) {
        this.matchId = matchId;
        this.firstTeamId = firstTeamId;
        this.secondTeamId = secondTeamId;
        this.matchDate = matchDate;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winnerTeamId = winnerTeamId;
    }
    

    public int getMatchId() {
        return matchId;
    }
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
    public int getFirstTeamId() {
        return firstTeamId;
    }
    public void setFirstTeamId(int firstTeamId) {
        this.firstTeamId = firstTeamId;
    }
    public int getSecondTeamId() {
        return secondTeamId;
    }
    public void setSecondTeamId(int secondTeamId) {
        this.secondTeamId = secondTeamId;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getWinnerTeamId() {
        return winnerTeamId;
    }
    public void setWinnerTeamId(int winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
 
}